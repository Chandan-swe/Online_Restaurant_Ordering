/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinerestaurantorderingystem;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rezwan
 */
public class food_menu extends javax.swing.JFrame {
int totalofsnacks;
int totalofcurrydishes;
int totaloftanddori;
int totalofbiriyani;
int totalofbeverages;
int numofi;
String a;
void show_message()
{
  JOptionPane.showMessageDialog(null, "The given input must be an integer");

}
void clrscr()
{
   snacksTextField.setText("");
    curryTextField.setText("");
    tandooriTextField.setText("");
    biriyaniTextField.setText("");
    beveragesTextField.setText("");
    totalcostTextField.setText("");

}
int snacks()
{
    
  
  try{
      
    
       int numofi=Integer.parseInt(snacksTextField.getText());
      
      
     
     
     
     
      
      
        if(snacksComboBox.getSelectedItem().equals("Vegetable samosa 30/-"))
        { 
             a="vegetable samosa 30/-";
            
           totalofsnacks=numofi*30;
        }
       else if(snacksComboBox.getSelectedItem().equals("Meat samosa 40/-"))
        { 
            a="Meat samosa 40/-";
            
            
           totalofsnacks=numofi*40;
        }
      else  if(snacksComboBox.getSelectedItem().equals("Vegetable chop 30/-"))
        { 
             a="Vegetable chop 30/-";
            
            
           totalofsnacks=numofi*30;
        }
      else  if(snacksComboBox.getSelectedItem().equals("Fish chop 50/-"))
        { 
           a="Fish chop 50/-";
            
            
           totalofsnacks=numofi*50;
        }
        else
        { 
            a="Chicken roll 60/-";
            
            
           totalofsnacks=numofi*60;
        }
         
        
        
   }
   catch(Exception e)
   {
         System.out.println("");
       show_message();
       
   
   }
  saveFile1(a);
  return totalofsnacks;
  
}
int curry_dishes()
{
    
    
  try
  {
      int numofi=Integer.parseInt(curryTextField.getText());
    
        if(curryComboBox.getSelectedItem().equals("Chicken curry 180/-"))
        { 
             a="Chicken curry 180/-";
            
            
           totalofcurrydishes=numofi*180;
        }
        else if(curryComboBox.getSelectedItem().equals("Goat Rezala 250/-"))
        { 
          a="Goat Rezala 250/-";
             
           totalofcurrydishes=numofi*250;
        }
        else if(curryComboBox.getSelectedItem().equals("Rohu Fish Curry 220/-"))
        { 
             a="Rohu Fish Curry 220/-";
            ;  
           totalofcurrydishes=numofi*220;
        }
        else if(curryComboBox.getSelectedItem().equals("Hilisha Fish with Mustard 250/-"))
        { 
             a="Hilisha Fish with Mustard 250/-";
              
           totalofcurrydishes=numofi*250;
        }
         else 
        { 
            
            a="Mixed vegetables 80/-";
             
           totalofcurrydishes=numofi*80;
        }
        
        
   }
   catch(Exception e)
   {
       System.out.println("");
        
   }
       saveFile1(a);
  return totalofcurrydishes;
}
int tandooriandgrill()
{
    
  
  try{
      
        numofi=Integer.parseInt(tandooriTextField.getText());
    
     
     
    
        if(tandooriComboBox.getSelectedItem().equals("Chicken Roast 150/-"))
        { 
           a="Chicken Roast 150/-";
            saveFile1(a);   
           totaloftanddori=numofi*150;
        }
        else if(tandooriComboBox.getSelectedItem().equals("Sheek Kabab 150/-"))
        { 
            a="Sheek Kabab 150/-";
            saveFile1(a);  
           totaloftanddori=numofi*150;
        }
        else if(tandooriComboBox.getSelectedItem().equals("Grilled Fish 250/-"))
        { 
           a="Grilled Fish 250/-";
            saveFile1(a);  
           totaloftanddori=numofi*250;
        }
         else 
        { 
            a="Chicken Tikka 150/-";
            saveFile1(a);  
           totaloftanddori=numofi*150;
        }
        
        
   }
   catch(Exception e)
   {
       System.out.println("");
       
   
   }
  return totaloftanddori;
}
int biriyani()
{
    
  
  try{
       
        numofi=Integer.parseInt(biriyaniTextField.getText());
    
      
     
    
        if(biriyaniComboBox.getSelectedItem().equals("Chicken Biriyani 130/-"))
        { 
           String a="Chicken Biriyani 130/-";
            saveFile1(a); 
           totalofbiriyani=numofi*130;
        }
        else if(biriyaniComboBox.getSelectedItem().equals("Goat Biriyani 150/-"))
        { 
            String a="Goat Biriyani 150/-";
            saveFile1(a);
           totalofbiriyani=numofi*150;
        }
         else 
        { 
            String a="Mix vegetable Biriyani 100/-";
            saveFile1(a);
           totalofbiriyani=numofi*100;
        }
        
      
        
        
   }
   catch(Exception e)
   {
       System.out.println("");
       
   }
  return totalofbiriyani;
}
int beverages()
{
  try{
      
        numofi=Integer.parseInt(beveragesTextField.getText());
     
     
    
        if(beveragesComboBox.getSelectedItem().equals("Soft drinks 70/-"))
        { 
            a="Soft drinks 70/-";
            saveFile1(a);
           totalofbeverages=numofi*70;
        }
        else if(beveragesComboBox.getSelectedItem().equals("Ice Tea 80/-"))
        { 
          a="Ice Tea 80/-";
            saveFile1(a); 
           totalofbeverages=numofi*80;
        }
        else if(beveragesComboBox.getSelectedItem().equals("Coffee 85/-"))
        { 
           a="Coffee 85/-";
            saveFile1(a);
           totalofbeverages=numofi*85;
        }
        else if(beveragesComboBox.getSelectedItem().equals("Spicy Tea 80/-"))
        { 
           a="Spicy Tea 80/-";
            saveFile1(a); 
           totalofbeverages=numofi*80;
        }
         else 
        { 
             a="Lassi 80/-";
            saveFile1(a);
           totalofbeverages=numofi*80;
        }
        
        
   }
   catch(Exception e)
   {
       System.out.println("");
       
   
   }
  return totalofbeverages;

}



    /**
     * Creates new form food_menu
     */
    public food_menu() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        biriyaniComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        snacksComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        curryComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tandooriComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        beveragesComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalcostTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        snacksTextField = new javax.swing.JTextField();
        tandooriTextField = new javax.swing.JTextField();
        biriyaniTextField = new javax.swing.JTextField();
        beveragesTextField = new javax.swing.JTextField();
        curryTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezwan\\Desktop\\rony1.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("please select what kind of food you want to have ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 350, 17);

        biriyaniComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        biriyaniComboBox.setForeground(new java.awt.Color(255, 51, 0));
        biriyaniComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Biryani Dishes", "Chicken Biriyani 130/-", "Goat Biriyani 150/-", "Mix vegetable Biriyani 100/-" }));
        getContentPane().add(biriyaniComboBox);
        biriyaniComboBox.setBounds(10, 390, 221, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("SNACKS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Curry Dishes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 170, 90, 17);

        snacksComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        snacksComboBox.setForeground(new java.awt.Color(255, 0, 0));
        snacksComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Snacks", "Vegetable samosa 30/-", "Meat samosa 40/-", "vegetable chop 30/-", "Fish chop 50/-", "Chicken roll 60/-" }));
        snacksComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacksComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(snacksComboBox);
        snacksComboBox.setBounds(10, 120, 189, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 194, 0, 0);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Tandoori and Grill");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 250, 130, 30);

        curryComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        curryComboBox.setForeground(new java.awt.Color(255, 51, 0));
        curryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Curry Dishes", "Chicken curry 180/-", "Goat Rezala 250/-", "Rohu Fish Curry 220/-", "Hilisha Fish with Mustard 250/-", "Mixed vegetables 80/-" }));
        curryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curryComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(curryComboBox);
        curryComboBox.setBounds(10, 200, 171, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Biriyani Dishes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 350, 110, 17);

        tandooriComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tandooriComboBox.setForeground(new java.awt.Color(255, 51, 0));
        tandooriComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Tandoori & Grill", "Chicken Roast 150/-", "Sheek Kabab 150/-", "Grilled Fish 250/-", "Chicken Tikka 150/-" }));
        getContentPane().add(tandooriComboBox);
        tandooriComboBox.setBounds(10, 300, 179, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Beverages");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 440, 91, 30);

        beveragesComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        beveragesComboBox.setForeground(new java.awt.Color(255, 51, 0));
        beveragesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Beverages", "Soft drinks 70/-", "Ice Tea 80/-", "Coffee 85/-", "Spicy Tea 80/-", "Lassi 80/-" }));
        beveragesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beveragesComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(beveragesComboBox);
        beveragesComboBox.setBounds(10, 490, 200, 28);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(282, 50, 0, 0);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Total Cost");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(830, 80, 74, 25);

        totalcostTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcostTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalcostTextField);
        totalcostTextField.setBounds(950, 80, 144, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("No of Item:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 90, 90, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("No of Item:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 160, 90, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("No of Item:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 250, 90, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("No of Item:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 350, 90, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("No of Item:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 440, 90, 17);

        snacksTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacksTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(snacksTextField);
        snacksTextField.setBounds(470, 120, 101, 30);
        getContentPane().add(tandooriTextField);
        tandooriTextField.setBounds(470, 290, 101, 30);
        getContentPane().add(biriyaniTextField);
        biriyaniTextField.setBounds(470, 390, 101, 30);
        getContentPane().add(beveragesTextField);
        beveragesTextField.setBounds(470, 490, 101, 40);

        curryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curryTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(curryTextField);
        curryTextField.setBounds(470, 200, 101, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Total cost");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(990, 130, 101, 40);

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(1010, 280, 80, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Order");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1010, 200, 80, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LOVE AND FOOD ARE MEANT FOR SHARING NOT FOR WASTING");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(360, -110, 610, 250);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezwan\\Desktop\\fast-food.jpg")); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 1400, 730);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 360, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void curryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curryTextFieldActionPerformed

    private void snacksComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacksComboBoxActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_snacksComboBoxActionPerformed

    private void curryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curryComboBoxActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_curryComboBoxActionPerformed

    private void snacksTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacksTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snacksTextFieldActionPerformed

    private void totalcostTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcostTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcostTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        int a=Integer.parseInt(String.valueOf(snacks()+curry_dishes()+tandooriandgrill()+biriyani()+beverages()));
       
        totalcostTextField.setText("total cost is "+String.valueOf(snacks()+curry_dishes()+tandooriandgrill()+biriyani()+beverages()));
        saveFile(a);
        }
        catch(Exception e)
        {
          show_message();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
     private void saveFile1(String menu)
    {
        try{
            FileWriter f= new FileWriter("receit.txt", true);
            f.write( String.valueOf("your selected item is:"+menu));
            f.write("\n");
            
            f.close();
            
        }
        catch(Exception e){}
    } 
     
    private void saveFile(int totalcost)
    {
        try{
            FileWriter fw = new FileWriter("receit.txt", true);
            fw.write( String.valueOf("totalcost:"+totalcost));
            fw.write("\r\n");
            
            fw.close();
            
        }
        catch(Exception e){}
    }
     
    private void beveragesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beveragesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beveragesComboBoxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        receitJFrame r=new receitJFrame();
        r.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    snacksTextField.setText("");
    curryTextField.setText("");
    tandooriTextField.setText("");
    biriyaniTextField.setText("");
    beveragesTextField.setText("");
    totalcostTextField.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(food_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(food_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(food_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(food_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new food_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> beveragesComboBox;
    private javax.swing.JTextField beveragesTextField;
    private javax.swing.JComboBox<String> biriyaniComboBox;
    private javax.swing.JTextField biriyaniTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> curryComboBox;
    private javax.swing.JTextField curryTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> snacksComboBox;
    private javax.swing.JTextField snacksTextField;
    private javax.swing.JComboBox<String> tandooriComboBox;
    private javax.swing.JTextField tandooriTextField;
    private javax.swing.JTextField totalcostTextField;
    // End of variables declaration//GEN-END:variables
}
