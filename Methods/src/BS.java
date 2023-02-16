import java.util.Scanner;

public class BS {

	public static void main(String[] args) {
	  
		int a[]= {10,20,30,40,50,60,70,80,90};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to search");
		int key = scan.nextInt();
		int low = 0;
		int high = a.length;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==a[mid])
			{
				System.out.println("key "+ key +" found at "+ mid);
				break;
			}
			else if(key<a[mid])
			{
				high=mid-1;
			}
			else if (key>a[mid])
			{
				low=mid+1;
			}	
		}	
			if(low>high) 
			{
				System.out.println("Key Not Found");
			}
		
	}

}
