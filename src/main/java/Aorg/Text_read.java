package Aorg;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Text_read {
    public static String readTxt(String txtPath) {
        StringBuilder str = new StringBuilder();
        String strLine;

        File storefile = new File(txtPath);
        FileInputStream stream;
        try {
            //读入文件信息并利用InputStreamReader将字节信息转为字符流
            stream = new FileInputStream(storefile);
            InputStreamReader streamReader = new InputStreamReader(stream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);

            while ((strLine = reader.readLine()) != null) {
                str.append(strLine);
            }
            // 关闭资源
            streamReader.close();
            reader.close();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}
