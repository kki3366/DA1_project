package UI;

import DAO.KhachHangDAO;
import Entity.KhachHang;
import Ultils.Auth;
import Ultils.Check;
import Ultils.MsgBox;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khoa
 */
public class khachHangJInternalFrame extends javax.swing.JInternalFrame {

    KhachHangDAO dao = new KhachHangDAO();
    int row = 0;

    public khachHangJInternalFrame() {
        initComponents();
        init();
       autoIDKhachHang();
    }
    
    void autoIDKhachHang(){
        KhachHangDAO dao = new KhachHangDAO();
        dao.AutoIDKhachHang(txtMaKhachHang);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        txtSDTKhachHang = new javax.swing.JTextField();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ NHÂN VIÊN");
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
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel2.setText("Mã Khách Hàng");

        txtMaKhachHang.setName("Mã nhân viên"); // NOI18N

        jLabel3.setText("Họ Tên");

        jLabel4.setText("SDT Khách Hàng");

        txtMaNhanVien.setName("Họ và tên"); // NOI18N

        jLabel5.setText("Mã Nhân Viên");

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

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(249, 359, Short.MAX_VALUE))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSDTKhachHang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", null, pnlEdit, "Cập nhật");

        pnlList.setLayout(new java.awt.BorderLayout());

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID KHÁCH HÀNG", "HỌ TÊN", "SDT KHÁCH HÀNG", "MÃ NHÂN VIÊN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setEditingRow(1);
        tblKhachHang.setRowHeight(25);
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(2).setPreferredWidth(140);
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
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void init() {
        tabs.setSelectedIndex(1);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }
//    

    //Tạo hàm fill table để đưa dữ liệu vào bên trong bảng
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel(); //tạo 1 model cho bảng nhân viên
        model.setRowCount(0); // xóa tất cả các hàng trên bảng nhân viên

        try {
            List<KhachHang> list = dao.selectAll();//đọc cơ sở dữ liệu từ CSDL
            for (KhachHang kh : list) {
                Object[] row = {kh.getIdKhachHang(),
                    kh.getHoTen(),
                    kh.getSDTKhachHang(),
                    kh.getIdNhanVien()};
                model.addRow(row); //thêm 1 hàng vào bảng nhân viên

            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }

    }

    //Tạo hàm setForm
    public void setForm(KhachHang kh) {
        txtMaKhachHang.setText(kh.getIdKhachHang());
        txtMaNhanVien.setText(kh.getIdNhanVien());
        txtHoTen.setText(kh.getHoTen());
        txtSDTKhachHang.setText(kh.getSDTKhachHang());

    }
//        

    public KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setHoTen(txtHoTen.getText());
        kh.setSDTKhachHang(txtSDTKhachHang.getText());
        

        return kh;
    }
////        
//
//    public void clearForm() {
//        NhanVien nv = new NhanVien();
//        this.setForm(nv);
//        this.row = -1;
//        this.updateStatus();
//    }
////        
//
//    public void edit() {
//        String manv = (String) tblKhachHang.getValueAt(this.row, 0);
//        NhanVien nv = dao.selectById(manv);
//        this.setForm(nv);
//        tabs.setSelectedIndex(0);
//        this.updateStatus();
//    }
////        
//
//    public void insert() {
//        NhanVien nv = getForm();
//        String mk2 = new String(txtSDTKhachHang.getPassword());
//        if (!mk2.equals(nv.getMatKhau())) {
//            MsgBox.alert(this, "Xác Nhân Mật Khẩu Không Đúng");
//            txtSDTKhachHang.requestFocus();
//        } else {
//            try {
//                dao.insert(nv);
//                this.fillTable();
//                this.clearForm();
//                MsgBox.alert(this, "Thêm Mới Thành Công");
//            } catch (Exception e) {
//                MsgBox.alert(this, "Thêm Mới Thất Bại");
//            }
//        }
//    }
////        
//
//    public void update() {
//        NhanVien nv = getForm();
//        String mk2 = new String(txtSDTKhachHang.getPassword());
//        if (!mk2.equals(nv.getMatKhau())) {
//            MsgBox.alert(this, "Xác Nhân Mật Khẩu Không Đúng");
//            txtSDTKhachHang.requestFocus();
//        } else {
//            try {
//                dao.update(nv);
//                this.fillTable();
//                MsgBox.alert(this, "Cập Nhật Thành Công");
//            } catch (Exception e) {
//                MsgBox.alert(this, "Cập Nhật Thất Bại");
//            }
//        }
//    }
//        

//    public void delete() {
//        if (!Auth.isManager()) {
//            MsgBox.alert(this, "Bạn Không Có Quyền Xóa Nhân Viên");
//        } else {
//            String manv = txtMaKhachHang.getText();
//            if (manv.equals(Auth.user.getIdNhanVien())) {
//                MsgBox.alert(this, "Không Được Xóa Chính Bạn!");
//            } else if (MsgBox.confirm(this, "Bạn Thực Sự Muốn Xóa Nhân Viên Này?")) {
//                try {
//                    dao.delete(manv);
//                    this.fillTable();
//                    this.clearForm();
//                    MsgBox.alert(this, "Xóa Thành Công!");
//                } catch (Exception e) {
//                    MsgBox.alert(this, "Xóa Thất Bại!");
//                }
//            }
//        }
//
//    }

    public boolean checkTrungMa(JTextField jtxt) {

        if (dao.selectById(jtxt.getText()) == null) {
            return true;
        } else {

            MsgBox.alert(this, jtxt.getName() + " đã bị tồn tại.");
            return false;
        }
    }

    public void updateStatus() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        txtMaKhachHang.setEditable(!edit);
        btnInsert.setEnabled(!edit);
        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);

    }


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
//        if (evt.getClickCount() == 2) {
//            this.row = tblKhachHang.getSelectedRow();
//            this.edit();
//        }
    }//GEN-LAST:event_tblKhachHangMouseClicked


    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
//        if (Check.checkNullTextField(txtMaKhachHang)
//                && Check.checkNullTextField(txtHoTen)
//                && Check.checkNullTextField(txtSDTKhachHang)
//                && Check.checkNullTextField(txtMaNhanVien)) {
//            if (!txtHoTen.getPassword().equals(txtSDTKhachHang.getPassword())) {
//                if (checkTrungMa(txtMaKhachHang)) {
//                    insert();
//                }
//
//            } else {
//                MsgBox.alert(this, "Mật khẩu không khớp");
//            }
//
//        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        this.update();
    }//GEN-LAST:event_btnUpdateActionPerformed


    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        this.delete();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
//        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSDTKhachHang;
    // End of variables declaration//GEN-END:variables

}
