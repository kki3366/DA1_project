package UI;


import DAO.DonViTinhDAO;
import DAO.NhanVienDAO;
import DAO.SanPhamDAO;
import Entity.DonViTinh;
import Entity.NhanVien;
import Entity.SanPham;
import Ultils.Auth;
import Ultils.MsgBox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sieu Nhan Bay
 */
public class SanPhamJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form khoaHocJInternalFrame
     */
    public SanPhamJInternalFrame() {
        initComponents();
      

    }
   NhanVienDAO NhanVienDAO = new NhanVienDAO();
  static SanPhamDAO SanPhamDAO = new SanPhamDAO();
   DonViTinhDAO DonViTinh = new DonViTinhDAO();
    @SuppressWarnings("unchecked")
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlFormNguoiHoc = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        txtSOLuong = new javax.swing.JTextField();
        txtGiaSP = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnLamMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtMaNGTao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDVT = new javax.swing.JTextField();
        pnlCongCuBangNguoiHoc = new javax.swing.JPanel();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtTimKiemNH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ SẢN PHẨM");
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

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÝ SẢN PHẨM");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Sản Phẩm");

        pnlFormNguoiHoc.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormNguoiHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Số Lượng");
        pnlFormNguoiHoc.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Mã Sản Phẩm");
        pnlFormNguoiHoc.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Ghi chú");
        pnlFormNguoiHoc.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Người Tạo");
        pnlFormNguoiHoc.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Giá Sản Phẩm");
        pnlFormNguoiHoc.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Tên Sản Phẩm");
        pnlFormNguoiHoc.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtTenSP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTenSP.setForeground(new java.awt.Color(51, 51, 51));
        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });
        pnlFormNguoiHoc.add(txtTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 260, -1));

        txtMaSP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMaSP.setForeground(new java.awt.Color(51, 51, 51));
        pnlFormNguoiHoc.add(txtMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 90, -1));

        txtSOLuong.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtSOLuong.setForeground(new java.awt.Color(51, 51, 51));
        pnlFormNguoiHoc.add(txtSOLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 260, -1));

        txtGiaSP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtGiaSP.setForeground(new java.awt.Color(51, 51, 51));
        pnlFormNguoiHoc.add(txtGiaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 260, -1));

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtGhiChu.setForeground(new java.awt.Color(51, 51, 51));
        txtGhiChu.setRows(5);
        jScrollPane5.setViewportView(txtGhiChu);

        pnlFormNguoiHoc.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 171, 810, 110));

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(102, 102, 102));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        pnlFormNguoiHoc.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(102, 102, 102));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlFormNguoiHoc.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        btnCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        pnlFormNguoiHoc.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(102, 102, 102));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlFormNguoiHoc.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        txtMaNGTao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMaNGTao.setForeground(new java.awt.Color(51, 51, 51));
        pnlFormNguoiHoc.add(txtMaNGTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 260, -1));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Đn Vị");
        pnlFormNguoiHoc.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        txtDVT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtDVT.setForeground(new java.awt.Color(51, 51, 51));
        txtDVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVTActionPerformed(evt);
            }
        });
        pnlFormNguoiHoc.add(txtDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 260, -1));

        pnlCongCuBangNguoiHoc.setBackground(new java.awt.Color(255, 255, 255));
        pnlCongCuBangNguoiHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLast.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(102, 102, 102));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlCongCuBangNguoiHoc.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 40, 20));

        btnFirst.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(102, 102, 102));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlCongCuBangNguoiHoc.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 40, 20));

        btnPrev.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(102, 102, 102));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlCongCuBangNguoiHoc.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 40, 20));

        btnNext.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(102, 102, 102));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlCongCuBangNguoiHoc.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 40, 20));

        txtTimKiemNH.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTimKiemNH.setForeground(new java.awt.Color(153, 153, 153));
        txtTimKiemNH.setText("Tìm kiếm Sản Phẩm");
        txtTimKiemNH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemNHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemNHFocusLost(evt);
            }
        });
        txtTimKiemNH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemNHKeyReleased(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblNguoiHoc.setAutoCreateRowSorter(true);
        tblNguoiHoc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNguoiHoc.setGridColor(new java.awt.Color(255, 255, 255));
        tblNguoiHoc.setRowHeight(30);
        tblNguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNguoiHocMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblNguoiHoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFormNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(540, 540, 540)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(940, 940, 940)
                            .addComponent(txtTimKiemNH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlCongCuBangNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(pnlFormNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(11, 11, 11)
                    .addComponent(txtTimKiemNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(pnlCongCuBangNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 350, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


   
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        isUpdate = false;
       // if (checkForm()) {
            insert();
        //}
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        isUpdate = true;
        //if (checkForm()) {
            Update();
       // }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtTimKiemNHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemNHFocusGained
        // TODO add your handling code here:
        focusGained();
    }//GEN-LAST:event_txtTimKiemNHFocusGained

    private void txtTimKiemNHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemNHFocusLost
        // TODO add your handling code here:
        focusLost();
    }//GEN-LAST:event_txtTimKiemNHFocusLost

    private void txtTimKiemNHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemNHKeyReleased
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_txtTimKiemNHKeyReleased

    private void tblNguoiHocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiHocMousePressed
        // TODO add your handling code here:
        row = tblNguoiHoc.getSelectedRow();
        edit();
    }//GEN-LAST:event_tblNguoiHocMousePressed

    private void txtDVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDVTActionPerformed

 static DefaultTableModel model;
    
    boolean isUpdate = false;
     
    int row;
//
//    public void generateDatePicker() {
//        datePickerModel = new UtilDateModel();
//        datePicker = new JDatePicker(datePickerModel);
//        txtNgaySinh.setLayout(new BorderLayout());
//        txtNgaySinh.add(datePicker, BorderLayout.CENTER);
//        datePicker.setCursor(Cursor.getDefaultCursor());
////        String date = sdf.format(new Date());
////        int year = Integer.parseInt(date.substring(0, 4));
////        int month = Integer.parseInt(date.substring(5, 7));
////        int day = Integer.parseInt(date.substring(8, 10));
////        datePickerModel.setDate(year, month, day);
//        datePickerModel.setValue(new java.util.Date());
//    }

    public void setModelTable() {
        model = new DefaultTableModel(new Object[][]{}, new Object[]{"Mã NH", "Họ và tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email", "Ghi chú"});
        tblNguoiHoc.setModel(model);
        JTableHeader header = tblNguoiHoc.getTableHeader();
        header.setFont(new Font("SansSerif", 1, 18));
        header.setForeground(new Color(102, 102, 102));
    }

//    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
//            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

//    public static boolean validate(String emailStr) {
//        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
//        return matcher.find();
//    }

    public void init() {
        setModelTable();
        fillTable();
        row = -1;
        updateStatus();
        txtDVT.setEditable(false);
        txtMaNGTao.setEditable(false);
    }

    public void focusGained() {
        if (txtTimKiemNH.getText().equals("Tìm kiếm người học")) {
            txtTimKiemNH.setText("");
        }
        txtTimKiemNH.setForeground(Color.black);
    }

    public void focusLost() {
        if (txtTimKiemNH.getText().equals("")) {
            txtTimKiemNH.setText("Tìm kiếm người học");
            txtTimKiemNH.setForeground(new Color(102, 102, 102));
        }

    }

    public void insert() {
        SanPham nh = getForm();
        try {
            SanPhamDAO.insert(nh);
            fillTable();
            clearForm();
            JOptionPane.showMessageDialog(this, "thêm thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "thêm thất bại ");
        }
    }

    public void Update() {
        SanPham nh = getForm();
        if (MsgBox.confirm(this, "Bạn có chắc muốn cập nhật không?")) {
            try {
                SanPhamDAO.update(nh);
                fillTable();
                clearForm();
                //JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại ");
            }
        }

    }

    public void delete() {
        SanPham nh = getForm();
        if (!Auth.isManager()) {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền xóa học viên ");
        } else {

            int chon = JOptionPane.showConfirmDialog(this, "Are you sure delete ? ", "DELETE ", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION) {
                try {
                    SanPhamDAO.delete(nh.getTenSP());
                    fillTable();
                    clearForm();
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công ");
                }
            }
        }
    }

    public void first() {
        row = 0;
        tblNguoiHoc.setRowSelectionInterval(row, row);
        edit();
    }

    public void next() {
        if (row < tblNguoiHoc.getRowCount() - 1) {
            row++;
            tblNguoiHoc.setRowSelectionInterval(row, row);
            edit();
        }
    }

    public void prev() {
        if (row > 0) {
            row--;
            tblNguoiHoc.setRowSelectionInterval(row, row);
            edit();
        }
    }

    public void last() {
        row = tblNguoiHoc.getRowCount() - 1;
        tblNguoiHoc.setRowSelectionInterval(row, row);
        edit();
    }

    public void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblNguoiHoc.getRowCount() - 1);
        //trạng thái form
        txtDVT.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnCapNhat.setEnabled(edit);
        btnXoa.setEnabled(edit);
        //trang thai dieu hương
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);

        txtMaNGTao.setText(Auth.user.getIdNhanVien());
       
        
    }

    public SanPham setForm(SanPham nh) {

        txtTenSP.setText(nh.getTenSP());
        //txtNgaySinh.setText(String.valueOf(nh.getNgaySinh()));
       
       
        txtGiaSP.setText(String.valueOf(nh.getGiaSP()));
        txtMaNGTao.setText(nh.getNgTao());
        txtSOLuong.setText(String.valueOf(nh.getSoLuong()));
        txtGhiChu.setText(nh.getMoTa());
        return nh;
    }

    public SanPham getForm() {
        SanPham nh = new SanPham();
        nh.setTenSP(txtTenSP.getText());
        nh.setGiaSP(Double.valueOf(txtTenSP.getText()) );             
        nh.setNgTao(Auth.user.getIdNhanVien());
        nh.setSoLuong(Double.valueOf(txtSOLuong.getText()));
        nh.setMoTa(txtGhiChu.getText());
       
        return nh;
    }

    public void clearForm() {
        SanPham nh = new SanPham();
        setForm(nh);
        txtTenSP.setText("");
        row = -1;
        updateStatus();
    }

    public void edit() {
        String SP = String.valueOf(tblNguoiHoc.getValueAt(row, 0));
        SanPham nh = SanPhamDAO.selectById(SP);
        setForm(nh);
        updateStatus();
    }

    static public void fillTable() {
        //DefaultTableModel modelNguoiHoc = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiemNH.getText();
            List<SanPham> list;
            if (keyword.trim().equals("") || keyword.trim().equals("Tìm kiếm người học")) {
                list = SanPhamDAO.selectAll();
            } else {
                list = SanPhamDAO.selectBySql(keyword);
            }
            for (SanPham cd : list) {
                Object[] row = {
                    cd.getMaSP(),
                    cd.getTenSP(),
                    (long) cd.getGiaSP(),
                    cd.getSoLuong(),
                    cd.getMoTa(),
                    cd.getNgTao()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public void timKiemNguoiHoc() {
        fillTable();
        clearForm();
        row = -1;
        updateStatus();
    }

//    public boolean checkForm() {
//
//        if (txtMaSP.getText().equals("") || txtTenSP.getText().equals("") || txtGiaSP.getText().equals("")
//                || txtSOLuong.getText().equals("") || txtMaNGTao.getText().equals("") || txtGhiChu.getText().equals("")
//                ){
//            JOptionPane.showMessageDialog(this, "Hãy nhập đủ dữ liệu sau đó ấn Thêm", "Error", 1);
//            return false;
//        }  
//
//        } else if (!txtTenSP.getText().contains(" ")) {
//            MsgBox.alert(this, "Vui lòng nhập đầy đủ họ tên!");
//            return false;
//        } else if (!(txtMaNguoiHoc.getText()).matches("NH[0-9]{1,9}")) {
//            JOptionPane.showMessageDialog(this, "Sai định dạng mã \n VD : NH01", "Error", 1);
//            txtMaNguoiHoc.requestFocus();
//            return false;
//        } else if (!(txtGiaSP.getText()).matches("0[3789]{1}[\\d]{8}")) {
//            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng - Vui lòng kiểm tra lại", "Error", 1);
//            txtGiaSP.requestFocus();
//            return false;
//        } // ông xem giúp tui cái mẫu của email nha 
//        else if (!validate(txtSOLuong.getText())) {
//            JOptionPane.showMessageDialog(this, "Email không đúng - vui lòng kiểm tra lại ", "Error", 1);
//            txtSOLuong.requestFocus();
//            return false;
//        }
//
//        List<NguoiHoc> list = dao.selectAll();
//        for (int i = 0; i < list.size(); i++) {
//            if (isUpdate) {
//            } else {
//                if (txtMaNguoiHoc.getText().equalsIgnoreCase(list.get(i).getMaNH())) {
//                    JOptionPane.showMessageDialog(this, "Trùng Mã Người Học", "Error", 1);
//                    return false;
//                }
//                if (txtSOLuong.getText().equalsIgnoreCase(list.get(i).getEmail())) {
//                    JOptionPane.showMessageDialog(this, "Trùng Email. Vui lòng nhập lại", "Error", 1);
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCongCuBangNguoiHoc;
    private javax.swing.JPanel pnlFormNguoiHoc;
    private static javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtDVT;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGiaSP;
    private javax.swing.JTextField txtMaNGTao;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSOLuong;
    private javax.swing.JTextField txtTenSP;
    private static javax.swing.JTextField txtTimKiemNH;
    // End of variables declaration//GEN-END:variables
}
