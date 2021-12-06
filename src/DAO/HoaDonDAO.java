/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HoaDon;
import helper.JDBCHelper;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author pc
 */
public class HoaDonDAO extends DAO<HoaDon, Integer> {
    
    final String INSERT = "INSERT INTO HoaDon ( IDPhong, IDKhachHang, ThoiGianBatDau, ThoiGianKetThuc,IDNhanVien,DonGiaHoaDon,HoaDonHoanTat,NgayTao ) VALUES (?, ?, ?,?,?,?,?,?)";
    final String SELECT_IDBILLBYIDROOM = "select * from HoaDon where IDPhong = ? and HoaDonHoanTat = 0";
    final String UPDATE_STATUS_BILL = "update HoaDon set HoaDonHoanTat = 1 where IDHoaDon = ?";

    @Override
    public void insert(HoaDon enity) {
        JDBCHelper.update(INSERT,enity.getIDPhong(), enity.getIDKhachHang(), enity.getThoiGianBatDau(),enity.getThoiGianKetThuc(),enity.getIDNhanVien(), enity.getDonGiaHoaDon(),enity.isHoaDonHoanTat(), enity.getNgayTao());
    }

    @Override
    public void update(HoaDon enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDon selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDon enity = new HoaDon();
                enity.setIDHoaDon(rs.getInt("IDHoaDon"));
                enity.setIDPhong(rs.getString("IDPhong"));
                enity.setIDKhachHang(rs.getString("IDKhachHang"));
                enity.setThoiGianBatDau(rs.getDate("ThoiGianBatDau"));
                enity.setThoiGianKetThuc(rs.getDate("ThoiGianKetThuc"));
                enity.setIDNhanVien(rs.getString("IDNhanVien"));
                enity.setDonGiaHoaDon(rs.getInt("DonGiaHoaDon"));
                enity.setHoaDonHoanTat(rs.getBoolean("HoaDonHoanTat"));
                enity.setNgayTao(rs.getDate("NgayTao"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

//    public HoaDon CheckBillByIDPhong(String IdPhong) {
//        List<HoaDon> list = this.selectBySql(SELECT_IDBILLBYIDROOM, IdPhong);
//        if (list.isEmpty()) {
//            return null;
//        }
//       return list.get(0);
//        
//    }
    
    public List<HoaDon> CheckBillByIDPhong(String IdPhong) {
        return this.selectBySql(SELECT_IDBILLBYIDROOM, IdPhong);  
    }
    
    public void ThanhToan(int id){
        JDBCHelper.update(UPDATE_STATUS_BILL, id);
    }

}
