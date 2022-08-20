package Day_0820;

public class Exam_02 {

	public static void main(String[] args) {
		System.out.println("안녕하세요 두번째 프로그램입니다");
		int month = 8;
		String monthstr = "";
		switch (month) {
		case 1:
			monthstr = "겨울";
			break;
		case 2:
			monthstr = "겨울";
			break;
		case 3:
			monthstr = "봄";
			break;
		case 4:
			monthstr = "봄";
			break;
		case 5:
			monthstr = "봄";
			break;
		case 6:
			monthstr = "여름";
			break;
		case 7:
			monthstr = "여름";
			break;
		case 8:
			monthstr = "여름";
			break;
		case 9:
			monthstr = "가을";
			break;
		case 10:
			monthstr = "가을";
			break;
		case 11:
			monthstr = "가을";
			break;
		case 12:
			monthstr = "겨울";
			break;	
		default:
			monthstr = "4계절 중 하나입니다";
			break;
		}
		System.out.println(monthstr);
	}
}
