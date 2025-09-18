package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro109;
	private String loaiPhong109;
	private double giaPhong109;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen109, int CMND109, int soNgayTro109, String loaiPhong109, double giaPhong109) {
		this.hoTen109 = hoTen109;
		this.CMND109 = CMND109;
		this.soNgayTro109 = soNgayTro109;
		this.loaiPhong109 = loaiPhong109;
		this.giaPhong109 = giaPhong109;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro109 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong109 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong109 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro109);
		System.out.println("\tLoai phong: " + loaiPhong109);
		System.out.println("\tGia phong: " + giaPhong109);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro109() {
		return soNgayTro109;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong109() {
		return giaPhong109;
	}
}
