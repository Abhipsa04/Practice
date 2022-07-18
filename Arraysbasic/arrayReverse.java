import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of Array : ");
	    int n = sc.nextInt();
		System.out.println("Enter the Array elements:");
		int[] arr = new int[n];
		for(int i = 0 ; i< n ; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("The original array is : ");
		for(int i = 0 ; i< n ; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		int start = 0;
		int end = arr.length-1;
		while(start<end){
		    int temp = arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		}
		System.out.println("The reversed array is : ");
		for(int i = 0 ; i< n ; i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
