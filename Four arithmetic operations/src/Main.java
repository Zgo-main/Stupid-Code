/**
 * @author 20194656
 */
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Problem p = new Problem();
		Sign ps = new Sign();
		p.printFormula(ps);
		new ReadTxt();

		while (true) {
			System.out.println("#��Ŀ������d��resault.txt�£�ÿ���������ɶ��Ḳ��ԭ���ļ�#");
			System.out.println("#�����Է������Ʋ�����ÿ�ο��ƽ�����ᱣ��,ֱ���˳�����#");
			System.out.println("#����1�س�������Ŀ��Ŀ");
			System.out.println("#����2�س������Ƿ��г˳�");
			System.out.println("#����3�س�����������������(ͬʱ��������������ֵ)");
			System.out.println("#����4�س����Ʋ������Ƿ��и���");
			System.out.println("#�����1-4�����ַ��س��˳�����");

			Scanner in = new Scanner(System.in);
			int judge = in.nextInt();

			switch (judge) {
			case 1: {
				System.out.println("������Ҫ��Ҫ��ʾ����Ŀ����:");
				
				try {
					p.number = in.nextInt();
				} catch (Exception e) {
					System.out.println("���������");
					break;
				}

				p.printFormula(ps);

				new ReadTxt();

			}
				break;

			case 2: {
				ps.change = 1;
				p.printFormula(ps);
				
				new ReadTxt();
			}
				break;

			case 3: {
				System.out.println("��������������ֵ(ͬʱ��������������ֵ):");
				
				try {
					p.max = in.nextInt();
				} catch (Exception e) {
					System.out.println("���������");
					break;
				}
				
				p.printFormula(ps);

				new ReadTxt();
			}
				break;

			case 4: {
				p.pmsign = true;
				p.printFormula(ps);

				new ReadTxt();
			}
				break;

			default: {
				System.out.println("�������˳�");
				System.exit(-1);

			}
			}

		}
	}

}
