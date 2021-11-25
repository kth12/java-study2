package application;

import java.util.Random;

public class Randomword {
//스페이스바로 뛰어진 단어들을 문자열로 str에 저장
	private String str = "economics  entertainment strategy  argument  perspective apartment  atmosphere establishment presentation development application refrigerator preference organization midnight  philosophy depression membership attention  magazine  intention  possession judgment  protection recognition association environment interaction passenger  activity  relation  education  grandmother reputation department politics  stranger  election  population conversation personality elevator  agreement  foundation responsibility improvement communication impression chemistry  possibility";
	private String[] words = str.split(" "); // 문자열을 스페이스바로 잘라서 배열에 입력

	private String slectword; // 랜덤으로 선택된 단어
	private char[] characters;// 문자배열
	private Random random = new Random();

	public Randomword() {
		// 생성자에 랜덤 단어 선택
		slectword = words[random.nextInt(words.length)]; // 1.랜덤으로 선택 수정
		characters = new char[slectword.length()]; // 선택단어의 길이만큼 문자배열 크기로 생성
	}

	public void getwords() { // 현재 words배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
//		characters[3] = 'x'; // 테스트
		for (char c : characters) {
			if (c == '\u0000') 
				sb.append(c == '\u0000' ? '_' :c);
				sb.append(' ');
			}

//			System.out.println(slectword); //정답 출력 (테스트용)
			return sb.toString(); // 선택된 랜덤 단어를 가져옴
		}
	
		public void addGuess(char c) {
			//넘어온 문자를 검사해서 선택단어에 있으면 characters 배열에 저장
         for(int i=0; i<slectword.length(); i++) {//단어 길이만큼 반복
        	 if(c == slectword.charAt(i)) {
        		 characters[i] = c;
        	 }
         }
	}

}
