package Day_0903;

class Singleton{
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	static Singleton getInstance() {
		return singleton;
	}
}


public class Exam_16 {
	public static void main (String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1==s2) {
			System.out.println("s1==s2");
		}else {
			System.out.println("s1!=s2");
		}
		
	}
}

