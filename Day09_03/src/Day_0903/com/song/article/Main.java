package Day_0903.com.song.article;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령어 : ");
			String commend = sc.nextLine();
			
			if(commend.equals("system exit")) {
				break;
			}else if(commend.equals("article list")) {
				break;
			}
		}
		sc.close();
		System.out.println("==프로그램 끝==");
	}
}
