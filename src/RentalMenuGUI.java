
import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author leemj
 */
public class RentalMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form ComicRentalSystem
     */
    private RentalSystem rs;
    private List comics;
    private List mangas;
    private List rentees;
    int comicIndex = 0;
    int renteeIndex = 0;

    public RentalMenuGUI() {
        initComponents();
        rs = new RentalSystem();
        comics = rs.comic();
        mangas = rs.manga();
        rentees = rs.rentee();
        displayComic(comicIndex);
        displayRentee(renteeIndex);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        panelComic = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRental = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnComicPrev = new javax.swing.JButton();
        btnComicNext = new javax.swing.JButton();
        panelRentee = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLoans = new javax.swing.JTable();
        btnRenteePrev = new javax.swing.JButton();
        btnRenteeNext = new javax.swing.JButton();
        panelSystem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnEarning = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelSearch = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbComic = new javax.swing.JRadioButton();
        rbRentee = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        lblComicHeader = new javax.swing.JLabel();
        lblRenteeHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comic Rental System");
        jLabel1.setToolTipText("");

        panelComic.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ISBN-13:");

        txtISBN.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Title:");

        txtTitle.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Daily Rental Cost:");

        txtRental.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Deposit:");

        txtDeposit.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Additional Information:");

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        btnComicPrev.setText("Previous");
        btnComicPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComicPrevActionPerformed(evt);
            }
        });

        btnComicNext.setText("Next");
        btnComicNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComicNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelComicLayout = new javax.swing.GroupLayout(panelComic);
        panelComic.setLayout(panelComicLayout);
        panelComicLayout.setHorizontalGroup(
            panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComicLayout.createSequentialGroup()
                        .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRental, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1)
                    .addGroup(panelComicLayout.createSequentialGroup()
                        .addComponent(btnComicPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComicNext))
                    .addGroup(panelComicLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelComicLayout.createSequentialGroup()
                        .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle)
                            .addComponent(txtISBN))))
                .addContainerGap())
        );
        panelComicLayout.setVerticalGroup(
            panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComicLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(panelComicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComicPrev)
                    .addComponent(btnComicNext))
                .addContainerGap())
        );

        panelRentee.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Member-ID:");

        txtID.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Name:");

        txtName.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("List of Loans:");

        tblLoans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN-13", "Title", "Rental Per Day", "Deposit Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLoans);

        btnRenteePrev.setText("Previous");
        btnRenteePrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenteePrevActionPerformed(evt);
            }
        });

        btnRenteeNext.setText("Next");
        btnRenteeNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenteeNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRenteeLayout = new javax.swing.GroupLayout(panelRentee);
        panelRentee.setLayout(panelRenteeLayout);
        panelRenteeLayout.setHorizontalGroup(
            panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRenteeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRenteeLayout.createSequentialGroup()
                        .addGroup(panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtName)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGroup(panelRenteeLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRenteeLayout.createSequentialGroup()
                        .addComponent(btnRenteePrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRenteeNext)))
                .addContainerGap())
        );
        panelRenteeLayout.setVerticalGroup(
            panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRenteeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelRenteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRenteePrev)
                    .addComponent(btnRenteeNext)))
        );

        panelSystem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtMessage.setEditable(false);
        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane3.setViewportView(txtMessage);

        btnEarning.setBackground(new java.awt.Color(0, 0, 255));
        btnEarning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEarning.setForeground(new java.awt.Color(255, 255, 255));
        btnEarning.setText("Get Earning Stats");
        btnEarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEarningActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear Message");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSystemLayout = new javax.swing.GroupLayout(panelSystem);
        panelSystem.setLayout(panelSystemLayout);
        panelSystemLayout.setHorizontalGroup(
            panelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panelSystemLayout.createSequentialGroup()
                        .addComponent(btnEarning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(btnClear)))
                .addContainerGap())
        );
        panelSystemLayout.setVerticalGroup(
            panelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEarning, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Search:");

        btnSearch.setBackground(new java.awt.Color(0, 155, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbComic);
        rbComic.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbComic.setSelected(true);
        rbComic.setText("Comic By ISBN-13");

        buttonGroup1.add(rbRentee);
        rbRentee.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbRentee.setText("Rentee by MemberID");

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch))
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addComponent(rbComic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbRentee)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbComic)
                    .addComponent(rbRentee))
                .addGap(16, 16, 16)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSave.setBackground(new java.awt.Color(255, 0, 0));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save & Exit ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblComicHeader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblComicHeader.setText("Comic");

        lblRenteeHeader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRenteeHeader.setText("Rentee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelComic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComicHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelRentee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRenteeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComicHeader)
                    .addComponent(lblRenteeHeader))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRentee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelComic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComicNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComicNextActionPerformed
        // TODO add your handling code here:
        if (comicIndex < (comics.size() - 1)) {
            try {
                comicIndex++;
                displayComic(comicIndex);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "No more comics to display!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No more comics to display!");
        }
    }//GEN-LAST:event_btnComicNextActionPerformed

    private void btnComicPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComicPrevActionPerformed
        // TODO add your handling code here:
        if (comicIndex > 0) {
            try {
                comicIndex--;
                displayComic(comicIndex);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "No more comics to display!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No more comics to display!");
        }

    }//GEN-LAST:event_btnComicPrevActionPerformed

    private void btnRenteeNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenteeNextActionPerformed
        // TODO add your handling code here:
        if (renteeIndex < (rentees.size() - 1)) {
            try {
                renteeIndex++;
                displayRentee(renteeIndex);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "No more rentees to display!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No more rentees to display!");
        }
    }//GEN-LAST:event_btnRenteeNextActionPerformed

    private void btnRenteePrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenteePrevActionPerformed
        // TODO add your handling code here:
        if (renteeIndex > 0) {
            try {
                renteeIndex--;
                displayRentee(renteeIndex);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "No more rentees to display!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No more rentees to display!");
        }
    }//GEN-LAST:event_btnRenteePrevActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String isbnSearch = txtSearch.getText().trim();
        String memberSearch = txtSearch.getText().trim();

        if (rbComic.isSelected()) {
            searchComic(isbnSearch);
        } else if (rbRentee.isSelected()) {
            searchMember(memberSearch);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEarningActionPerformed
        // TODO add your handling code here:
        earnings(rentees.size());
    }//GEN-LAST:event_btnEarningActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtMessage.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveRentee();
        JOptionPane.showMessageDialog(null, "Saving data..");
        JOptionPane.showMessageDialog(null, "Thank you for using Comic Rental.\nWe look forward to serve you in the near future.");
        System.exit(0);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void displayComic(int comicIndex) {
        String information;
        lblComicHeader.setText("Comic " + (comicIndex + 1) + " of " + comics.size());
        Comic comic = (Comic) comics.get(comicIndex);
        Manga manga = (Manga) mangas.get(comicIndex);
        txtTitle.setText(comic.getTitle());
        txtISBN.setText(comic.getIsbn13());
        txtRental.setText("$" + String.format("%.2f", comic.getPricePerDay()));
        txtDeposit.setText("$" + String.format("%.2f", comic.getDeposit()));

        if (comic.getType().equals("Manga")) {
            information = manga.information();
        } else {
            information = comic.information();
        }

        txtInfo.setText(information);
    }

    public void displayRentee(int renteeIndex) {
        lblRenteeHeader.setText("Rentee " + (renteeIndex + 1) + " of " + rentees.size());
        Rentee rentee = (Rentee) rentees.get(renteeIndex);
        DefaultTableModel model = (DefaultTableModel) tblLoans.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (int j = 0; j < comics.size(); j++) { //loop through comic object array
            Comic comic = (Comic) comics.get(j);
            for (int k = 0; k < rentee.getComicsISBN().length; k++) { //loop through rentee object comicISBN array  
                if (comic.getIsbn13().equals(rentee.getComicsISBN()[k])) {
                    txtID.setText(rentee.getMemberID());
                    txtName.setText(rentee.getName());
                    String rowData[] = {
                        rentee.getComicsISBN()[k],
                        comic.getTitle(),
                        "$" + String.format("%.2f", comic.getPricePerDay()),
                        "$" + String.format("%.2f", comic.getDeposit())
                    };
                    model.addRow(rowData);
                }
            }
        }
    }

    public void searchComic(String isbn13) {
        String msg = "No such ISBN-13 \"" + isbn13 + "\" in the data!";
        for (int i = 0; i < comics.size(); i++) { //compare isbn13 input to isbn13 in comic object array
            Comic comic = (Comic) comics.get(i);
            if (isbn13.equals(comic.getIsbn13())) {
                msg = "Found and displayed item with the ISBN-13: " + isbn13;
                displayComic(i);
            }
        }
        txtMessage.setText(msg);
    }

    public void searchMember(String memberID) {
        String msg = "No such Member ID \"" + memberID + "\" in the data!";
        for (int i = 0; i < rentees.size(); i++) { //compare memberID input to memberID in rentee object array
            Rentee rentee = (Rentee) rentees.get(i);
            if (memberID.toLowerCase().equals(rentee.getMemberID().toLowerCase())) {
                msg = "Found and displayed rentee with the Member ID: " + rentee.getMemberID();
                displayRentee(i);
            }
        }
        txtMessage.setText(msg);
    }

    public double calculateRentalPerDay(int index) {
        Rentee rentee = (Rentee) rentees.get(index);
        double rentalPerDay = 0;
        for (int i = 0; i < comics.size(); i++) { //loop through comic object array
            Comic comic = (Comic) comics.get(i);
            for (int j = 0; j < rentee.getComicsISBN().length; j++) { //loop through rentee object comic array
                if (comic.getIsbn13().equals(rentee.getComicsISBN()[j])) {
                    rentalPerDay += comic.getPricePerDay();
                }
            }
        }
        return rentalPerDay;
    }

    public void earnings(int renteeArrLength) {
        String stats;
        double earningPerDay = 0;
        stats = "Earning Per Day:";
        stats += "\n----------------------\n\n";
        stats += "There are " + renteeArrLength + " Rentees in total.\n\n";
        for (int i = 0; i < renteeArrLength; i++) { //loop through the rentee object array
            earningPerDay += calculateRentalPerDay(i);
        }
        stats += "Average earning per day based on number of rentees is $" + String.format("%.2f", earningPerDay / renteeArrLength) + ".\n\n";
        stats += "Total earning per day is $" + String.format("%.2f", earningPerDay);
        txtMessage.setText(stats);
    }

    public void saveRentee() {
        File renteesData = new File("rentees.dat");

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(renteesData));
            os.writeObject(rentees);
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(RentalMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentalMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnComicNext;
    private javax.swing.JButton btnComicPrev;
    private javax.swing.JButton btnEarning;
    private javax.swing.JButton btnRenteeNext;
    private javax.swing.JButton btnRenteePrev;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblComicHeader;
    private javax.swing.JLabel lblRenteeHeader;
    private javax.swing.JPanel panelComic;
    private javax.swing.JPanel panelRentee;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelSystem;
    private javax.swing.JRadioButton rbComic;
    private javax.swing.JRadioButton rbRentee;
    private javax.swing.JTable tblLoans;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRental;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
