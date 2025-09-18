package Test;

import Class.QuanLySach;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls109 = new QuanLySach();
        qls109.nhapDanhSachTaiLieu(sc);
        System.out.println("\tNhap vao loai tai lieu can tim: ");
        String loai109 = sc.nextLine();
        qls109.timLoaiTL(loai109);
        System.out.println("\tNhap vao ma tai lieu can tim: ");
        String maTL109 = sc.nextLine();
        qls109.timMaTL(maTL109);
        sc.close();
    }
}
