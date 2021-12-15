/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.DonViTinhDAO;
import DAO.SanPhamDAO;
import Entity.DonViTinh;
import Entity.SanPham;
import Ultils.Auth;
import Ultils.MsgBox;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOW
 */
public class DonViTinhJinternal extends javax.swing.JInternalFrame {

    static DefaultTableModel model;
    DonViTinhDAO DAO = new DonViTinhDAO();

    public DonViTinhJinternal() {
//        setTable();
        initComponents();
        fillcboSanPham();
        FillTable();
        AutoID();
        txtIDNhanVien.setText(Auth.user.getIdNhanVien());
    }

//    public void setTable() {
//        model = model = new DefaultTableModel(new Object[][]{}, new Object[]{"IDDVT", "Tên Dơn Vị Tính", "IDNHANVIEN"});
//        tblDVT.setModel(model);
//    }
  boolean isUpdate = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDVT = new javax.swing.JTable();
        txtTimDVT = new javax.swing.JTextField();
        pnlFormChuyenDe = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtIDNhanVien = new javax.swing.JTextField();
        txtTenDVT = new javax.swing.JTextField();
        txtIDDVT = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        cboSanPham = new javax.swing.JComboBox<>();
        pnlCongCuBangChuyenDe = new javax.swing.JPanel();

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Đơn Vị Tính");

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblDVT.setAutoCreateRowSorter(true);
        tblDVT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tblDVT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDVT.setGridColor(new java.awt.Color(255, 255, 255));
        tblDVT.setRowHeight(30);
        tblDVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDVTMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblDVT);

        txtTimDVT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTimDVT.setForeground(new java.awt.Color(153, 153, 153));
        txtTimDVT.setText("Tìm kiếm Đơn Vị");
        txtTimDVT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimDVTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimDVTFocusLost(evt);
            }
        });
        txtTimDVT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimDVTKeyReleased(evt);
            }
        });

        pnlFormChuyenDe.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormChuyenDe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("IDDVT");
        pnlFormChuyenDe.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Sản Phẩm");
        pnlFormChuyenDe.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Tên Đơn VỊ");
        pnlFormChuyenDe.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        txtIDNhanVien.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormChuyenDe.add(txtIDNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 360, -1));

        txtTenDVT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormChuyenDe.add(txtTenDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 360, -1));

        txtIDDVT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pnlFormChuyenDe.add(txtIDDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 360, -1));

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(102, 102, 102));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        pnlFormChuyenDe.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, -1, -1));

        btnCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        pnlFormChuyenDe.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(102, 102, 102));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlFormChuyenDe.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, -1, -1));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(102, 102, 102));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlFormChuyenDe.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("ID Nhân Viên");
        pnlFormChuyenDe.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlFormChuyenDe.add(cboSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 360, -1));

        pnlCongCuBangChuyenDe.setBackground(new java.awt.Color(255, 255, 255));
        pnlCongCuBangChuyenDe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(940, Short.MAX_VALUE)
                .addComponent(txtTimDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(540, 540, 540)
                            .addComponent(jLabel19))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlCongCuBangChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlFormChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtTimDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(680, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(61, 61, 61)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnlCongCuBangChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnlFormChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDVTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDVTMousePressed
        // TODO add your handling code here:
//        index = tblDVT.getSelectedRow();
//        edit();
    }//GEN-LAST:event_tblDVTMousePressed

    private void txtTimDVTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimDVTFocusGained
        // TODO add your handling code here:
//        focusGained();
    }//GEN-LAST:event_txtTimDVTFocusGained

    private void txtTimDVTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimDVTFocusLost
        // TODO add your handling code here:
//        focusLost();
    }//GEN-LAST:event_txtTimDVTFocusLost

    private void txtTimDVTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimDVTKeyReleased
        // TODO add your handling code here:
        FillTable();
    }//GEN-LAST:event_txtTimDVTKeyReleased

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
//        isUpdate = true;
//       
//            update();
//        
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
//        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
     insert();
    }//GEN-LAST:event_btnThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel pnlCongCuBangChuyenDe;
    private javax.swing.JPanel pnlFormChuyenDe;
    private static javax.swing.JTable tblDVT;
    private javax.swing.JTextField txtIDDVT;
    private javax.swing.JTextField txtIDNhanVien;
    private javax.swing.JTextField txtTenDVT;
    private static javax.swing.JTextField txtTimDVT;
    // End of variables declaration//GEN-END:variables

//    public void focusGained() {
//        if (txtTimDVT.getText().equals("Tìm kiếm chuyên đề")) {
//            txtTimDVT.setText("");
//        }
//        txtTimDVT.setForeground(Color.black);
//    }
//
//    public void focusLost() {
//        if (txtTimDVT.getText().equals("")) {
//            txtTimDVT.setText("Tìm kiếm chuyên đề");
//            txtTimDVT.setForeground(new Color(102, 102, 102));
//        }
//    }
//
//    public void FillTable() {
//        model.setRowCount(0);
//
//        try {
//            DonViTinhDAO dao = new DonViTinhDAO();
//            List<DonViTinh> list = dao.selectAll();
////            if (txtTimDVT.getText().equals("") || txtTimDVT.getText().equals("Tìm kiếm chuyên đề")) {
////                list = DAO.selectAll();
////            } else {
////                list = DAO.selectByKeyword(txtTimDVT.getText());
////            }
//            for (DonViTinh DVT : list) {
//                Object[] row = {
//                    DVT.getIDDVT(),
//                    DVT.getTenDVT(),
//                    DVT.getIDNhanVIen()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//        }
//
//    }
//
//    void setForm(DonViTinh DVT) {
//        txtIDDVT.setText(String.valueOf(DVT.getIDDVT()));
//        txtTenDVT.setText(DVT.getTenDVT());
//        txtIDNhanVien.setText(Auth.user.getIdNhanVien());
//    }
//
    DonViTinh getForm() {
        DonViTinh DVT = new DonViTinh();
        DVT.setIDDVT(Integer.valueOf(txtIDDVT.getText()));
        DVT.setTenDVT(txtTenDVT.getText());
        DVT.setIDSanPham(IdSanPham);
        DVT.setIDNhanVIen(txtIDNhanVien.getText());
        return DVT;
    }
    
    void insert(){
        DonViTinhDAO dao = new DonViTinhDAO();
        DonViTinh dvt = getForm();
         try {
            dao.insert(dvt);
            this.FillTable();
          
            MsgBox.alert(this, "Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Thêm Thất Bại");
        }
    }
//    int index = -1;
//     void edit() {
//        try {
//            String IDDVT = (String) tblDVT.getValueAt(this.index, 0);
//            DonViTinh model = DAO.selectById(IDDVT);
//            if (model != null) {
//                setForm(model);//lỗi chưa bk sửa
//                this.updateStatus();
//            }
//        } catch (Exception e) {
//            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
//        }
//    }
//       void insert() {
//        DonViTinh model = getForm();
//        if (model.getTenDVT()== null) {
//            MsgBox.alert(this, "Hình Không Được Để Trống");
//            return;
//        }
//        try {
//            DAO.insert(model);
//            this.FillTable();
//            //MsgBox.alert(this, "Thêm mới thành công!");
//        } catch (Exception e) {
//            MsgBox.alert(this, "Thêm mới thất bại!");
//        }
//    }
//
//    void update() {
//        DonViTinh model = getForm();
//        if (MsgBox.confirm(this, "Bạn có chắc muốn cập nhật chuyên đề này không?")) {
//            try {
//                DAO.update(model);
//                this.FillTable();
//                clear();
//                //MsgBox.alert(this, "Cập nhật thành công");
//            } catch (Exception e) {
//            }
//
//        }
//    }
//
//    void delete() {
//        DonViTinh DVT = DAO.selectById(String.valueOf(tblDVT.getValueAt(index, 0)));
//        if (MsgBox.confirm(this, "Bạn có chắc muốn xóa chuyên đề này không?")) {
//            try {
//                String IDDVT = txtIDDVT.getText();
//                DAO.delete(IDDVT);
//                this.FillTable();
//                MsgBox.alert(this, "Xóa thành công!");
//            } catch (Exception e) {
//                MsgBox.alert(this, "Không thể xóa chuyên đề đã tồn tại khóa học!");
//            }
//        }
//
//    }
//
//    void updateStatus() {
//        boolean edit = (index >= 0);
//        boolean first = this.index == 0;
//        boolean last = this.index == tblDVT.getRowCount() - 1;
//        tblDVT.setEnabled(!edit);
//        btnThem.setEnabled(!edit);
//        btnCapNhat.setEnabled(edit);
//        btnXoa.setEnabled(edit);
//
//        btnFirst.setEnabled(edit && !first);
//        btnPrev.setEnabled(edit && !first);
//        btnNext.setEnabled(edit && !last);
//        btnLast.setEnabled(edit && !last);
//    }
//    
//    public void first() {
//        index = 0;
//        tblDVT.setRowSelectionInterval(index, index);
//        edit();
//    }
//
//    public void prev() {
//        if (index > 0) {
//            index--;
//            tblDVT.setRowSelectionInterval(index, index);
//            edit();
//        }
//    }
//
//    public void next() {
//        if (index < tblDVT.getRowCount() - 1) {
//            index++;
//            tblDVT.setRowSelectionInterval(index, index);
//            edit();
//        }
//    }
//
//    public void last() {
//        index = tblDVT.getRowCount() - 1;
//        tblDVT.setRowSelectionInterval(index, index);
//        edit();
//    }
//
//    void clear() {
//        txtIDDVT.setText("");
//        txtTenDVT.setText("");
//        txtIDNhanVien.setText("");        
//        index = -1;
//        updateStatus();
//    }
    int IdSanPham;
    
    
    void AutoID(){
        DonViTinhDAO dao = new DonViTinhDAO();
        dao.AuToIdDVT(txtIDDVT);
    }
    
    void fillcboSanPham(){
          SanPhamDAO dao = new SanPhamDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSanPham.getModel();
        model.removeAllElements();
        List<SanPham> list = dao.selectAll();
        for (SanPham sp : list) {
            model.addElement(sp.getTenSanPham());
            IdSanPham = sp.getIdSanPham();
        }

    }
    
    void FillTable(){
          DefaultTableModel model = (DefaultTableModel) tblDVT.getModel(); //tạo 1 model cho bảng nhân viên
        model.setRowCount(0); // xóa tất cả các hàng trên bảng nhân viên

        try {
            DonViTinhDAO dao = new DonViTinhDAO();
            List<DonViTinh> list = dao.selectAll();//đọc cơ sở dữ liệu từ CSDL
            for (DonViTinh dvt : list) {
                Object[] row = {dvt.getIDDVT(),
                    dvt.getTenDVT(),
                    dvt.getIDSanPham(),
                    dvt.getIDNhanVIen()};
                model.addRow(row); //thêm 1 hàng vào bảng nhân viên

            }
            
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }

    }

}
