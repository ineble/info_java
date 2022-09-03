package Day_0903;



public class Exam_05 {
	static int func(int n) {
		if(n==1)
		return 1;
		return n+func(n-1);
	}
	static int fac(int n) {
		if(n==1)
			return 1;
		return n*fac(n-1);
	}
	
	public static void main (String[] args) {
		System.out.println(func(5));
		System.out.println(fac(5));
		
	}
}
