/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class testNhanVienDao {

    public static void main(String[] args) {
        NhanVienDAO dao = new NhanVienDAO();
        List<NhanVien> list = new ArrayList<>();
        list.add(dao.selectById("test1"));
        if (list.get(0) == null) {
            System.out.println("Không tìm thấy");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getHoTen());
                System.out.println(list.get(i).getMatKhau());
                System.out.println(list.get(i).getIdNhanVien());
                System.out.println(list.get(i).isVaiTro());
            }

        }
    }

}
