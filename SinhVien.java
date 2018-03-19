package sv;


import java.util.Date;


class SinhVien {
    private String mMaSV;
    private String HoTen;
    private Date Ngaysinh;
    private String Diachi;
    private String DienThoai;

    public SinhVien(String mMaSV, String HoTen, Date Ngaysinh, String Diachi, String DienThoai) {
        this.mMaSV = mMaSV;
        this.HoTen = HoTen;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.DienThoai = DienThoai;
    }
    
    /**
     *
     * @return
     */
    public String getmMaSV() {
        return mMaSV;
    }

    public void setmMaSV(String mMaSV) {
        this.mMaSV = mMaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    @Override
    public String toString() {
        return  "mMaSV= " + mMaSV + ", HoTen= " + HoTen + ", Ngaysinh= " + Ngaysinh + ", Diachi= " + Diachi + ", DienThoai= " + DienThoai ;
    }
    
}

