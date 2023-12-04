package Linkedin;
public class TwoSumProblem {
	public void problem(int arr[] , int target)
	{
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++)
		{
		if(flag ==true)
		{
			for(int j=i+1;j<arr.length;j++)
			{
	
				if(arr[i]+arr[j] == target)
				{
					System.out.println("The target is -> " + target + "The two indices is this -> "+ i +" and "+ j   );
					
				flag=false;
				}
			
		}
		
		}
	}
	}
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int target =5;
	TwoSumProblem solve = new TwoSumProblem();
	solve.problem(arr, target);
}
}
