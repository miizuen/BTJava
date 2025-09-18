package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private int soNguoi109;
	private int soNha109;
	private Nguoi[] list109; // list la mang danh sach chua cac thanh vien trong ho

	public HoDan() {
		list109 = new Nguoi[10];
	}

	public HoDan(String hoTen109, Date ngaySinh109, String ngheNghiep109, int soNguoi109, int soNha109) {
		super(hoTen109, ngaySinh109, ngheNghiep109);
		this.soNguoi109 = soNguoi109;
		this.soNha109 = soNha109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi109 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha109 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i109 = 0; i109 < soNguoi109; i109++) {
			System.out.println("Nguoi thu " + (i109 + 1) + " la:");
			list109[i109] = new Nguoi();
			list109[i109].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi109);
		System.out.println("\tSo nha: " + soNha109);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi109; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list109[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList109() {
		return list109;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi109() {
		return soNguoi109;
	}
}
