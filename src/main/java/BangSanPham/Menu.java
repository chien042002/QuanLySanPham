package BangSanPham;

import Dao.KhachHangDao;
import Model.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<SanPham>DanhSachSP;
    private Scanner scanner;

    public Menu() {
        DanhSachSP = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void disPlayMenu(){
        int choice=0;
        do {
            System.out.println("------- MENU -------");
            System.out.println("1. Add San Pham");
            System.out.println("2. Edit San Pham ");
            System.out.println("3. Delete San Pham");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSanPham();
                    break;
                case 2:
                    editSanPham();
                    break;
                case 3:
                    deleteSanPham();
                    break;
                case 4:
                    System.out.println("Thoát...");
                    break;
                default:
                    System.out.println("Vui Lòng Nhập Lại!");
                    break;
            }
        }while (choice!=4);  scanner.close();
        }
        private void addSanPham(){
            System.out.println("------- Add Sản Phẩm -------");
            System.out.print("Nhập  ID: ");
            int ID=scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nhập tên :");
            String Ten= scanner.nextLine();

            System.out.println("Nhập số lượng :");
            int soLuong= scanner.nextInt();

            System.out.println("Nhập Đơn Giá:");
            double donGia= scanner.nextDouble();

            SanPham sanpham=new SanPham(ID,Ten,soLuong,donGia);
            DanhSachSP.add(sanpham);
        }
        private void editSanPham(){
            System.out.println("------- Edit Sản Phẩm -------");
            System.out.print("Nhập vào ID sản phẩm cần sửa: ");
            int ID = scanner.nextInt();

            boolean found = false;
            for (SanPham sanPham : DanhSachSP) {
                if (sanPham.getID() == ID) {
                    System.out.print("Nhập tên sản phẩm mới: ");
                    String Ten = scanner.nextLine();
                    sanPham.setTenSanPham(Ten);

                    System.out.print("Nhập số lượng mới: ");
                    int soLuong = scanner.nextInt();
                    sanPham.setSoLuong(soLuong);

                    System.out.print("Nhập đơn giá mới: ");
                    double donGia = scanner.nextDouble();
                    sanPham.setDonGia(donGia);

                    found = true;
                    System.out.println("Đã cập nhật sản phẩm thành công");
                    break;
                }
            }

            if (!found) {
                System.out.println("Sản phẩm không có");
            }
        }
      private void deleteSanPham(){
          System.out.println("------- Delete Sản Phẩm -------");
          System.out.print("Nhập vào ID sản phẩm cần xóa: ");
          int ID = scanner.nextInt();

          boolean found = false;
          for (SanPham sanPham : DanhSachSP) {
              if (sanPham.getID() == ID) {
                  DanhSachSP.remove(sanPham);
                  found = true;
                  System.out.println("Đã xóa sản phẩm thành công");
                  break;
              }
          }

          if (!found) {
              System.out.println("Sản phẩm không có");
          }
      }

    public static void main(String[] args) {
             Menu menu=new Menu();
             menu.disPlayMenu();
    }
    }

