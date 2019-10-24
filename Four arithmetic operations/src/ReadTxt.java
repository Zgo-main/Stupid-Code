/**
 * 输出文件result.txt
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadTxt {
	ReadTxt() {
		try {
			// 将D:/test.txt文件读取到输入流中
			InputStream input = new FileInputStream("D:/result.txt");
			// 创建BufferedReader，以gb2312的编码方式读取文件
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, "gb2312"));
			String line = null;
			// 按行读取文本，直到末尾
			while ((line = reader.readLine()) != null) {
				// 打印当前行字符串
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
