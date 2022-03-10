import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}
		input.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[n - 1]);
	}
}
