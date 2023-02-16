import java.util.Scanner;

public class Scannerarr {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int [][] arr=new int[3][4];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("enter the marks of student"+i +" "+ j );
				arr[i][j]=scan.nextInt();
			}
		}
			System.out.println("these are the marks of students are	");
			for( int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr[i].length; j++)
				{
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
}
}