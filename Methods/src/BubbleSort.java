
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,9,12,28,5,7,3,2,1,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j]<a[j-1])
				{
				  int tempVar=a[j];
				  a[j]=a[j-1];
				  a[j-1]=tempVar;
					
				}
			}
		}
		for(int e:a)
		{
			System.out.print( e+" ");	
		}
	}

}
