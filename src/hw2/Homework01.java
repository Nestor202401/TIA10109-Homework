package hw2;

public class Homework01 {
	public static void main(String[] args) {

		// 作業01:
		System.out.println("請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)");
		int sun = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sun += i;
		}
		System.out.println("總和=" + sun);

		System.out.println("===============================");

		// 作業02:
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) for迴圈 ");
		int product = 1;
		for (int i = 2; i <= 10; i++) {
			product *= i;
		}
		System.out.println(product);

		System.out.println("===============================");

		// 作業03: while 迴圈方式
		System.out.println("while迴圈方式");

		int product02 = 1;
		int j = 2;
		while (j <= 10) {
			product02 *= j;
			j++;
		}
		System.out.println(product02);

		System.out.println("===============================");

		// 作業04:
		// 請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100

		System.out.println("請設計一隻Java程式結果為1 4 9 16 25 36 49 64 81 100");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		System.out.println("===============================");

		// 作業05:
		System.out.println("阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，\r\n" + "輸出結果為阿文可以選擇的數字有哪些？總共有幾個？");
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != 4 && i % 10 != 4) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.println();
		System.out.println("總共有" + count + "個");

		System.out.println("===============================");

		// 作業06:
		System.out.println("請設計一隻Java程式");
		for (int i = 10; i >= 0; i--) {
			for (int u = 1; u <= i; u++) {
				System.out.print(u);

			}
			System.out.println();
		}

		System.out.println("===============================");

		// 作業06:
		System.out.println("請設計一隻Java程式");
		for (char ch = 'A'; ch<= 'F'; ch++) {
			for (int i = 1; i <=ch - 'A' + 1 ; i++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}
}
