package b65;
import java.util.Arrays;
import java.util.Scanner;
public class numericArray {
	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);
		        int n=sc.nextInt();
		        int[] my_array1 = new int[n];
		        for(int i=0; i<n; i++) {
		        	my_array1[i]=sc.nextInt();
		        }

		        
		        System.out.println("Original array: " + Arrays.toString(my_array1));

		        
		        Arrays.sort(my_array1);

		       
		        System.out.println("Sorted array: " + Arrays.toString(my_array1));

		        
		        int sum = 0;
		        for (int i = 0; i < my_array1.length; i++) {
		            sum += my_array1[i];
		        }
		       
		        double average = (double) sum / my_array1.length;
		        System.out.println("Sum of array elements: " + sum);
		        System.out.println("Average value of array elements: " + average);
		    }
		
	
}
