package text;   //�׽�Ʈ�� ��Ű��

import java.util.Random;

import application.Randomword;

public class text {
    public static void main(String[] args) {
//		Randomword r = new Randomword();
//		r.getwords();
//		System.out.println(r.toString());
//		�������ΰ������¹��?
	Random random = new Random();
	
	String[] words = {"���","�����","���̾�","����","��"};
	
	for(int i=0; i<100; i++) {
		int randomindex =random.nextInt(words.length);  // 0~(�迭����-1) �������� ���
		System.out.println(words[randomindex]);
	  }
	}
}
