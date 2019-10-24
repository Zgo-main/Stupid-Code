/**
 * 运算符号的类，输出运算符号
 */
public class Sign {
	int change = 0;

	void sign() {

		if (change == 0) {
			switch ((int) (Math.random() * (2 - 0) + 0)) {
			case 0:
				System.out.print(" + ");
				break;
			case 1:
				System.out.print(" - ");
			}

		} else {
			switch ((int) (Math.random() * (4 - 0) + 0)) {
			case 0:
				System.out.print(" + ");
				break;
			case 1:
				System.out.print(" - ");
				break;
			case 2:
				System.out.print(" * ");
				break;
			case 3:
				System.out.print(" / ");
				break;
			}

		}

	}

}
