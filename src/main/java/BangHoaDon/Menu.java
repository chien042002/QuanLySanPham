package BangHoaDon;

import Model.HoaDon;
import Model.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();


        danhSachSanPham.add(new SanPham(1, "Tủ lạnh 1", 10, 10.5));
        danhSachSanPham.add(new SanPham(2, "Máy Tính 2", 20, 20.0));
        danhSachSanPham.add(new SanPham(3, "Tivi 3", 8, 15.75));

        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Chọn sản phẩm");
            System.out.println("2. Thêm sản phẩm vào hóa đơn");
            System.out.println("3. Thanh toán");
            System.out.println("4. Tính tổng số tiền");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:

                    System.out.println("Danh sách sản phẩm:");
                    for (SanPham sanPham : danhSachSanPham) {
                        System.out.println(sanPham.getID() + ". " + sanPham.getTenSanPham());
                    }
                    break;

                case 2:

                    System.out.print("Nhập ID hóa đơn: ");
                    int idHoaDon = scanner.nextInt();
                    System.out.print("Nhập ID sản phẩm: ");
                    int idSanPham = scanner.nextInt();
                    System.out.print("Nhập ID khách hàng: ");
                    int idKhachHang = scanner.nextInt();


                    SanPham sanPhamChon = null;
                    for (SanPham sanPham : danhSachSanPham) {
                        if (sanPham.getID() == idSanPham) {
                            sanPhamChon = sanPham;
                            break;
                        }
                    }


                    double soTien = sanPhamChon.getDonGia();
                    HoaDon hoaDon = new HoaDon(idHoaDon, idSanPham, idKhachHang, soTien);
                    danhSachHoaDon.add(hoaDon);

                    System.out.println("Thêm sản phẩm vào hóa đơn thành công!");
                    break;

                case 3:

                    System.out.println("Hóa đơn đã thanh toán.");
                    break;

                case 4:
                    double tongTien = 0;
                    for (HoaDon hoaDon1 : danhSachHoaDon) {
                        tongTien += hoaDon1.getSoTien();
                    }
                    System.out.println("Tổng số tiền của hóa đơn: " + tongTien);
                    break;
                case 0:
                    System.out.println("Thoát Chương trình ");
                    break;
                default:
                    System.out.println("nhập sai lựa chọn vui lòng nhập lại");
            }
        }while (luaChon !=5);
    }
}
