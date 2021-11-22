package UI;


//
//import DAO.nhanVienDAO;
//import java.util.List;
//
//import javax.swing.table.DefaultTableModel;
//
//import Entity.NhanVien;
//import Utils.Auth;
//import Utils.MsgBox;


/**
 *
 * @author Nghiptpc00940
 * Ngày 04/10/2021
 */
public class PhongJInternalFrame extends javax.swing.JInternalFrame {
//     nhanVienDAO dao = new nhanVienDAO();
     int row = 0;

    public PhongJInternalFrame() {
        initComponents();
//        init();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGiaPhong = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

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

        txtTenPhong.setName("Mã nhân viên"); // NOI18N

        jLabel3.setText("Giá Phòng");

        txtGiaPhong.setName("Mật khẩu"); // NOI18N

        jLabel6.setText("Loại Phòng");

        buttonGroup1.add(rdoTruongPhong);
        rdoTruongPhong.setSelected(true);
        rdoTruongPhong.setText("VIP");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setText("THƯỜNG");

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

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenPhong)
                    .addComponent(txtGiaPhong)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(rdoTruongPhong)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNhanVien))
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)))
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanVien))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", null, pnlEdit, "Cập nhật");

        pnlList.setLayout(new java.awt.BorderLayout());

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhanVien.setEditingRow(1);
        tblNhanVien.setRowHeight(25);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        pnlList.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabs.addTab("DANH SÁCH", null, pnlList, "Danh sách");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    public void init(){
//        tabs.setSelectedIndex(1);
//        this.fillTable();
//        this.row = -1;
//        this.updateStatus();
//    }
//    
    
 
    //Tạo hàm fill table để đưa dữ liệu vào bên trong bảng
//        public void fillTable(){
//            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel(); //tạo 1 model cho bảng nhân viên
//            model.setRowCount(0); // xóa tất cả các hàng trên bảng nhân viên
//            try {
//                List<NhanVien> list = dao.selectAll();//đọc cơ sở dữ liệu từ CSDL
//                for(NhanVien nv : list){
//                    Object[] row = {nv.getMaNV(),nv.getMatKhau(),nv.getHoTen(),nv.isVaiTro()?"Trưởng phòng":"Nhân viên"};
//                model.addRow(row); //thêm 1 hàng vào bảng nhân viên
//                }
//            } catch (Exception e) {
//                MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");         
//            }
//        }
        
     //Tạo hàm setForm
//        public void setForm(NhanVien nv){
//            txtMaNV.setText(nv.getMaNV());
//            txtHoTen.setText(nv.getHoTen());
//            txtMatKhau.setText(nv.getMatKhau());
//            txtXacNhanMK.setText(nv.getMatKhau());
//            rdoTruongPhong.setSelected(nv.isVaiTro());
//            rdoNhanVien.setSelected(!nv.isVaiTro());
//        }
        
//        public NhanVien getForm(){
//            NhanVien nv = new NhanVien();
//            nv.setMaNV(txtMaNV.getText());
//            nv.setHoTen(txtHoTen.getText());
//            nv.setMatKhau(new String (txtMatKhau.getPassword()));
//            nv.setVaiTro(rdoTruongPhong.isSelected());
//            return nv;
//        }
//        
//        public void clearForm(){
//            NhanVien nv = new NhanVien();
//            this.setForm(nv);
//            this.row = -1;
//            this.updateStatus();
//        }
//        
//        public void edit(){
//            String manv = (String)tblNhanVien.getValueAt(this.row, 0);
//            NhanVien nv = dao.selectById(manv);
//            this.setForm(nv);
//            tabs.setSelectedIndex(0);
//            this.updateStatus();
//        }
//        
//        public void insert(){
//            NhanVien nv = getForm();
//            String mk2  = new String (txtXacNhanMK.getPassword());
//            if(!mk2.equals(nv.getMatKhau())){
//                MsgBox.alert(this, "Xác Nhân Mật Khẩu Không Đúng");
//                txtXacNhanMK.requestFocus();
//            }else{
//                try {
//                    dao.insert(nv);
//                    this.fillTable();
//                    this.clearForm();   
//                    MsgBox.alert(this,"Thêm Mới Thành Công");
//                } catch (Exception e) {
//                    MsgBox.alert(this,"Thêm Mới Thất Bại");  
//                }
//            }
//        }
//        
//        public void update(){
//            NhanVien nv = getForm();
//            String mk2  = new String (txtXacNhanMK.getPassword());
//            if(!mk2.equals(nv.getMatKhau())){
//                MsgBox.alert(this, "Xác Nhân Mật Khẩu Không Đúng");
//                txtXacNhanMK.requestFocus();
//            }else{
//                try {
//                    dao.update(nv);
//                    this.fillTable();   
//                    MsgBox.alert(this,"Cập Nhật Thành Công");
//                } catch (Exception e) {
//                    MsgBox.alert(this,"Cập Nhật Thất Bại");  
//                }
//            }
//        }
//        
//         public void delete(){
//             if(!Auth.isManager()){
//                 MsgBox.alert(this, "Bạn Không Có Quyền Xóa Nhân Viên");
//             }else{
//                 String manv = txtMaNV.getText();
//                 if(manv.equals(Auth.user.getMaNV())){
//                     MsgBox.alert(this, "Không Được Xóa Chính Bạn!");
//                 }else if(MsgBox.confirm(this, "Bạn Thực Sự Muốn Xóa Nhân Viên Này?")){
//                     try {
//                         dao.delete(manv);
//                         this.fillTable();
//                         this.clearForm();
//                         MsgBox.alert(this, "Xóa Thành Công!");
//                     } catch (Exception e) {
//                         MsgBox.alert(this, "Xóa Thất Bại!");
//                     }
//                 }
//             }
//            
//        }
//         
//        public void first(){
//            this.row = 0;
//            this.edit();
//        }
//        
//        public void next(){
//            if(this.row < tblNhanVien.getRowCount()-1){
//                this.row++;
//                this.edit();
//            }
//        }
//        
//        public void prev(){
//            if(this.row>0){
//                this.row--;
//                this.edit();
//            }
//        }
//       
//        public void last(){
//            this.row =tblNhanVien.getRowCount() -1;
//            this.edit();
//        }
//        
//        public void updateStatus(){
//            boolean edit = (this.row>= 0);
//            boolean first = (this.row == 0);
//            boolean last = ( this.row == tblNhanVien.getRowCount() -1 );
//            //trạng thái form
//            txtMaNV.setEditable(!edit);
//            btnInsert.setEnabled(!edit);
//            btnUpdate.setEnabled(edit);
//            btnDelete.setEnabled(edit);
//            
//            //trạng thái điều hướng
//            
//            btnFirst.setEnabled(edit && !first);
//            btnPrev.setEnabled(edit && !first);
//            btnNext.setEnabled(edit && !last);
//            btnLast.setEnabled(edit && !last);
//        }
//         
//        
           

   

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
//                 if(evt.getClickCount() == 2){
//                     this.row = tblNhanVien.getSelectedRow();
//                     this.edit();
//                 }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
//        if(txtMaNV.getText().equals("")){
//            MsgBox.alert(this, "Vui Lòng Nhập Mã Nhân Viên");
//            txtMaNV.requestFocus();
//        }else if(txtMatKhau.getText().equals("")){
//             MsgBox.alert(this, "Vui Lòng Nhập Mật Khẩu");
//             txtMatKhau.requestFocus();
//        }else if(txtXacNhanMK.getText().equals("")){
//             MsgBox.alert(this, "Vui Lòng Nhập Xác Nhận Mật Khẩu");
//             txtXacNhanMK.requestFocus();
//        }else if(txtHoTen.getText().equals("")){
//             MsgBox.alert(this, "Vui Lòng Nhập Họ Và Tên");
//             txtHoTen.requestFocus();
//        }else if(rdoTruongPhong.isSelected()==false && rdoNhanVien.isSelected()==false){
//             MsgBox.alert(this, "Vui Lòng Chọn Vai Trò");
//        }else{
//            this.insert();
//        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        this.update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        this.delete();
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
//           this.clearForm();
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JPasswordField txtGiaPhong;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables

    

    
}
