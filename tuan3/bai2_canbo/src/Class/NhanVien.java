package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec109;

    public NhanVien() {

    }

    public NhanVien(String hoTen109, String ngaySinh109, String gioiTinh109, String diaChi109, String congViec109) {
        super(hoTen109, ngaySinh109, gioiTinh109, diaChi109);
        this.congViec109 = congViec109;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("\tNhap cong viec: ");
        congViec109 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + congViec109);
    }
}