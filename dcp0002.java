import java.util.Scanner;

public class dcp0002 {
	public static void main (String[] args) {
		Scanner entry = new Scanner(System.in);
		
		// ask for list
		System.out.println("How many numbers are in your list?");
		int count = entry.nextInt();
		int[] list = new int[count];
		int[] result = new int[count];
		
		System.out.println("Enter the numbers:");
		for(int i=0; i<count; i++) {
			list[i] = entry.nextInt();
		}
				
		// calculate product
		for (int i=0; i<list.length; i++) {
			int product = 1;
			for (int j=0; j<list.length; j++) {
				product *= i==j?1:list[j];
			}
			result[i] = product;
		}
		
		String answer = "[";
		
		for (int i=0; i<result.length; i++) {
			if (i!=0) {answer += ", ";}
			answer += result[i];
		}
		answer += "]";
		
		// write out result
		System.out.println("Your result is "+answer);
	}
}
