package Day_0903.com.song.article;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("==���α׷� ����==");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("��ɾ� : ");
			String commend = sc.nextLine();
			
			if(commend.equals("system exit")) {
				break;
			}else if(commend.equals("article list")) {
				break;
			}
		}
		sc.close();
		System.out.println("==���α׷� ��==");
	}
}
