package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen109;
	protected String ngaySinh109;
	protected String queQuan109;

	public Nguoi() {

	}

	public Nguoi(String hoTen109, String ngaySinh109, String queQuan109) {
		this.hoTen109 = hoTen109;
		this.ngaySinh109 = ngaySinh109;
		this.queQuan109 = queQuan109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen109 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh109 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan109 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen109);
		System.out.println("\tNgay sinh: " + ngaySinh109);
		System.out.println("\tQue quan: " + queQuan109);
	}
}
