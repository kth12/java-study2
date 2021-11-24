package ch06_methood;

//하나의 파일에 여러개의 클래스를 만들수 있다
class person{
	String name;
}
//public class 는 한 파일에 하나만 생성가능, 파일이름과 같음
public class Classobject {

	public static void main(String[] args) {
		// 클래스와 객체
		//클래스는 설계도이고 실제 사용가능한 객체를 생성(객체는 실제 메모리에 생성됨 = 인스턴스)
		person p1 =null; //참조변수 펄슨 클래스 타입 p1 선언, 초기값없음
		System.out.println(p1);
		p1 = new person();  //person의 실제 객체를 생성하여 그 주소값을 p1에 대입
		System.out.println(p1);
		
		p1.name  = "펭수";
		
		person p2 = new person();
		p2.name = "길동";
		person p3 = new person();
		p3.name = "라이온";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		
	}

}
