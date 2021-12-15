/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.DonViTinh;
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
public class DonViTinhDAO {
    String INSERT_SQL = "INSERT INTO DONVITINH(IDDVT,TENDVT, IDSanPham,IDNHANVIEN) VALUES (?,?,?,?)";
    String UPDATE_SQL = "UPDATE DONVITINH SET TENDVT = ?,IDNHANVIEN= ?where IDDVT = ?";
    String DELETE_SQL = "DELETE FROM DONVITINH WHERE IDDVT=?";
    String SELECT_ALL_SQL = "SELECT * FROM DONVITINH";
    String SELECT_BY_ID_SQL = "SELECT * FROM DONVITINH WHERE IDDVT=?";
    final String AUTO_ID ="SELECT MAX(IDDVT) from DonViTinh";
  
    public void insert(DonViTinh entity) {
        JDBCHelper.update(INSERT_SQL, entity.getIDDVT(), entity.getTenDVT(), entity.getIDSanPham(),entity.getIDNhanVIen());
    }

   
    public void update(DonViTinh entity) {
       
           JDBCHelper.update(INSERT_SQL, entity.getTenDVT(), entity.getIDNhanVIen(), entity.getIDDVT());
        
    }

  
    public void delete(String id) {
      
            JDBCHelper.update(DELETE_SQL, id);
        
    }


    public List<DonViTinh> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    
    public DonViTinh selectById(String id) {
        List<DonViTinh> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

   
    public List<DonViTinh> selectBySql(String sql, Object... args) {
        List<DonViTinh> list = new ArrayList<DonViTinh>();
        try {
            ResultSet result = JDBCHelper.query(sql, args);
            while (result.next()) {
                DonViTinh entity = new DonViTinh();
                entity.setIDDVT(result.getInt("IDDVT"));
                entity.setTenDVT(result.getString("TENDVT"));
                entity.setIDNhanVIen(result.getString("IDNHANVIEN"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<DonViTinh> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM DONVITINH WHERE TEDVT LIKE ?";
        return selectBySql(sql, "%" + keyword + "%");
    }
    
     
    public void AuToIdDVT(JTextField jtxf){
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
