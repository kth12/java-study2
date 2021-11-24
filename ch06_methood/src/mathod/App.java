package mathod;

public class App {
	public static void main(String[] args) {

		person p1 = new person();
//인스턴스 변수의 값이 없을때 자동으로 0,null초기화 시킴
		System.out.println(p1.name);
		System.out.println(p1.age);

		p1.sayHello(); // 메소드호출

		p1.name = "펭수";
		p1.age = 7;

//System.out.println(p1.name);
//System.out.println(p1.age);
		p1.sayHello(); // 메소드 호출

		person p2 = new person();
		p2.name = "라이언";

		p2.sayHello();
	}

}
