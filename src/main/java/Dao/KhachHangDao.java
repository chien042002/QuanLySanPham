package Dao;

import KetNoi.KetNoi;
import Model.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KhachHangDao implements DaoInTerFace<KhachHang> {
    public static KhachHangDao GetInstance(){return  new KhachHangDao();};
    @Override
    public int Add(KhachHang khachHang) {
        int ketQua=0;
        Connection conn=null;
        try {
            conn= KetNoi.GetConnection();
            String sql= "INSERT INTO KhachHang (ID_KH,Ten,SDT,DiaChi)" +
                    "  VALUES (?, ?, ?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1,khachHang.getID_KH());
            pst.setString(2,khachHang.getTen());
            pst.setInt(3,khachHang.getSDT());
            pst.setString(4,khachHang.getDiaChi());
            ketQua=pst.executeUpdate();
            System.out.println("Thực Thi :" + sql);
            System.out.println("Có " + ketQua + " Dòng Thay Đổi");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
           if (conn!=null){
               try {
                   conn.close();
               } catch (SQLException e) {
                   throw new RuntimeException(e);
               }

           }
        }return ketQua;
    }

    @Override
    public int Edit(KhachHang khachHang) {
        int ketQua=0;
        Connection conn=null;
        try {
            String sql = "UPDATE KhachHang " +
                    " SET " +
                    " ,Ten=?" +
                    " ,SDT=?" +
                    " ,DiaChi=?" +
                    " WHERE ID_KH=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,khachHang.getTen());
            pst.setInt(2,khachHang.getSDT());
            pst.setString(3,khachHang.getDiaChi());
            pst.setInt(4,khachHang.getID_KH());
            ketQua=pst.executeUpdate();
            System.out.println("Thực Thi :" + sql);
            System.out.println("Có " + ketQua + " Dòng Bị Thay Đổi");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }return ketQua;

    }

    @Override
    public int Delete(KhachHang khachHang) {
        int ketQua=0;
        Connection conn=null;
        try {
          conn=KetNoi.GetConnection();
             String sql="DELETE FROM KhachHang"+"WHE ID_KH=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, khachHang.getID_KH());
            ketQua = pst.executeUpdate();
            System.out.println("Thực Thi :" + sql);
            System.out.println("Có " + ketQua + " Dòng Bị Thay Đổi ");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }return ketQua;
    }
}
