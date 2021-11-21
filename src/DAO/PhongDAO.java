/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Phong;
import helper.JDBCHelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author pc
 */
public class PhongDAO extends DAO<Phong, String> {

    private final String INSERT_SQL = "INSERT INTO Phong (IDPhong, TenPhong, TrangThaiPhong, GiaPhong, LoaiPhong) VALUES (?, ?, ?, ?,?)";
    private final String UPDATE_SQL = "UPDATE Phong SET TenPhong=?, TrangThaiPhong=?, GiaPhong=?, LoaiPhong=?  WHERE IDPhong=?";
    private final String DELETE_SQL = "DELETE FROM Phong WHERE IDPhong=?";
    private final String SELECT_ALL_SQL = "SELECT * FROM Phong";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM Phong WHERE IDPhong=?";

    @Override
    public void insert(Phong enity) {
        JDBCHelper.update(INSERT_SQL, enity.getIDPhong(), enity.getTenPhong(), enity.isTrangThaiPhong(), enity.getGiaPhong(),enity.isLoaiPhong());
    }

    @Override
    public void update(Phong enity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Phong> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Phong selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
