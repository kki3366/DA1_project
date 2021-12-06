/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ChiTietHoaDon;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ChiTietHoaDonDAO extends DAO<ChiTietHoaDon, Integer> {
    
    
    final String INSERT = "INSERT INTO ChiTietHoaDon(SoLuong,IDSanPham, IDHoaDon, DonGiaHoaDon) VALUES (?,?,?,?)";
    final String SELECT_ALL_BILLINFO = "select * from ChiTietHoaDon where IDHoaDon = ?";

    @Override
    public void insert(ChiTietHoaDon enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ChiTietHoaDon enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChiTietHoaDon selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChiTietHoaDon> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChiTietHoaDon enity = new ChiTietHoaDon();
                enity.setIDChiTietHoaDon(rs.getInt("IDChiTietHoaDon"));
                enity.setSoLuong(rs.getInt("SoLuong"));
                enity.setIDHoaDon(rs.getInt("IDHoaDon"));
                enity.setIdSanPham(rs.getInt("IDSanPham"));
                enity.setDonGiaChiTietHoaDon(rs.getInt("DonGiaChiTietHoaDon"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<ChiTietHoaDon> selectAllByIDHoaDon(int IdHoaDon) {
       return this.selectBySql(SELECT_ALL_BILLINFO, IdHoaDon);
    }

}
