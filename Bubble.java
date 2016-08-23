import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Bubble
{
	public static void shorting(int n)
	{
		int a[] = {10,56,2,23,850,556,23};
		int temp; // Here Temp variable is for to transfer a[i] value into (a[i+1]) it means the next address of a[i].
		for(int k=0;k<n-1;k++)
		{
			for(int i=0;i<n-k-1;i++)
			{
				if(a[i] > a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] arg)
	{
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println("Before Shorting");	
			shorting(n);
			System.out.println("After Shorting");
	}
}