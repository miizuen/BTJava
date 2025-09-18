package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> dshd109;

	public KhuPho() {
		dshd109 = new ArrayList<HoDan>(10);
	}

	public void themHoDan(HoDan hoDan109) {
		dshd109.add(hoDan109);
	}

	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan109;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan109 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan109; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan109 = new HoDan();
			hoDan109.nhapThongTin(sc);
			themHoDan(hoDan109);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = dshd109.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd109.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv = null;

		for (HoDan hoDan : dshd109) {
			dstv = hoDan.getList109();
			for (int i = 0; i < hoDan.getSoNguoi109(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh109().getYear() + 1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}
