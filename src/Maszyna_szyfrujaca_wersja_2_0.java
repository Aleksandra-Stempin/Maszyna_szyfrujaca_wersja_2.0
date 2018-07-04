
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksandra Stempin
 */
public class Maszyna_szyfrujaca_wersja_2_0 extends javax.swing.JFrame {

    /**
     * Creates new form maszyna_szyfrująca
     */
    public Maszyna_szyfrujaca_wersja_2_0() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        codeNumberLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        oryginalTextArea = new javax.swing.JTextArea();
        paste = new javax.swing.JButton();
        codeNumberField = new javax.swing.JTextField();
        oryginalTextLabel = new javax.swing.JLabel();
        code = new javax.swing.JButton();
        cleanAll = new javax.swing.JButton();
        codedTextLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        codedTextArea = new javax.swing.JTextArea();
        copy = new javax.swing.JButton();
        colorListLabel = new javax.swing.JLabel();
        colorList = new javax.swing.JComboBox<>();
        deCode = new javax.swing.JButton();
        cleanText = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(title);
        setBounds(new java.awt.Rectangle(200, 70, 300, 400));
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("machine.png"))
        );
        setResizable(false);

        mainPanel.setBackground(panelColorViolet);
        mainPanel.setPreferredSize(new java.awt.Dimension(921, 589));

        codeNumberLabel.setBackground(panelColorViolet);
        codeNumberLabel.setFont(standartFont);
        codeNumberLabel.setForeground(fontColorViolet);
        codeNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codeNumberLabel.setText(CodeNumberLabelString);
        codeNumberLabel.setToolTipText("");
        codeNumberLabel.setAutoscrolls(true);
        codeNumberLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        codeNumberLabel.setOpaque(true);

        oryginalTextArea.setBackground(textAreaColorViolet);
        oryginalTextArea.setColumns(20);
        oryginalTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        oryginalTextArea.setLineWrap(true);
        oryginalTextArea.setRows(5);
        oryginalTextArea.setToolTipText("");
        oryginalTextArea.setWrapStyleWord(true);
        oryginalTextArea.setAlignmentX(5);
        oryginalTextArea.setFocusTraversalPolicyProvider(true);
        oryginalTextArea.setName(""); // NOI18N
        oryginalTextArea.setNextFocusableComponent(codeNumberField);
        jScrollPane1.setViewportView(oryginalTextArea);
        oryginalTextArea.requestFocus(true);

        paste.setBackground(buttonColorViolet);
        paste.setFont(standartFont);
        paste.setForeground(fontColorViolet);
        paste.setText(buttonPasteteString);
        paste.setFocusable(false);
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });

        codeNumberField.setBackground(textAreaColorViolet);
        codeNumberField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codeNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeNumberField.setNextFocusableComponent(oryginalTextArea);

        oryginalTextLabel.setBackground(panelColorViolet);
        oryginalTextLabel.setFont(standartFont);
        oryginalTextLabel.setForeground(fontColorViolet);
        oryginalTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oryginalTextLabel.setText(textOriginalLabelString);
        oryginalTextLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oryginalTextLabel.setOpaque(true);

        code.setBackground(buttonColorViolet);
        code.setFont(standartFont);
        code.setForeground(fontColorViolet);
        code.setText(buttonCodeString);
        code.setFocusable(false);

        cleanAll.setBackground(buttonColorViolet);
        cleanAll.setFont(standartFont);
        cleanAll.setForeground(fontColorViolet);
        cleanAll.setText(buttonCleanString);
        cleanAll.setFocusable(false);

        codedTextLabel.setBackground(panelColorViolet);
        codedTextLabel.setFont(standartFont);
        codedTextLabel.setForeground(fontColorViolet);
        codedTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codedTextLabel.setText(textCodedLabelString);
        codedTextLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        codedTextLabel.setOpaque(true);

        codedTextArea.setEditable(false);
        codedTextArea.setBackground(textAreaColorViolet);
        codedTextArea.setColumns(20);
        codedTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codedTextArea.setLineWrap(true);
        codedTextArea.setRows(5);
        codedTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(codedTextArea);

        copy.setBackground(buttonColorViolet);
        copy.setFont(standartFont);
        copy.setForeground(fontColorViolet);
        copy.setText(buttonCopyString);
        copy.setFocusable(false);
        copy.setSelected(true);
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        colorListLabel.setBackground(panelColorViolet);
        colorListLabel.setFont(standartFont);
        colorListLabel.setForeground(fontColorViolet);
        colorListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorListLabel.setText(colorListLabelString);
        colorListLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colorListLabel.setOpaque(true);

        colorList.setBackground(buttonColorViolet);
        colorList.setFont(standartFont);
        colorList.setForeground(fontColorViolet);
        colorList.setModel((new javax.swing.DefaultComboBoxModel<>(new String[] {colorListViolet, colorListGreen, colorListBlue })));
        colorList.setFocusable(false);
        colorList.setRequestFocusEnabled(false);
        colorList.setVerifyInputWhenFocusTarget(false);
        colorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorListActionPerformed(evt);
            }
        });

        deCode.setBackground(buttonColorViolet);
        deCode.setFont(standartFont);
        deCode.setForeground(fontColorViolet);
        deCode.setText(buttonDeCodeString);
        deCode.setFocusable(false);
        deCode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cleanText.setBackground(buttonColorViolet);
        cleanText.setFont(standartFont);
        cleanText.setForeground(fontColorViolet);
        cleanText.setText(buttonCleanTextString);
        cleanText.setFocusPainted(false);
        cleanText.setFocusable(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(colorListLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(oryginalTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(colorList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codedTextLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(codeNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paste, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deCode)
                            .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(cleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanText, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cleanAll, cleanText, code, codedTextLabel, copy, deCode, jScrollPane1, jScrollPane2, oryginalTextLabel, paste});

        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(colorList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oryginalTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codedTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(paste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cleanAll, cleanText, code, copy, deCode, paste});

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {codeNumberField, codeNumberLabel, codedTextLabel, colorListLabel, oryginalTextLabel});

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        paste.setMnemonic(buttonPasteteString.charAt(1));
        //codeNumberField.setBackground(textAreaColorViolet);
        code.addActionListener(new CodeButton());
        code.setMnemonic(buttonCodeString.charAt(0));
        cleanAll.addActionListener(new CleanButton());
        cleanAll.setMnemonic(buttonCleanString.charAt(0));
        copy.setMnemonic(buttonCopyString.charAt(0));
        colorList.requestFocus(false);
        deCode.addActionListener(new CodeButton());
        deCode.setMnemonic(buttonDeCodeString.charAt(0));
        cleanText.addActionListener(new CleanButton());
        cleanText.setMnemonic(buttonCleanTextString.charAt(1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        JOptionPane.showMessageDialog(rootPane, startInfo, startInfoLabel, 1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
        String textToCopy = codedTextArea.getText();
        if (textToCopy.equals("")){
            JOptionPane.showMessageDialog(rootPane, copyNoTextString, warningString, 0);
        }else{

            StringSelection textCopied = new StringSelection(textToCopy);

            Clipboard clipboardCopy = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboardCopy.setContents(textCopied, null);
           
        }

    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        // TODO add your handling code here:
        Clipboard clipboardPastate = Toolkit.getDefaultToolkit().getSystemClipboard();
        DataFlavor flavorPastate = DataFlavor.stringFlavor;
        String textToPastate = "";
        try {
            textToPastate = (String) clipboardPastate.getData(flavorPastate);
            oryginalTextArea.setText(textToPastate);
        } catch (UnsupportedFlavorException ex) {
            JOptionPane.showMessageDialog(rootPane, pasteteFlavorExceptionString, warningString, 0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, pasteteIOExceptionString, warningString, 0);
        }
    }//GEN-LAST:event_pasteActionPerformed

    private void colorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorListActionPerformed
        // TODO add your handling code here:
        String choosenColor = colorList.getSelectedItem().toString();
        
        switch (choosenColor) {
            case colorListViolet:
                mainPanel.setBackground(panelColorViolet);
                
                oryginalTextArea.setBackground(textAreaColorViolet);
                codedTextArea.setBackground(textAreaColorViolet);
                codeNumberField.setBackground(textAreaColorViolet);
                
                colorList.setBackground(buttonColorViolet);
                colorList.setForeground(fontColorViolet);
                //colorList.setFont(standartFont);
                

                code.setBackground(buttonColorViolet);
                code.setForeground(fontColorViolet);
                
                deCode.setBackground(buttonColorViolet);
                deCode.setForeground(fontColorViolet);
                
                copy.setBackground(buttonColorViolet);
                copy.setForeground(fontColorViolet);
                
                paste.setBackground(buttonColorViolet);
                paste.setForeground(fontColorViolet);
                
                code.setBackground(buttonColorViolet);
                code.setForeground(fontColorViolet);
                
                cleanAll.setBackground(buttonColorViolet);
                cleanAll.setForeground(fontColorViolet);
                
                cleanText.setBackground(buttonColorViolet);
                cleanText.setForeground(fontColorViolet);
                
                colorListLabel.setBackground(panelColorViolet);
                colorListLabel.setForeground(fontColorViolet);
                
                oryginalTextLabel.setBackground(panelColorViolet);
                oryginalTextLabel.setForeground(fontColorViolet);
                
                codedTextLabel.setBackground(panelColorViolet);
                codedTextLabel.setForeground(fontColorViolet);
                
                codeNumberLabel.setBackground(panelColorViolet);
                codeNumberLabel.setForeground(fontColorViolet);
                
                break;
                
            case colorListGreen:
                mainPanel.setBackground(panelColorGreen);
                
                oryginalTextArea.setBackground(textAreaColorGreen);
                codedTextArea.setBackground(textAreaColorGreen);
                codeNumberField.setBackground(textAreaColorGreen);
                
                colorList.setBackground(buttonColorGreen);
                colorList.setForeground(fontColorGreen);
                //colorList.setFont(standartFont);
                
                code.setBackground(buttonColorGreen);
                code.setForeground(fontColorGreen);
                
                copy.setBackground(buttonColorGreen);
                copy.setForeground(fontColorGreen);
                
                paste.setBackground(buttonColorGreen);
                paste.setForeground(fontColorGreen);
                
                code.setBackground(buttonColorGreen);
                code.setForeground(fontColorGreen);
                
                deCode.setBackground(buttonColorGreen);
                deCode.setForeground(fontColorGreen);
                
                cleanAll.setBackground(buttonColorGreen);
                cleanAll.setForeground(fontColorGreen);
                
                cleanText.setBackground(buttonColorGreen);
                cleanText.setForeground(fontColorGreen);
                
                colorListLabel.setBackground(panelColorGreen);
                colorListLabel.setForeground(fontColorGreen);
                
                oryginalTextLabel.setBackground(panelColorGreen);
                oryginalTextLabel.setForeground(fontColorGreen);
                
                codedTextLabel.setBackground(panelColorGreen);
                codedTextLabel.setForeground(fontColorGreen);
                
                codeNumberLabel.setBackground(panelColorGreen);
                codeNumberLabel.setForeground(fontColorGreen);
     
                break;
                
            case colorListBlue:
                mainPanel.setBackground(panelColorBlue);
                
                oryginalTextArea.setBackground(textAreaColorBlue);
                codedTextArea.setBackground(textAreaColorBlue);
                codeNumberField.setBackground(textAreaColorBlue);
                
                colorList.setBackground(buttonColorBlue);
                colorList.setForeground(fontColorBlue);
                //colorList.setFont(standartFont);
                
                code.setBackground(buttonColorBlue);
                code.setForeground(fontColorBlue);
                
                copy.setBackground(buttonColorBlue);
                copy.setForeground(fontColorBlue);
                
                paste.setBackground(buttonColorBlue);
                paste.setForeground(fontColorBlue);
                
                code.setBackground(buttonColorBlue);
                code.setForeground(fontColorBlue);
                
                deCode.setBackground(buttonColorBlue);
                deCode.setForeground(fontColorBlue);
                
                cleanAll.setBackground(buttonColorBlue);
                cleanAll.setForeground(fontColorBlue);
                
                cleanText.setBackground(buttonColorBlue);
                cleanText.setForeground(fontColorBlue);
                
                colorListLabel.setBackground(panelColorBlue);
                colorListLabel.setForeground(fontColorBlue);
                
                oryginalTextLabel.setBackground(panelColorBlue);
                oryginalTextLabel.setForeground(fontColorBlue);
                
                codedTextLabel.setBackground(panelColorBlue);
                codedTextLabel.setForeground(fontColorBlue);
                
                codeNumberLabel.setBackground(panelColorBlue);
                codeNumberLabel.setForeground(fontColorBlue);

                break;
                
            default:
                mainPanel.setBackground(panelColorViolet);
                
                oryginalTextArea.setBackground(textAreaColorViolet);
                codedTextArea.setBackground(textAreaColorViolet);
                codeNumberField.setBackground(textAreaColorViolet);
                
                colorList.setBackground(buttonColorViolet);
                colorList.setForeground(fontColorViolet);
                //colorList.setFont(standartFont);
                
                code.setBackground(buttonColorViolet);
                code.setForeground(fontColorViolet);
                
                copy.setBackground(buttonColorViolet);
                copy.setForeground(fontColorViolet);
                
                paste.setBackground(buttonColorViolet);
                paste.setForeground(fontColorViolet);
                
                code.setBackground(buttonColorViolet);
                code.setForeground(fontColorViolet);
                
                deCode.setBackground(buttonColorViolet);
                deCode.setForeground(fontColorViolet);
                
                cleanAll.setBackground(buttonColorViolet);
                cleanAll.setForeground(fontColorViolet);
                
                cleanText.setBackground(buttonColorViolet);
                cleanText.setForeground(fontColorViolet);
                
                colorListLabel.setBackground(panelColorViolet);
                colorListLabel.setForeground(fontColorViolet);
                
                oryginalTextLabel.setBackground(panelColorViolet);
                oryginalTextLabel.setForeground(fontColorViolet);
                
                codedTextLabel.setBackground(panelColorViolet);
                codedTextLabel.setForeground(fontColorViolet);
                
                codeNumberLabel.setBackground(panelColorViolet);
                codeNumberLabel.setForeground(fontColorViolet);
                
                break;
        }
        
        
    }//GEN-LAST:event_colorListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException {
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

            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

  
            

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maszyna_szyfrujaca_wersja_2_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maszyna_szyfrujaca_wersja_2_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maszyna_szyfrujaca_wersja_2_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maszyna_szyfrujaca_wersja_2_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
               
            // select Look and Feel


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maszyna_szyfrujaca_wersja_2_0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanAll;
    private javax.swing.JButton cleanText;
    private javax.swing.JButton code;
    private javax.swing.JTextField codeNumberField;
    private javax.swing.JLabel codeNumberLabel;
    private javax.swing.JTextArea codedTextArea;
    private javax.swing.JLabel codedTextLabel;
    private javax.swing.JComboBox<String> colorList;
    private javax.swing.JLabel colorListLabel;
    private javax.swing.JButton copy;
    private javax.swing.JButton deCode;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea oryginalTextArea;
    private javax.swing.JLabel oryginalTextLabel;
    private javax.swing.JButton paste;
    // End of variables declaration//GEN-END:variables

private class CodeButton implements ActionListener {
    
    String alphabet = alphabetBasic + alphabetBasic + alphabetBasic;
    int alphabetLenght = alphabetBasic.length();
    int startChar = alphabet.length()/3;
    int endChar = startChar + alphabetLenght - 1;



        @Override
        public void actionPerformed(ActionEvent e) {
            String textOryginal = oryginalTextArea.getText();
            int textLenght = textOryginal.length();

            if (!textOryginal.equals("")){

                CodeNumberFieldHandler codeNumberFieldhandler = new CodeNumberFieldHandler();
                String codeNumberRaw = codeNumberField.getText();
                double codeNumber = codeNumberFieldhandler.parseInt(codeNumberRaw);
                if (codeNumber%1!=0){
                    JOptionPane.showMessageDialog(rootPane,wrongCodeNumberString, attentionString, 0); 
                }
               
               else if (codeNumber%1==0){
                  int codeNumber2 = (int)codeNumber;
                  
                    
                    boolean shouldDecode = e.toString().contains(buttonDeCodeString);
              
                    if(shouldDecode){
                        codeNumber2 = codeNumber2*(-1);
                    }

                    char [] textToCode = new char [textLenght];

                    for (int i = 0; i < textLenght; i++){

                      for (int j = startChar; j <= endChar; j++) {

                          if (textOryginal.charAt(i)==alphabet.charAt(j)){
                              textToCode[i]=alphabet.charAt(j+codeNumber2);
                              break;
                          }
   
                          else{
                              textToCode[i]=textOryginal.charAt(i);
                          }

                      }
                    }

                    String textCoded = String.valueOf(textToCode);

                    codedTextArea.setText(textCoded);

                }
                else {
                    JOptionPane.showMessageDialog(rootPane,wrongCodeNumberString, attentionString, 0);
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, noTextToCodeString, errorString, 0);
            }
        }
        
    }

private class CleanButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String noText = "";
            oryginalTextArea.setText(noText);
            codedTextArea.setText(noText);
            boolean cleanCodeNumber = e.toString().contains(buttonCleanString);
            if(cleanCodeNumber)
                codeNumberField.setText(noText);
            
            System.out.println(cleanCodeNumber);
        }
    
}



public class CodeNumberFieldHandler{

   public double parseInt(String codeNumberRaw) throws NumberFormatException{
       codeNumberRaw = codeNumberField.getText();
            
            try{
                double codeNumber = Integer.parseInt(codeNumberRaw);
                return codeNumber;
            }
            catch (NumberFormatException ex){
                double codeNumber = 2.7;
                return codeNumber; 
            }

        } 
}

private final String alphabetBasic = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPQRSŚTUVWXYZŹŻaąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż1234567890—’'!@#$%^&*„”\"*\\/()_+-=,.:;?";

private final String title = "maszyna szyfrująca";

private final String textOriginalLabelString = "Wpisz lub wklej ze schowka tekst, który chcesz zakodować";

private final String CodeNumberLabelString = "                Wpisz liczbę, o którą chcesz przesunąć znaki w tekście";

private final String textCodedLabelString = "Tekst zakodowany";

private final String pasteteFlavorExceptionString = "Zawartość schowka nie jest tekstem";

private final String pasteteIOExceptionString = "Wystąpił błąd wejścia/wyjścia";

private final String copyNoTextString = "Brak tekstu do skopiowania";

private final String wrongCodeNumberString = "Nieprawidłowa wartość przesunięcia";

private final String noTextToCodeString = "Brak tekstu do zakodowania";

private final String startInfoLabel = "informacja początkowa";

private final String warningString = "ostrzeżenie";

private final String attentionString = "uwaga";

private final String errorString = "błąd";

private final String buttonPasteteString = "Wklej tekst ze schowka";

private final String buttonCopyString = "Skopiuj tekst do schowka";

private final String buttonCodeString = "Zakoduj tekst";

private final String buttonDeCodeString = "Rozkoduj tekst";

private final String buttonCleanString = "Wyczyść wszystko";

private final String buttonCleanTextString = "Wyczyść tekst";

private final String startInfo = "\"Maszyna szyfrująca\" używa  szyfru przesuwającego\npolegającego na zastąpieniu każdego znaku\nwpisanego tekstu znakiem oddalonym od niego\no stałą, zdefiniowaną przez uzytkownika, liczbę pozycji.";

private final String colorListLabelString = "Wybierz kolor";

private final String colorListViolet = "Fioletowy";

private final String colorListGreen = "Zielony";

private final String colorListBlue = "Niebieski";

private final Font standartFont = new Font("Sylfaen", 2, 16);

// violet
private final Color panelColorViolet = new Color(153,153,255);
private final Color textAreaColorViolet = new Color(204,204,255);
private final Color buttonColorViolet = new Color(102,102,255);
private final Color fontColorViolet = new Color (51,0,51);

// blue
private final Color panelColorBlue = new Color(113, 218, 218);
private final Color textAreaColorBlue = new Color(179, 236, 255);
private final Color buttonColorBlue = new Color(0, 153, 204);
private final Color fontColorBlue = new Color (0, 0, 77);

// green
private final Color panelColorGreen = new Color(102, 204, 102);
private final Color textAreaColorGreen = new Color(159, 223, 159);
private final Color buttonColorGreen = new Color(0, 102, 0);
private final Color fontColorGreen = new Color (0, 51, 0);

}

