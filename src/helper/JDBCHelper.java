/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class JDBCHelper {
     static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=DA1";
    static final String USERNAME = "sa";
    static final String PASSWORD = "0907852396";
    
    
     static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
     public Connection getConnection(){
         Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Kết nối thành công");
            
        } catch (Exception ex) {
            System.out.println("Kết nối không thành công");
            ex.printStackTrace();
        }finally{
           
                try {
                     if(conn != null){
                    conn.close();
                     }
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        return conn;
    }
     
      public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }
      
      
       public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
       
       
        public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
        return stmt.executeQuery();
    }
        
        
        public static Object value(String sql, Object... args) {
        ResultSet rs;
        try {
            rs = JDBCHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
}
