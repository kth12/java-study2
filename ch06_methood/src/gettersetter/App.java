package gettersetter;

public class App {
	
	public static void main(String[] args) {
		//인스턴스 변수에 접근하는 메소드 get과set
		
		Person p1 = new Person();
		//p1.name = "펭수";
		//보안상 객체의 변수에 바로접근하지 못함
		p1.setName("펭수");
		System.out.println(p1.getName());
		p1.setage(25);
		System.out.println(p1.getage());
		
		Person p2 = new Person();
		p2.setName("길동");
		System.out.println(p2.getName());
		p2.setage(18);
		System.out.println(p2.getage());
	}

}
