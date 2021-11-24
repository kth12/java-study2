package Returnvalue;

public class App {
	public static void main(String[] args) {
		//리턴값이 있는 메소드 사용
		Returnmethod r1 =new Returnmethod();
		
		String cat = r1.getAnimal();
		System.out.println("캣 변수는 :"+cat);
	}

}
