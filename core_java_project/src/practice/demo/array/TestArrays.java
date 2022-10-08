package practice.demo.array;

public class TestArrays {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++) {
			System.out.println("Array is :" +a[i]);
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
	}
}
