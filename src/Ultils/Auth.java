/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultils;

import Entity.NhanVien;

/**
 *
 * @author pc
 */
public class Auth {
    public static NhanVien user = null;
     public static boolean isLogin(){
        
        return Auth.user != null;
    }
    // kiểm tra vai trò
    public static boolean isManager(){
        return Auth.isLogin() && user.isVaiTro();
        //hello world
    }
    
     public void clear(){
        Auth.user = null;
    }
}
