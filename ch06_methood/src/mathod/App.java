package mathod;

public class App {
	public static void main(String[] args) {

		person p1 = new person();
//�ν��Ͻ� ������ ���� ������ �ڵ����� 0,null�ʱ�ȭ ��Ŵ
		System.out.println(p1.name);
		System.out.println(p1.age);

		p1.sayHello(); // �޼ҵ�ȣ��

		p1.name = "���";
		p1.age = 7;

//System.out.println(p1.name);
//System.out.println(p1.age);
		p1.sayHello(); // �޼ҵ� ȣ��

		person p2 = new person();
		p2.name = "���̾�";

		p2.sayHello();
	}

}
