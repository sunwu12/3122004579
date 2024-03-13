import org.junit.Test;

import static Aorg.Text_read.readTxt;

public class Text_read_test {
    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = readTxt("txt/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = readTxt("txt/none.txt");
    }

}
