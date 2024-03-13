package Aorg;


/*
计算相似度
 */
public class GetSimilarity {
    public static double ComputeSimilarity(String simHash1, String simHash2) {


        double distance = GetHammingDistance.ComputeHammingDistance(simHash1, simHash2);

        return  0.01*(100 - distance * 100 / 128);
    }
}
