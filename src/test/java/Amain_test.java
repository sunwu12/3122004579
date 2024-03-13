import org.testng.annotations.Test;

import java.text.DecimalFormat;

import static Aorg.GetSimHash.ComputeSimHash;
import static Aorg.GetSimilarity.ComputeSimilarity;
import static Aorg.Text_read.readTxt;
import static Aorg.Text_write.writeTxt;

public class Amain_test {
        @Test
    public void origAndAllTest(){
            DecimalFormat format = new DecimalFormat("######0.00");
        String[] str = new String[6];
        str[0] = readTxt("txt/orig.txt");
        str[1] = readTxt("txt/orig_0.8_add.txt");
        str[2] = readTxt("txt/orig_0.8_del.txt");
        str[3] = readTxt("txt/orig_0.8_dis_1.txt");
        str[4] = readTxt("txt/orig_0.8_dis_10.txt");
        str[5] = readTxt("txt/orig_0.8_dis_15.txt");
        String ansFileName = "txt/answer.txt";
        for(int i = 0; i <= 5; i++){
            double ans = ComputeSimilarity(ComputeSimHash(str[0]), ComputeSimHash(str[i]));
            System.out.println("查重率："+format.format(ans*100)+"%");
            writeTxt(ans, ansFileName);
        }
    }
    
}
