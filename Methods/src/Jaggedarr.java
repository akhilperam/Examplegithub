import java.util.Scanner;

public class Jaggedarr{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in); //useroutput scannerclass
		int [][][] a = new int[2][][];
		           a[0] = new int[3][];
		           a[1]= new int[2][];
		        
		         a[0][0]= new int [3];
		         a[0][1]= new int[2];
		         a[0][2]= new int [1];
		         a[1][0]= new int[1];
		         a[1][1]= new int [3];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
					{ 
					System.out.println("enetr the marks of college " + i + " class "+ j +" student "+ k);
						a[i][j][k] =s.nextInt();				
					}
			}
		}
		System.out.println("these are the Marks of Studens");
		
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
					{
					System.out.print(a[i][j][k]+" ");
					}
			}
			System.out.println();
		}	
	
	}
}