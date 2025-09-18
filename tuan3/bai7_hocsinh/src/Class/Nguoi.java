package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen109;
	protected Date ngaySinh109;
	protected String queQuan109;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen109, Date ngaySinh109, String queQuan109) {
		this.hoTen109 = hoTen109;
		this.ngaySinh109 = ngaySinh109;
		this.queQuan109 = queQuan109;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen109 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh109 = strToDate(strDate);
		System.out.print("\tNhap que quan: ");
		queQuan109 = sc.nextLine();
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
		System.out.println("\tQue quan: " + queQuan109);
	}

	// ham lay ra que quan
	public String getqueQuan109() {
		return queQuan109;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getngaySinh109() {
		return ngaySinh109;
	}
}
