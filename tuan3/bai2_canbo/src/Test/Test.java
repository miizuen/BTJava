package Test;

import java.util.Scanner;

import Class.QLCB;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb109 = new QLCB();
        qlcb109.nhapDanhSach(sc);
        System.out.println("\tNhap vao ho ten can tim kiem: ");
        String name109 = sc.nextLine();
        qlcb109.timKiemCanBo(name109);
        sc.close();
    }
}
