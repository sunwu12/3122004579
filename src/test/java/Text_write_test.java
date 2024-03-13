import org.junit.Test;

import static Aorg.Text_write.writeTxt;

public class Text_write_test {
    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.71,42,0.10,0.45,800};
        for (double v : elem) {
            writeTxt(v, "txt/answer.txt");
        }
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {100,600,0.30,0.55,0.12};
        for (double v : elem) {
            writeTxt(v, "User:/ABCD/ansAll.txt");
        }
    }
}
