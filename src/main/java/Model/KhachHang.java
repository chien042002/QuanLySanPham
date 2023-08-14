package Model;

public class KhachHang {
    private int ID_KH;
    private String Ten;
    private int SDT;
    private String DiaChi;
    public KhachHang(){
        super();
    }
    public KhachHang(int ID_KH,String Ten,int SDT,String DiaChi){
        super();
        this.ID_KH=ID_KH;
        this.Ten=Ten;
        this.SDT=SDT;
        this.DiaChi=DiaChi;
    }

    public int getID_KH() {
        return ID_KH;
    }

    public void setID_KH(int ID_KH) {
        this.ID_KH = ID_KH;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ID_KH=" + ID_KH +
                ", Ten='" + Ten + '\'' +
                ", SDT=" + SDT +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
