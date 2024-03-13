import org.junit.Test;

import static Aorg.GetHash.ComputeHash;

public class GetHash_test {
    @Test
    public void getHashTest(){
        String[] strings = {"今天", "是", "星期天", "天气", "晚上", "电影"};
        for (String string : strings) {
            String stringHash = ComputeHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
        String[] strings1 = {"明天", "一起", "去", "公园", "散步", "放风筝"};
        for (String string : strings1) {
            String stringHash = ComputeHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }



}
