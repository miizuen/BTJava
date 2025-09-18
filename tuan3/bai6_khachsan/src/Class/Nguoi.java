package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen109;
	protected Date ngaySinh109;
	protected int CMND109;

	public Nguoi() {

	}

	public Nguoi(String hoTen109, Date ngaySinh109, int CMND109) {
		this.hoTen109 = hoTen109;
		this.ngaySinh109 = ngaySinh109;
		this.CMND109 = CMND109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen109 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh109 = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND109 = sc.nextInt();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen109);
		System.out.println("\tNgay sinh: " + ngaySinh109);
		System.out.println("\tCMND: " + CMND109);
	}

	// ham lay ra thong tin CMND
	public int getCMND109() {
		return CMND109;
	}
}
