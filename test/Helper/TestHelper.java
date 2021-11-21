/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import helper.JDBCHelper;

/**
 *
 * @author pc
 */
public class TestHelper {
    public static void main(String[] args) {
         JDBCHelper help = new JDBCHelper();
         help.getConnection();
    }
}
