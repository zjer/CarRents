package carrents;

import java.util.Scanner;

public class CarRentTest {

	public static void main(String[] args) {
		System.out.println("==========欢迎光临XXX汽车租赁公司==========");
		System.out.println("可供租赁的车辆类型：1.轿车\t2.客车");
		System.out.print("请选择你要租赁的汽车类型：");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		if (type == 1) {
			CarRent car = new Car();
			car.rentWay();
			car.rentTotal();
		} else {
			CarRent bus = new Bus();
			bus.rentWay();
			bus.rentTotal();
		}
	}

}
