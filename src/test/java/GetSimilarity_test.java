import org.junit.Test;

import java.text.DecimalFormat;

import static Aorg.GetSimHash.ComputeSimHash;
import static Aorg.GetSimilarity.ComputeSimilarity;
import static Aorg.Text_read.readTxt;

public class GetSimilarity_test {
    @Test
    public void getSimilarityTest() {
        DecimalFormat format = new DecimalFormat("######0.00");
        String str0 = readTxt("txt/orig.txt");
        String str1 = readTxt("txt/orig_0.8_add.txt");
        double similarity = ComputeSimilarity(ComputeSimHash(str0), ComputeSimHash(str1));
        System.out.println("str0和str1的相似度:" + format.format(100*similarity)+"%");
    }
}
