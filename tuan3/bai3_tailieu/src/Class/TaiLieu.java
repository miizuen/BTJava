package Class;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu109;
    private String tenNXB109;
    private String soBanPhatHanh109;

    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu109, String tenNXB109, String soBanPhathanh109) {
        this.maTaiLieu109 = maTaiLieu109;
        this.tenNXB109 = tenNXB109;
        this.soBanPhatHanh109 = soBanPhathanh109;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu109 = sc.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        tenNXB109 = sc.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        soBanPhatHanh109 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu109);
        System.out.println("Ten nha xuat ban: " + tenNXB109);
        System.out.println("So ban phat hanh: " + soBanPhatHanh109);
    }

    public String getmaTaiLieu109() {
        return maTaiLieu109;
    }
}
