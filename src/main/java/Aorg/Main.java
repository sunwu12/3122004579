package Aorg;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("######0.00");
        //分别输入所用及保存文件地址
        String string0 = args[0];
        String string1 = args[1];
        String resultFileName = args[2];
        // 从输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = Text_read.readTxt(string0);
        String str1 = Text_read.readTxt(string1);

        // 由字符串得出对应的 simHash值
        String simHash0 = GetSimHash.ComputeSimHash(str0);
        String simHash1 = GetSimHash.ComputeSimHash(str1);

        // 由 simHash值求出相似度
        double similarity = GetSimilarity.ComputeSimilarity(simHash0, simHash1);
        // 在运行窗口中表示相似度，并把相似度写入最后的结果文件中
        System.out.println("相似度："+df.format(similarity*100)+"%");
        Text_write.writeTxt(similarity, resultFileName);
    }
}