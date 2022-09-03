package Day_0903;



public class Exam_04 {
	static int test(int n) {
		int s=0;
		for(int i =1; i<=n; i++) {
			s+= i;
		}
		return s;
	}
	static void func(int n) {
		if(n==0)
		return;
		System.out.println("Hello world");
		func(n-1);
	}
	
	public static void main (String[] args) {
		System.out.println(test(5));
		func(5);
		
	}
}
