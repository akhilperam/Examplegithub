import java.util.Scanner;

public class LinearSerach {

	public static void main(String[] args) {
		
		int a [] = {10,20,30,80,90,60,55,40};
		Boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find : ");
		int find = scan.nextInt();

		for(int i=0; i<a.length;i++)
		{
			if (find==a[i])
			{
				
				System.out.println("Found " + find + " Index of " + i );
				flag=true;
				break;
				
			}
	
		}

		if(flag == false)
		System.out.println("I did not find ");
		
	}

}
