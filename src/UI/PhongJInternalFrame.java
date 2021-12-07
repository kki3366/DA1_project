package UI;

import DAO.PhongDAO;
import Entity.Phong;
import Ultils.Auth;
import Ultils.Check;
import Ultils.MsgBox;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 *
 */
public class PhongJInternalFrame extends javax.swing.JInternalFrame {

    int row = 0;

    public PhongJInternalFrame() {
        initComponents();
        fillTable();
        autoIdPhong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoVip = new javax.swing.JRadioButton();
        rdoPhong = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtGiaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIDPhong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoSudung = new javax.swing.JRadioButton();
        rdoTrong = new javax.swing.JRadioButton();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLyPhong = new javax.swing.JTable();

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
        jLabel1.setText("QUẢN LÝ PHÒNG");

        jLabel2.setText("Tên Phòng");

        txtTenPhong.setName("Tên Phòng"); // NOI18N

        jLabel3.setText("Giá Phòng");

        jLabel6.setText("Loại Phòng");

        buttonGroup1.add(rdoVip);
        rdoVip.setSelected(true);
        rdoVip.setText("VIP");

        buttonGroup1.add(rdoPhong);
        rdoPhong.setText("THƯỜNG");

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

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtGiaPhong.setName("Giá Phòng"); // NOI18N
        txtGiaPhong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGiaPhongKeyPressed(evt);
            }
        });

        jLabel4.setText("ID Phòng");

        txtIDPhong.setEditable(false);

        jLabel5.setText("Trạng Thái Phòng");

        buttonGroup2.add(rdoSudung);
        rdoSudung.setText("Đang sử dụng");
        rdoSudung.setEnabled(false);

        buttonGroup2.add(rdoTrong);
        rdoTrong.setSelected(true);
        rdoTrong.setText("Trống");
        rdoTrong.setEnabled(false);

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenPhong)
                    .addComponent(txtGiaPhong)
                    .addComponent(txtIDPhong)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(rdoSudung)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoTrong))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear))
                            .addComponent(jLabel4)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(rdoVip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoPhong))
                            .addComponent(jLabel5))
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIDPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoSudung)
                    .addComponent(rdoTrong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoVip)
                    .addComponent(rdoPhong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(24, 24, 24))
        );

        tabs.addTab("CẬP NHẬT", null, pnlEdit, "Cập nhật");

        pnlList.setLayout(new java.awt.BorderLayout());

        tblQuanLyPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PHÒNG", "TÊN PHÒNG", "GIÁ PHÒNG", "TRẠNG THÁI", "LOẠI PHÒNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuanLyPhong.setEditingRow(1);
        tblQuanLyPhong.setRowHeight(25);
        tblQuanLyPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLyPhong);
        if (tblQuanLyPhong.getColumnModel().getColumnCount() > 0) {
            tblQuanLyPhong.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        pnlList.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabs.addTab("DANH SÁCH", null, pnlList, "Danh sách");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    PhongDAO pdao = new PhongDAO();

    void autoIdPhong() {

        pdao.AutoIDPhong(txtIDPhong);
    }

    //Tạo hàm fill table để đưa dữ liệu vào bên trong bảng
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyPhong.getModel(); //tạo 1 model cho bảng nhân viên
        model.setRowCount(0); // xóa tất cả các hàng trên bảng nhân viên
        try {
            List<Phong> list = pdao.selectAll();//đọc cơ sở dữ liệu từ CSDL
            for (Phong p : list) {
                Object[] row = {p.getIdPhong(), p.getTenPhong(), p.getGiaPhong(), p.isTrangThaiPhong() ? "Đang sử dụng" : "Trống", p.isLoaiPhong() ? "VIP" : "Thường"};
                model.addRow(row); //thêm 1 hàng vào bảng nhân viên
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
            e.printStackTrace();
        }
    }

    //Tạo hàm setForm
    public void setForm(Phong p) {
        txtIDPhong.setText(p.getIdPhong());
        txtTenPhong.setText(p.getTenPhong());
        txtGiaPhong.setText(String.valueOf(p.getGiaPhong()));
        rdoSudung.setSelected(p.isTrangThaiPhong());
        rdoTrong.setSelected(!p.isTrangThaiPhong());
        rdoVip.setSelected(p.isLoaiPhong());
        rdoPhong.setSelected(!p.isLoaiPhong());
    }

    public Phong getForm() {
        Phong p = new Phong();
        p.setIdPhong(txtIDPhong.getText());
        p.setTenPhong(txtTenPhong.getText());
        p.setGiaPhong(Integer.parseInt(txtGiaPhong.getText()));
        p.setTrangThaiPhong(rdoTrong.isSelected());
        p.setLoaiPhong(rdoVip.isSelected());
        return p;
    }
//        

    public void clearForm() {
        Phong p = new Phong();
        this.setForm(p);
        txtGiaPhong.setText("");
        autoIdPhong();
        this.row = -1;
        this.updateStatus();
    }
//        

    public void edit() {
        String maP = (String) tblQuanLyPhong.getValueAt(this.row, 0);
        Phong nv = pdao.selectById(maP);
        this.setForm(nv);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    public void insert() {
        Phong p = getForm();
        try {
            pdao.insert(p);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm Mới Thành Công");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm Mới Thất Bại");
            e.printStackTrace();
        }

    }
//        

    public void update() {
        Phong p = getForm();
        try {
            pdao.update(p);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Cập Nhật Thành Công");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập Nhật Thất Bại");
        }

    }
//        

    public void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn Không Đủ Thẩm Quyền");
        } else if (MsgBox.confirm(this, "Bạn có muốn xóa?")) {
            try {
                String maP = txtIDPhong.getText();
                pdao.delete(maP);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa Thành Công");
            } catch (Exception ex) {
                MsgBox.alert(this, "Xóa Thất Bại");
                ex.printStackTrace();
            }
        }

    }
//         

//        
    public void updateStatus() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        btnInsert.setEnabled(!edit);
        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);

    }
//         
//        


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void tblQuanLyPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyPhongMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblQuanLyPhong.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblQuanLyPhongMouseClicked


    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (Check.checkNullTextField(txtTenPhong) && Check.checkNullTextField(txtGiaPhong)) {
            this.insert();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         if (Check.checkNullTextField(txtTenPhong) && Check.checkNullTextField(txtGiaPhong)) {
            this.update();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.delete();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtGiaPhongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaPhongKeyPressed
         char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            MsgBox.alert(this, "SDT phải là số");
            txtGiaPhong.setText("");
        } else {

        }
    }//GEN-LAST:event_txtGiaPhongKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JRadioButton rdoPhong;
    private javax.swing.JRadioButton rdoSudung;
    private javax.swing.JRadioButton rdoTrong;
    private javax.swing.JRadioButton rdoVip;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblQuanLyPhong;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JTextField txtIDPhong;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables

}
