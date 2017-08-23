package carrents;

import java.util.Scanner;

abstract class CarRent {
	Scanner sc = new Scanner(System.in);
	// Ʒ��
	private String brand;
	// ���ƺ�
	private String no;
	// �����
	private double rent;
	
	// ���캯��
	public CarRent() {
		super();
	}
	public CarRent(String brand, String no, double rent) {
		super();
		this.brand = brand;
		this.no = no;
		this.rent = rent;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	// �����⳵�ķ���
	public abstract void rentWay();
	// �����������ķ���
	public abstract void rentTotal();
	
}

// �����γ�car����
class Car extends CarRent {
	// �γ��ͺ�
	private String model;

	// ���캯��
	public Car() {
		super();
	}
	public Car(String brand, String no, double rent, String model) {
		super(brand, no, rent);
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// ��д�⳵����
	public void rentWay() {
		System.out.println("�ɹ����޵�����Ʒ�ƣ�1.����\t2.���");
		System.out.print("��ѡ����Ҫ���޵�����Ʒ�ƣ�");
		int brand1 = sc.nextInt();
		// �ж����������
		switch (brand1) {
		case 1:// �趨Ϊ����
			super.setBrand("����");
			System.out.println("�ɹ����޵������ͺţ�1.X6\t2.550i");
			System.out.print("��ѡ����Ҫ���޵������ͺţ�");
			int model1 = sc.nextInt();
			if ("1".equals(model1)) {
				this.model = "X6";
				super.setNo("��NY28588");
				super.setRent(800);
			} else {
				this.model = "550i";
				super.setNo("��CNY3284");
				super.setRent(600);
			}
			break;
		case 2:// �趨Ϊ���
			super.setBrand("���");
			System.out.println("�ɹ����޵������ͺţ�1.������\t2.GL8");
			System.out.print("��ѡ����Ҫ���޵������ͺţ�");
			int model2 = sc.nextInt();
			if ("1".equals(model2)) {
				this.model = "������";
				super.setNo("��NT37465");
				super.setRent(300);
			} else {
				this.model = "GL8";
				super.setNo("��NT96968");
				super.setRent(600);
			}
			break;
		default:
			break;
		}
	}
	
	// ��д�����㷽��
	public void rentTotal() {
		double rents = 0;
		System.out.print("��������Ҫ���޵�������");
		int days = sc.nextInt();
		if (days > 7) {
			rents = super.getRent() * days * 0.9;
		} else if (days > 30) {
			rents = super.getRent() * days * 0.8;
		} else {
			rents = super.getRent() * days * 0.7;
		}
		System.out.println("���ɹ������ˣ�" + super.getBrand() + model + " " + "���ƺ�Ϊ��" + super.getNo() + " " + "����Ҫ֧�������޷��ã�" + rents + "Ԫ�����");
	}
}

//�����γ�bus����
class Bus extends CarRent {
	// �γ��ͺ�
	private int seats;

	// ���캯��
	public Bus() {
		super();
	}
	public Bus(String brand, String no, double rent, int seats) {
		super(brand, no, rent);
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	// ��д�⳵����
	public void rentWay() {
		System.out.println("�ɹ����޵�����Ʒ�ƣ�1.��\t2.����");
		System.out.print("��ѡ����Ҫ���޵�����Ʒ�ƣ�");
		int brand1 = sc.nextInt();
		// �ж����������
		switch (brand1) {
		case 1:// �趨Ϊ��
			super.setBrand("��");
			System.out.println("�ɹ����޵�������λ����1.16\t2.34");
			System.out.print("��ѡ����Ҫ���޵�������λ����");
			int seat1 = sc.nextInt();
			if ("1".equals(seat1)) {
				this.seats = 16;
				super.setNo("��6566754");
				super.setRent(800);
			} else {
				this.seats = 34;
				super.setNo("��9696996");
				super.setRent(1500);
			}
			break;
		case 2:// �趨Ϊ����
			super.setBrand("����");
			System.out.println("�ɹ����޵�������λ����1.16\t2.34");
			System.out.print("��ѡ����Ҫ���޵�������λ����");
			int seat2 = sc.nextInt();
			if ("1".equals(seat2)) {
				this.seats = 16;
				super.setNo("��NT37465");
				super.setRent(800);
			} else {
				this.seats = 34;
				super.setNo("��NT96968");
				super.setRent(1500);
			}
			break;
		default:
			break;
		}
	}
	
	// ��д�����㷽��
	public void rentTotal() {
		double rents = 0;
		System.out.print("��������Ҫ���޵�������");
		int days = sc.nextInt();
		if (days >= 3) {
			rents = super.getRent() * days * 0.9;
		} else if (days >= 7) {
			rents = super.getRent() * days * 0.8;
		} else if (days >= 30) {
			rents = super.getRent() * days * 0.7;
		} else {
			rents = super.getRent() * days * 0.6;
		}
		System.out.println("���ɹ������ˣ�" + super.getBrand() + " " + "��λ��Ϊ��" + seats + " " + "���ƺ�Ϊ��" + super.getNo() + " " + "����Ҫ֧�����޷��ã�" + rents + "Ԫ�����");
	}
}



