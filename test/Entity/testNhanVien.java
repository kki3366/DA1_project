/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author pc
 */
public class testNhanVien {
    public static void main(String[] args) {
        NhanVien nv = NhanVien.builder().HoTen("Võ Đăng Khoa").IdNhanVien("sa").MatKhau("sa").VaiTro(true).build();
        System.out.println("Tên nhân viên:" + nv.getHoTen());
        System.out.println("Id nhân viên :" + nv.getIdNhanVien());
        System.out.println("Mật khẩu nhân viên: " + nv.getMatKhau());
        System.out.println("vai trò nhân viên: " + nv.isVaiTro());
    }
}
