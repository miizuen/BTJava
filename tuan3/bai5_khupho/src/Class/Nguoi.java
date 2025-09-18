package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen109;
	private Date ngaySinh109;
	private String ngheNghiep109;

	public Nguoi() {

	}

	public Nguoi(String hoTen109, Date ngaySinh109, String ngheNghiep109) {
		this.hoTen109 = hoTen109;
		this.ngaySinh109 = ngaySinh109;
		this.ngheNghiep109 = ngheNghiep109;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen109 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate109 = sc.nextLine();
		ngaySinh109 = strToDate(strDate109);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep109 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
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

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen109);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh109));
		System.out.println("\tNghe nghiep: " + ngheNghiep109);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date109) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date109);

		return strDate;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh109() {
		return ngaySinh109;
	}
}
