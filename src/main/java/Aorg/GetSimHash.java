package Aorg;

import com.hankcs.hanlp.HanLP;

import java.util.List;

public class GetSimHash {
    // 文本过短时无法计算误差大，做限制处理
    public static String ComputeSimHash(String str){
        if(str.length() <450)
        {
            System.out.println("文本过短，无法计算！");
            return null;
        }
        int[] v = new int[128];
        // 使用外部依赖hankcs包提供的接口进行分词
        List<String> keywordList = HanLP.extractKeyword(str, str.length());//将分好的词存入keywordList中
        int size = keywordList.size();//保留关键字数目，为后面的加权做准备
        int i = 0;//i控制权重划分
        for(String keyword : keywordList)
        {
            // 获取hash值
            String keywordHash = GetHash.ComputeHash(keyword);

            // 合并
            for (int j = 0; j < v.length; j++)
            {
                // 对keywordHash的每一位与'1'进行比较
                if (keywordHash.charAt(j) == '1')
                {
                    //由词频从高到低分为20级权重
                    v[j] += (20 - (i/ (size / 20)));
                }
                else
                {
                    v[j] -= (20 - (i/ (size / 20)));
                }

            }
            i++;

        }
        StringBuilder simHash = new StringBuilder();// 储存返回的simHash值
        // 降维
        for (int k : v) {
            // 若simhash值小于1，则赋值为0，若不是则赋值为1
            if (k <= 0) {
                simHash.append("0");
            } else {
                simHash.append("1");
            }

        }
        return simHash.toString();
    }
}
