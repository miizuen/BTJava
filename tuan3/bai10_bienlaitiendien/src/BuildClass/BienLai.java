package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	private int chiSoMoi109;
	private int chiSoCu109;
	private double tien109;

	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi109, int chiSoCu109, double tien109) {
		this.chiSoMoi109 = chiSoMoi109;
		this.chiSoCu109 = chiSoCu109;
		this.tien109 = tien109;
	}

	public BienLai(String tenChuHo109, int chiSoMoi109, int chiSoCu109, double tien109) {
		this.tenChuHo109 = tenChuHo109;
		this.chiSoMoi109 = chiSoMoi109;
		this.chiSoCu109 = chiSoCu109;
		this.tien109 = tien109;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi109 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu109 = sc.nextInt();
		sc.nextLine();
		tien109 = (chiSoMoi109 - chiSoCu109) * 750;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi109);
		System.out.println("\tChi so cu: " + chiSoCu109);
		System.out.println("\ttien109: : " + tien109);
	}
}
