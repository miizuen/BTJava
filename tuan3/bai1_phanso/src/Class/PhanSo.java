package Class;

import java.util.Scanner;

public class PhanSo {
    // thuoc tinh
    private int tuSo109;
    private int mauSo109;

    // phuong thuc
    // ham khoi tao khong co doi so
    public PhanSo() {
        tuSo109 = 0;
        mauSo109 = 1;
    }

    // ham khoi tao co doi so
    public PhanSo(int tuSo109, int mauSo109) {
        this.tuSo109 = tuSo109;
        this.mauSo109 = mauSo109;
    }

    // ham nhap phan so
    public void nhapPS(Scanner sc) {
        int a, b;
        do {
            System.out.print("\tNhap vao tu so: ");
            a = sc.nextInt();
            System.out.print("\tNhap vao mau so: ");
            b = sc.nextInt();
            if (b == 0)
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai");
            else {
                tuSo109 = a;
                mauSo109 = b;
            }
        } while (b == 0);
    }

    // ham hien thi
    public void hienThiPS() {
        if (tuSo109 * mauSo109 < 0)
            System.out.println("\t-" + Math.abs(tuSo109) + "/" + Math.abs(mauSo109));
        else
            System.out.println("\t" + Math.abs(tuSo109) + "/" + Math.abs(mauSo109));
    }

    // ham cong
    public PhanSo congPS(PhanSo ps2) {
        int a = tuSo109 * ps2.mauSo109 + ps2.tuSo109 * mauSo109;
        int b = mauSo109 * ps2.mauSo109;
        return new PhanSo(a, b);
    }

    // ham tru
    public PhanSo truPS(PhanSo ps2) {
        int a = tuSo109 * ps2.mauSo109 - ps2.tuSo109 * mauSo109;
        int b = mauSo109 * ps2.mauSo109;
        return new PhanSo(a, b);
    }

    // ham nhan
    public PhanSo nhanPS(PhanSo ps2) {
        int a = tuSo109 * ps2.tuSo109;
        int b = mauSo109 * ps2.mauSo109;
        return new PhanSo(a, b);
    }

    // ham chia
    public PhanSo chiaPS(PhanSo ps2) {
        int a = tuSo109 * ps2.mauSo109;
        int b = mauSo109 * ps2.tuSo109;
        return new PhanSo(a, b);
    }

    // ham tim USCLN
    private int timUSCLN(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public boolean kiemTraToiGian() {
        if (timUSCLN(mauSo109, mauSo109) == 1)
            return true;
        else
            return false;
    }

    public void toiGianPS() {
        int x = timUSCLN(mauSo109, mauSo109);
        tuSo109 /= x;
        mauSo109 /= x;
    }
}
