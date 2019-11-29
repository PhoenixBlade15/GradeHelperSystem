/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradehelpersystem;

import static gradehelpersystem.GradeHelperSystem.dirS;
import static gradehelpersystem.MainMenu.SelectedCourse;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthew
 */
public class GradeMenu extends javax.swing.JFrame {

    /**
     * Creates new form GradeMenu
     */
    public GradeMenu() {
        initComponents();
        loadGrades();
        fillGradeTable();
        loadCategories();
        fillCategoryTable();
        updateCategoryComboBox();
        calculateGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        GradeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GradeText = new javax.swing.JTextField();
        AssignmentNameText = new javax.swing.JTextField();
        addGradeButton = new javax.swing.JButton();
        categoryDropMenu = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        CategoriesTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        CategoryButtonAdd = new javax.swing.JButton();
        CategoryText = new javax.swing.JTextField();
        CategoryButtonDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CurrentGrade = new javax.swing.JLabel();
        removeGradeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CategoryWeight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Grade", "Weight Category"
            }
        ));
        jScrollPane1.setViewportView(GradeTable);

        jLabel1.setText("Assignment Name:");

        jLabel2.setText("Grade:");

        jLabel3.setText("Category:");

        addGradeButton.setText("Add Assignment:");
        addGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGradeButtonActionPerformed(evt);
            }
        });

        categoryDropMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ap_ple", "bottom", "jeans" }));

        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categories", "Weight %"
            }
        ));
        jScrollPane2.setViewportView(CategoriesTable);

        jLabel4.setText("Category:");

        CategoryButtonAdd.setText("Add Category");
        CategoryButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryButtonAddActionPerformed(evt);
            }
        });

        CategoryButtonDelete.setText("Remove Category");
        CategoryButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryButtonDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Grade in class:");

        CurrentGrade.setText("100");

        removeGradeButton.setText("Remove Assignment");
        removeGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGradeButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Weight %:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GradeText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AssignmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CategoryButtonDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(CategoryButtonAdd)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(removeGradeButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CategoryText, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(CategoryWeight))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addComponent(CurrentGrade))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(addGradeButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AssignmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GradeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(categoryDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGradeButton)
                .addGap(4, 4, 4)
                .addComponent(removeGradeButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CategoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CategoryWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CategoryButtonAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryButtonDelete)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CurrentGrade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList<String> Grades = new ArrayList<>();
    ArrayList<String> Categories = new ArrayList<>();
    ArrayList<String> justCategories = new ArrayList<>();
    ArrayList<String> justWeight = new ArrayList<>();
    
    public boolean isNumber(String Num){
        if (Num.isEmpty()) {
            return false;
        }
        int intValue = 0;
        try {
            intValue = Integer.parseInt(Num.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        if (intValue < 0 || intValue > 100) {
            return false;
        }
        return true;
    }
    
    // Send message to user
    private void msgbox(String s){
        JOptionPane.showMessageDialog(null, s);
    }
    
    // Saves the new course
    public void saveGrade(String assignmentName, String grade, String Category){
        
        if ( Grades.contains(assignmentName) ){
            int gradePlace = Grades.indexOf(assignmentName);
            Grades.remove(gradePlace+2);
            Grades.remove(gradePlace+1);
            Grades.remove(gradePlace);
        } 
        if (!Grades.equals("")){
            Grades.add(assignmentName);
            Grades.add(grade);
            Grades.add(Category);
        }
        try{
            File dir = new File(dirS);
            File gradesFile = new File(dir + "\\" + SelectedCourse + "Grade.txt");
            if ( gradesFile.exists() ){
                gradesFile.delete();
            }
            try {
                dir.mkdir();
                FileWriter fWriter = new FileWriter( gradesFile );
                try (PrintWriter output = new PrintWriter( fWriter )) {
                    for (String Grade : Grades) {
                        output.println(Grade);
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
                System.exit(4);
            }
        } catch ( Exception e ){
            System.out.println(e);
            System.exit(5);
        }
        Grades.clear();
        loadGrades();
    }
    
    // Loads courses into array list
    public void loadGrades(){
        Grades.clear();
        try{
            File dir = new File(dirS);
            File gradesFile = new File(dir + "\\" + SelectedCourse + "Grade.txt");
            if ( gradesFile.exists() ){
                Scanner input = new Scanner( gradesFile );
                String text;
                while ( true ){
                    try {
                        text = input.next();
                    } catch (Exception e){
                        break;
                    }
                    Grades.add(text);
                }
            }
        } catch ( Exception e ){
            System.out.println(e);
            System.exit(3);
        }
    }
    
    // Deletes an assignment out of the system
    public void deleteGrade(String AssignmentName){
        if ( Grades.contains(AssignmentName) ){
            int gradePlace = Grades.indexOf(AssignmentName);
            Grades.remove(gradePlace+2); 
            Grades.remove(gradePlace+1);
            Grades.remove(gradePlace);
            saveGrade("","","");
        } else {
            msgbox("Assignment does not exist");
        }
    }
    
    // Saves the new category
    public void saveCategory(String categoryName, String categoryWeight){
        
        if ( Categories.contains(categoryName) ){
            int categoryPlace = Categories.indexOf(categoryName);
            Categories.remove(categoryPlace+1);
            Categories.remove(categoryPlace);
        } 
        if (!Categories.equals("")){
            Categories.add(categoryName);
            Categories.add(categoryWeight);
        }
        try{
            File dir = new File(dirS);
            File categoriesFile = new File(dir + "\\" + SelectedCourse + "Categories.txt");
            if ( categoriesFile.exists() ){
                categoriesFile.delete();
            }
            try {
                dir.mkdir();
                FileWriter fWriter = new FileWriter( categoriesFile );
                try (PrintWriter output = new PrintWriter( fWriter )) {
                    for (String Category : Categories) {
                        output.println(Category);
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
                System.exit(4);
            }
        } catch ( Exception e ){
            System.out.println(e);
            System.exit(5);
        }
        Categories.clear();
        loadCategories();
    }
    
    // Loads courses into array list
    public void loadCategories(){
        Categories.clear();
        justCategories.clear();
        justWeight.clear();
        try{
            File dir = new File(dirS);
            File categoriesFile = new File(dir + "\\" + SelectedCourse + "Categories.txt");
            if ( categoriesFile.exists() ){
                int isCategory = 0;
                Scanner input = new Scanner( categoriesFile );
                String text;
                while ( true ){
                    try {
                        text = input.next();
                        if ( isCategory == 0 || isCategory == 2 ){
                            isCategory = 0;
                            justCategories.add(text);
                        } else {
                            justWeight.add(text);
                        }
                        isCategory++;
                    } catch (Exception e){
                        break;
                    }
                    Categories.add(text);
                }
            }
        } catch ( Exception e ){
            System.out.println(e);
            System.exit(3);
        }
    }
    
    // Deletes an assignment out of the system
    public void deleteCategory(String CategoryName){
        if ( Categories.contains(CategoryName) ){
            int categoryPlace = Categories.indexOf(CategoryName);
            Categories.remove(categoryPlace+1);
            Categories.remove(categoryPlace);
            saveCategory("", "");
        } else {
            msgbox("Category does not exist");
        }
    }
    
    // Fills grade table in
    public void fillGradeTable(){
        String[] colNames = new String[] {"Name", "Grade", "Weight"};
        String[][] rowData = new String[Grades.size() / colNames.length][colNames.length];
        for (int i = 0; i < rowData.length; i++) {
            for (int j = 0; j < rowData[i].length; j++) {
                rowData[i][j] = Grades.get(i * colNames.length + j);
            }
        }
        
        GradeTable.setModel(new javax.swing.table.DefaultTableModel( rowData, colNames));
    }

    // Fills category table in
    public void fillCategoryTable(){
        String[] colNames = new String[] {"Categories", "Weight %"};
        String[][] rowData = new String[Categories.size() / colNames.length][colNames.length];
        for (int i = 0; i < rowData.length; i++) {
            for (int j = 0; j < rowData[i].length; j++) {
                rowData[i][j] = Categories.get(i * colNames.length + j);
            }
        }
        
        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel( rowData, colNames));
    }
    
    // Calculates the grades
    public void calculateGrade(){
        double WeightTotal = 0;
        double GradeTotal = 0;
        for (int i = 1; i < Grades.size(); i += 3) {
            String Weight = Grades.get(i+1);
            double WeightNum = 0;
            
            // Search for matching weight string
            for (int j = 0; j < justCategories.size(); j++) {
                if ( justCategories.get(j).equals(Weight) ){
                    WeightNum = Double.parseDouble(justWeight.get(j)) / 100;
                }
            }
            WeightTotal += WeightNum;
            GradeTotal += (Double.parseDouble(Grades.get(i))) * WeightNum;
        }
        double grade = GradeTotal/WeightTotal;
        CurrentGrade.setText(Double.toString(grade));
    }
    
    // Updates combobox for the Categories
    public void updateCategoryComboBox(){
        categoryDropMenu.setModel(new javax.swing.DefaultComboBoxModel(justCategories.toArray()));
    }
    
    // Add an assignment
    private void addGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGradeButtonActionPerformed
        String AssignmentName = AssignmentNameText.getText().trim().replace(" ", "_");
        String AssignmentGrade = GradeText.getText();
        String AssignmentCategory = categoryDropMenu.getItemAt(categoryDropMenu.getSelectedIndex()).toString();
        if ( AssignmentName.length() > 0 || AssignmentName != null ){
            if ( isNumber(AssignmentGrade) ){
                if ( AssignmentCategory.length() > 0 ){
                    saveGrade(AssignmentName, AssignmentGrade, AssignmentCategory);
                    fillGradeTable();
                    calculateGrade();
                } else {
                    msgbox("Category must be added first.");
                }
            } else {
                msgbox("Grade must be a number between 0-100");
            }
        } else {
            msgbox("Assignment Name needs to be filled in.");
        }
    }//GEN-LAST:event_addGradeButtonActionPerformed

    // Adds a category when button clicked
    private void CategoryButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryButtonAddActionPerformed
        String CategoryName = CategoryText.getText().trim().replace(" ", "_");
        String Weight = CategoryWeight.getText();
        if ( CategoryName.length() > 0 || CategoryName != null ){
            if ( isNumber(Weight) ){
                saveCategory(CategoryName, Weight);
                fillCategoryTable();
                updateCategoryComboBox();
            } else {
                msgbox("Category Weight must be a number between 0 and 100.");
            }
        } else {
            msgbox("Category box needs to not be blank.");
        }
    }//GEN-LAST:event_CategoryButtonAddActionPerformed

    // Deletes a category when button clicked
    private void CategoryButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryButtonDeleteActionPerformed
        String CategoryName = CategoryText.getText();
        if ( CategoryName.length() > 0 || CategoryName != null ){
            deleteCategory(CategoryName);
            fillCategoryTable();
            updateCategoryComboBox();
        } else {
            msgbox("Category box needs to not be blank.");
        }
    }//GEN-LAST:event_CategoryButtonDeleteActionPerformed

    private void removeGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGradeButtonActionPerformed
        String AssignmentName = AssignmentNameText.getText();
        deleteGrade(AssignmentName);
        fillGradeTable();
    }//GEN-LAST:event_removeGradeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AssignmentNameText;
    private javax.swing.JTable CategoriesTable;
    private javax.swing.JButton CategoryButtonAdd;
    private javax.swing.JButton CategoryButtonDelete;
    private javax.swing.JTextField CategoryText;
    private javax.swing.JTextField CategoryWeight;
    private javax.swing.JLabel CurrentGrade;
    private javax.swing.JTable GradeTable;
    private javax.swing.JTextField GradeText;
    private javax.swing.JButton addGradeButton;
    private javax.swing.JComboBox categoryDropMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeGradeButton;
    // End of variables declaration//GEN-END:variables
}
