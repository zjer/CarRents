package carrents;

import java.util.Scanner;

abstract class CarRent {
	Scanner sc = new Scanner(System.in);
	// 品牌
	private String brand;
	// 车牌号
	private String no;
	// 日租金
	private double rent;
	
	// 构造函数
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
	
	// 创建租车的方法
	public abstract void rentWay();
	// 创建计算租金的方法
	public abstract void rentTotal();
	
}

// 创建轿车car子类
class Car extends CarRent {
	// 轿车型号
	private String model;

	// 构造函数
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
	
	// 重写租车方法
	public void rentWay() {
		System.out.println("可供租赁的汽车品牌：1.宝马\t2.别克");
		System.out.print("请选择你要租赁的汽车品牌：");
		int brand1 = sc.nextInt();
		// 判断输入的数字
		switch (brand1) {
		case 1:// 设定为宝马
			super.setBrand("宝马");
			System.out.println("可供租赁的汽车型号：1.X6\t2.550i");
			System.out.print("请选择你要租赁的汽车型号：");
			int model1 = sc.nextInt();
			if ("1".equals(model1)) {
				this.model = "X6";
				super.setNo("京NY28588");
				super.setRent(800);
			} else {
				this.model = "550i";
				super.setNo("京CNY3284");
				super.setRent(600);
			}
			break;
		case 2:// 设定为别克
			super.setBrand("别克");
			System.out.println("可供租赁的汽车型号：1.林荫大道\t2.GL8");
			System.out.print("请选择你要租赁的汽车型号：");
			int model2 = sc.nextInt();
			if ("1".equals(model2)) {
				this.model = "林荫大道";
				super.setNo("京NT37465");
				super.setRent(300);
			} else {
				this.model = "GL8";
				super.setNo("京NT96968");
				super.setRent(600);
			}
			break;
		default:
			break;
		}
	}
	
	// 重写租金计算方法
	public void rentTotal() {
		double rents = 0;
		System.out.print("请输入您要租赁的天数：");
		int days = sc.nextInt();
		if (days > 7) {
			rents = super.getRent() * days * 0.9;
		} else if (days > 30) {
			rents = super.getRent() * days * 0.8;
		} else {
			rents = super.getRent() * days * 0.7;
		}
		System.out.println("您成功租赁了：" + super.getBrand() + model + " " + "车牌号为：" + super.getNo() + " " + "您需要支付的租赁费用：" + rents + "元人民币");
	}
}

//创建轿车bus子类
class Bus extends CarRent {
	// 轿车型号
	private int seats;

	// 构造函数
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
	
	// 重写租车方法
	public void rentWay() {
		System.out.println("可供租赁的汽车品牌：1.金杯\t2.金龙");
		System.out.print("请选择你要租赁的汽车品牌：");
		int brand1 = sc.nextInt();
		// 判断输入的数字
		switch (brand1) {
		case 1:// 设定为金杯
			super.setBrand("金杯");
			System.out.println("可供租赁的汽车座位数：1.16\t2.34");
			System.out.print("请选择你要租赁的汽车座位数：");
			int seat1 = sc.nextInt();
			if ("1".equals(seat1)) {
				this.seats = 16;
				super.setNo("京6566754");
				super.setRent(800);
			} else {
				this.seats = 34;
				super.setNo("京9696996");
				super.setRent(1500);
			}
			break;
		case 2:// 设定为金龙
			super.setBrand("金龙");
			System.out.println("可供租赁的汽车座位数：1.16\t2.34");
			System.out.print("请选择你要租赁的汽车座位数：");
			int seat2 = sc.nextInt();
			if ("1".equals(seat2)) {
				this.seats = 16;
				super.setNo("京NT37465");
				super.setRent(800);
			} else {
				this.seats = 34;
				super.setNo("京NT96968");
				super.setRent(1500);
			}
			break;
		default:
			break;
		}
	}
	
	// 重写租金计算方法
	public void rentTotal() {
		double rents = 0;
		System.out.print("请输入您要租赁的天数：");
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
		System.out.println("您成功租赁了：" + super.getBrand() + " " + "座位数为：" + seats + " " + "车牌号为：" + super.getNo() + " " + "您需要支付租赁费用：" + rents + "元人民币");
	}
}



