/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class MenuTrungGian {
    private String TenSanPham;
    private int SoLuongSanPham;
    private int GiaSanPham;
    private boolean TrangThaiHoanTat;
    private int Tongtien;
    private int ThoiGianSuDung;

   
}
