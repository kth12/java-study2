package ch06_methood;

//�ϳ��� ���Ͽ� �������� Ŭ������ ����� �ִ�
class person{
	String name;
}
//public class �� �� ���Ͽ� �ϳ��� ��������, �����̸��� ����
public class Classobject {

	public static void main(String[] args) {
		// Ŭ������ ��ü
		//Ŭ������ ���赵�̰� ���� ��밡���� ��ü�� ����(��ü�� ���� �޸𸮿� ������ = �ν��Ͻ�)
		person p1 =null; //�������� �޽� Ŭ���� Ÿ�� p1 ����, �ʱⰪ����
		System.out.println(p1);
		p1 = new person();  //person�� ���� ��ü�� �����Ͽ� �� �ּҰ��� p1�� ����
		System.out.println(p1);
		
		p1.name  = "���";
		
		person p2 = new person();
		p2.name = "�浿";
		person p3 = new person();
		p3.name = "���̿�";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		
	}

}
