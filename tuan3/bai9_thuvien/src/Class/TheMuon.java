package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon109;
	private Date ngayMuon109;
	private Date hanTra109;
	private String soHieu109;

	public TheMuon() {

	}

	public TheMuon(int soMuon109, Date ngayMuon109, String soHieu109) {
		this.soMuon109 = soMuon109;
		this.ngayMuon109 = ngayMuon109;
		this.soHieu109 = soHieu109;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon109 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strngayMuon109 = sc.nextLine();
		ngayMuon109 = strToDate(strngayMuon109);

		String strNgayTra = "31-12-2020";
		hanTra109 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu109 = sc.nextLine();
	}

	private Date strToDate(String strngayMuon109) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strngayMuon109);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon109);
		System.out.println("\tNgay muon: " + ngayMuon109);
		System.out.println("\tHan tra: " + hanTra109);
		System.out.println("\tSo hieu: " + soHieu109);
	}

	// ham lay ra thong tin ve han tra
	public Date gethanTra109() {
		return hanTra109;
	}
}
