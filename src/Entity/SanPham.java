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
public class SanPham {
//    int maSP;
//    String tenSP;
//    String NgTao;
//    double soLuong;
//    double giaSP;
//    String moTa;  
//
//    public SanPham(int maSP, String tenSP, String NgTao, double soLuong, double giaSP, String moTa) {
//        this.maSP = maSP;
//        this.tenSP = tenSP;
//        this.NgTao = NgTao;
//        this.soLuong = soLuong;
//        this.giaSP = giaSP;
//        this.moTa = moTa;
//    }
//
//    public String getNgTao() {
//        return NgTao;
//    }
//
//    public void setNgTao(String NgTao) {
//        this.NgTao = NgTao;
//    }
//
//
//    public double getSoLuong() {
//        return soLuong;
//    }
//
//    public void setSoLuong(double soLuong) {
//        this.soLuong = soLuong;
//    }
//
//    public SanPham() {
//    }
//
//    public int getMaSP() {
//        return maSP;
//    }
//
//    public void setMaSP(int maSP) {
//        this.maSP = maSP;
//    }
//
//    public String getTenSP() {
//        return tenSP;
//    }
//
//    public void setTenSP(String tenSP) {
//        this.tenSP = tenSP;
//    }
//
//    public double getGiaSP() {
//        return giaSP;
//    }
//
//    public void setGiaSP(double giaSP) {
//        this.giaSP = giaSP;
//    }
//
//    public String getMoTa() {
//        return moTa;
//    }
//
//    public void setMoTa(String moTa) {
//        this.moTa = moTa;
//    }   
     private int IdSanPham;
    private String TenSanPham;
    private int GiaSanPham;
    private String MoTaSanPham;
    private String IdNhanVien;

    public SanPham() {
    }

    public SanPham(int IdSanPham, String TenSanPham, int GiaSanPham, String MoTaSanPham, String IdNhanVien) {
        this.IdSanPham = IdSanPham;
        this.TenSanPham = TenSanPham;
        this.GiaSanPham = GiaSanPham;
        this.MoTaSanPham = MoTaSanPham;
        this.IdNhanVien = IdNhanVien;
    }

    
    
    
    
    
    public int getIdSanPham() {
        return IdSanPham;
    }

    public void setIdSanPham(int IdSanPham) {
        this.IdSanPham = IdSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getGiaSanPham() {
        return GiaSanPham;
    }

    public void setGiaSanPham(int GiaSanPham) {
        this.GiaSanPham = GiaSanPham;
    }

    public String getMoTaSanPham() {
        return MoTaSanPham;
    }

    public void setMoTaSanPham(String MoTaSanPham) {
        this.MoTaSanPham = MoTaSanPham;
    }

    public String getIdNhanVien() {
        return IdNhanVien;
    }

    public void setIdNhanVien(String IdNhanVien) {
        this.IdNhanVien = IdNhanVien;
    }
    
}
