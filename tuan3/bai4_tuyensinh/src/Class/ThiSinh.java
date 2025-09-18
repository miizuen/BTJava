package Class;

import java.util.Scanner;

public class ThiSinh {
	private int soBD109;
	private String hoTen109;
	private String diaChi109;
	private String dienUuTien109;

	public ThiSinh() {

	}

	public ThiSinh(int soBD109, String hoTen109, String diaChi109, String dienUuTien109) {
		this.soBD109 = soBD109;
		this.hoTen109 = hoTen109;
		this.diaChi109 = diaChi109;
		this.dienUuTien109 = dienUuTien109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD109 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen109 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi109 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien109 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD109);
		System.out.println("\tHo ten: " + hoTen109);
		System.out.println("\tDia chi: " + diaChi109);
		System.out.println("\tDien uu tien: " + dienUuTien109);
	}

	public int getSoBD109() {
		return soBD109;
	}
}
