package Class;

import java.util.Scanner;

public class SinhVien {

	protected String hoTen109;
	protected String maSV109;
	protected String ngaySinh109;
	protected String lop109;

	public SinhVien() {

	}

	public SinhVien(String hoTen109, String maSV109, String ngaySinh109, String lop109) {
		this.hoTen109 = hoTen109;
		this.maSV109 = maSV109;
		this.ngaySinh109 = ngaySinh109;
		this.lop109 = lop109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen109 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV109 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh109 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop109 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen109);
		System.out.println("\tNgay sinh: " + ngaySinh109);
		System.out.println("\tMa sinh vien: " + maSV109);
		System.out.println("\tlop: " + lop109);
	}
}
