package practice.demo.jdbc;

public class Test1 {

	public static String getfruitpostiton(String fruit[], int index, int position) {

		String fr = null;
		String swap[] = new String[fruit.length];
		for (int i = index; i < fruit.length; i++) {
			System.out.println("fuirt array : " + fruit[i]);
			fr = fruit[i];
			System.out.println("fruit :" + fr);
			swap[index - 1] = fruit[i];
			swap[i] = fruit[i];

		}
		for (int j = 0; j < swap.length; j++) {
			System.out.println("swap array :" + swap[j]);
			System.out.println("length :"+swap.length);
		}

		return fr;

	}

	public static void main(String[] args) {
		getfruitpostiton(new String[] { "mango", "apple", "papaya" }, 2, 1);
	}

}
