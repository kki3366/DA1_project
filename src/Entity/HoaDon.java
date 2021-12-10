/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author pc
 */
@Getter
@Setter
@NoArgsConstructor
public class HoaDon {
    private int IDHoaDon;
    private String IDPhong;
    private String IDKhachHang;
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private String IDNhanVien;
    private int DonGiaHoaDon;
    private boolean HoaDonHoanTat;
    private Date NgayTao;
    private boolean ChoThanhToan; // sửa
 
}
