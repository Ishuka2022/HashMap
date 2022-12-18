package Hasmap_Programs;

import java.util.Scanner;

public class Starclass {
	public static void main(String[] args) {
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.println("*     * *");
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lucky number : ");
		int a =  sc.nextInt();
		
		if(a<=10 || a==777)
		{
			System.out.println("u are Lucky You Won !!!");	
			System.out.println("Tu mera hai bas mera hii rahe ga");
		}
		else {
			System.out.println("@@@@@@@@@@ You Loose 😂😂😂😂😂😂 @@@@@@@@@");
			
		}
			
		}
}
