package carrents;

import java.util.Scanner;

public class CarRentTest {

	public static void main(String[] args) {
		System.out.println("==========��ӭ����XXX�������޹�˾==========");
		System.out.println("�ɹ����޵ĳ������ͣ�1.�γ�\t2.�ͳ�");
		System.out.print("��ѡ����Ҫ���޵��������ͣ�");
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
