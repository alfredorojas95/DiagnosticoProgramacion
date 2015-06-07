package sudoku;

public class GUISudoku extends javax.swing.JFrame {

    boolean esNumero = false;
    Met_sudoku accion = new Met_sudoku();
//    int[][] sud1 = new int[3][3];
//    int[][] sud2 = new int[3][3];
//    int[][] sud3 = new int[3][3];
//    int[][] sud4 = new int[3][3];
//    int[][] sud5 = new int[3][3];
//    int[][] sud6 = new int[3][3];
//    int[][] sud7 = new int[3][3];
//    int[][] sud8 = new int[3][3];
//    int[][] sud9 = new int[3][3];

    public GUISudoku() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        text8 = new javax.swing.JTextField();
        text9 = new javax.swing.JTextField();
        text10 = new javax.swing.JTextField();
        text11 = new javax.swing.JTextField();
        text12 = new javax.swing.JTextField();
        text13 = new javax.swing.JTextField();
        text14 = new javax.swing.JTextField();
        text15 = new javax.swing.JTextField();
        text16 = new javax.swing.JTextField();
        text17 = new javax.swing.JTextField();
        text18 = new javax.swing.JTextField();
        text19 = new javax.swing.JTextField();
        text20 = new javax.swing.JTextField();
        text21 = new javax.swing.JTextField();
        text22 = new javax.swing.JTextField();
        text23 = new javax.swing.JTextField();
        text24 = new javax.swing.JTextField();
        text25 = new javax.swing.JTextField();
        text26 = new javax.swing.JTextField();
        text27 = new javax.swing.JTextField();
        text28 = new javax.swing.JTextField();
        text29 = new javax.swing.JTextField();
        text30 = new javax.swing.JTextField();
        text31 = new javax.swing.JTextField();
        text32 = new javax.swing.JTextField();
        text33 = new javax.swing.JTextField();
        text34 = new javax.swing.JTextField();
        text35 = new javax.swing.JTextField();
        text36 = new javax.swing.JTextField();
        text37 = new javax.swing.JTextField();
        text38 = new javax.swing.JTextField();
        text39 = new javax.swing.JTextField();
        text40 = new javax.swing.JTextField();
        text41 = new javax.swing.JTextField();
        text42 = new javax.swing.JTextField();
        text43 = new javax.swing.JTextField();
        text44 = new javax.swing.JTextField();
        text45 = new javax.swing.JTextField();
        text46 = new javax.swing.JTextField();
        text47 = new javax.swing.JTextField();
        text48 = new javax.swing.JTextField();
        text49 = new javax.swing.JTextField();
        text50 = new javax.swing.JTextField();
        text51 = new javax.swing.JTextField();
        text52 = new javax.swing.JTextField();
        text53 = new javax.swing.JTextField();
        text54 = new javax.swing.JTextField();
        text55 = new javax.swing.JTextField();
        text56 = new javax.swing.JTextField();
        text57 = new javax.swing.JTextField();
        text58 = new javax.swing.JTextField();
        text59 = new javax.swing.JTextField();
        text60 = new javax.swing.JTextField();
        text61 = new javax.swing.JTextField();
        text62 = new javax.swing.JTextField();
        text63 = new javax.swing.JTextField();
        text64 = new javax.swing.JTextField();
        text65 = new javax.swing.JTextField();
        text66 = new javax.swing.JTextField();
        text67 = new javax.swing.JTextField();
        text68 = new javax.swing.JTextField();
        text69 = new javax.swing.JTextField();
        text70 = new javax.swing.JTextField();
        text71 = new javax.swing.JTextField();
        text72 = new javax.swing.JTextField();
        text73 = new javax.swing.JTextField();
        text74 = new javax.swing.JTextField();
        text75 = new javax.swing.JTextField();
        text76 = new javax.swing.JTextField();
        text77 = new javax.swing.JTextField();
        text78 = new javax.swing.JTextField();
        text79 = new javax.swing.JTextField();
        text80 = new javax.swing.JTextField();
        text81 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel1.setText("Sudoku");

        text1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text1KeyTyped(evt);
            }
        });

        text2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text2KeyTyped(evt);
            }
        });

        text3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text3KeyTyped(evt);
            }
        });

        text4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text4KeyTyped(evt);
            }
        });

        text5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text5KeyTyped(evt);
            }
        });

        text6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text6KeyTyped(evt);
            }
        });

        text7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text7KeyTyped(evt);
            }
        });

        text8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text8KeyTyped(evt);
            }
        });

        text9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text9KeyTyped(evt);
            }
        });

        text10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text10KeyTyped(evt);
            }
        });

        text11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text11KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text11KeyTyped(evt);
            }
        });

        text12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text12KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text12KeyTyped(evt);
            }
        });

        text13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text13KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text13KeyTyped(evt);
            }
        });

        text14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text14KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text14KeyTyped(evt);
            }
        });

        text15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text15KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text15KeyTyped(evt);
            }
        });

        text16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text16KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text16KeyTyped(evt);
            }
        });

        text17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text17KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text17KeyTyped(evt);
            }
        });

        text18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text18KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text18KeyTyped(evt);
            }
        });

        text19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text19KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text19KeyTyped(evt);
            }
        });

        text20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text20KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text20KeyTyped(evt);
            }
        });

        text21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text21KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text21KeyTyped(evt);
            }
        });

        text22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text22KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text22KeyTyped(evt);
            }
        });

        text23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text23KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text23KeyTyped(evt);
            }
        });

        text24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text24KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text24KeyTyped(evt);
            }
        });

        text25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text25KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text25KeyTyped(evt);
            }
        });

        text26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text26KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text26KeyTyped(evt);
            }
        });

        text27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text27KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text27KeyTyped(evt);
            }
        });

        text28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text28KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text28KeyTyped(evt);
            }
        });

        text29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text29KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text29KeyTyped(evt);
            }
        });

        text30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text30KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text30KeyTyped(evt);
            }
        });

        text31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text31KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text31KeyTyped(evt);
            }
        });

        text32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text32KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text32KeyTyped(evt);
            }
        });

        text33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text33KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text33KeyTyped(evt);
            }
        });

        text34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text34KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text34KeyTyped(evt);
            }
        });

        text35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text35KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text35KeyTyped(evt);
            }
        });

        text36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text36KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text36KeyTyped(evt);
            }
        });

        text37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text37KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text37KeyTyped(evt);
            }
        });

        text38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text38KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text38KeyTyped(evt);
            }
        });

        text39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text39KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text39KeyTyped(evt);
            }
        });

        text40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text40KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text40KeyTyped(evt);
            }
        });

        text41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text41KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text41KeyTyped(evt);
            }
        });

        text42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text42KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text42KeyTyped(evt);
            }
        });

        text43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text43KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text43KeyTyped(evt);
            }
        });

        text44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text44KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text44KeyTyped(evt);
            }
        });

        text45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text45KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text45KeyTyped(evt);
            }
        });

        text46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text46KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text46KeyTyped(evt);
            }
        });

        text47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text47KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text47KeyTyped(evt);
            }
        });

        text48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text48KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text48KeyTyped(evt);
            }
        });

        text49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text49KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text49KeyTyped(evt);
            }
        });

        text50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text50KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text50KeyTyped(evt);
            }
        });

        text51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text51KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text51KeyTyped(evt);
            }
        });

        text52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text52KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text52KeyTyped(evt);
            }
        });

        text53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text53KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text53KeyTyped(evt);
            }
        });

        text54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text54KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text54KeyTyped(evt);
            }
        });

        text55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text55KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text55KeyTyped(evt);
            }
        });

        text56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text56KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text56KeyTyped(evt);
            }
        });

        text57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text57KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text57KeyTyped(evt);
            }
        });

        text58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text58KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text58KeyTyped(evt);
            }
        });

        text59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text59KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text59KeyTyped(evt);
            }
        });

        text60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text60KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text60KeyTyped(evt);
            }
        });

        text61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text61KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text61KeyTyped(evt);
            }
        });

        text62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text62KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text62KeyTyped(evt);
            }
        });

        text63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text63KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text63KeyTyped(evt);
            }
        });

        text64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text64KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text64KeyTyped(evt);
            }
        });

        text65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text65KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text65KeyTyped(evt);
            }
        });

        text66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text66KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text66KeyTyped(evt);
            }
        });

        text67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text67.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text67KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text67KeyTyped(evt);
            }
        });

        text68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text68KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text68KeyTyped(evt);
            }
        });

        text69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text69KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text69KeyTyped(evt);
            }
        });

        text70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text70.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text70KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text70KeyTyped(evt);
            }
        });

        text71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text71KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text71KeyTyped(evt);
            }
        });

        text72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text72KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text72KeyTyped(evt);
            }
        });

        text73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text73KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text73KeyTyped(evt);
            }
        });

        text74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text74.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text74KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text74KeyTyped(evt);
            }
        });

        text75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text75KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text75KeyTyped(evt);
            }
        });

        text76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text76KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text76KeyTyped(evt);
            }
        });

        text77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text77KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text77KeyTyped(evt);
            }
        });

        text78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text78KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text78KeyTyped(evt);
            }
        });

        text79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text79.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text79KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text79KeyTyped(evt);
            }
        });

        text80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text80KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text80KeyTyped(evt);
            }
        });

        text81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        text81.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text81KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text81KeyTyped(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(text34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text67, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text68, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text69, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text65, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text70, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text71, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text72, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text76, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text77, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text78, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text73, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text74, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text75, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(text79, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text80, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text81, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text65, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text67, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text68, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text69, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text70, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text71, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text72, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text73, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text74, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text75, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text76, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text77, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text78, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text79, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text80, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text81, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarEntrada(java.awt.event.KeyEvent evt, javax.swing.JTextField c) {
//      restringir que el ingreso de datos sean sólo números entre 1 y 9 
//      y que al textfield no se pueda ingresar mas de un dígito 
        esNumero = false;
        char caracter = evt.getKeyChar();
        if ((caracter < '1' || caracter > '9') || (c.getText().length() == 1)) {
            evt.consume();
            esNumero = true;
        }
    }

    private void capturarEntrada(java.awt.event.KeyEvent evt, javax.swing.JTextField c, int i, int j) {

        boolean estaRepetido = false;
        boolean esCuadrado = false;
        int y = evt.getKeyCode();
        if (y == 8) {//captura la tecla 'retroceso'
            accion.almacenar(i, j, 0);//si se elimina (con retroceso)el valor del texfield se le asigna como nuevo valor el 'cero'
        } else {
            if (esNumero == false) {
                //if (c.getText() != null) {//contenido del textfield debe ser distinto de nulo
                    int valorTextfield = Integer.parseInt(c.getText());
                    estaRepetido = accion.estaRepetido(i, j, valorTextfield);//verificar repetido en filas y columnas
                    esCuadrado = accion.verificarMatrices(i, j, valorTextfield);
                    if ((estaRepetido == false) && (esCuadrado == false)) {//si no está repetido se guarda el valor del textfield en la matriz
                        accion.almacenar(i, j, valorTextfield);//almacenar valores en la matriz
                    } else {// se encuntra repetido
                        c.setText("");//si está repetido lo borra del texfield y no se guarda en la matriz
                    }
                //}

            }
        }

    }

    private void text1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyTyped
        validarEntrada(evt, text1);
    }//GEN-LAST:event_text1KeyTyped

    private void text1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyReleased
        capturarEntrada(evt, text1, 0, 0);
    }//GEN-LAST:event_text1KeyReleased

    private void text2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyReleased
        capturarEntrada(evt, text2, 0, 1);
    }//GEN-LAST:event_text2KeyReleased

    private void text2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyTyped
        validarEntrada(evt, text2);
    }//GEN-LAST:event_text2KeyTyped

    private void text3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyTyped
        validarEntrada(evt, text3);
    }//GEN-LAST:event_text3KeyTyped

    private void text3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyReleased
        capturarEntrada(evt, text3, 0, 2);
    }//GEN-LAST:event_text3KeyReleased

    private void text4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyReleased
        capturarEntrada(evt, text4, 01, 0);
    }//GEN-LAST:event_text4KeyReleased

    private void text4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyTyped
        validarEntrada(evt, text4);
    }//GEN-LAST:event_text4KeyTyped

    private void text5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyTyped
        validarEntrada(evt, text5);
    }//GEN-LAST:event_text5KeyTyped

    private void text5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyReleased
        capturarEntrada(evt, text5, 1, 1);
    }//GEN-LAST:event_text5KeyReleased

    private void text6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text6KeyTyped
        validarEntrada(evt, text6);
    }//GEN-LAST:event_text6KeyTyped

    private void text6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text6KeyReleased
        capturarEntrada(evt, text6, 1, 2);
    }//GEN-LAST:event_text6KeyReleased

    private void text7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text7KeyTyped
        validarEntrada(evt, text7);
    }//GEN-LAST:event_text7KeyTyped

    private void text7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text7KeyReleased
        capturarEntrada(evt, text7, 2, 0);
    }//GEN-LAST:event_text7KeyReleased

    private void text8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text8KeyReleased
        capturarEntrada(evt, text8, 2, 1);
    }//GEN-LAST:event_text8KeyReleased

    private void text8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text8KeyTyped
        validarEntrada(evt, text8);
    }//GEN-LAST:event_text8KeyTyped

    private void text9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text9KeyTyped
        validarEntrada(evt, text9);
    }//GEN-LAST:event_text9KeyTyped

    private void text9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text9KeyReleased
        capturarEntrada(evt, text9, 2, 2);
    }//GEN-LAST:event_text9KeyReleased

    private void text10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text10KeyTyped
        validarEntrada(evt, text10);
    }//GEN-LAST:event_text10KeyTyped

    private void text10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text10KeyReleased
        capturarEntrada(evt, text10, 0, 3);
    }//GEN-LAST:event_text10KeyReleased

    private void text11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text11KeyTyped
        validarEntrada(evt, text11);
    }//GEN-LAST:event_text11KeyTyped

    private void text11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text11KeyReleased
        capturarEntrada(evt, text11, 0, 4);
    }//GEN-LAST:event_text11KeyReleased

    private void text12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text12KeyTyped
        validarEntrada(evt, text12);
    }//GEN-LAST:event_text12KeyTyped

    private void text12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text12KeyReleased
        capturarEntrada(evt, text12, 0, 5);
    }//GEN-LAST:event_text12KeyReleased

    private void text13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text13KeyTyped
        validarEntrada(evt, text13);
    }//GEN-LAST:event_text13KeyTyped

    private void text13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text13KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text13, 1, 3);
    }//GEN-LAST:event_text13KeyReleased

    private void text14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text14KeyTyped
        validarEntrada(evt, text14);
    }//GEN-LAST:event_text14KeyTyped

    private void text14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text14KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text14, 1, 4);
    }//GEN-LAST:event_text14KeyReleased

    private void text15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text15KeyTyped
        validarEntrada(evt, text15);
    }//GEN-LAST:event_text15KeyTyped

    private void text15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text15KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text15, 1, 5);
    }//GEN-LAST:event_text15KeyReleased

    private void text16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text16KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text16);
    }//GEN-LAST:event_text16KeyTyped

    private void text16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text16KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text16, 2, 3);
    }//GEN-LAST:event_text16KeyReleased

    private void text17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text17KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text17);
    }//GEN-LAST:event_text17KeyTyped

    private void text17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text17KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text17, 2, 4);
    }//GEN-LAST:event_text17KeyReleased

    private void text18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text18KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text18);
    }//GEN-LAST:event_text18KeyTyped

    private void text18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text18KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text18, 2, 5);
    }//GEN-LAST:event_text18KeyReleased

    private void text19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text19KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text19);
    }//GEN-LAST:event_text19KeyTyped

    private void text19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text19KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text19, 0, 6);
    }//GEN-LAST:event_text19KeyReleased

    private void text20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text20KeyTyped
        validarEntrada(evt, text20);
    }//GEN-LAST:event_text20KeyTyped

    private void text20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text20KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text20, 0, 7);
    }//GEN-LAST:event_text20KeyReleased

    private void text21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text21KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text21);
    }//GEN-LAST:event_text21KeyTyped

    private void text21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text21KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text21, 0, 8);
    }//GEN-LAST:event_text21KeyReleased

    private void text22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text22KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text22);
    }//GEN-LAST:event_text22KeyTyped

    private void text22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text22KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text22, 1, 6);
    }//GEN-LAST:event_text22KeyReleased

    private void text23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text23KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text23);
    }//GEN-LAST:event_text23KeyTyped

    private void text23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text23KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text23, 1, 7);
    }//GEN-LAST:event_text23KeyReleased

    private void text24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text24KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text24);
    }//GEN-LAST:event_text24KeyTyped

    private void text24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text24KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text24, 1, 8);
    }//GEN-LAST:event_text24KeyReleased

    private void text25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text25KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text25);
    }//GEN-LAST:event_text25KeyTyped

    private void text25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text25KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text25, 2, 6);
    }//GEN-LAST:event_text25KeyReleased

    private void text26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text26KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text26);
    }//GEN-LAST:event_text26KeyTyped

    private void text26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text26KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text26, 2, 7);
    }//GEN-LAST:event_text26KeyReleased

    private void text27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text27KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text27);
    }//GEN-LAST:event_text27KeyTyped

    private void text27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text27KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text27, 2, 8);
    }//GEN-LAST:event_text27KeyReleased

    private void text28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text28KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text28);
    }//GEN-LAST:event_text28KeyTyped

    private void text28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text28KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text28, 3, 0);
    }//GEN-LAST:event_text28KeyReleased

    private void text29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text29KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text29);
    }//GEN-LAST:event_text29KeyTyped

    private void text29KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text29KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text29, 3, 1);
    }//GEN-LAST:event_text29KeyReleased

    private void text30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text30KeyTyped
        validarEntrada(evt, text30);
    }//GEN-LAST:event_text30KeyTyped

    private void text30KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text30KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text30, 3, 2);
    }//GEN-LAST:event_text30KeyReleased

    private void text31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text31KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text31);
    }//GEN-LAST:event_text31KeyTyped

    private void text31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text31KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text31, 4, 0);
    }//GEN-LAST:event_text31KeyReleased

    private void text32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text32KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text32);
    }//GEN-LAST:event_text32KeyTyped

    private void text32KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text32KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text32, 4, 1);
    }//GEN-LAST:event_text32KeyReleased

    private void text33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text33KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text33);
    }//GEN-LAST:event_text33KeyTyped

    private void text33KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text33KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text33, 4, 2);
    }//GEN-LAST:event_text33KeyReleased

    private void text34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text34KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text34);
    }//GEN-LAST:event_text34KeyTyped

    private void text34KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text34KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text34, 5, 0);
    }//GEN-LAST:event_text34KeyReleased

    private void text35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text35KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text35);
    }//GEN-LAST:event_text35KeyTyped

    private void text35KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text35KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text35, 5, 1);
    }//GEN-LAST:event_text35KeyReleased

    private void text36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text36KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text36);
    }//GEN-LAST:event_text36KeyTyped

    private void text36KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text36KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text36, 5, 2);
    }//GEN-LAST:event_text36KeyReleased

    private void text37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text37KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text37);
    }//GEN-LAST:event_text37KeyTyped

    private void text37KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text37KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text37, 3, 3);
    }//GEN-LAST:event_text37KeyReleased

    private void text38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text38KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text38);
    }//GEN-LAST:event_text38KeyTyped

    private void text38KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text38KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text38, 3, 4);
    }//GEN-LAST:event_text38KeyReleased

    private void text39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text39KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text39);
    }//GEN-LAST:event_text39KeyTyped

    private void text39KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text39KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text39, 3, 5);
    }//GEN-LAST:event_text39KeyReleased

    private void text40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text40KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text40);
    }//GEN-LAST:event_text40KeyTyped

    private void text40KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text40KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text40, 4, 3);
    }//GEN-LAST:event_text40KeyReleased

    private void text41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text41KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text41);
    }//GEN-LAST:event_text41KeyTyped

    private void text41KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text41KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text41, 4, 4);
    }//GEN-LAST:event_text41KeyReleased

    private void text42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text42KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text42);
    }//GEN-LAST:event_text42KeyTyped

    private void text42KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text42KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text42, 4, 5);
    }//GEN-LAST:event_text42KeyReleased

    private void text43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text43KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text43);
    }//GEN-LAST:event_text43KeyTyped

    private void text43KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text43KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text43, 5, 3);
    }//GEN-LAST:event_text43KeyReleased

    private void text44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text44KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text44);
    }//GEN-LAST:event_text44KeyTyped

    private void text44KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text44KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text44, 5, 4);
    }//GEN-LAST:event_text44KeyReleased

    private void text45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text45KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text45);
    }//GEN-LAST:event_text45KeyTyped

    private void text45KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text45KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text45, 5, 5);
    }//GEN-LAST:event_text45KeyReleased

    private void text46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text46KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text46);
    }//GEN-LAST:event_text46KeyTyped

    private void text46KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text46KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text46, 3, 6);
    }//GEN-LAST:event_text46KeyReleased

    private void text47KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text47KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text47);
    }//GEN-LAST:event_text47KeyTyped

    private void text47KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text47KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text47, 3, 7);
    }//GEN-LAST:event_text47KeyReleased

    private void text48KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text48KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text48);
    }//GEN-LAST:event_text48KeyTyped

    private void text48KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text48KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text48, 3, 8);
    }//GEN-LAST:event_text48KeyReleased

    private void text49KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text49KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text49);
    }//GEN-LAST:event_text49KeyTyped

    private void text49KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text49KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text49, 4, 6);
    }//GEN-LAST:event_text49KeyReleased

    private void text50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text50KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text50);
    }//GEN-LAST:event_text50KeyTyped

    private void text50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text50KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text50, 4, 7);
    }//GEN-LAST:event_text50KeyReleased

    private void text51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text51KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text51);
    }//GEN-LAST:event_text51KeyTyped

    private void text51KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text51KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text51, 4, 8);
    }//GEN-LAST:event_text51KeyReleased

    private void text52KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text52KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text52);
    }//GEN-LAST:event_text52KeyTyped

    private void text52KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text52KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text52, 5, 6);
    }//GEN-LAST:event_text52KeyReleased

    private void text53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text53KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text53);
    }//GEN-LAST:event_text53KeyTyped

    private void text53KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text53KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text53, 5, 7);
    }//GEN-LAST:event_text53KeyReleased

    private void text54KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text54KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text54);
    }//GEN-LAST:event_text54KeyTyped

    private void text54KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text54KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text54, 5, 8);
    }//GEN-LAST:event_text54KeyReleased

    private void text55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text55KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text55);
    }//GEN-LAST:event_text55KeyTyped

    private void text55KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text55KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text55, 6, 0);
    }//GEN-LAST:event_text55KeyReleased

    private void text56KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text56KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text56);
    }//GEN-LAST:event_text56KeyTyped

    private void text56KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text56KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text56, 6, 1);
    }//GEN-LAST:event_text56KeyReleased

    private void text57KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text57KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text57);
    }//GEN-LAST:event_text57KeyTyped

    private void text57KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text57KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text57, 6, 2);
    }//GEN-LAST:event_text57KeyReleased

    private void text58KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text58KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text58);
    }//GEN-LAST:event_text58KeyTyped

    private void text58KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text58KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text58, 7, 0);
    }//GEN-LAST:event_text58KeyReleased

    private void text59KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text59KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text59);
    }//GEN-LAST:event_text59KeyTyped

    private void text59KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text59KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text59, 7, 1);
    }//GEN-LAST:event_text59KeyReleased

    private void text60KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text60KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text60);
    }//GEN-LAST:event_text60KeyTyped

    private void text60KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text60KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text60, 7, 2);
    }//GEN-LAST:event_text60KeyReleased

    private void text61KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text61KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text61);
    }//GEN-LAST:event_text61KeyTyped

    private void text61KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text61KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text61, 8, 0);
    }//GEN-LAST:event_text61KeyReleased

    private void text62KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text62KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text62);
    }//GEN-LAST:event_text62KeyTyped

    private void text62KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text62KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text62, 8, 1);
    }//GEN-LAST:event_text62KeyReleased

    private void text63KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text63KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text63);
    }//GEN-LAST:event_text63KeyTyped

    private void text63KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text63KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text63, 8, 2);
    }//GEN-LAST:event_text63KeyReleased

    private void text64KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text64KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text64);
    }//GEN-LAST:event_text64KeyTyped

    private void text64KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text64KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text64, 6, 3);
    }//GEN-LAST:event_text64KeyReleased

    private void text65KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text65KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text65);
    }//GEN-LAST:event_text65KeyTyped

    private void text65KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text65KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text65, 6, 4);
    }//GEN-LAST:event_text65KeyReleased

    private void text66KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text66KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text66);
    }//GEN-LAST:event_text66KeyTyped

    private void text66KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text66KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text66, 6, 5);
    }//GEN-LAST:event_text66KeyReleased

    private void text67KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text67KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text67);
    }//GEN-LAST:event_text67KeyTyped

    private void text67KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text67KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text67, 7, 3);
    }//GEN-LAST:event_text67KeyReleased

    private void text68KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text68KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text68);
    }//GEN-LAST:event_text68KeyTyped

    private void text68KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text68KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text68, 7, 4);
    }//GEN-LAST:event_text68KeyReleased

    private void text69KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text69KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text69);
    }//GEN-LAST:event_text69KeyTyped

    private void text69KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text69KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text69, 7, 5);
    }//GEN-LAST:event_text69KeyReleased

    private void text70KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text70KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text70);
    }//GEN-LAST:event_text70KeyTyped

    private void text70KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text70KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text70, 8, 3);
    }//GEN-LAST:event_text70KeyReleased

    private void text71KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text71KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text71);
    }//GEN-LAST:event_text71KeyTyped

    private void text71KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text71KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text71, 8, 4);
    }//GEN-LAST:event_text71KeyReleased

    private void text72KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text72KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text72);
    }//GEN-LAST:event_text72KeyTyped

    private void text72KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text72KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text72, 8, 5);
    }//GEN-LAST:event_text72KeyReleased

    private void text73KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text73KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text73);
    }//GEN-LAST:event_text73KeyTyped

    private void text73KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text73KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text73, 6, 6);
    }//GEN-LAST:event_text73KeyReleased

    private void text74KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text74KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text74);
    }//GEN-LAST:event_text74KeyTyped

    private void text74KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text74KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text74, 6, 7);
    }//GEN-LAST:event_text74KeyReleased

    private void text75KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text75KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text75);
    }//GEN-LAST:event_text75KeyTyped

    private void text75KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text75KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text75, 6, 8);
    }//GEN-LAST:event_text75KeyReleased

    private void text76KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text76KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text76);
    }//GEN-LAST:event_text76KeyTyped

    private void text76KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text76KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text76, 7, 6);
    }//GEN-LAST:event_text76KeyReleased

    private void text77KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text77KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text77);
    }//GEN-LAST:event_text77KeyTyped

    private void text77KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text77KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text77, 7, 7);
    }//GEN-LAST:event_text77KeyReleased

    private void text78KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text78KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text78);
    }//GEN-LAST:event_text78KeyTyped

    private void text78KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text78KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text78, 7, 8);
    }//GEN-LAST:event_text78KeyReleased

    private void text79KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text79KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text79);
    }//GEN-LAST:event_text79KeyTyped

    private void text79KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text79KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text79, 8, 6);
    }//GEN-LAST:event_text79KeyReleased

    private void text80KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text80KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text80);
    }//GEN-LAST:event_text80KeyTyped

    private void text80KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text80KeyReleased
        // TODO add your handling code here:
        capturarEntrada(evt, text80, 8, 7);
    }//GEN-LAST:event_text80KeyReleased

    private void text81KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text81KeyTyped
        // TODO add your handling code here:
        validarEntrada(evt, text81);
    }//GEN-LAST:event_text81KeyTyped

    private void text81KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text81KeyReleased
        capturarEntrada(evt, text81, 8, 8);
    }//GEN-LAST:event_text81KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Test_Sudoku.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUISudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text10;
    private javax.swing.JTextField text11;
    private javax.swing.JTextField text12;
    private javax.swing.JTextField text13;
    private javax.swing.JTextField text14;
    private javax.swing.JTextField text15;
    private javax.swing.JTextField text16;
    private javax.swing.JTextField text17;
    private javax.swing.JTextField text18;
    private javax.swing.JTextField text19;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text20;
    private javax.swing.JTextField text21;
    private javax.swing.JTextField text22;
    private javax.swing.JTextField text23;
    private javax.swing.JTextField text24;
    private javax.swing.JTextField text25;
    private javax.swing.JTextField text26;
    private javax.swing.JTextField text27;
    private javax.swing.JTextField text28;
    private javax.swing.JTextField text29;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text30;
    private javax.swing.JTextField text31;
    private javax.swing.JTextField text32;
    private javax.swing.JTextField text33;
    private javax.swing.JTextField text34;
    private javax.swing.JTextField text35;
    private javax.swing.JTextField text36;
    private javax.swing.JTextField text37;
    private javax.swing.JTextField text38;
    private javax.swing.JTextField text39;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text40;
    private javax.swing.JTextField text41;
    private javax.swing.JTextField text42;
    private javax.swing.JTextField text43;
    private javax.swing.JTextField text44;
    private javax.swing.JTextField text45;
    private javax.swing.JTextField text46;
    private javax.swing.JTextField text47;
    private javax.swing.JTextField text48;
    private javax.swing.JTextField text49;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text50;
    private javax.swing.JTextField text51;
    private javax.swing.JTextField text52;
    private javax.swing.JTextField text53;
    private javax.swing.JTextField text54;
    private javax.swing.JTextField text55;
    private javax.swing.JTextField text56;
    private javax.swing.JTextField text57;
    private javax.swing.JTextField text58;
    private javax.swing.JTextField text59;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text60;
    private javax.swing.JTextField text61;
    private javax.swing.JTextField text62;
    private javax.swing.JTextField text63;
    private javax.swing.JTextField text64;
    private javax.swing.JTextField text65;
    private javax.swing.JTextField text66;
    private javax.swing.JTextField text67;
    private javax.swing.JTextField text68;
    private javax.swing.JTextField text69;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text70;
    private javax.swing.JTextField text71;
    private javax.swing.JTextField text72;
    private javax.swing.JTextField text73;
    private javax.swing.JTextField text74;
    private javax.swing.JTextField text75;
    private javax.swing.JTextField text76;
    private javax.swing.JTextField text77;
    private javax.swing.JTextField text78;
    private javax.swing.JTextField text79;
    private javax.swing.JTextField text8;
    private javax.swing.JTextField text80;
    private javax.swing.JTextField text81;
    private javax.swing.JTextField text9;
    // End of variables declaration//GEN-END:variables
}
