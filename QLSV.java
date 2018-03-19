package sv;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QLSV {

    int stt = 0;
    private String mMaSV;
    private String HoTen;
    private Date Ngaysinh;
    private String Diachi;
    private String DienThoai;
    Scanner sc = new Scanner(System.in);
    SinhVien sv[] = new SinhVien[50];

    //sv[0] = new SinhVien();
    public void add() throws ParseException {

        if (stt > 50) {
            System.out.println("Day Bo Nho");
        } else {
            Boolean flag = false;
            do {
                System.out.print("Nhap MaSV: ");
                mMaSV = sc.nextLine();
                for (int i = 0; i < stt; i++) {
                    if (mMaSV.equalsIgnoreCase(sv[i].getmMaSV()) == true) {
                        flag = true;
                    }
                }
            } while (flag);
            System.out.print("Nhap Ho Ten: ");
            HoTen = sc.nextLine();
            System.out.print("Nhap Dia Chi: ");
            Diachi = sc.nextLine();
            System.out.print("Nhap ngay thang:");
            String ngaythang;
            ngaythang = sc.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Ngaysinh = df.parse(ngaythang);
            System.out.print("Nhap SDT: ");
            DienThoai = sc.nextLine();
            SinhVien s = new SinhVien(mMaSV, HoTen, Ngaysinh, Diachi, DienThoai);
            sv[stt] = s;
            stt++;
        }
    }

    public void input(int stt) throws ParseException {
        System.out.print("Nhap Ho Ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap Dia Chi: ");
        Diachi = sc.nextLine();
        System.out.print("Nhap ngay thang:");
        String ngaythang;
        ngaythang = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Ngaysinh = df.parse(ngaythang);
        System.out.print("Nhap SDT: ");
        DienThoai = sc.nextLine();
        SinhVien s = new SinhVien(mMaSV, HoTen, Ngaysinh, Diachi, DienThoai);
        sv[stt]=s;
    }

    public void xemDS() {
        for (int i = 0; i < stt; i++) {
            System.out.println(" " + sv[i].toString());
        }
    }

    public void xemTT(int i) {
        System.out.print("MSVV:" + sv[i].getmMaSV());
        System.out.print("\tHo tenSV:" + sv[i].getHoTen());
        System.out.print("\tDia ChiSV:" + sv[i].getDiachi());
        System.out.print("\tNgay Sinh SV:" + sv[i].getNgaysinh());
        System.out.print("\tSDT:" + sv[i].getDienThoai());
    }

    public void showMenu() {
        System.out.println("-----------Menu----------");
        System.out.println("1-Xem Danh Sach Sinh Vien.");
        System.out.println("2-Them Sinh Vien.");
        System.out.println("3-Tim Sinh Vien.");
        System.out.println("4- Cap Nhat Thong Tin Sinh Vien.");
        System.out.println("0-Exit.");
        System.out.println("--------------------------");
        System.out.print("Enter Your choice: ");
    }

    public int search() {
        System.out.print("Nhap MaSV ");
        mMaSV = sc.nextLine();
        
        int a = -1, count=0;
        for (int i = 0; i < stt; i++) {
            if (mMaSV.equalsIgnoreCase(sv[i].getmMaSV()) == true) {
                System.out.println(sv[i].toString());
                count++;
            } 
        }
            
        if(count==0)  System.out.println("khong tim thay sinh vien co ma so: " + mMaSV);
       
        return a;
    }

    public void update() throws ParseException {
        int i = search();
        if(i>0)input(i);
    }
}

