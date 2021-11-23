/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultils;

import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class Check {
    public static boolean checkNullTextField(JTextField jtxt) {
        if (!jtxt.getText().trim().isEmpty()) {
            return true;
        } else {
            MsgBox.alert(jtxt.getRootPane(), "Không được để trống" + " " + jtxt.getName());
            return false;
        }
    }
    
  
}
