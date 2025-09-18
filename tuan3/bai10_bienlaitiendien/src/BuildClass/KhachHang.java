package BuildClass;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo109;
	protected int soNha109;
	protected String maCongTo109;

	public KhachHang() {

	}

	public KhachHang(String tenChuHo109, int soNha109, String maCongTo109) {
		this.tenChuHo109 = tenChuHo109;
		this.soNha109 = soNha109;
		this.maCongTo109 = maCongTo109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo109 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha109 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo109 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo109);
		System.out.println("\tSo nha: " + soNha109);
		System.out.println("\tMa cong to: " + maCongTo109);
	}
}
