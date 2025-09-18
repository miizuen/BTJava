package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	private double luongcung109;
	private double thuong109;
	private double phat109;
	private double luongThucLinh109;

	public CBGV() {

	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongcung109 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong109 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat109 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh109 = luongcung109 + thuong109 - phat109;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongcung109);
		System.out.println("\tthuong: " + thuong109);
		System.out.println("\tphat: " + phat109);
		System.out.println("\tLuong thuc linh: " + luongThucLinh109);
	}

	public double getluongThucLinh109() {
		return luongThucLinh109;
	}
}
