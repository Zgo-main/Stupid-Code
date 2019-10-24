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
			System.out.println("#题目保存在d盘resault.txt下，每次重新生成都会覆盖原有文件#");
			System.out.println("#您可以反复控制参数，每次控制结果都会保存,直到退出程序#");
			System.out.println("#输入1回车控制题目数目");
			System.out.println("#输入2回车控制是否有乘除");
			System.out.println("#输入3回车控制最大操作数操作(同时定义算术结果最大值)");
			System.out.println("#输入4回车控制操作数是否含有负数");
			System.out.println("#输入除1-4任意字符回车退出程序");

			Scanner in = new Scanner(System.in);
			int judge = in.nextInt();

			switch (judge) {
			case 1: {
				System.out.println("请输入要需要显示的题目数量:");
				
				try {
					p.number = in.nextInt();
				} catch (Exception e) {
					System.out.println("错误的输入");
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
				System.out.println("请输入操作数最大值(同时定义算术结果最大值):");
				
				try {
					p.max = in.nextInt();
				} catch (Exception e) {
					System.out.println("错误的输入");
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
				System.out.println("程序以退出");
				System.exit(-1);

			}
			}

		}
	}

}
