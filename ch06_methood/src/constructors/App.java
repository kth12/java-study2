package constructors;

public class App {
	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		person p1 = new person("펭수", 120.0);
		// 기본생성자는 생략 가능
		person p2 = new person("길동", 172.5);
		person p3 = new person("라이언", 165.5);

//		System.out.printf("이름 : %s , 키 :%.1f \n", p1.getName(), p1.getheghit());
//		System.out.printf("이름 : %s , 키 :%.1f \n", p2.getName(), p2.getheghit());
//		System.out.printf("이름 : %s , 키 :%.1f \n", p3.getName(), p3.getheghit());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
