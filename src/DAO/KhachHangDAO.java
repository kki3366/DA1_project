/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhachHang;
import helper.JDBCHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

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
    final String AUTO_ID ="SELECT MAX(IDKhachHang) as idKhachHang from KhachHang";

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
    
    public void AutoIDKhachHang(JTextField jtxf){
        try {
            ResultSet rs;
            rs = JDBCHelper.query(AUTO_ID);
            rs.next();
            rs.getString("idKhachHang");
            if(rs.getString("idKhachHang")== null){
                jtxf.setText("KH000");
            }else{
                Long id = Long.parseLong(rs.getString("idKhachHang").substring(2, rs.getString("idKhachHang").length()));
                id++;
                jtxf.setText("KH00" + String.format("%1d", id));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
