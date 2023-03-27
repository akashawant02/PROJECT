package pgdac_march23a;

public class pattern3 {

	public static void main(String[] args) {
		int space=3;
		int k=1;
		for(int i=1;i<=4;i++)
		{
		  
			for( int l=1;l<=space;l++)  System.out.print("  ");
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ k+" ");
				k++;
			}
			System.out.println();
			space--;
		}

	}

}
