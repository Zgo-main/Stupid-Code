/**
 * ����ļ�result.txt
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
			// ��D:/test.txt�ļ���ȡ����������
			InputStream input = new FileInputStream("D:/result.txt");
			// ����BufferedReader����gb2312�ı��뷽ʽ��ȡ�ļ�
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, "gb2312"));
			String line = null;
			// ���ж�ȡ�ı���ֱ��ĩβ
			while ((line = reader.readLine()) != null) {
				// ��ӡ��ǰ���ַ���
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
