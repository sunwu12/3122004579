package Aorg;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GetHash {
    public static String ComputeHash(String str) {
        try {
            // 这里使用了MD5获得hash值
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            return new BigInteger(1, messageDigest.digest(str.getBytes(StandardCharsets.UTF_8))).toString(2);
            StringBuilder str256= new StringBuilder(new BigInteger(1, messageDigest.digest(str.getBytes(StandardCharsets.UTF_8))).toString(2));
            //hash长度小于256时用0将其补全
            if(str256.length()<256)
            {
                int dif = 256 - str256.length();
                str256.append("0".repeat(Math.max(0, dif)));
            }
            return str256.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}