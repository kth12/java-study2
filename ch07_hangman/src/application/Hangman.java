package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; // ������ ��� ����?
	private Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);

	// ���α׷��� �����ϴ� �� �޼ҵ�
	public void run() {
		do {
			displayword(); // ȭ�鿡 �ܾ�ǥ��
			getuserInput(); // ö�� �ϳ��� �Է¹���
			checkuserinput(); // �´��� üũ (���� ������ running = flase)
		} while (running);
	}

	private void displayword() {
		// System.out.println("ȭ�鿡 �ܾ� ǥ��");
		// 2.���� ���� ��ü�� ������ �������� �� �ܾ ����Ѵ�.
		System.out.println(word.toString());
	}

	private void getuserInput() {
//  �������� �� ���� �Է� �䱸
//		�Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ�
//		RandomWord ��ü�� ���� (addGuess(����) �޼ҵ带 ������ )
		System.out.println("�� ���� �Է� : ");
		String guess = scanner.nextLine(); // �Է¹��� ���ڿ��� Guess�� ����
//     �ܾ�� �Է¹��� ���ڰ� �ִ��� Ȯ���ؼ� ó���Ѵ�. (�ܾ�� Randomword ��ü word�� ���)
		word.addGuess(guess.charAt(0)); // ù��° ���ڸ� �Է�
	}

	private void checkuserinput() {
//		������ �ܾ �ٸ������ üũ�ؼ� ������ ����
//		���� ���� Ȯ���� �ϴ� �޼ҵ� iscompleted �� Ŭ������ �����
		if(word.iscompleted()) {
			System.out.println("�� ������!");
			System.out.println("������ :" + word.toString());
			running = false; //�ݺ��� �������� => ����
		}

	}

	/**
	 * ��ĳ�ʸ� �ݴ� �޼ҵ�
	 */
	public void close() {
		scanner.close();
		
	}

}
