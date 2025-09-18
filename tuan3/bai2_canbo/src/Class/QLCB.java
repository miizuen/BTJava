package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb109;

    public QLCB() {
        dscb109 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb109) {
        dscb109.add(cb109);
    }

    public void nhapDanhSach(Scanner sc) {
        CanBo cb109;
        System.out.println("\tNhap vao so luong can bo: ");
        int n109 = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap thong tin chi tiet: ");
        for (int i109 = 0; i109 < n109; i109++) {
            System.out.println("\tLan nhap thu " + (i109 + 1) + ": ");
            System.out.println("\tChon can bo (1-KySu;2-NhanVien;3-CongNhan): ");
            int chon109 = sc.nextInt();
            sc.nextLine();
            cb109 = new CanBo();
            switch (chon109) {
                case 1:
                    cb109 = new KySu();
                    break;
                case 2:
                    cb109 = new NhanVien();
                    break;
                case 3:
                    cb109 = new CongNhan();
                    break;
                default:
                    cb109 = new KySu();
                    break;
            }
            cb109.nhapThongTin(sc);
            themCanBo(cb109);
        }
    }

    public void timKiemCanBo(String hoten109) {
        for (CanBo cb109 : dscb109) {
            if (hoten109.equals(cb109.getHoTen109())) {
                cb109.hienThiThongTin();
            }
        }
    }
}
