package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> dsts109;

	public TuyenSinh() {
		dsts109 = new ArrayList<ThiSinh>(10);
	}

	public void themThiSinh(ThiSinh ts) {
		dsts109.add(ts);
	}

	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts109;
		int chon109;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n109 = sc.nextInt();
		sc.nextLine();

		for (int i109 = 0; i109 < n109; i109++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon109 = sc.nextInt();

			switch (chon109) {
				case 1:
					ts109 = new KhoiA("Toan", "Ly", "Hoa");
					break;
				case 2:
					ts109 = new KhoiB("Toan", "Hoa", "Sinh");
					break;
				case 3:
					ts109 = new KhoiC("Van", "Su", "Dia");
					break;
				default:
					ts109 = new KhoiA("Toan", "Ly", "Hoa");
					break;
			}

			ts109.nhapThongTin(sc);
			themThiSinh(ts109);
		}
	}

	public void hienThiDanhSach() {
		int n109 = dsts109.size();
		for (int i109 = 0; i109 < n109; i109++) {
			System.out.println("Thi sinh thu " + (i109 + 1) + " la:");
			dsts109.get(i109).hienThiThongTin();
		}
	}

	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts109) {
			if (ts.getSoBD109() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
