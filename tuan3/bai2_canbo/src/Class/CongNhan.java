package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac109;

    public CongNhan() {

    }

    public CongNhan(String hoTen109, String ngaySinh109, String gioiTinh109, String diaChi109, String bac109) {
        super(hoTen109, ngaySinh109, gioiTinh109, diaChi109);
        this.bac109 = bac109;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("\tNhap bac: ");
        bac109 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBac: " + bac109);
    }
}
