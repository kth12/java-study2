package text;   //테스트용 패키지

import java.util.Random;

import application.Randomword;

public class text {
    public static void main(String[] args) {
//		Randomword r = new Randomword();
//		r.getwords();
//		System.out.println(r.toString());
//		랜덤으로가져오는방법?
	Random random = new Random();
	
	String[] words = {"펭수","고양이","라이언","늑대","소"};
	
	for(int i=0; i<100; i++) {
		int randomindex =random.nextInt(words.length);  // 0~(배열갯수-1) 랜덤으로 출력
		System.out.println(words[randomindex]);
	  }
	}
}
