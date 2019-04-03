/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class Illustration extends javax.swing.JFrame {

    Maxheap maxheap;
    private Timer timer;
    
    public Illustration(Maxheap heap) {
        this.setVisible(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);  
        importHeap(heap);
    }
    
    public void displayHeapContent(List<Integer> integers)
    {
        for(int i =0; i<31; i++)
        {
            jLabel4.setText(jLabel4.getText()+ Integer.toString(integers.get(i))+ " ");
        }
    }
    
    public void displayHeapContent(int[] integers)
    {
        jLabel4.setText("Array Content: ");
        for(int i =0; i<31; i++)
        {
            jLabel4.setText(jLabel4.getText()+ Integer.toString(integers[i])+ " ");
        }
    }
    
    public void colorSwap(int pos1, int pos2, List<JLabel> LabelList)
    {
        LabelList.get(pos1).setForeground(Color.red);
        LabelList.get(pos2).setForeground(Color.red);
    }
       
    private void importHeap(Maxheap heap)
    {
        maxheap = heap;
    }
    public List<JLabel> sendLabels()
    {
        List<JLabel> LabelList = new ArrayList<JLabel>();
        LabelList.add(jLabel6);
        LabelList.add(jLabel7);
        LabelList.add(jLabel8);
        LabelList.add(jLabel9);
        LabelList.add(jLabel10);
        LabelList.add(jLabel11);
        LabelList.add(jLabel12);
        LabelList.add(jLabel13);
        LabelList.add(jLabel14);
        LabelList.add(jLabel15);
        LabelList.add(jLabel16);
        LabelList.add(jLabel17);
        LabelList.add(jLabel18);
        LabelList.add(jLabel19);
        LabelList.add(jLabel20);
        LabelList.add(jLabel21);
        LabelList.add(jLabel22);
        LabelList.add(jLabel23);
        LabelList.add(jLabel24);
        LabelList.add(jLabel25);
        LabelList.add(jLabel26);
        LabelList.add(jLabel27);
        LabelList.add(jLabel28);
        LabelList.add(jLabel29);
        LabelList.add(jLabel30);
        LabelList.add(jLabel31);
        LabelList.add(jLabel32);
        LabelList.add(jLabel33);
        LabelList.add(jLabel34);
        LabelList.add(jLabel35);
        LabelList.add(jLabel36);
        
        return(LabelList);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 800));
        setMinimumSize(new java.awt.Dimension(1400, 750));
        setPreferredSize(new java.awt.Dimension(1130, 800));
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("    ");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 630, 50, 40));

        jLabel35.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("    ");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, 50, 40));

        jLabel34.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("    ");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 50, 40));

        jLabel33.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("    ");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 50, 40));

        jLabel32.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("    ");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, 50, 40));

        jLabel31.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("    ");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 50, 40));

        jLabel30.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("    ");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 50, 40));

        jLabel29.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("    ");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 50, 40));

        jLabel28.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("    ");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 50, 40));

        jLabel27.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("    ");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 50, 40));

        jLabel26.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("    ");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 50, 40));

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("    ");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 50, 40));

        jLabel24.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("    ");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 50, 40));

        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("    ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 50, 40));

        jLabel22.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("    ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 50, 40));

        jLabel21.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("    ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 50, 40));

        jLabel20.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("    ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 540, 50, 40));

        jLabel19.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("    ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 50, 40));

        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("    ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 50, 40));

        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("    ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 50, 40));

        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("    ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 50, 40));

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("    ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 50, 40));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("    ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 50, 40));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("    ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 50, 40));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("    ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, 50, 40));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("    ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 40, 40));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("    ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 40, 40));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("    ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 40, 40));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("    ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 40, 40));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("    ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 50, 40));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("    ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 268, 50, 40));

        jLabel1.setFont(new java.awt.Font("Gotham Medium", 1, 18)); // NOI18N
        jLabel1.setText("5-level Max Heap");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 47));

        jLabel2.setFont(new java.awt.Font("Gotham Book", 0, 14)); // NOI18N
        jLabel2.setText("Sorting Techniques Graphical Illustration");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 51));
        jButton1.setText("Generate Array");
        jButton1.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 320, 130, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Restore Array");
        jButton2.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 360, 130, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Max Heapify");
        jButton3.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 400, 130, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Merge Sort");
        jButton4.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 440, 130, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Heap Sort");
        jButton5.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 480, 130, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Bubble Sort");
        jButton6.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 520, 130, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Quick Sort");
        jButton7.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 130, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Insertion Sort");
        jButton8.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 640, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heap/Heap no back.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(1130, 660));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 169, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel4.setText("Array Contents: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 1030, 20));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Selection Sort");
        jButton9.setPreferredSize(new java.awt.Dimension(140, 35));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 600, 130, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Change Log:");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 120, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, 260, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel4.setText("Array Contents: ");
        maxheap.initialiseArray();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel4.setText("Array Contents: ");
        maxheap.restoreArray();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            maxheap.heapify();
        } catch (InterruptedException ex) {
            Logger.getLogger(Illustration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            maxheap.Heapsort();
        } catch (InterruptedException ex) {
            Logger.getLogger(Illustration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        maxheap.Mergesortcast();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void writeLog(String text)
    {
        jTextArea1.append(text + "\n");
    }
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            maxheap.Insertionsort();
        } catch (InterruptedException ex) {
            Logger.getLogger(Illustration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            maxheap.Selectionsort();
        } catch (InterruptedException ex) {
            Logger.getLogger(Illustration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            maxheap.bubbleSort();
        } catch (InterruptedException ex) {
            Logger.getLogger(Illustration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            maxheap.Quicksortcast();
        } catch (InterruptedException ex) {
            Logger.getLogger(Illustration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
