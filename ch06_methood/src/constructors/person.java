package constructors;

public class person {
	private String name;
	private double height;

//	public person() {} //�⺻������ (��������)
//	������ �޼ҵ� : public + Ŭ������(), ����Ÿ�Ծ���
	public person() {
		name = "�͸�";
		height = 170;
		System.out.println("�ѻ���� ����!");
	}

	public person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("�� ����� ����!");
	}
	//toString �޼ҵ�
	public String toString() {
		
		return  "�̸� : "+name+",Ű: "+height;
	}

	// get set �޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getheghit() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

}
