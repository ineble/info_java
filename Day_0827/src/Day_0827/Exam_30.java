package Day_0827;
/*
 *00001010
 * */

public class Exam_30 {
	public static void main(String[] args) {
		int var[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0; i <3; i++) {
			for(int j = 0; j <3; j ++) {
				System.out.print(var[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("2��°");
		int arr[][] = {{1,2,3,4},{5,6},{7,8,9}};
		for(int i =0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j ++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===========================");
		int arr1[][] = {{1,2,3,4},{5,6},{7,8,9}};
		System.out.println("�� �� : " + arr1.length);
		System.out.println("0��° ĭ �� : " + arr1[0].length);
		System.out.println("1��° ĭ �� : " + arr1[1].length);
		System.out.println("2��° ĭ �� : " + arr1[2].length);
		
		for(int i =0; i< arr1.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
