/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author WINDOW
 */
public class DonViTinh {
   int IDDVT ;
   String tenDVT;
   String IDNhanVIen;

    public DonViTinh() {
    }

    public DonViTinh(int IDDVT, String tenDVT, String IDNhanVIen) {
        this.IDDVT = IDDVT;
        this.tenDVT = tenDVT;
        this.IDNhanVIen = IDNhanVIen;
    }

    public String getIDNhanVIen() {
        return IDNhanVIen;
    }

    public void setIDNhanVIen(String IDNhanVIen) {
        this.IDNhanVIen = IDNhanVIen;
    }


    public int getIDDVT() {
        return IDDVT;
    }

    public void setIDDVT(int IDDVT) {
        this.IDDVT = IDDVT;
    }

    public String getTenDVT() {
        return tenDVT;
    }

    public void setTenDVT(String tenDVT) {
        this.tenDVT = tenDVT;
    }
   
}
