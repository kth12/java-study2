package ch02_variable;

public class APp1 {

	public static void main(String[] args) {
		//���� ����� : 1. ���� ���� (Ÿ��,�ڷ���), 2.���� �ʱ�ȭ
		int x = 10;
		int y = 30;
		
		int z = x + y;
		
		int a; //���� a�� ����(Ÿ���ʿ�)
		int b = 10; //���� b�� ����� �ʱ�ȭ ���ÿ�
		a = 7; //a�� �ʱⰪ �Է�


		System.out.Printin("����z�� ����: " + z); //���ڿ�("")+���� =���ڿ��� �ȴ�.
		System.out.Printin("����a�� ����: " + a); //
		System.out.Printin("����b�� ����: " + b);
		// ������ ���� �ٽ� ���Ҵ�(�ٲܼ� ��)
		z= a+b;
		
		System.out.Printin("����z�� ����: " + z);
	}

}
