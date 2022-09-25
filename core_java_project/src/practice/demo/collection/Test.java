package practice.demo.collection;

/* Author :Kundan Kumar
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Test {

	public static void main(String[] args) {

		int x = 10;
		int x1 = 010;
		int x2 = 0x10;
		double b1 = 10D;

		System.out.println("its time to fuck you baby!!" + x + "---x1--" + x1 + "--x2--" + x2);

		int[] str = { 2, 4, 5, 6, 2, 1 };

		int a = 6;

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] + str[j] == 6) {
					System.out.println(str[i]);
					System.out.println(str[j]);
					System.out.println("\n");
				}
			}
		}
	}
}