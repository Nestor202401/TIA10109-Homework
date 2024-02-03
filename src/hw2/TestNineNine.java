package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		int i, j;

//		方式一: for + while
		for (i = 1; i < 10; i++) {
			j = 1;
			while (j < 10) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("===============================");

		// 方式二: for +do while

		for (i = 1; i < 10; i++) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j < 10);
			System.out.println();
		}
		System.out.println("===============================");

		// 方式三 : while + do while

		i = 1;
		while (i < 10) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j < 10);

			i++;
			System.out.println();

		}

	}
}
