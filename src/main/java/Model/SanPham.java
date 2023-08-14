package Model;

public class SanPham {
    private int ID;
    private String TenSanPham;
    private int SoLuong;
    private double DonGia;
    public SanPham(){
        super();
    }
    public SanPham(int ID,String TenSanPham,int SoLuong,double DonGia){
        super();
        this.ID=ID;
        this.TenSanPham=TenSanPham;
        this.SoLuong=SoLuong;
        this.DonGia=DonGia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ID=" + ID +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                '}';
    }
}
