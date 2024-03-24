//Java program to print my name, Telusko, Java using star pattern

package com.pattern;

public class TeluskoJava {

	public static void main(String[] args) 
	{
	
        int i,j,n = 10;
		
		for(i=0;i<n;i++)
		{
			
			//code for N
			for(j=0;j<n;j++) 
			{
				if(j==0||j==n-1||i==j)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			//code for A
			for(j=0;j<n;j++) 
			{
				if((j==0&&i>0)||(i==0&&j>0&&j<n-1)||i==(n-1)/2||(j==n-1&&i>0))
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			//code for V
			for(j=0;j<n*2;j++) 
			{
				if(i==j||i+j==n*2-1)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			//code for E
			for(j=0;j<n;j++) 
			{
				if(i==0&&j>0||i==n-1&&j>0||j==0&&i>0&&i<n-1||i==(n-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
            System.out.print("   ");
			
            //code for E
			for(j=0;j<n;j++) 
			{
				if(i==0&&j>0||i==n-1&&j>0||j==0&&i>0&&i<n-1||i==(n-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			//code for N
			for(j=0;j<n;j++) 
			{
				if(j==0||j==n-1||i==j)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
		
			
			System.out.println();
		
			
			
			
		}
		
		System.out.println();
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				//code for T
				for(j=0;j<n;j++)
				 {
					if(i==0 || j==(n-1)/2)
							 System.out.print("*");
					else
						 System.out.print(" ");
				}
				 
				
				 System.out.print("   ");
					
		       //code for E
					for(j=0;j<n;j++)
					{
						if(i==0&&j>0 || i==n-1&&j>0 || i==(n-1)/2 || j==0&&i>0&&i<n-1)
						     System.out.print("*");
						else
							System.out.print(" ");
					}
					
					
					System.out.print("   ");
					
					//code for L
					for(j=0;j<n;j++)
					{
						if(j==0 || i==n-1)
							    System.out.print("*");
						else
							System.out.print(" ");
					}
					
					
					 System.out.print("   ");
						
						//code for U
						 for(j=0;j<n;j++)
						 {
							if(j==0&&i<n-1 || j==n-1&&i<n-1 || i==n-1&&j>1&&j<n-2)
									 System.out.print("*");
							else
								 System.out.print(" ");
						}
						 
						 
						 System.out.print("   ");
							
							//code for S
							 for(j=0;j<n;j++)
							 {
								if(i==0&&j>0&&j<n-1 || i==(n-1)/2&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1 || j==0&&i>0&&i<(n-1)/2 || 
										j==n-1&&i>(n-1)/2&&i<n-1 || j==n-1&&i>0&&i<(n-1)/2-2 || j==0&&i<n-1&&i>(n-1)/2+3) 
										 System.out.print("*");
								else
									 System.out.print(" ");
							}
							 
							 
							 System.out.print("   ");
								
					         //code for K
								for(j=0;j<n;j++)
								{
									if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
									     System.out.print("*");
									else
										System.out.print(" ");
								}
								
								 System.out.print("   ");
									
									//code for O
									 for(j=0;j<n;j++)
									 {
										if(i==0&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1 || j==0&&i>0&&i<n-1 || j==n-1&&i>0&&i<n-1) 
												 System.out.print("*");
										else
											 System.out.print(" ");
									 }
							 
			
				
				System.out.println();
			
				
			}
			
	
		}
		System.out.println();
		
		for(i=0;i<n;i++)
		{
			
		    //code for J
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n-1&&i<n-1 || i==n-1&&j>1&&j<n-2 || j==0&&i<n-1&&i>(n-1)/2+2) //j==0&&i<n-1&&i>=n-3
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.print("   ");
			
			//code for A
			for(j=0;j<n;j++) 
			{
				if((j==0&&i>0)||(i==0&&j>0&&j<n-1)||i==(n-1)/2||(j==n-1&&i>0))
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
           System.out.print("   ");
			
			//code for V
			for(j=0;j<n*2;j++) 
			{
				if(i==j||i+j==n*2-1)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
            System.out.print("   ");
			
			//code for A
			for(j=0;j<n;j++) 
			{
				if((j==0&&i>0)||(i==0&&j>0&&j<n-1)||i==(n-1)/2||(j==n-1&&i>0))
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}

}
