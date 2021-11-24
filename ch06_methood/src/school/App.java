package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체를 만들기
		student s1 = new student("펭수", 7);
		student s2 = new student("펭수", 37);
		student s3 = new student("펭수", 27);
		student s4 = new student("펭수", 17);
		
		s1.setVisible(false); //펭수는 원격 ,온도측정안함
		
		s2.setTemperature(35.5); //길동은 집체 온도 35.5
		
		s3.setTemperature(36.5); //라이언은 집체 온도36.5
		
		s4.setVisible(false); //오리온도 집격
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
			}

}
