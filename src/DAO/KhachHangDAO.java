/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhachHang;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class KhachHangDAO extends DAO<KhachHang, String> {

    final String INSERT_CUSTOMER = "INSERT INTO KhachHang (IDKhachHang,HoTen,SDTKhachHang,IDNhanVien) VALUES (?,?,?,?)";
    final String UPDATE_CUSTOMER = "UPDATE KhachHang SET HoTen=?, SDTKhachHang=?, IDNhanVien=? WHERE IDKhachHang=?";
    final String DELETE_CUSTOMER = "DELETE FROM KhachHang WHERE IDKhachHang=?";
    final String SELECT_ALL_CUSTOMER = "SELECT * FROM KhachHang";
    final String SELECT_BY_ID_CUSTOMER = "SELECT * FROM NguoiHoc WHERE IDKhachHang=?";

    @Override
    public void insert(KhachHang enity) {
        JDBCHelper.update(INSERT_CUSTOMER, enity.getIdKhachHang(), enity.getHoTen(), enity.getSDTKhachHang(), enity.getIdNhanVien());
    }

    @Override
    public void update(KhachHang enity) {
        JDBCHelper.update(UPDATE_CUSTOMER, enity.getHoTen(), enity.getSDTKhachHang(), enity.getIdNhanVien(), enity.getIdKhachHang());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_CUSTOMER, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_CUSTOMER);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_CUSTOMER, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhachHang enity = new KhachHang();
                enity.setIdKhachHang(rs.getString("IDKhachHang"));
                enity.setHoTen(rs.getString("HoTen"));
                enity.setSDTKhachHang(rs.getString("SDTKhachHang"));
                enity.setIdNhanVien(rs.getString("IDNhanVien"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
