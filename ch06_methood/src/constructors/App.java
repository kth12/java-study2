package constructors;

public class App {
	public static void main(String[] args) {
		// ������ : Ŭ������ Ư���� �޼ҵ�
		person p1 = new person("���", 120.0);
		// �⺻�����ڴ� ���� ����
		person p2 = new person("�浿", 172.5);
		person p3 = new person("���̾�", 165.5);

//		System.out.printf("�̸� : %s , Ű :%.1f \n", p1.getName(), p1.getheghit());
//		System.out.printf("�̸� : %s , Ű :%.1f \n", p2.getName(), p2.getheghit());
//		System.out.printf("�̸� : %s , Ű :%.1f \n", p3.getName(), p3.getheghit());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
