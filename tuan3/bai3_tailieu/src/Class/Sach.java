package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia109;
    private int soTrang109;

    public Sach() {
    }

    public Sach(String maTaiLieu109, String tenNXB109, String soBanPhathanh109, String tacGia109, int soTrang109) {
        super(maTaiLieu109, tenNXB109, soBanPhathanh109);
        this.tacGia109 = tacGia109;
        this.soTrang109 = soTrang109;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("Nhap ten tac gia: ");
        tacGia109 = sc.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang109 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ten tac gia " + tacGia109);
        System.out.println("So trang: " + soTrang109);
    }
}
