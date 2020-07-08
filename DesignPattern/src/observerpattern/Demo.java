package observerpattern;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Song
 * @Date 2020/5/20 15:44
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        File filePath = new File("D:\\demo.txt");
        try {
            filePath.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(filePath, true));
            for (int i = 0; i < 5000; i++) {
                out.write(i + "\n");
            }
            out.flush(); // 清空缓冲区
            out.close(); // //不关闭文件会导致资源的泄露，读写文件都同理
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
