package application;

import java.util.Random;

public class Randomword {
//�����̽��ٷ� �پ��� �ܾ���� ���ڿ��� str�� ����
	private String str = "economics  entertainment strategy  argument  perspective apartment  atmosphere establishment presentation development application refrigerator preference organization midnight  philosophy depression membership attention  magazine  intention  possession judgment  protection recognition association environment interaction passenger  activity  relation  education  grandmother reputation department politics  stranger  election  population conversation personality elevator  agreement  foundation responsibility improvement communication impression chemistry  possibility";
	private String[] words = str.split(" "); // ���ڿ��� �����̽��ٷ� �߶� �迭�� �Է�

	private String slectword; // �������� ���õ� �ܾ�
	private char[] characters;// ���ڹ迭
	private Random random = new Random();

	public Randomword() {
		// �����ڿ� ���� �ܾ� ����
		slectword = words[random.nextInt(words.length)]; // 1.�������� ���� ����
		characters = new char[slectword.length()]; // ���ôܾ��� ���̸�ŭ ���ڹ迭 ũ��� ����
	}

	public void getwords() { // ���� words�迭�� �ִ� ��ü �ܾ ���
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
//		characters[3] = 'x'; // �׽�Ʈ
		for (char c : characters) {
			if (c == '\u0000') 
				sb.append(c == '\u0000' ? '_' :c);
				sb.append(' ');
			}

//			System.out.println(slectword); //���� ��� (�׽�Ʈ��)
			return sb.toString(); // ���õ� ���� �ܾ ������
		}
	
		public void addGuess(char c) {
			//�Ѿ�� ���ڸ� �˻��ؼ� ���ôܾ ������ characters �迭�� ����
         for(int i=0; i<slectword.length(); i++) {//�ܾ� ���̸�ŭ �ݺ�
        	 if(c == slectword.charAt(i)) {
        		 characters[i] = c;
        	 }
         }
	}

}
