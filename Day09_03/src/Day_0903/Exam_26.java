package Day_0903;

abstract class car{ //�߻�Ŭ���� : �̿ϼ� ���赵
	String name;
	abstract String getName(String val);
	car(String val){
		this.name = val;
	}
	String getName() {
		return "car name : " + name;
	}
}
class Truck extends car{
	Truck(String val){
		super(val);
	}

	@Override
	String getName(String val) {
		return "Car name : " + val ;
	}

	String getName(byte[] val) {
		return "Car name : " + val;
	}
	
}


public class Exam_26 {
	public static void main (String[] args) {
		car car = new Truck("spack");
		System.out.println(car.getName());
	}
}

