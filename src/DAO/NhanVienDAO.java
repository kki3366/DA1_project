/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhanVien;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class NhanVienDAO extends DAO<NhanVien, String> {

    private final String INSERT_SQL = "INSERT INTO NhanVien (IDNhanVien, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
    private final String UPDATE_SQL = "UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE IDNhanVien=?";
    private final String DELETE_SQL = "DELETE FROM NhanVien WHERE IDNhanVien=?";
    private final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE IDNhanVien=?";

    @Override
    public void insert(NhanVien enity) {
        JDBCHelper.update(INSERT_SQL, enity.getIdNhanVien(), enity.getMatKhau(), enity.getHoTen(), enity.isVaiTro());
    }

    @Override
    public void update(NhanVien enity) {
        JDBCHelper.update(UPDATE_SQL, enity.getMatKhau(), enity.getHoTen(), enity.isVaiTro(),enity.getIdNhanVien());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = NhanVien.builder()
                        .IdNhanVien(rs.getString("IDNhanVien"))
                        .MatKhau(rs.getString("MatKhau"))
                        .HoTen(rs.getString("HoTen"))
                        .VaiTro(rs.getBoolean("VaiTro")).build();
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

}
