package school;

public class student {
	private String name;
	private int age;
	private boolean visible; // ��ü true, ���� false
	private double temperature; // �µ�üũ
    
	//������
	public student(String name, int age) {
		visible = true;
		temperature = 0.0;
		this.name = name;
		this.age = age;
	}
	
	//�ڵ��ϼ� ������� getter setter �޼��� �ϼ�

	public String getName() {
		return name;
	

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

//	toString �޼ҵ�
	@Override
	public String toString() {
		return "�л� [�̸�=" + name + ", ����=" + age + ", ��ü=" + visible + ", �µ�=" + temperature + "]";
	}


}
