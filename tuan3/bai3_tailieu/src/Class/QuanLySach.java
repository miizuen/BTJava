package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl109;

    public QuanLySach() {
        dstl109 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl109) {
        dstl109.add(tl109);
    }

    public void nhapDanhSachTaiLieu(Scanner sc) {
        int chon109;
        String stop109;
        TaiLieu tl109;
        do {
            System.out.println("\tNhap loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon109 = sc.nextInt();
            sc.nextLine();
            switch (chon109) {
                case 1:
                    tl109 = new Sach();
                    break;
                case 2:
                    tl109 = new TapChi();
                    break;
                case 3:
                    tl109 = new Bao();
                    break;
                default:
                    tl109 = new Sach();
                    break;
            }
            tl109.nhapThongTin(sc);
            themTaiLieu(tl109);
            System.out.println("\tBan co muon nhap vao nua khong (c/k): ");
            stop109 = sc.nextLine();
        } while (stop109.equals("c"));
    }

    public void timMaTL(String maTL109) {
        for (TaiLieu tl109 : dstl109) {
            if (maTL109.equals(tl109.getmaTaiLieu109())) {
                tl109.hienThiThongTin();
            }
        }
    }

    public void timLoaiTL(String loai) {
        for (TaiLieu tl109 : dstl109) {
            if (loai.equals("Sach") && (tl109 instanceof Sach)) {
                tl109.hienThiThongTin();
            } else if (loai.equals("TapChi") && (tl109 instanceof TapChi)) {
                tl109.hienThiThongTin();
            } else if (loai.equals("Bao") && (tl109 instanceof Bao)) {
                tl109.hienThiThongTin();
            }
        }
    }
}
