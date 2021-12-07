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

/**
 *
 * @author WINDOW
 */
public class SanPhamDAO extends DAO<SanPham, Integer>{
//    String INSERT_SQL = "INSERT INTO SANPHAM(IDSanPham,TenSanPham, GiaSanPham, MoTaSanPham, IDDVT, IDNhanVien)"+"VALUES (?,?,?,?,?,?,?)";
//    String UPDATE_SQL = "UPDATE SANPHAM SET TenSanPham = ?,GiaSanPham= ?,MoTaSanPham=? where IDSanPham = ?";
//    String DELETE_SQL = "DELETE FROM SANPHAM WHERE IDSanPham=?";
//    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
//    String SELECT_BY_ID_SQL = "SELECT * FROM SANPHAM WHERE IDSanPham=?";
//    public void insert(SanPham entity){
//        JDBCHelper.update(INSERT_SQL, entity.getMaSP(),entity.getTenSP(),entity.getGiaSP(),entity.getMoTa());
//    }
//    public void update(SanPham entity){
//    JDBCHelper.update(UPDATE_SQL, entity.getTenSP(),entity.getGiaSP(),entity.getMoTa(),entity.getMaSP());
//    }
//    public void delete(String id){
//    JDBCHelper.update(DELETE_SQL, id);
//    }
// 
//
//    public List<SanPham> selectAll() {
//        return this.selectBySql(SELECT_ALL_SQL);
//    }
//
//   
//    public SanPham selectById(Integer id) {
//        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id); // đang lỗi 
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.get(0);
//    }
//    
//    // kiểm tra lại đoạn này
//    public List<SanPham> selectBySql(String sql, Object... args) {
//        List<SanPham> list = new ArrayList<>();
//        try {
//            ResultSet result = JDBCHelper.query(sql, args);
//            while (result.next()) {
//                SanPham entity = new SanPham();
//                entity.setMaSP(result.getInt("MAKH"));                        
//                entity.setTenSP(result.getString("GHICHU"));
//                entity.setNgTao(result.getString("NguoiTao"));
//                entity.setGiaSP(result.getDouble("GiaSanPham"));
//                entity.setSoLuong(result.getDouble("SoLuong"));
//                entity.setMoTa(result.getString("MaNV"));                       
//                list.add(entity);
//            }
//            result.getStatement().getConnection().close();
//            return list;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<SanPham> selectByDonViTinh(String maCD) {
//        String sql = "SELECT * FROM DONVITINH WHERE IDDVT = ?";
//        return this.selectBySql(sql, maCD);
//    }
//
//    public SanPham selectById(String SP) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//   
//    
     final String SELECT_ALL = "select * from SanPham";
    
    final String Select_All_By_Id = "select * from SanPham where TenSanPham LIKE ?";
    
    @Override
    public void insert(SanPham enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void update(SanPham enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }
    
    @Override
    public SanPham selectById(Integer id) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}

   

