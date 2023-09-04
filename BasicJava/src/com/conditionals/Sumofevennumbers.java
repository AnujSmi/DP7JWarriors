package com.conditionals;
public class Sumofevennumbers 
		{
			public static void main(String ags[]) 
			{
				
				long sum = 0;
				
				for(int i =1; i<=20; i++)
					
					if(i%2==0)
					{
						sum+=i;
					}
				System.out.print(sum);
			}
		}

