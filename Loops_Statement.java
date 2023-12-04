import java.util.*;
public class Loops_Statement {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	//Print the table of the given input
	
	for(int i=1;i<=10;i++)
	{
		int n = i*number;
		System.out.print(n+" ");
		
	}
	
	
//-------------------------------------------------------------------------------
//Half pyramid problem
 int row = sc.nextInt();
 
 
 for(int i=1;i<=row;i++)
 {
	 for(int j=1; j<=i; j++)
	 {
		
			 System.out.print("* "); 
		 
		 
	 }
	 System.out.println();
 }

//-------------------------------------------------------------------------------
//ULTA Half pyramid problem
 
 System.out.println();
 System.out.println();
 
 for(int i=row;i>=1;i--)
 {
	 for(int j=1; j<=i; j++)
	 {
		
			 System.out.print("* "); 
		 
		 
	 }
	 System.out.println();
 }
 

//-------------------------------------------------------------------------------
//starting mai spaces vala Half pyramid problem

System.out.println();
System.out.println();

for(int i=1;i<=row;i++)
{
	
	 for(int j=1; j<=row-i; j++)
	 {
		
			 System.out.print(" "); 
		 
		 
	 }
	 for(int j=1; j<=i; j++)
	 {
		
			 System.out.print("*"); 
		 
		 
	 }
	 System.out.println();
}



System.out.println();
System.out.println();
//-------------------------------------------------------------------------------
//number vala ulta Half pyramid problem

for(int i=row;i>=1;i--)
{
	 for(int j=1; j<=i; j++)
	 {
		
			 System.out.print(j); 
		
		 
	 }
	 System.out.println();
}


System.out.println();
System.out.println();



//-------------------------------------------------------------------------------
//flyoids triangle
int sum=1;
for(int i=1;i<=row;i++)
{
	 for(int j=1; j<=i; j++)
	 {
		
			
			 System.out.print(sum+" "); 
			 sum++;
			 
		
		 
	 }
	 System.out.println();
}

System.out.println();
System.out.println();



//-------------------------------------------------------------------------------
//On OFF pattern
for(int i=1;i<=row;i++)
{
	 for(int j=1; j<=i; j++)
	 {
		if(((i+j)%2) ==0)
		{
			
			 System.out.print("1 "); 
			
		}
		else
		{
			System.out.print("0 ");
		}
		 
	 }
	 System.out.println();
}

 
}
}
