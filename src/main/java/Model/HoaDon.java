package Model;

public class HoaDon {
    private int ID_HoaDon;
    private int ID_SanPham;
     private int ID_KhachHang;
     private double SoTien;
     public HoaDon(){
         super();
     }
     public HoaDon(int ID_HoaDon,int ID_SanPham,int ID_KhachHang,double SoTien){
         super();
         this.ID_HoaDon=ID_HoaDon;
         this.ID_SanPham=ID_SanPham;
         this.ID_KhachHang=ID_KhachHang;
         this.SoTien=SoTien;

     }

    public int getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(int ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public int getID_SanPham() {
        return ID_SanPham;
    }

    public void setID_SanPham(int ID_SanPham) {
        this.ID_SanPham = ID_SanPham;
    }

    public int getID_KhachHang() {
        return ID_KhachHang;
    }

    public void setID_KhachHang(int ID_KhachHang) {
        this.ID_KhachHang = ID_KhachHang;
    }

    public float getSoTien() {
        return (float) SoTien;
    }

    public void setSoTien(double soTien) {
        SoTien = soTien;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "ID_HoaDon=" + ID_HoaDon +
                ", ID_SanPham=" + ID_SanPham +
                ", ID_KhachHang=" + ID_KhachHang +
                ", SoTien=" + SoTien +
                '}';
    }
}
