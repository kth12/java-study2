package instanceVariable;

public class App {
public static void main(String[] args) {
  person p1 = new person();
  // 인스턴스 변수의 값이 없을때 자동으로 0, null초기화됨
  System.out.println(p1.name);
  System.out.println(p1.age);
  
  
  }

}
