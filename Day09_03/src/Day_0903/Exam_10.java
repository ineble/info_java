package Day_0903;
class Exam_10{
	int exam01(int[] num) {
		int m = num[0];
		for(int i = 0; i < num.length; i ++) {
			if(m > num[i])
				m = num[i];
		}
		return m;
	}
}