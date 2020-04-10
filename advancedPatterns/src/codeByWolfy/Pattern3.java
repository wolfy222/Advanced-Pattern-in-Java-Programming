/*
 * Pattern 3-
 * 
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 *  
 *  For the value of n=5
 */

package codeByWolfy;
import java.util.*;
public class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int rows=(2*n)-1;
		System.out.println("Required Pattern - ");
		
		for(int i=1; i<=rows; i++)
		{
			if(i<=n)
			{				
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j=1; j<=(rows-i+1); j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

