package school;

public class App {

	public static void main(String[] args) {
		// �л� ��ü�� �����
		student s1 = new student("���", 7);
		student s2 = new student("���", 37);
		student s3 = new student("���", 27);
		student s4 = new student("���", 17);
		
		s1.setVisible(false); //����� ���� ,�µ���������
		
		s2.setTemperature(35.5); //�浿�� ��ü �µ� 35.5
		
		s3.setTemperature(36.5); //���̾��� ��ü �µ�36.5
		
		s4.setVisible(false); //�����µ� ����
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
			}

}
