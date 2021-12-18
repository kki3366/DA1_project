/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.SanPham;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author WINDOW
 */
public class SanPhamDAO extends DAO<SanPham, Integer>{
    
    String INSERT_SQL = "INSERT INTO SANPHAM(IDSanPham,TenSanPham, GiaSanPham, MoTaSanPham, IDNhanVien) VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SANPHAM SET TenSanPham = ?,GiaSanPham= ?,MoTaSanPham=?, IDNhanVien = ? where IDSanPham = ?";
    String DELETE_SQL = "DELETE FROM SANPHAM WHERE IDSanPham=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SANPHAM WHERE IDSanPham=?";
     final String SELECT_ALL = "select * from SanPham";
    final String Select_All_By_Id = "select * from SanPham where TenSanPham LIKE ?";
    final String AUTO_ID ="SELECT MAX(IDSanPham) from SanPham";
    
    @Override
    public void insert(SanPham enity) {
        JDBCHelper.update(INSERT_SQL, enity.getIdSanPham(),enity.getTenSanPham(),enity.getGiaSanPham(),enity.getMoTaSanPham(),enity.getIdNhanVien());
    }
    
    @Override
    public void update(SanPham enity) {
        JDBCHelper.update(UPDATE_SQL,enity.getTenSanPham(),enity.getGiaSanPham(),enity.getMoTaSanPham(),enity.getIdNhanVien(),enity.getIdSanPham());
    }
    
    @Override
    public void delete(Integer id) {
         JDBCHelper.update(DELETE_SQL, id);
    }
    
    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }
    
    @Override
    public SanPham selectById(Integer id) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);    
    }

    
    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham enity = new SanPham();
                enity.setIdSanPham(rs.getInt("IDSanPham"));
                enity.setTenSanPham(rs.getString("TenSanPham"));
                enity.setGiaSanPham(rs.getInt("GiaSanPham"));
                enity.setMoTaSanPham(rs.getString("MoTaSanPham"));
                enity.setIdNhanVien(rs.getString("IDNhanVien"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
    public SanPham selectByNameSP(String name){
         List<SanPham> list = this.selectBySql(Select_All_By_Id, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public void AuToIdSanPham(JTextField jtxf){
        try {
            ResultSet rs;
            rs = JDBCHelper.query(AUTO_ID);
            rs.next();
            rs.getInt(1);
            if( rs.getInt(1) < 0){
                jtxf.setText("1");
            }else{
                int id = rs.getInt(1);
                id++;
                jtxf.setText(String.valueOf(id));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

   

