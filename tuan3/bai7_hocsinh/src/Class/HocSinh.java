package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop109;
	private String khoaHoc109;
	private String kyHoc109;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen109, String lop109, String khoaHoc109, String kyHoc109) {
		this.hoTen109 = hoTen109;
		this.lop109 = lop109;
		this.khoaHoc109 = khoaHoc109;
		this.kyHoc109 = kyHoc109;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop109 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoaHoc109 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc109 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tlop: " + lop109);
		System.out.println("\tKhoa hoc: " + khoaHoc109);
		System.out.println("\tKy hoc: " + kyHoc109);
	}

	// ham lay ra thong tin ve lop109
	public String getlop109() {
		return lop109;
	}
}
