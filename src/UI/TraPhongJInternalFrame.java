package UI;

import DAO.ChiTietHoaDonDAO;
import DAO.HoaDonDAO;
import Entity.HoaDon;
import DAO.KhachHangDAO;
import DAO.MenuTrungGianDAO;
import DAO.PhongDAO;
import DAO.SanPhamDAO;
import Entity.ChiTietHoaDon;
import Entity.KhachHang;
import Entity.MenuTrungGian;
import Entity.Phong;
import Entity.SanPham;
import Ultils.Auth;
import Ultils.MsgBox;
import Ultils.XDate;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class TraPhongJInternalFrame extends javax.swing.JInternalFrame {

    String idRoom = null;

    public TraPhongJInternalFrame() {
        initComponents();
        fillComboBoxSanPham();
        Date now = new Date();
//        txtThoiGianKetThuc.setText(XDate.toString(now, "dd-MM-yyyy hh:mm:ss"));
        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

            @Override
            public void actionPerformed(ActionEvent e) {
                txtThoiGianKetThuc.setText(sdf.format(new Date()));
            }
        }).start();

    }
    ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
    int idHoaDon = 0;
    String idPhong = null;
    int idSP = 0;
    int slSP = 0;
    int IdCTHD = 0;
    String TenSanPham;
    int GiaSanPham = 0;
    boolean status = false;
    int GiaPhong = 0;
    int ThoiGian = 0;
    boolean ChoThanhToan;
    boolean hoantat;
    int row;

    void OpenRoom() {

        PhongDAO dao = new PhongDAO();
        for (Phong p : dao.selectAll()) {
            JButton btn = new JButton();
            btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btn.setFont(btn.getFont().deriveFont(14f).deriveFont(Font.BOLD));
            btn.setSize(60, 60);
            btn.setText("<html><p>" + p.getTenPhong() + "</p><p>" + String.valueOf(p.isTrangThaiPhong() ? "Sử dụng" : "Trống") + "</p></html>");
            pnlDatPhong.add(btn);
            if (p.isTrangThaiPhong() == true) {
                btn.setBackground(Color.green);
            }

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String Idroom = p.getIdPhong();
                    status = p.isTrangThaiPhong();
                    GiaPhong = p.getGiaPhong();
                    System.out.println(GiaPhong);
                    System.out.println(status);
                    System.out.println(Idroom);
                    ShowBill(Idroom);
                    System.out.println(ChoThanhToan);
                    String test = cboSanPham.getSelectedItem().toString();
                    System.out.println("test :" + test);

                }
            });

        }

    }

    void ShowBill(String IdPhong) {

        HoaDonDAO hddao = new HoaDonDAO();
        List<HoaDon> listHd = hddao.CheckBillByIDPhong(IdPhong);
        for (HoaDon hd : listHd) {
//            idHoaDon = hd.getIDHoaDon();
//              System.out.println("ID Hóa Đơn là :" + idHoaDon);
            ChoThanhToan = hd.isChoThanhToan();
            idHoaDon = hd.getIDHoaDon();
            idPhong = hd.getIDPhong();
            System.out.println("ID hóa đơn theo phòng là: " + idHoaDon);
            System.out.println("Hóa đơn chờ thanh toán: " + ChoThanhToan);
        }

        ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();

        List<ChiTietHoaDon> listCTHD = cthddao.selectAllByIDHoaDon(idHoaDon);
        for (ChiTietHoaDon chiTietHoaDon : listCTHD) {
            IdCTHD = chiTietHoaDon.getIDChiTietHoaDon();
            System.out.println("Id Chi tết hóa đơn là:" + IdCTHD);
        }

        MenuTrungGianDAO menudao = new MenuTrungGianDAO();

        try {
            DefaultTableModel model = (DefaultTableModel) tblChitiethoadon.getModel();
            model.setRowCount(0);
            List<MenuTrungGian> listCtHd = menudao.selectAllMenuTrungGian(IdPhong);
            for (MenuTrungGian menuTG : listCtHd) {
//                Object[] rowTable = {menuTG.getTenSanPham(),menuTG.getGiaSanPham(),menuTG.getSoLuongSanPham(),menuTG.getTongtien()};
                Object[] rowTable = {menuTG.getTenSanPham(), menuTG.getSoLuongSanPham(), menuTG.getGiaSanPham(), menuTG.getTongtien()};
                model.addRow(rowTable);
                ThoiGian = menuTG.getThoiGianSuDung();
                slSP = menuTG.getSoLuongSanPham();
                TenSanPham = menuTG.getTenSanPham();
                System.out.println("Tên sản phẩm: " + TenSanPham);
                System.out.println("số lượng sp: " + slSP);

            }
            int Tongtien = 0;
//            DecimalFormat formatter = new DecimalFormat("###,###,###");
            for (int i = 0; i < tblChitiethoadon.getRowCount(); i++) {
                Tongtien += Integer.parseInt(tblChitiethoadon.getValueAt(i, 3).toString());
            }

            txtTien.setText(String.valueOf(Tongtien));
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
        btnThemSanPham = new javax.swing.JButton();
        btnChinhSoLuong = new javax.swing.JButton();
        SpinnerSL = new javax.swing.JSpinner();
        txtThoiGianKetThuc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTien = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnTraPhong = new javax.swing.JButton();
        scrool = new javax.swing.JScrollPane();
        pnlDatPhong = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu Thêm Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
        tblChitiethoadon.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblChitiethoadon);

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSanPhamActionPerformed(evt);
            }
        });

        btnThemSanPham.setText("Thêm Sản Phẩm");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });

        btnChinhSoLuong.setText("Chỉnh số lượng");
        btnChinhSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSoLuongActionPerformed(evt);
            }
        });

        SpinnerSL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));

        jLabel2.setText("Thời Gian Rời");

        jLabel3.setText("Tiền");

        btnXoa.setText("Xóa ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTien)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(cboSanPham, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SpinnerSL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThemSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChinhSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChinhSoLuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTraPhong.setText("Trả Phòng");
        btnTraPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraPhongActionPerformed(evt);
            }
        });

        scrool.setBorder(javax.swing.BorderFactory.createTitledBorder("Phòng"));

        pnlDatPhong.setLayout(new java.awt.GridLayout(8, 8, 10, 10));
        scrool.setViewportView(pnlDatPhong);
        OpenRoom();
        pnlDatPhong.repaint();

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTraPhong)
                        .addGap(18, 18, 18)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraPhong)
                    .addComponent(btnThanhToan))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void ThanhToan() {
        if (ChoThanhToan == false) {
            MsgBox.alert(this, "Vui lòng trả phòng trước");
        } else {
            HoaDonDAO hddao = new HoaDonDAO();
            if (idHoaDon != -1) {
                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
                Date now = new Date();
                HoaDon hd = hddao.selectById(idHoaDon);
                PhongDAO phong = new PhongDAO();
                phong.PhongStatus(idPhong);
                hddao.ThanhToan(idHoaDon, Integer.parseInt(txtTien.getText()) + (ThoiGian * (GiaPhong / 60)));
                ShowBill(idPhong);
                txtTien.setText("");
                pnlDatPhong.removeAll();
                OpenRoom();

            }
        }
    }

    void TraPhong() {
        if (ChoThanhToan == true) {
            MsgBox.alert(this, "Bạn đã trả phòng rồi");
        } else {
            HoaDonDAO hddao = new HoaDonDAO();
            if (idHoaDon != -1) {
                JOptionPane.showMessageDialog(this, "Trả phòng thành công");
                Date now = new Date();
                hddao.TraPhong(XDate.toDate(txtThoiGianKetThuc.getText(), "dd-MM-yyyy hh:mm:ss"), idHoaDon);
                ShowBill(idPhong);
//                PhongDAO phong = new PhongDAO();
//            phong.PhongStatus(idPhong);
                pnlDatPhong.removeAll();
                OpenRoom();

            }
        }
    }

    void fillComboBoxSanPham() {
        SanPhamDAO dao = new SanPhamDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSanPham.getModel();
        model.removeAllElements();
        List<SanPham> list = dao.selectAll();
        for (SanPham sp : list) {
            model.addElement(sp.getTenSanPham());

        }

    }

    public ChiTietHoaDon getForm() {
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.setIDHoaDon(idHoaDon);
        cthd.setSoLuong((int) SpinnerSL.getValue());
        cthd.setIDSanPham(idSP);
        cthd.setDonGiaChiTietHoaDon(GiaSanPham);
        return cthd;
    }

    void insertSP() {
          ChiTietHoaDonDAO dao = new ChiTietHoaDonDAO();
          if(dao.Check_item(idHoaDon, idSP) == true){
              MsgBox.alert(this, "Sản phẩm đã được thêm");
          }else{
               ChiTietHoaDon cthd = getForm();
            try {
                cthddao.insert(cthd);
                System.out.println(cthd.getIDChiTietHoaDon());
                ShowBill(idPhong);
                System.out.println();
                System.out.println("Thêm thành công");
            } catch (Exception ex) {
                if (ex.getMessage().contains("UNIQUE KEY")) {
                    MsgBox.alert(this, "Sản phẩm đã được thêm");
                } else {
                    MsgBox.alert(this, "Thêm sản phẩm thất bại");
                    ex.printStackTrace();
                }
            }
          }

    }

    void updateSP() {
        ChiTietHoaDon cthd = getForm();
        try {
            cthddao.Update_item_after_insert((int) SpinnerSL.getValue(), idSP);
            System.out.println(cthd.getIDChiTietHoaDon());
            ShowBill(idPhong);
            System.out.println();
            System.out.println("Sửa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sửa thất bại");
        }
    }

    void deleteSP() {
        ChiTietHoaDon cthd = getForm();
        try {
            cthddao.delete(idSP);
            System.out.println(cthd.getIDChiTietHoaDon());
            ShowBill(idPhong);

            System.out.println("Xóa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Xóa thất bại");
        }
    }

    void getIdSP_GiaSP_By_CBO() {
        String value = (String) cboSanPham.getSelectedItem();
        if (value == null) {

        } else {
            SanPhamDAO spdao = new SanPhamDAO();
            SanPham sp = spdao.selectByNameSP(value);
            idSP = sp.getIdSanPham();
            GiaSanPham = sp.getGiaSanPham();
            System.out.println("ID sản phẩm là: " + idSP);
        }
    }


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnTraPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraPhongActionPerformed
        if (status == false) {
            MsgBox.alert(this, "Phòng đang trống. Vui lòng kiểm tra lại");
        } else {
            TraPhong();
        }
    }//GEN-LAST:event_btnTraPhongActionPerformed

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        if (status == false) {
            MsgBox.alert(this, "Phòng đang trống. Vui lòng kiểm tra lại");
        } else {
            insertSP();
        }
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    private void cboSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSanPhamActionPerformed
        getIdSP_GiaSP_By_CBO();
    }//GEN-LAST:event_cboSanPhamActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        if (status == false) {
            MsgBox.alert(this, "Phòng đang trống. Vui lòng kiểm tra lại");
        } else {
            ThanhToan();
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnChinhSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSoLuongActionPerformed
        if (status == false) {
            MsgBox.alert(this, "Phòng đang trống. Vui lòng kiểm tra lại");
        } else {
            updateSP();
        }
    }//GEN-LAST:event_btnChinhSoLuongActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (status == false) {
            MsgBox.alert(this, "Phòng đang trống. Vui lòng kiểm tra lại");
        } else {
            deleteSP();
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerSL;
    private javax.swing.JButton btnChinhSoLuong;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnTraPhong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel pnlDatPhong;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JTable tblChitiethoadon;
    private javax.swing.JTextField txtThoiGianKetThuc;
    private javax.swing.JTextField txtTien;
    // End of variables declaration//GEN-END:variables

}
