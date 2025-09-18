package Class;

import java.util.Scanner;

public class CanBo {
    private String hoTen109;
    private String ngaySinh109;
    private String gioiTinh109;
    private String diaChi109;

    public CanBo() {
    }

    public CanBo(String hoTen109, String ngaySinh109, String gioiTinh109, String diaChi109) {
        this.hoTen109 = hoTen109;
        this.ngaySinh109 = ngaySinh109;
        this.gioiTinh109 = gioiTinh109;
        this.diaChi109 = diaChi109;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("\tNhap vao ho ten: ");
        hoTen109 = sc.nextLine();
        System.out.println("\tNhap ngay sinh(dd/mm/yyyy): ");
        ngaySinh109 = sc.nextLine();
        System.out.println("\tNhap gioi tinh: ");
        gioiTinh109 = sc.nextLine();
        System.out.println("\tNhap dia chi: ");
        diaChi109 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen109);
        System.out.println("\tNgay sinh: " + ngaySinh109);
        System.out.println("\tGioi tinh: " + gioiTinh109);
        System.out.println("\tDia chi: " + diaChi109);
    }

    public String getHoTen109() {
        return this.hoTen109;
    }
}
