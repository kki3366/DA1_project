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
public class DatPhongJInternalFrame extends javax.swing.JInternalFrame {
//     nhanVienDAO dao = new nhanVienDAO();
     int row = 0;

    public DatPhongJInternalFrame() {
        initComponents();
//        init();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        jLabel1.setText("QUẢN LÝ ĐẶT PHÒNG");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel2.setText("Họ Tên Khách Hàng");

        jTextField1.setText("jTextField1");

        jLabel3.setText("SDT KHách Hàng");

        jTextField2.setText("jTextField2");

        jLabel4.setText("Nhân Viên");

        jTextField3.setText("jTextField3");

        jButton1.setText("Thêm KH");

        jButton2.setText("Sửa KH");

        jButton3.setText("Xóa KH");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Khách Hàng");

        jLabel6.setText("Phòng Còn Trống");

        jButton4.setText("Đặt Phòng");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jButton4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    

    
}
