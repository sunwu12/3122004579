import org.junit.Test;

import static Aorg.GetHammingDistance.ComputeHammingDistance;
import static Aorg.GetSimHash.ComputeSimHash;
import static Aorg.Text_read.readTxt;

public class GetHammingDistance_test {
    @Test
    public void getHammingDistanceTest() {
        String str0 = readTxt("txt/orig.txt");
        String str1 = readTxt("txt/orig_0.8_add.txt");
        int distance = ComputeHammingDistance(ComputeSimHash(str0), ComputeSimHash(str1));
        System.out.println("HammingDistance：" + distance);
    }
}
