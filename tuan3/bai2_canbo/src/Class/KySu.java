package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao109;

    public KySu() {

    }

    public KySu(String hoTen109, String ngaySinh109, String gioiTinh109, String diaChi109, String nganhDaoTao109) {
        super(hoTen109, ngaySinh109, gioiTinh109, diaChi109);
        this.nganhDaoTao109 = nganhDaoTao109;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("\tNhap nganh dao tao: ");
        nganhDaoTao109 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + nganhDaoTao109);
    }
}
