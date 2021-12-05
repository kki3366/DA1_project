package UI;

import DAO.KhachHangDAO;
import DAO.PhongDAO;
import Entity.KhachHang;
import Entity.Phong;
import Ultils.Auth;
import Ultils.MsgBox;
import Ultils.XDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class DatPhongJInternalFrame extends javax.swing.JInternalFrame {

    int row = 0;
    String idPhong = null;

    public DatPhongJInternalFrame() {
        initComponents();
        fillTable();
        fillComboBoxPhong();
        Date now = new Date();
        txtThoiGianBatDau.setText(XDate.toString(now, "dd-MMM-yyyy hh:mm:ss"));
        txtNhanVien.setText(Auth.user.getIdNhanVien());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboPhongTrong = new javax.swing.JComboBox<>();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtThoiGianBatDau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNhanVien = new javax.swing.JTextField();
        btnDatPhong = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

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

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID KHÁCH HÀNG", "HỌ TÊN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane2.setViewportView(tblKhachHang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel5.setText("Mã Khách Hàng");

        jLabel6.setText("Phòng Còn Trống");

        cboPhongTrong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPhongTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongTrongActionPerformed(evt);
            }
        });

        txtMaKhachHang.setEditable(false);

        jLabel2.setText("Tên Khách Hàng");

        txtTenKhachHang.setEditable(false);

        jLabel3.setText("Thời Gian Bắt Đầu");

        txtThoiGianBatDau.setEditable(false);

        jLabel4.setText("Nhân Viên");

        txtNhanVien.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(cboPhongTrong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                    .addComponent(jLabel3)
                    .addComponent(txtThoiGianBatDau)
                    .addComponent(jLabel4)
                    .addComponent(txtNhanVien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPhongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDatPhong.setText("Đặt Phòng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDatPhong)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatPhong)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    KhachHangDAO khdao = new KhachHangDAO();
    PhongDAO phongdao = new PhongDAO();

    void fillComboBoxPhong() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPhongTrong.getModel();
        model.removeAllElements();
        List<Phong> list = phongdao.selectAll_isActive();
        for (Phong phong : list) {
            model.addElement(phong.getTenPhong());
        }

    }

    //Tạo hàm fill table để đưa dữ liệu vào bên trong bảng
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel(); //tạo 1 model cho bảng nhân viên
        model.setRowCount(0); // xóa tất cả các hàng trên bảng nhân viên
        try {
            List<KhachHang> list = khdao.selectAll();//đọc cơ sở dữ liệu từ CSDL
            for (KhachHang kh : list) {
                Object[] row = {kh.getIdKhachHang(), kh.getHoTen()};
                model.addRow(row); //thêm 1 hàng vào bảng nhân viên
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }
    }
    
    void ChooseNameRoom(){
         String TenPhong = cboPhongTrong.getItemAt(cboPhongTrong.getSelectedIndex());
        if (TenPhong == null) {

        } else {
            PhongDAO dao = new PhongDAO();
            Phong p = dao.selectBynameRoom(TenPhong.trim());
            idPhong = p.getIDPhong();
            System.out.println(idPhong);
        }
        System.out.println(TenPhong);
    }

    //Tạo hàm setForm
    public void setForm(KhachHang kh) {
        txtMaKhachHang.setText(kh.getIdKhachHang());
        txtTenKhachHang.setText(kh.getHoTen());
    }
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

    public void edit() {
        String maKH = (String) tblKhachHang.getValueAt(this.row, 0);
        KhachHang nv = khdao.selectById(maKH);
        this.setForm(nv);
        this.updateStatus();
    }
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

    public void updateStatus() {
        boolean edit = (this.row >= 0);
        //trạng thái form
        btnDatPhong.setEnabled(edit);
    }
//         
//        

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblKhachHang.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void cboPhongTrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongTrongActionPerformed
       ChooseNameRoom();
    }//GEN-LAST:event_cboPhongTrongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatPhong;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboPhongTrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtNhanVien;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtThoiGianBatDau;
    // End of variables declaration//GEN-END:variables

}
