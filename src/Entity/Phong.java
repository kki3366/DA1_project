/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author pc
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Phong {
    private String IdPhong;
    private String tenPhong;
    private boolean TrangThaiPhong;
    private int GiaPhong;
    private boolean LoaiPhong;

    
}
