/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JPanal;

import Entities.Product;
import Entities.Store;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayesh
 */
public class ProductPortal extends javax.swing.JFrame {

    /**
     * Creates new form ProductPortal
     */
    public ProductPortal() {
        initComponents();
      this.setBounds(300, 100, 785, 555);
      Store.dummyvalues();
      setTableValues();
    }
    
    //set table
   void setTableValues() {
    ArrayList<Product> objects= Store.getProduct();
    if(objects!=null){
    DefaultTableModel model= (DefaultTableModel)prd_list.getModel();
    model.setRowCount(0);
    for(int i=0; i<objects.size();i++){
        Object[] cols= new Object[6];
        cols[0]=objects.get(i).getProductId();
        cols[1]=objects.get(i).getName();
        cols[2]=objects.get(i).getCategory();
        cols[3]=objects.get(i).getStock();
        cols[4]=objects.get(i).getWhole_sale_P();
        cols[5]=objects.get(i).getRetail_P();
        model.addRow(cols);
       }
    }
}
   public void setsingleitemTable(Product p) {
    
    DefaultTableModel model= (DefaultTableModel)prd_list.getModel();
    model.setRowCount(0);
        Object[] cols= new Object[6];
        cols[0]=p.getProductId();
        cols[1]=p.getName();
        cols[2]=p.getCategory();
        cols[3]=p.getStock();
        cols[4]=p.getWhole_sale_P();
        cols[5]=p.getRetail_P();
        model.addRow(cols);

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prod_rp = new javax.swing.JTextField();
        prod_name = new javax.swing.JTextField();
        prod_stock = new javax.swing.JTextField();
        prod_wp = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prd_list = new javax.swing.JTable();
        prod_category = new javax.swing.JComboBox<>();
        delete1 = new javax.swing.JButton();
        pr_id = new javax.swing.JTextField();
        textfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        prod_rp.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        prod_rp.setForeground(new java.awt.Color(153, 153, 153));
        prod_rp.setText("Retail Price");
        getContentPane().add(prod_rp);
        prod_rp.setBounds(40, 350, 210, 30);

        prod_name.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        prod_name.setForeground(new java.awt.Color(153, 153, 153));
        prod_name.setText("Name");
        getContentPane().add(prod_name);
        prod_name.setBounds(40, 150, 210, 40);

        prod_stock.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        prod_stock.setForeground(new java.awt.Color(153, 153, 153));
        prod_stock.setText("Stock");
        getContentPane().add(prod_stock);
        prod_stock.setBounds(40, 250, 210, 30);

        prod_wp.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        prod_wp.setForeground(new java.awt.Color(153, 153, 153));
        prod_wp.setText("Whole Sale Price");
        getContentPane().add(prod_wp);
        prod_wp.setBounds(40, 300, 210, 30);

        search.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(102, 102, 102));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(630, 90, 120, 36);

        back.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 102));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(150, 460, 120, 36);

        add.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(102, 102, 102));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(20, 410, 120, 36);

        update.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(102, 102, 102));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(20, 460, 120, 36);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel2.setText("Product");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 170, 40);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel3.setText("Portal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 30, 150, 40);

        prd_list.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        prd_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_Id", "Name", "Category", "Stock", "Wholesale Price", "Retail Price"
            }
        ));
        prd_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prd_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(prd_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 142, 452, 360);

        prod_category.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        prod_category.setForeground(new java.awt.Color(153, 153, 153));
        prod_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Fruits", "Snacks" }));
        getContentPane().add(prod_category);
        prod_category.setBounds(42, 202, 210, 30);

        delete1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        delete1.setForeground(new java.awt.Color(102, 102, 102));
        delete1.setText("Delete");
        delete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(delete1);
        delete1.setBounds(150, 410, 120, 36);

        pr_id.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pr_id.setForeground(new java.awt.Color(153, 153, 153));
        pr_id.setText("ProductId");
        pr_id.setAutoscrolls(false);
        pr_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pr_idActionPerformed(evt);
            }
        });
        getContentPane().add(pr_id);
        pr_id.setBounds(40, 100, 210, 30);
        getContentPane().add(textfield);
        textfield.setBounds(300, 90, 310, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPanal/icon/image4.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
    String id = pr_id.getText().trim();
    String name = prod_name.getText().trim();
    String category = prod_category.getSelectedItem().toString().trim();
    String stock = prod_stock.getText().trim();
    String wp = prod_wp.getText().trim();
    String rp = prod_rp.getText().trim();
    
    if (!id.isEmpty() && !name.isEmpty() && !category.isEmpty() && 
            !stock.isEmpty() && !wp.isEmpty() && !rp.isEmpty()) {
        try {
            Product p = new Product();
            p.setProductId(Integer.parseInt(id));
            p.setName(name);
            p.setCategory(category);
            p.setStock(Integer.parseInt(stock));
            p.setWhole_sale_P(Double.parseDouble(wp));
            p.setRetail_P(Double.parseDouble(rp));
            Store.addProduct(p);
            setTableValues();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for ID, stock, wholesale price, and retail price.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please fill all the fields.");
    }
    }//GEN-LAST:event_addActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if (!textfield.getText().isEmpty()) {
        Product obj = Store.searchByName(textfield.getText());
        if (obj != null) {
            this.setsingleitemTable(obj);
        } else {
            JOptionPane.showMessageDialog(null, "Product " + textfield.getText() + " not found");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please fill in the required fields");
    }   
    }//GEN-LAST:event_searchActionPerformed

    private void pr_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pr_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pr_idActionPerformed

    private void prd_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prd_listMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) prd_list.getModel();
        int index =prd_list.getSelectedRow();
        pr_id.setText(model.getValueAt(index, 0).toString());
        prod_name.setText(model.getValueAt(index, 1).toString());
        prod_category.setSelectedItem(model.getValueAt(index, 2));
        prod_stock.setText(model.getValueAt(index, 3).toString());
        prod_wp.setText(model.getValueAt(index, 4).toString());
        prod_rp.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_prd_listMouseClicked

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
 // Trim all input fields to avoid issues with whitespace
    String id = pr_id.getText().trim();
    String name = prod_name.getText().trim();
    String category = prod_category.getSelectedItem().toString().trim();
    String stock = prod_stock.getText().trim();
    String wp = prod_wp.getText().trim();
    String rp = prod_rp.getText().trim();
    
    if (!id.isEmpty() && !name.isEmpty() 
       && !category.isEmpty() && !stock.isEmpty() && !wp.isEmpty() && !rp.isEmpty()) {
        try {
            Product p = new Product();
            p.setProductId(Integer.parseInt(id));
            p.setName(name);
            p.setCategory(category);
            p.setStock(Integer.parseInt(stock));
            p.setWhole_sale_P(Double.parseDouble(wp));
            p.setRetail_P(Double.parseDouble(rp));

            boolean deleted = Store.deleteProduct(p);
            if (deleted) {
                setTableValues();
                JOptionPane.showMessageDialog(null, "Product deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Product not found.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers for ID, stock, wholesale price, and retail price.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please fill all the fields.");
    }
    }//GEN-LAST:event_delete1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String id = pr_id.getText().trim();
    String name = prod_name.getText().trim();
    String category = prod_category.getSelectedItem().toString().trim();
    String stock = prod_stock.getText().trim();
    String wp = prod_wp.getText().trim();
    String rp = prod_rp.getText().trim();
    
        if (!id.isEmpty() && !name.isEmpty() 
           && !category.isEmpty() && !stock.isEmpty() && !wp.isEmpty() && !rp.isEmpty()){
            Product p = new Product();
            p.setProductId(Integer.parseInt(id));
            p.setName(name);
            p.setCategory(category);
            p.setStock(Integer.parseInt(stock));
            p.setWhole_sale_P(Double.parseDouble(wp));
            p.setRetail_P(Double.parseDouble(rp));
            Store.updateProduct(p.getProductId(), p);
            setTableValues();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
          new LoginPortal().setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed
    

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
            java.util.logging.Logger.getLogger(ProductPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pr_id;
    private javax.swing.JTable prd_list;
    private javax.swing.JComboBox<String> prod_category;
    private javax.swing.JTextField prod_name;
    private javax.swing.JTextField prod_rp;
    private javax.swing.JTextField prod_stock;
    private javax.swing.JTextField prod_wp;
    private javax.swing.JButton search;
    private javax.swing.JTextField textfield;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    
}
