package Dao;

import KetNoi.KetNoi;
import Model.HoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HoaDonDao implements DaoInTerFace<HoaDon> {
    public static HoaDonDao getInstance() {
        return new HoaDonDao();
    }
    @Override
    public int Add(HoaDon hoaDon) {
        int ketQua = 0;
        Connection conn = null;
        try {
            conn = KetNoi.GetConnection();
            String sql = "INSERT INTO HoaDon (ID_HD, ID_SP, ID_KH, SoTien) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, hoaDon.getID_HoaDon());
            pst.setInt(2, hoaDon.getID_SanPham());
            pst.setInt(3, hoaDon.getID_KhachHang());
            pst.setFloat(4, hoaDon.getSoTien());
            ketQua = pst.executeUpdate();
            System.out.println("Thực Thi: " + sql);
            System.out.println("Có " + ketQua + " Dòng Thay Đổi");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ketQua;
    }

    @Override
    public int Edit(HoaDon hoaDon) {
        int ketQua = 0;
        Connection conn = null;
        try {
            conn = KetNoi.GetConnection();
            String sql = "UPDATE HoaDon SET ID_SP=?, ID_KH=?, SoTien=? WHERE ID_HD=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, hoaDon.getID_HoaDon());
            pst.setInt(2, hoaDon.getID_KhachHang());
            pst.setFloat(3, hoaDon.getSoTien());
            pst.setInt(4, hoaDon.getID_HoaDon());
            ketQua = pst.executeUpdate();
            System.out.println("Thực Thi: " + sql);
            System.out.println("Có " + ketQua + " Dòng Bị Thay Đổi");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ketQua;
    }

    @Override
    public int Delete(HoaDon hoaDon) {
        int ketQua = 0;
        Connection conn = null;
        try {
            conn = KetNoi.GetConnection();
            String sql = "DELETE FROM HoaDon WHERE ID_HD=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, hoaDon.getID_HoaDon());
            ketQua = pst.executeUpdate();
            System.out.println("Thực Thi: " + sql);
            System.out.println("Có " + ketQua + " Dòng Bị Thay Đổi");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ketQua;
    }


}
