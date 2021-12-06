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
public class SanPhamDAO {
    String INSERT_SQL = "INSERT INTO SANPHAM(IDSanPham,TenSanPham, GiaSanPham, MoTaSanPham, IDDVT, IDNhanVien)"+"VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SANPHAM SET TenSanPham = ?,GiaSanPham= ?,MoTaSanPham=? where IDSanPham = ?";
    String DELETE_SQL = "DELETE FROM SANPHAM WHERE IDSanPham=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SANPHAM WHERE IDSanPham=?";
    public void insert(SanPham entity){
        JDBCHelper.update(INSERT_SQL, entity.getMaSP(),entity.getTenSP(),entity.getGiaSP(),entity.getMoTa());
    }
    public void update(SanPham entity){
    JDBCHelper.update(UPDATE_SQL, entity.getTenSP(),entity.getGiaSP(),entity.getMoTa(),entity.getMaSP());
    }
    public void delete(String id){
    JDBCHelper.update(DELETE_SQL, id);
    }
 

    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

   
    public SanPham selectById(Integer id) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id); // đang lỗi 
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet result = JDBCHelper.query(sql, args);
            while (result.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(result.getInt("MAKH"));                        
                entity.setTenSP(result.getString("GHICHU"));
                entity.setNgTao(result.getString("NguoiTao"));
                entity.setGiaSP(result.getDouble("GiaSanPham"));
                entity.setSoLuong(result.getDouble("SoLuong"));
                entity.setMoTa(result.getString("MaNV"));                       
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<SanPham> selectByDonViTinh(String maCD) {
        String sql = "SELECT * FROM DONVITINH WHERE IDDVT = ?";
        return this.selectBySql(sql, maCD);
    }

    public SanPham selectById(String SP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void test(){
        
    }
    
    
}

   

