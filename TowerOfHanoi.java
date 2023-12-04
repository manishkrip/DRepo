import java.util.*;
public class TowerOfHanoi {
   
	public static void towerHanoi(int n,String s,String h,String d)
	{
		if(n==1)
		{
			System.out.println("Transfer disk "+n+" from "+ s +" to "+d);
			return;
		}
		
		towerHanoi(n-1, s, d, h);
		System.out.println("Transfer disk "+n+" from "+ s +" to "+d);
		towerHanoi(n-1, h, s, d);
	}
	
	public static void main(String[] args) {
		int n=3;
		towerHanoi(n, "S", "H", "D");
	}
}
