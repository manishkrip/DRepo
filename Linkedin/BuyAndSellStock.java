package Linkedin;

import java.util.*;

public class BuyAndSellStock {
	public void profit(int[] arr, int day) {
		// TODO Auto-generated method stub
		int day_length  = arr.length;
		int max=0;
		int future_day=0;
		for(int i=day-1;i<day_length;i++)
		{
			if(arr[i] >max)
			{
				max = arr[i];
				future_day =i+1;
			}
		}
		int result = arr[future_day-1] -  arr[day -1 ];
		if(result==0)
		{
			System.out.println("No Profit book");
		}
		else
		System.out.println("The maximum profit will be " + result + " on this day "+ future_day  );
	}
	
	public void stocksell(int arr[])
	{
		int arr_length = arr.length;
		int prevprofit=0;
		int maxprofit=0;
		int min =arr[0];
		for(int i=1;i<arr_length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];					
			}
	
				maxprofit=   arr[i] - min;
				if(maxprofit>prevprofit)
				{
				prevprofit = maxprofit;
			
			}
		}
			System.out.println("The profit is "+ prevprofit);
	}

	public static void main(String[] args) {
		BuyAndSellStock p1 = new BuyAndSellStock();
		int arr[] = { 12, 10, 19,5, 23, 14,5 };
		Scanner sc = new Scanner(System.in);
		System.out.println(" You have 5 days so accordingly Enter the day of buying stock  ");
		int day = sc.nextInt();
		p1.profit(arr, day);
		p1.stocksell(arr);
	}



}
