/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.MenuTrungGian;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class MenuTrungGianDAO extends DAO<MenuTrungGian, String> {

    //final String SELECT_ALL_MENU_BYTABLE ="select sp.TenSanPham, cthd.SoLuong, sp.GiaSanPham, (sp.GiaSanPham * cthd.SoLuong) + DATEDIFF(minute, ThoiGianBatDau, ThoiGianKetThuc) * (p.GiaPhong/60) as 'Total' from ChiTietHoaDon cthd, HoaDon hd, SanPham sp, Phong p where cthd.IDHoaDon = hd.IDHoaDon and cthd.IDSanPham = sp.IDSanPham and hd.IDPhong = p.IDPhong and hd.IDPhong = ?";
    final String SELECT_ALL_MENU_BYTABLE ="select sp.TenSanPham, cthd.SoLuong, sp.GiaSanPham, (sp.GiaSanPham * cthd.SoLuong) as 'TongGia',DATEDIFF(minute, ThoiGianBatDau, ThoiGianKetThuc) as 'ThoiGianSuDung'from ChiTietHoaDon cthd, HoaDon hd, SanPham sp, Phong p where cthd.IDHoaDon = hd.IDHoaDon and cthd.IDSanPham = sp.IDSanPham and hd.IDPhong = p.IDPhong and hd.HoaDonHoanTat = 0 and hd.IDPhong = ?";

    @Override
    public void insert(MenuTrungGian enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(MenuTrungGian enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MenuTrungGian> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MenuTrungGian selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MenuTrungGian> selectBySql(String sql, Object... args) {
        List<MenuTrungGian> list = new ArrayList<MenuTrungGian>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                MenuTrungGian enity = new MenuTrungGian();
                enity.setTenSanPham(rs.getString("TenSanPham"));
                enity.setSoLuongSanPham(rs.getInt("SoLuong"));
                enity.setGiaSanPham(rs.getInt("GiaSanPham"));
//                enity.setTongtien(rs.getInt("Total"));
                enity.setThoiGianSuDung(rs.getInt("ThoiGianSuDung"));
                enity.setTongtien(rs.getInt("TongGia"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<MenuTrungGian> selectAllMenuTrungGian(String IdPhong) {
        return this.selectBySql(SELECT_ALL_MENU_BYTABLE, IdPhong);
    }

}
