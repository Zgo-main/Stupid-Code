/**
 * �����ʽ�����浽D:result.txt
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class 	Problem {

	int number = 10;// ��Ŀ����
	int max = 100;// �����
	boolean pmsign = false;// ������
	Sign p;

	void printFormula(Sign p) throws FileNotFoundException {

		PrintStream ps = new PrintStream("d:/result.txt");// �����ļ�
		PrintStream psOld = System.out;// ����Ĭ�������
		System.setOut(ps);// �����������ps

		int count = 0;

		while (count < number) {

			int random1 = (int) (1 + Math.random() * (max));
			int random2 = (int) (1 + Math.random() * (max));

			if (pmsign) {
				switch ((int) (Math.random() * (2 - 0) + 0)) {
				case 0:
					random1 = -random1;
					break;
				case 1:
					;
				}

				switch ((int) (Math.random() * (2 - 0) + 0)) {
				case 0:
					random2 = -random2;
					break;
				case 1:
					;
				}

			}

			if (random1 + random2 < max) {
				if (random1 < 0) {
					System.out.printf("(%3d)", random1);
				} else {
					System.out.printf("%5d", random1);
				}

				p.sign();

				if (random2 < 0) {
					System.out.printf("(%d)\n", random2);
				} else {
					System.out.printf("%d\n", random2);
				}

				count++;
			}

		}

		System.setOut(psOld); // �ָ������

	}
}
