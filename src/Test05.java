import java.util.Scanner;
import java.util.Arrays;
 
public class Test05 {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
 
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
 
	}
}