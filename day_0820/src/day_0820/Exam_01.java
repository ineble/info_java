package Day_0820;

public class Exam_01 {
	public static void main(String [] args) {
		System.out.println("Hello world !!!");
		System.out.println("구구단 시작");
		for(int i = 1; i < 10; i++ ) {
			System.out.println("====="  + i + "단 =====");
			for(int j = 1; j < 10; j++) {
				 System.out.println( i + "*" + j + "=" + (i*j));
			}
			 System.out.println("-------------------------");
		}
		
		
	}
}
