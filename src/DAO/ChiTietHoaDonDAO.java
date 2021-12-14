/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ChiTietHoaDon;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ChiTietHoaDonDAO extends DAO<ChiTietHoaDon, Integer> {
    
    final String INSERT = "INSERT INTO ChiTietHoaDon(SoLuong,IDSanPham, IDHoaDon, DonGiaChiTietHoaDon) VALUES (?,?,?,?)";
    final String SELECT_ALL_BILLINFO = "select * from ChiTietHoaDon where IDHoaDon = ?";
    final String UPDATE_ITEM_AFTER_INSER = "update ChiTietHoaDon set SoLuong = ? where IDSanPham = ?";
    final String DELETE_ITEM = "delete from ChiTietHoaDon where IDSanPham = ?";
    final String CHECK_EXISTS = "select count(*) from ChiTietHoaDon where IDHoaDon = ? and IDSanPham = ?";

    @Override
    public void insert(ChiTietHoaDon enity) {
        JDBCHelper.update(INSERT, enity.getSoLuong(), enity.getIDSanPham(), enity.getIDHoaDon(), enity.getDonGiaChiTietHoaDon());
    }

    @Override
    public void update(ChiTietHoaDon enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_ITEM, id);
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
                enity.setIDSanPham(rs.getInt("IDSanPham"));
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

    public void Update_item_after_insert(int sl, int idSp) {
        JDBCHelper.update(UPDATE_ITEM_AFTER_INSER, sl, idSp);
    }

    public boolean Check_item(int idHd, int idSp) {
        boolean check = false;
        try {
            ResultSet rs;
            rs = JDBCHelper.query(CHECK_EXISTS, idHd, idSp);
            rs.next();
            rs.getInt(1);
            if (rs.getInt(1) > 0) {
                check = true;
            } else {
                check = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

}
