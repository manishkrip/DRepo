package Linkedin;

public class practice {
	static int i = 0;
	static int pre = 0;
	static int count = 0;
	static boolean flag = false;

	public static boolean isprime(int n) {
		if (pre == i) {
			i = n;
		}
		if (n == 1 || n == 0) {
			return flag;
		}
		if (n > 1) {
			;

			if (i % n == 0) {
				++count;
				pre++;
				if (count >= 2) {
					 flag = false;
					 return flag;
				} else {
					flag = true;
				}

			}
			isprime(n - 1);
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isprime(97));
	}
}
