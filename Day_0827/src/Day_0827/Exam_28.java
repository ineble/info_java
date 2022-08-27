package Day_0827;
/*
 *00001010
 * */

public class Exam_28 {
	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0, n = 10;
		while(n>0) {
			a[i++] = n % 2; // 0 1 0 1 a[0] a[1] a[2] a[3]
			n /= 2; //10 5 2 1 0  Æ¨±è 
		}
		for(i=7; i>=0; i--) { //¿ø·¡´Â a[7]=0 a[6]=0 a[5]=0 a[4]=0 a [3]=1 a[2]=0 a[1]=1 a[0]=0
			System.out.printf("%2d",a[i]);
		}
	}
}
