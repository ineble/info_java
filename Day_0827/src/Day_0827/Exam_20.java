package Day_0827;
// 배열 : 동일한 이름을 가진 기억 공간

public class Exam_20 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int s = 0;
		for(int i =0; i<a.length; i ++) {
			System.out.print(a[i] + "\t");
			s += a[i];
		}
		System.out.println("=" + s);
 				
	}
}
