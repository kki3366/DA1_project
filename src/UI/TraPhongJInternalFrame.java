package UI;

import DAO.ChiTietHoaDonDAO;
import DAO.HoaDonDAO;
import Entity.HoaDon;
import DAO.KhachHangDAO;
import DAO.MenuTrungGianDAO;
import DAO.PhongDAO;
import DAO.SanPhamDAO;
import Entity.KhachHang;
import Entity.MenuTrungGian;
import Entity.Phong;
import Entity.SanPham;
import Ultils.Auth;
import Ultils.MsgBox;
import Ultils.XDate;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class TraPhongJInternalFrame extends javax.swing.JInternalFrame {

    int row = 0;
    String idRoom = null;

    public TraPhongJInternalFrame() {
        initComponents();
        fillComboBoxSanPham();
       
    }
    ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
    int idHoaDon = 0;
    String idPhong = null;
    int idSP = 0;
    int GiaSanPham = 0;
    boolean status = false;
    
    
     void OpenRoom() {

        PhongDAO dao = new PhongDAO();
        for (Phong p : dao.selectAll()) {
            JButton btn = new JButton();
            btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btn.setFont(btn.getFont().deriveFont(14f).deriveFont(Font.BOLD));
            btn.setSize(60, 60);
            btn.setText("<html><p>" + p.getTenPhong() + "</p><p>" + String.valueOf(p.isTrangThaiPhong() ? "Đã đặt" : "Trống") + "</p></html>");
            pnlDatPhong.add(btn);
            pnlDatPhong.repaint();
            if (p.isTrangThaiPhong() == true) {
                btn.setBackground(Color.green);

            }

            btn.addActionListener((e) -> {
//                JOptionPane.showMessageDialog(this, p.getIdPhong());
                String Idroom = p.getIDPhong();
                status = p.isTrangThaiPhong();
                System.out.println(status);
                ShowBill(Idroom);
            });

        }
    }
     
     void ShowBill(String IdPhong) {
      
        HoaDonDAO hddao = new HoaDonDAO();
        List<HoaDon> listHd = hddao.CheckBillByIDPhong(IdPhong);
        for (HoaDon hd : listHd) {
//            idHoaDon = hd.getIDHoaDon();
//             System.out.println("ID Hóa Đơn là :" + idHoaDon);
            System.out.println("ID Phòng theo hóa đơn là :" + hd.getIDPhong());
            idHoaDon = hd.getIDHoaDon();
            idPhong = hd.getIDPhong();
            System.out.println("ID hóa đơn theo phòng là: " + idHoaDon);
        }

//        List<ChiTietHoaDon> listcthd = new ArrayList<>();
//        ChiTietHoaDonDAO ctdao = new ChiTietHoaDonDAO();
//        for (ChiTietHoaDon chiTietHoaDon : listCtHd) {
//            
//        }
//        try {
//            DefaultTableModel model = (DefaultTableModel) tblChitiethoadon.getModel();
//            model.setRowCount(0);
//            List<ChiTietHoaDon> listCtHd = ctdao.selectAllByIDHoaDon(idHoaDon);
//            for (ChiTietHoaDon cthd : listCtHd) {
//                Object[] rowTable = {cthd.getIDChiTietHoaDon(), cthd.getSoLuong(), cthd.getIDSanPham(), cthd.getIDHoaDon(), cthd.getDonGiaChiTietHoaDon()};
//                model.addRow(rowTable);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi");
//        }
//        hd.setIDPhong(String.valueOf(hddao.CheckBillByIDPhong(IdPhong)));
//        System.out.println(hd.getIDPhong().toString().getClass());
        //PH000 - > IDHOaDon 4 ->
        MenuTrungGianDAO menudao = new MenuTrungGianDAO();
        int ThoiGian = 0;
        try {
            DefaultTableModel model = (DefaultTableModel) tblChitiethoadon.getModel();
            model.setRowCount(0);
            List<MenuTrungGian> listCtHd = menudao.selectAllMenuTrungGian(IdPhong);
            for (MenuTrungGian menuTG : listCtHd) {
//                Object[] rowTable = {menuTG.getTenSanPham(),menuTG.getGiaSanPham(),menuTG.getSoLuongSanPham(),menuTG.getTongtien()};
                Object[] rowTable = {menuTG.getTenSanPham(), menuTG.getSoLuongSanPham(), menuTG.getGiaSanPham(), menuTG.getTongtien()};
                model.addRow(rowTable);
                ThoiGian = menuTG.getThoiGianSuDung();

            }
            int Tongtien = 0;
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            for (int i = 0; i < tblChitiethoadon.getRowCount(); i++) {
                Tongtien += Integer.parseInt(tblChitiethoadon.getValueAt(i, 3).toString());
            }
//            txtTongTien.setText(String.valueOf(formatter.format(Tongtien)) + " VNĐ");
//            txtThoiGianSuDung.setText(String.valueOf(ThoiGian) + " Phút");
        } catch (Exception e) {
            System.out.println("Lỗi");
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChitiethoadon = new javax.swing.JTable();
        cboSanPham = new javax.swing.JComboBox<>();
        btnDatPhong = new javax.swing.JButton();
        scrool = new javax.swing.JScrollPane();
        pnlDatPhong = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ PHÒNG");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRẢ PHÒNG - THÊM MÓN");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel5.setText("Danh Sách Sản Phẩm");

        tblChitiethoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Sản Phẩm", "Số lượng", "Giá Sản Phẩm", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblChitiethoadon);

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnDatPhong.setText("DoSomeThing");
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });

        scrool.setBorder(javax.swing.BorderFactory.createTitledBorder("Phòng"));

        pnlDatPhong.setLayout(new java.awt.GridLayout(8, 8, 10, 10));
        scrool.setViewportView(pnlDatPhong);
        OpenRoom();
        pnlDatPhong.repaint();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDatPhong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(scrool, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrool, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDatPhong)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void ThanhToan() {
        HoaDonDAO hddao = new HoaDonDAO();
        if (idHoaDon != -1) {
            JOptionPane.showMessageDialog(this, "Bạn đã thanh toán");
            hddao.ThanhToan(idHoaDon);
            ShowBill(idPhong);
        }
    }
    
     void fillComboBoxSanPham() {
         SanPhamDAO dao = new SanPhamDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSanPham.getModel();
        model.removeAllElements();
        List<SanPham> list = dao.selectAll();
        for (SanPham sp : list) {
            model.addElement(sp.getTenSP());

        }

    }


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed
;
    }//GEN-LAST:event_btnDatPhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel pnlDatPhong;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JTable tblChitiethoadon;
    // End of variables declaration//GEN-END:variables

}
