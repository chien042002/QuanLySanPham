package BangKhachHang;

import Dao.KhachHangDao;
import Model.KhachHang;
import Model.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<KhachHang> DanhSachKH;
    private Scanner scanner;

    public Menu() {
        DanhSachKH = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void DisPlayMenu(){
   int choice=0;
   do {
       System.out.println("------- MENU -------");
       System.out.println("1. Add KhachHang");
       System.out.println("2. Edit KhachHang");
       System.out.println("3. Delete KhachHang");
       System.out.println("4. Exit");
       System.out.print("Nhập lựa chọn của bạn: ");
       choice = scanner.nextInt();
       switch (choice){
           case 1 :
               addKhachHang();
                   break;
           case 2:
               editKhachHang();
               break;
           case 3:
               deleteKhachHang();
               break;
           case 4:
               System.out.println("Thoát Menu");
               break;
           default:
               System.out.println("Lựa chọn không hợp lê!Vui lòng thử lại");
               break;
       }
   }while (choice!=4);
   scanner.close();
    }
    private void addKhachHang(){
        System.out.println("------- Add Khách Hàng -------");
        System.out.print("Nhập  ID: ");
        int ID=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập tên :");
        String Ten= scanner.nextLine();

        System.out.println("Nhập SDT :");
        int SDT= scanner.nextInt();

        System.out.println("Nhập Địa Chỉ:");
        String  diaChi= scanner.nextLine();

        KhachHang khachHang=new KhachHang(ID,Ten,SDT,diaChi);
        DanhSachKH.add(khachHang);
    }
    private void editKhachHang(){
        System.out.println("------- Sửa Khách Hàng -------");
        System.out.print("Nhập vào ID khách Hàng cần sửa: ");
        int ID = scanner.nextInt();

        boolean found = false;
        for (KhachHang khachHang : DanhSachKH) {
            if (khachHang.getID_KH() == ID) {
                System.out.print("Nhập vào tên khách hàng  mới: ");
                String Ten = scanner.nextLine();
                khachHang.setTen(Ten);

                System.out.print("Nhập vào SDT mới: ");
                int SDT = scanner.nextInt();
                khachHang.setSDT(SDT);

                System.out.print("Nhập vào địa chỉ  mới: ");
                String  diaChi = scanner.nextLine();
                khachHang.setDiaChi(diaChi);

                found = true;
                System.out.println("Đã cập nhật khách hàng thành công!");
                break;
            }
        }

        if (!found) {
            System.out.println("Khách hàng không có!");
        }
    }
    private void deleteKhachHang(){
        System.out.println("------- Delete Khách Hàng -------");
        System.out.print("Nhập vào ID khách hàng cần xóa: ");
        int ID = scanner.nextInt();

        boolean found = false;
        for (KhachHang khachHang : DanhSachKH) {
            if (khachHang.getID_KH() == ID) {
                DanhSachKH.remove(khachHang);
                found = true;
                System.out.println("Đã xóa khách hàng thành công");
                break;
            }
        }

        if (!found) {
            System.out.println("khách hàng không có");
        }
    }
    public static void main(String[] args) {
        BangSanPham.Menu menu = new BangSanPham.Menu();
        menu.disPlayMenu();
    }
}
