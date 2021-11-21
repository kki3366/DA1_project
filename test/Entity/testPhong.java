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
public class testPhong {
    public static void main(String[] args) {
        Phong p = Phong.builder().IDPhong("PH003").TenPhong("Phòng 3").LoaiPhong(true).GiaPhong(50000).TrangThaiPhong(false).build();
        System.out.println(p.getIDPhong());
        System.out.println(p.getTenPhong());
        System.out.println(p.isLoaiPhong());
        System.out.println(p.getGiaPhong());
        System.out.println(p.isTrangThaiPhong());
    }
}
