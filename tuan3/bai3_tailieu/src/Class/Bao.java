package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh109;

    public Bao() {

    }

    public Bao(String maTaiLieu109, String tenNXB109, String soBanPhathanh109, String ngayPhathanh109) {
        super(maTaiLieu109, tenNXB109, soBanPhathanh109);
        this.ngayPhatHanh109 = ngayPhathanh109;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap ngay phat hanh: ");
        ngayPhatHanh109 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh109);
    }
}
