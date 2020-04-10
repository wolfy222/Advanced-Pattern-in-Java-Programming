/*
 * Pattern 2-
 * 
 *      1
 *     2 3
 *    4 5 6
 *   7 8 9 10
 *  11 12 13 14 15
 *  
 *  For the value of n=5
 */

package codeByWolfy;
import java.util.*;
public class Pattern2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int t=1;
		System.out.println("Required Pattern - ");
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=(n-i); j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}
	}
}

