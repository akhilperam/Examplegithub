
public class Foreach {

	public static void main(String[] args) {
		int [] [] arr = {{10,20,30},{10,2,100,20,},{10,25,9,69,585}};
		
		for(int ar[]:arr)
		{
			for(int a:ar) 
			{
				
			System.out.print(a + " ");
			
			}
				System.out.println();
		}
	}
}
