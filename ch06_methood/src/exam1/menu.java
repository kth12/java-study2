package exam1;

public class menu {
     String[] options = {"�����ۺ���", "������ �߰�", "������ ����", "����"};
     
     void display() {  //�ɼ� �޴����� ����Ѵ�.
    	 for(int i=0; i<options.length; i++) {
    		 System.out.printf("%d.%s \n", i , options[i]);
    	 }
     }
}
