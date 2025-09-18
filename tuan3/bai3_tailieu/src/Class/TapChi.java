package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh109;
    private int thangPhatHanh109;

    public TapChi() {

    }

    public TapChi(String maTaiLieu109, String tenNXB109, String soBanPhathanh109, int soPhatHanh109,
            int thangPhatHanh109) {
        super(maTaiLieu109, tenNXB109, soBanPhathanh109);
        this.soPhatHanh109 = soPhatHanh109;
        this.thangPhatHanh109 = thangPhatHanh109;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh109 = sc.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        thangPhatHanh109 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh109);
        System.out.println("Thang phat hanh: " + thangPhatHanh109);
    }
}
