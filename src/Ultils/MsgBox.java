/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class MsgBox {
    /* hàm alert
    @params: Component để gọi đối tượng của frame cha
    @pargams: message nội dung của Joption
    dùng để thông báo
    */
    public static void alert(Component parent, String message)
    {
        JOptionPane.showMessageDialog(parent, message, "Hệ Thống Quản Lý FKaraoke",JOptionPane.INFORMATION_MESSAGE);
    }
     /* hàm confirm
    @params: Component để gọi đối tượng của frame cha
    @pargams: message nội dung của Joption
    dùng để thông báo lựa chọn yes no
    */
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message, "Hệ Thống Quản Lý FKaraoke",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
      /* hàm prompt
    @params: Component để gọi đối tượng của frame cha
    @pargams: message nội dung của Joption
    dùng để thông báo nhập nội dung vào input
    */
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message, "Hệ Thống Quản Lý FKaraoke", JOptionPane.INFORMATION_MESSAGE);
    }
}
