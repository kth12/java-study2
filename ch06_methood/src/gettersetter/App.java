package gettersetter;

public class App {
	
	public static void main(String[] args) {
		//�ν��Ͻ� ������ �����ϴ� �޼ҵ� get��set
		
		Person p1 = new Person();
		//p1.name = "���";
		//���Ȼ� ��ü�� ������ �ٷ��������� ����
		p1.setName("���");
		System.out.println(p1.getName());
		p1.setage(25);
		System.out.println(p1.getage());
		
		Person p2 = new Person();
		p2.setName("�浿");
		System.out.println(p2.getName());
		p2.setage(18);
		System.out.println(p2.getage());
	}

}
