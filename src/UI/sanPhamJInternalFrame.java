package UI;

import DAO.SanPhamDAO;
import Entity.SanPham;
import Ultils.Auth;
import Ultils.MsgBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khoa
 */
public class sanPhamJInternalFrame extends javax.swing.JInternalFrame {

    SanPhamDAO dao = new SanPhamDAO();
    int row = 0;

    public sanPhamJInternalFrame() {
        initComponents();
        init();
        fillTable();
        AutoID();
        txtNhanVien.setText(Auth.user.getIdNhanVien());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        lblIDSanPham = new javax.swing.JLabel();
        txtIDSanPham = new javax.swing.JTextField();
        lblTenSanPham = new javax.swing.JLabel();
        lblGiaSanPham = new javax.swing.JLabel();
        lblMoTa = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTaSP = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtNhanVien = new javax.swing.JTextField();
        txtTenSp = new javax.swing.JTextField();
        txtGiaSanPham = new javax.swing.JTextField();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ SẢN PHẨM\n");
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
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        lblIDSanPham.setText("ID Sản Phẩm");

        txtIDSanPham.setName("Mã nhân viên"); // NOI18N

        lblTenSanPham.setText("Tên Sản Phâm");

        lblGiaSanPham.setText("Giá Sản Phẩm");

        lblMoTa.setText("Mô Tả");

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

        txtMoTaSP.setColumns(20);
        txtMoTaSP.setRows(5);
        jScrollPane2.setViewportView(txtMoTaSP);

        jLabel2.setText("Nhân Viên");

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
                            .addComponent(lblGiaSanPham)
                            .addComponent(lblMoTa))
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiaSanPham, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNhanVien)
                            .addComponent(txtTenSp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditLayout.createSequentialGroup()
                                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditLayout.createSequentialGroup()
                                        .addComponent(btnInsert)
                                        .addGap(8, 8, 8)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnClear)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIDSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGiaSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMoTa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", null, pnlEdit, "Cập nhật");

        pnlList.setLayout(new java.awt.BorderLayout());

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID SẢN PHẨM", "TÊN SẢN PHẨM", "GIÁ SẢN PHẨM", "MÔ TẢ", "NHÂN VIÊN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setEditingRow(1);
        tblSanPham.setRowHeight(25);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(140);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void init() {
        tabs.setSelectedIndex(1);
        this.fillTable();
        this.row = -1;

    }

    void AutoID() {
        SanPhamDAO dao = new SanPhamDAO();
        dao.AuToIdSanPham(txtIDSanPham);
    }

    //Tạo hàm fill table để đưa dữ liệu vào bên trong bảng
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel(); //tạo 1 model cho bảng nhân viên
        model.setRowCount(0); // xóa tất cả các hàng trên bảng nhân viên

        try {
            List<SanPham> list = dao.selectAll();//đọc cơ sở dữ liệu từ CSDL
            for (SanPham sp : list) {

                Object[] row = {sp.getIdSanPham(),
                    sp.getTenSanPham(),
                    sp.getGiaSanPham(),
                    sp.getMoTaSanPham(),
                    sp.getIdNhanVien()};
                model.addRow(row); //thêm 1 hàng vào bảng nhân viên

            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }

    }

    public void setForm(SanPham sp) {
        txtIDSanPham.setText(String.valueOf(sp.getIdSanPham()));
        txtTenSp.setText(sp.getTenSanPham());
        txtGiaSanPham.setText(String.valueOf(sp.getGiaSanPham()));
        txtMoTaSP.setText(sp.getMoTaSanPham());
        txtNhanVien.setText(sp.getIdNhanVien());
    }

    public SanPham getForm() {
        SanPham sp = new SanPham();
        sp.setIdSanPham(Integer.parseInt(txtIDSanPham.getText()));
        sp.setTenSanPham(txtTenSp.getText());
        sp.setGiaSanPham(Integer.parseInt(txtGiaSanPham.getText()));
        sp.setMoTaSanPham(txtMoTaSP.getText());
        sp.setIdNhanVien(txtNhanVien.getText());
        return sp;
    }

    public void clearForm() {
        SanPham nv = new SanPham();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
    }

    public void edit() {
        int idsanpham = (int) tblSanPham.getValueAt(this.row, 0);
        SanPham nv = dao.selectById(idsanpham);
        this.setForm(nv);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    public void updateStatus() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        btnInsert.setEnabled(!edit);
        btnUpdate.setEnabled(edit);

    }

    public void insert() {
        SanPham nv = getForm();
        try {
            dao.insert(nv);
            this.fillTable();
            this.clearForm();
            AutoID();
            txtGiaSanPham.setText("");
            MsgBox.alert(this, "Thêm Mới Thành Công");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm Mới Thất Bại");
            e.printStackTrace();
        }
    }

    public void update() {
        SanPham sp = getForm();
        try {
            dao.update(sp);
            this.fillTable();
            this.clearForm();
             AutoID();
             txtGiaSanPham.setText("");
            MsgBox.alert(this, "Cập Nhật Thành Công");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập Nhật Thất Bại");
            e.printStackTrace();
        }
    }

    public void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không đủ thẩm quyền");
        } else {
            int idSanPham = Integer.parseInt(txtIDSanPham.getText());
            try {
                dao.delete(idSanPham);
                this.fillTable();
                this.clearForm();
                AutoID();
                txtGiaSanPham.setText("");
                MsgBox.alert(this, "Xóa Thành Công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa Thất Bại!");
            }
        }

    }


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblSanPham.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked


    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed


    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGiaSanPham;
    private javax.swing.JLabel lblIDSanPham;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiaSanPham;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextArea txtMoTaSP;
    private javax.swing.JTextField txtNhanVien;
    private javax.swing.JTextField txtTenSp;
    // End of variables declaration//GEN-END:variables

}
