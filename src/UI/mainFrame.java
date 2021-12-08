package UI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DAO.NhanVienDAO;
import Entity.NhanVien;
import Ultils.Auth;
import Ultils.MsgBox;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

public class mainFrame extends javax.swing.JFrame {

    public mainFrame() {
        initComponents();
        init();
        
       
    }

    void init() {
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(sdf.format(new Date()));
            }
        }).start();
        new ChaoJDialog(this, true).setVisible(true);
          
       
    }

    public void OpenFrameAnother(JInternalFrame x) {
        for (JInternalFrame frmChild : mainFrame.getAllFrames()) {
            frmChild.dispose();
        }

        x.setLocation(this.getWidth() / 2 - x.getWidth() / 2,
                (this.getHeight() - 20) / 2 - x.getHeight() / 2 - 60);
        mainFrame.add(x);
        x.setVisible(true);
    }

    // Open Form 
    void openLogin() {
        new dangNhapJDialog(this, true).setVisible(true);
    }

    void OpenchangePassWord() {
        if (Auth.isLogin()) {
            new doiMatKhauJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }

    }
//

    void LogOut() {

      if(Auth.isLogin()){
            if (MsgBox.confirm(this, "Bạn Muốn Đăng Xuất ?")) {
            Auth auth = new Auth();
            auth.clear();
            MsgBox.alert(this, "Bạn Đăng Xuất Thành Công");
        }
      }else{
          MsgBox.alert(this, "Bạn chưa đăng nhập");
      }
    }
//

    void OpenDatPhong() {
        if (Auth.isLogin()) {
            DatPhongJInternalFrame datphong = new DatPhongJInternalFrame();
            OpenFrameAnother(datphong);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }

    }
//

    void OpenSanPham() {

        if (Auth.isLogin()) {
//            SanPhamJInternalFrame sp = new SanPhamJInternalFrame();
//            OpenFrameAnother(sp);
            new SanPhamJrame().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }

    }

    void OpenPhong() {
        if (Auth.isLogin()) {
            PhongJInternalFrame phong = new PhongJInternalFrame();
            OpenFrameAnother(phong);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }
//        

    }

    void OpenNhanVien() {
        if (Auth.isLogin()) {
            nhanVienJInternalFrame nhanvien = new nhanVienJInternalFrame();
            OpenFrameAnother(nhanvien);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }
    }
    
    void OpenQuenMatKhau(){
        new quenMatKhauJDialog(this, true).setVisible(true);
    }
    
    void OpenKhachHang(){
        if (Auth.isLogin()) {
            khachHangJInternalFrame khachHang = new khachHangJInternalFrame();
            OpenFrameAnother(khachHang);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }
    }
    
    void OpenTraPhong(){
         if (Auth.isLogin()) {
             TraPhongJInternalFrame traphong = new TraPhongJInternalFrame();
            OpenFrameAnother(traphong);
        } else {
            MsgBox.alert(this, "Vui Lòng Đăng Nhập");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        mainFrame = new javax.swing.JDesktopPane(){
            //    protected void  paintComponent (Graphics g){
                //        Image img = new ImageIcon(this.getClass().getResource("/icon/logo.png")).getImage();
                //        try {
                    //            Graphics g2d = (Graphics2D)g;
                    //            double x= img.getWidth(null);
                    //            double y= img.getHeight(null);
                    //            //g2d.scale(getWidth()/x,getHeight()/y);
                    //            //g2d.drawImage(img, 0, 0, this);
                    //            g2d.drawImage(img, this.getWidth()/4+100,this.getHeight()/4-100,this);
                    //        } catch (Exception e) {
                    //            System.out.println("Gap loi");
                    //        }
                //    }
        };
        txtname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniQuenMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        menuSanPham = new javax.swing.JMenu();
        mniPhong = new javax.swing.JMenuItem();
        mniDatPhong = new javax.swing.JMenuItem();
        mniTraPhong = new javax.swing.JMenuItem();
        mniSanPham = new javax.swing.JMenuItem();
        mniQuanLyNhanVien = new javax.swing.JMenuItem();
        mniQuanLyKhachHang = new javax.swing.JMenuItem();
        menuThongKe = new javax.swing.JMenu();
        mniLuongNguoiHoc = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();

        jMenuItem15.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jMenuItem15.setText("CHÚC BẠN HỌC TẬP TỐT");
        jMenuItem15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        popupMenu.add(jMenuItem15);

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator7);

        btnChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Người học");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMargin(new java.awt.Insets(12, 30, 12, 30));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator6);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Hướng dẫn");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(12, 30, 12, 30));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG KARAOKE");

        mainFrame.setBackground(new java.awt.Color(157, 189, 228));
        mainFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainFrameMouseReleased(evt);
            }
        });

        mainFrame.setLayer(txtname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(txtname)
                .addContainerGap(586, Short.MAX_VALUE))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(txtname)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        getContentPane().add(mainFrame, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Hệ quản lý quán FKaraoke");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        lblDongHo.setForeground(new java.awt.Color(0, 51, 255));
        lblDongHo.setText("10:55 PM");
        jPanel1.add(lblDongHo, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        mnuHeThong.setText("Hệ thống");
        mnuHeThong.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mnuHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHeThongActionPerformed(evt);
            }
        });

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_login_32px.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_logout_rounded_left_32px.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator1);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_password_reset_32px.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);

        mniQuenMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_forgot_password_32px.png"))); // NOI18N
        mniQuenMatKhau.setText("Quên mật khẩu");
        mniQuenMatKhau.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniQuenMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuenMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniQuenMatKhau);
        mnuHeThong.add(jSeparator2);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_enter_32px_1.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        menuBar.add(mnuHeThong);

        menuSanPham.setText("Quản lý");
        menuSanPham.setMargin(new java.awt.Insets(5, 5, 5, 5));
        menuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSanPhamActionPerformed(evt);
            }
        });

        mniPhong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_warehouse_32px_1.png"))); // NOI18N
        mniPhong.setText("Phòng ");
        mniPhong.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPhongActionPerformed(evt);
            }
        });
        menuSanPham.add(mniPhong);

        mniDatPhong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_furniture_32px.png"))); // NOI18N
        mniDatPhong.setText("Đặt Phòng");
        mniDatPhong.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongActionPerformed(evt);
            }
        });
        menuSanPham.add(mniDatPhong);

        mniTraPhong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniTraPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_room_32px.png"))); // NOI18N
        mniTraPhong.setText("Trả Phòng");
        mniTraPhong.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniTraPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTraPhongActionPerformed(evt);
            }
        });
        menuSanPham.add(mniTraPhong);

        mniSanPham.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_similar_items_32px.png"))); // NOI18N
        mniSanPham.setText("Sản Phẩm");
        mniSanPham.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        menuSanPham.add(mniSanPham);

        mniQuanLyNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_employee_32px.png"))); // NOI18N
        mniQuanLyNhanVien.setText("Quản lý nhân viên");
        mniQuanLyNhanVien.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuanLyNhanVienActionPerformed(evt);
            }
        });
        menuSanPham.add(mniQuanLyNhanVien);

        mniQuanLyKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniQuanLyKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_customer_32px.png"))); // NOI18N
        mniQuanLyKhachHang.setText("Quản lý khách hàng");
        mniQuanLyKhachHang.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniQuanLyKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQuanLyKhachHangActionPerformed(evt);
            }
        });
        menuSanPham.add(mniQuanLyKhachHang);

        menuBar.add(menuSanPham);

        menuThongKe.setText("Thống kê");
        menuThongKe.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_graph_report_script_32px.png"))); // NOI18N
        mniLuongNguoiHoc.setText("Thống Kê");
        mniLuongNguoiHoc.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNguoiHocActionPerformed(evt);
            }
        });
        menuThongKe.add(mniLuongNguoiHoc);
        menuThongKe.add(jSeparator3);
        menuThongKe.add(jSeparator4);

        menuBar.add(menuThongKe);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongActionPerformed
        OpenDatPhong();
    }//GEN-LAST:event_mniDatPhongActionPerformed


    private void mniPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPhongActionPerformed
        OpenPhong();
    }//GEN-LAST:event_mniPhongActionPerformed

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        openLogin();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed
//        OpenSanPham();
    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyNhanVienActionPerformed
        OpenNhanVien();
    }//GEN-LAST:event_mniQuanLyNhanVienActionPerformed

    private void mniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNguoiHocActionPerformed

    }//GEN-LAST:event_mniLuongNguoiHocActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        OpenchangePassWord();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mainFrameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainFrameMouseReleased

    }//GEN-LAST:event_mainFrameMouseReleased

    private void menuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSanPhamActionPerformed
        OpenSanPham();
    }//GEN-LAST:event_menuSanPhamActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed

    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed

    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed

    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        LogOut();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniQuenMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuenMatKhauActionPerformed
        OpenQuenMatKhau();
    }//GEN-LAST:event_mniQuenMatKhauActionPerformed

    private void mnuHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHeThongActionPerformed

    }//GEN-LAST:event_mnuHeThongActionPerformed

    private void mniQuanLyKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyKhachHangActionPerformed
        OpenKhachHang();
    }//GEN-LAST:event_mniQuanLyKhachHangActionPerformed

    private void mniTraPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTraPhongActionPerformed
        OpenTraPhong();
    }//GEN-LAST:event_mniTraPhongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JDesktopPane mainFrame;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSanPham;
    private javax.swing.JMenu menuThongKe;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDatPhong;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniLuongNguoiHoc;
    private javax.swing.JMenuItem mniPhong;
    private javax.swing.JMenuItem mniQuanLyKhachHang;
    private javax.swing.JMenuItem mniQuanLyNhanVien;
    private javax.swing.JMenuItem mniQuenMatKhau;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenuItem mniTraPhong;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JLabel txtname;
    // End of variables declaration//GEN-END:variables
}
