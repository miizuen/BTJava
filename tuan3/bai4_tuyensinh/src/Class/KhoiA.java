package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1109;
	private String mon2109;
	private String mon3109;

	public KhoiA() {

	}

	public KhoiA(String mon1109, String mon2109, String mon3109) {
		this.mon1109 = mon1109;
		this.mon2109 = mon2109;
		this.mon3109 = mon3109;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1109 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2109 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3109 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1109 + " - " + mon2109 + " - " + mon3109);
	}
}
