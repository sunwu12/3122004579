import org.junit.Test;

import static Aorg.GetSimHash.ComputeSimHash;
import static Aorg.Text_read.readTxt;


public class GetSimHash_test {
    @Test

    public void getSimHashTest(){
        String str0 = readTxt("txt/orig.txt");
        String str1 = readTxt("txt/orig_0.8_add.txt");
        System.out.println("SimHash:"+ComputeSimHash(str0)+"\n");
        System.out.println("SimHash:"+ComputeSimHash(str1)+"\n");
    }
}
