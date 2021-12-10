/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HoaDon;
import Entity.NhanVien;
import helper.JDBCHelper;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pc
 */
public class HoaDonDAO extends DAO<HoaDon, Integer> {

    final String INSERT = "INSERT INTO HoaDon ( IDPhong, IDKhachHang, ThoiGianBatDau, ThoiGianKetThuc,IDNhanVien,DonGiaHoaDon,HoaDonHoanTat,NgayTao, ChoThanhToan) VALUES (?, ?, ?,?,?,?,?,?,?)";
    final String SELECT_IDBILLBYIDROOM = "select * from HoaDon where IDPhong = ? and HoaDonHoanTat = 0";
    final String UPDATE_STATUS_BILL = "update HoaDon set DonGiaHoaDon =?,HoaDonHoanTat = 1 where IDHoaDon = ?";
    final String UPDATE_BACK_ROOM = "update HoaDon set ThoiGianKetThuc = ?, ChoThanhToan = 1 where IDHoaDon = ?"; // sửa
    final String SELECT_PRICE = "select DonGiaHoaDon from HoaDon where IDHoaDon = ?";
    final String SELECT_ALL_BYID = "select * from HoaDon where IDHoaDon = ?";
    final String SELECT_ALL = "select * from HoaDon";
    final String Check_ThanhToanByIDPhong = "select * from HoaDon where IDPhong = ?";
    @Override
    public void insert(HoaDon enity) {
        JDBCHelper.update(INSERT, enity.getIDPhong(), enity.getIDKhachHang(), enity.getThoiGianBatDau(), enity.getThoiGianKetThuc(), enity.getIDNhanVien(), enity.getDonGiaHoaDon(), enity.isHoaDonHoanTat(), enity.getNgayTao(), enity.isChoThanhToan()); // sửa
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
          List<HoaDon> list = this.selectBySql(SELECT_ALL_BYID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
      return this.selectBySql(SELECT_ALL);
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
                enity.setChoThanhToan(rs.getBoolean("ChoThanhToan")); // sửa
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    public List<HoaDon> CheckBillByIDPhong(String IdPhong) {
        return this.selectBySql(SELECT_IDBILLBYIDROOM, IdPhong);
    }

    public void ThanhToan(int id, int DonGiaHoaDon) {
        JDBCHelper.update(UPDATE_STATUS_BILL, DonGiaHoaDon,id);
    }
    
    public void TraPhong(Date checkOut, int idRoom){
        JDBCHelper.update(UPDATE_BACK_ROOM, checkOut,idRoom);
    }
    
     public HoaDon selectByIdPhong(String id) {
          List<HoaDon> list = this.selectBySql(Check_ThanhToanByIDPhong, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
