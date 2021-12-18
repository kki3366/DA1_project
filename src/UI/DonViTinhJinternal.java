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
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
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
    int row = 0;

    public DonViTinhJinternal() {
//        setTable();
        initComponents();
        fillcboSanPham();
        FillTable();
        AutoID();
        txtNhanVien.setText(Auth.user.getIdNhanVien());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDVT = new javax.swing.JTable();
        pnlEdit = new javax.swing.JPanel();
        lblIDSanPham = new javax.swing.JLabel();
        txtIDDVT = new javax.swing.JTextField();
        lblTenSanPham = new javax.swing.JLabel();
        lblGiaSanPham = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNhanVien = new javax.swing.JTextField();
        txtTenDVT = new javax.swing.JTextField();
        cboSanPham = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(549, 570));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đơn Vị Tính");

        pnlList.setLayout(new java.awt.BorderLayout());

        tblDVT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Đơn Vị Tính", "Tên Sản Phẩm", "Tến Sản Phẩm", "NHÂN VIÊN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDVT.setEditingRow(1);
        tblDVT.setRowHeight(25);
        tblDVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDVTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDVT);

        pnlList.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabs.addTab("DANH SÁCH", null, pnlList, "Danh sách");

        lblIDSanPham.setText("ID Đơn Vị Tính");

        txtIDDVT.setName("Mã nhân viên"); // NOI18N

        lblTenSanPham.setText("Tên Đơn Vị");

        lblGiaSanPham.setText("Giá Sản Phẩm");

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhân Viên");

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDSanPham)
                            .addComponent(lblTenSanPham)
                            .addComponent(lblGiaSanPham))
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDDVT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNhanVien)
                            .addComponent(txtTenDVT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addGap(27, 27, 27)
                                .addComponent(btnUpdate)
                                .addGap(71, 71, 71)
                                .addComponent(btnClear)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIDSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGiaSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", null, pnlEdit, "Cập nhật");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updete();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblDVTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDVTMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDVT.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDVTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGiaSanPham;
    private javax.swing.JLabel lblIDSanPham;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDVT;
    private javax.swing.JTextField txtIDDVT;
    private javax.swing.JTextField txtNhanVien;
    private javax.swing.JTextField txtTenDVT;
    // End of variables declaration//GEN-END:variables
public void init() {
        tabs.setSelectedIndex(1);
        this.FillTable();
        this.row = -1;

    }

    public void clearForm() {
        DonViTinh nv = new DonViTinh();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
    }

    public void edit() {
        int idDVT = (int) tblDVT.getValueAt(this.row, 0);
        DonViTinh nv = DAO.selectById(idDVT);
        this.setForm(nv);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    public void updateStatus() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        txtIDDVT.setEnabled(!edit);
        btnInsert.setEnabled(!edit);
        btnUpdate.setEnabled(edit);

    }

    void setForm(DonViTinh DVT) {
        txtIDDVT.setText(String.valueOf(DVT.getIDDVT()));
        txtTenDVT.setText(DVT.getTenDVT());
        cboSanPham.getSelectedItem();
        txtNhanVien.setText(Auth.user.getIdNhanVien());
    }

    DonViTinh getForm() {
        DonViTinh DVT = new DonViTinh();
        DVT.setIDDVT(Integer.parseInt(txtIDDVT.getText()));
        DVT.setTenDVT(txtTenDVT.getText());
        DVT.setIDSanPham(IdSanPham);
        DVT.setIDNhanVIen(txtNhanVien.getText());
        return DVT;
    }

    void insert() {
        
        DonViTinh dvt = getForm();
        try {
            DAO.insert(dvt);
            this.FillTable();
            AutoID();
            MsgBox.alert(this, "Thêm thành công");
            printStackTrace();
        } catch (Exception e) {        
            MsgBox.alert(this, "Thêm Thất Bại");
        }
    }

    void updete() {
       
        DonViTinh dvt = getForm();
       if (MsgBox.confirm(this, "Bạn có chắc muốn cập nhật này không?")) {
            try {
                DAO.update(dvt);
                this.FillTable();
                AutoID();
                MsgBox.alert(this, "Cập nhật Thành Công");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Cập nhật Thất Bại");
            }
        }

    }
    int index = -1;

    void delete() {
        DonViTinh DVT = DAO.selectById((Integer) tblDVT.getValueAt(index, 0));
        if (MsgBox.confirm(this, "Bạn có chắc muốn xóa chuyên đề này không?")) {
            try {
                String IDDVT = txtIDDVT.getText();
                DAO.delete(IDDVT);
                this.FillTable();
                AutoID();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Không thể xóa chuyên đề đã tồn tại!");
            }
        }

    }

    int IdSanPham;

    void AutoID() {
        DonViTinhDAO dao = new DonViTinhDAO();
        dao.AuToIdDVT(txtIDDVT);
    }

    void fillcboSanPham() {
        SanPhamDAO dao = new SanPhamDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSanPham.getModel();
        model.removeAllElements();
        List<SanPham> list = dao.selectAll();
        for (SanPham sp : list) {
            model.addElement(sp.getTenSanPham());
            IdSanPham = sp.getIdSanPham();
        }

    }

    void FillTable() {
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
