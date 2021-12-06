/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhachHang;
import Entity.Phong;
import helper.JDBCHelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class PhongDAO extends DAO<Phong, String> {

    private final String INSERT_SQL = "INSERT INTO Phong (IDPhong, TenPhong, TrangThaiPhong, GiaPhong, LoaiPhong) VALUES (?, ?, ?, ?,?)";
    private final String UPDATE_SQL = "UPDATE Phong SET TenPhong=?, GiaPhong=?, TrangThaiPhong = ?, LoaiPhong=?  WHERE IDPhong=?";
    private final String DELETE_SQL = "DELETE FROM Phong WHERE IDPhong=?";
    private final String SELECT_ALL_SQL = "SELECT * FROM Phong";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM Phong WHERE IDPhong=?";
    private final String SELECT_ALL_ISACTIVE = "select * from Phong where TrangThaiPhong = 0";
    private final String SELECT_BY_NAMEROOM = "SELECT * FROM Phong WHERE TenPhong LIKE ?";
    final String AUTO_ID ="SELECT MAX(IDPhong) as idPhong from Phong";

    @Override
    public void insert(Phong enity) {
        JDBCHelper.update(INSERT_SQL, enity.getIDPhong(), enity.getTenPhong(), enity.isTrangThaiPhong(), enity.getGiaPhong(), enity.isLoaiPhong());
    }

    @Override
    public void update(Phong enity) {
        JDBCHelper.update(UPDATE_SQL, enity.getTenPhong(),enity.getGiaPhong(),enity.isTrangThaiPhong(),enity.isLoaiPhong(),enity.getIDPhong());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Phong> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Phong selectById(String id) {
        List<Phong> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Phong> selectBySql(String sql, Object... args) {
        List<Phong> list = new ArrayList<Phong>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Phong p = Phong.builder()
                        .IDPhong(rs.getString("IDPhong"))
                        .TenPhong(rs.getString("TenPhong"))
                        .TrangThaiPhong(rs.getBoolean("TrangThaiPhong"))
                        .GiaPhong(rs.getInt("GiaPhong"))
                        .LoaiPhong(rs.getBoolean("LoaiPhong")).build();
                list.add(p);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Phong> selectAll_isActive() {
        return this.selectBySql(SELECT_ALL_ISACTIVE);
    }

    public Phong selectBynameRoom(String nameRoom) {
        List<Phong> list = this.selectBySql(SELECT_BY_NAMEROOM, nameRoom);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
     
    public void AutoIDPhong(JTextField jtxf){
        try {
            ResultSet rs;
            rs = JDBCHelper.query(AUTO_ID);
            rs.next();
            rs.getString("idPhong");
            if(rs.getString("idPhong")== null){
                jtxf.setText("KH000");
            }else{
                Long id = Long.parseLong(rs.getString("idPhong").substring(2, rs.getString("idPhong").length()));
                id++;
                if(id > 19){
                    jtxf.setText("PH0" + String.format("%1d", id));
                }else{
                    jtxf.setText("PH00" + String.format("%1d", id));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
