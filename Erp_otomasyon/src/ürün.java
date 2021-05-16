import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class �r�n{
  
public void Show() {
	
    
            Frame �r�n = new Frame();
            �r�n.setTitle(" �r�n Olusturma ");
	        �r�n.setSize(435,600);
	        	     		     		     	     	    
	        Label label = new Label (" �r�nler");
	        label.setBounds(200, 50, 200, 50);
	        �r�n.add(label);
	
	        Label  label2 = new  Label (" �r�n Numaras� : ");
            label2.setBounds(30, 100, 100, 50);
            �r�n.add(label2);
 	   	     	   
            TextField txtAd1 = new TextField(); 
            txtAd1.setText(" ");
            txtAd1.setBounds(200, 110, 200, 25); 
            �r�n.add(txtAd1);
 	
            Label  label3 = new  Label (" �r�n Ad� : ");
 	        label3.setBounds(30, 150, 100, 50);
 	        �r�n.add(label3);
 	   	     	   
 	        TextField txtAd2 = new  TextField(); 
 	        txtAd2.setText(" ");
 	        txtAd2.setBounds(200, 160, 200, 25); 
 	        �r�n.add(txtAd2);
 	
 	        Label  label4 = new Label (" �r�n Adeti : ");
 	        label4.setBounds(30, 200, 100, 50);
 	        �r�n.add(label4);
 	   	     	   
 	        TextField txtAd3 = new  TextField(); 
 	        txtAd3.setText(" ");
 	        txtAd3.setBounds(200, 210, 200, 25); 
 	        �r�n.add(txtAd3);
 	
 	        Label  label5 = new Label (" �r�n Fiyat� : ");
 	        label5.setBounds(30, 250, 100, 50);
 	        �r�n.add(label5);
 	   	     	   
 	        TextField txtAd4 = new  TextField(); 
 	        txtAd4.setText(" ");
 	        txtAd4.setBounds(200, 260, 200, 25); 
 	        �r�n.add(txtAd4);
 	
 	        Button button1 = new Button("�r�n� Ekle");
 	        button1.setBounds(40,310,100,30);
 	        �r�n.add(button1);
 	        
 	        Button button2 = new Button("�r�n� Sil");
 	        button2.setBounds(165,310,100,30);
 	        �r�n.add(button2);

 	        Button button3 = new Button("�r�n� G�ncelle");
	        button3.setBounds(290,310,100,30);
	        �r�n.add(button3);
 	
	        Button button4 = new Button("�r�nleri Listele");
 	        button4.setBounds(40,360,350,30);
 	        �r�n.add(button4);
 	            
 	        
 	        DefaultTableModel  dtm = new DefaultTableModel(); 
			JTable table = new JTable();
			table.setBounds(10, 800, 100, 100);
			�r�n.add(table);
			�r�n.setVisible(true); 
			table.setModel(dtm);
			dtm.setColumnIdentifiers(new String [] {"�id","Ad�","Adet","Birim_fiyat�"});
 			 
  	       button1.addActionListener((ActionListener) new ActionListener() {
 	   		   public void  actionPerformed(ActionEvent e) {
	   			
 	   			if(txtAd1.getText().equals("") || txtAd2.getText().equals("") || txtAd3.getText().equals("") ||
 	   				txtAd1.getText().equals("")) {
 	   			  JOptionPane.showMessageDialog(null," Bos Gecilemez Veya Eksik Bilgiler Girildi"); 	   			  
 	   			}
 	   			else {
 	   			  dtm.addRow(new String [] {txtAd1.getText(),txtAd2.getText(),txtAd3.getText(),txtAd4.getText()}); 	   			
 	   			  txtAd1.setText("");
 	   			  txtAd2.setText("");
 	   			  txtAd3.setText("");
 	   			  txtAd4.setText("");	   			  
 	   			}	  
 	   		   }
           });
  	       
  	       
	       button2.addActionListener((ActionListener) new ActionListener() {
 	   		   public void  actionPerformed(ActionEvent e) {
               int i = table.getSelectedRow(); 
               
               if(i>=0) {
       	   	   dtm.removeRow(table.getSelectedRow()); 
       	       JOptionPane.showMessageDialog(null," Veri Silindi ");       	       
               }
               else{
         	       JOptionPane.showMessageDialog(null," Veri Secilmedi ");    
                }   	      
       	   	   }
	         });
	       
	       table.addMouseListener(new MouseAdapter() {
	    	   public void  mouseClicked(MouseEvent arg0) {
	    		   int i = table.getSelectedRow();
	    		   txtAd1.setText(dtm.getValueAt(i, 0).toString());
	    		   txtAd2.setText(dtm.getValueAt(i, 1).toString());
	    		   txtAd3.setText(dtm.getValueAt(i, 2).toString());
	    		   txtAd4.setText(dtm.getValueAt(i, 3).toString());
	       } 
            });
	       
	       button3.addActionListener((ActionListener) new ActionListener() {
 	   		   public void  actionPerformed(ActionEvent e) {

 	   		   int i = table.getSelectedRow();
 	   		    if(i>=0) {
       	   	   dtm.setValueAt(txtAd1.getText(),i,0);
       	       dtm.setValueAt(txtAd2.getText(),i,1);
       	       dtm.setValueAt(txtAd3.getText(),i,2);
       	       dtm.setValueAt(txtAd4.getText(),i,3);
       	       JOptionPane.showMessageDialog(null," Veri G�ncellendi ");  
 	   		    }  
 	   		   else{
        	       JOptionPane.showMessageDialog(null," Veri Secilmedi ");    
                }  	   		    
	 	   	    }
	           });
	       
	     	button4.addActionListener((ActionListener) new ActionListener() {
		   		   public void  actionPerformed(ActionEvent e) {
		   			   
		   	Frame list = new Frame();
		    list.setTitle(" �r�n Ekleme ");
		    list.setSize(500,600);
		    	    		    	    		   
		    String[] columns=new String[]
		    		{"�id","Ad�","Adet","Birim_fiyat�"};  
		    		    
		    String[][] cells=new String[][]{
		    		 {"1","Excalibur G770","1","7800 Tl"},
		    		 {"2","Siyah Erkek Oversize Bisiklet Yaka Bask�l�","2","50 Tl"},
		    		 {"3","LEGEND ESSENTIAL 2 Siyah","1","530 TL"},
		    		 {"4","Aqua Di Polo Unisex Kol Saati APL12C195H02","2","70 Tl"},
		    		 {"5","Pars Afrodizyak Parf�m 50ml Erkek Aphrodisiac","1","100 Tl"},
		    		 {"6","Xiaomi Mi 10T Pro 256 GB Cosmic Black","1","6500 Tl"}};
		    		    	 
		    JTable table=new JTable(cells,columns);
		    table.setBounds(50, 500, 100, 0); 
		    list.add(table);
			list.add(new JScrollPane(table));
		    list.setVisible(true);		    
		    		 
		    list.setLayout(null);
		    list.setLocationRelativeTo(null);
		    list.setVisible(true);
		      		    
		    list.addWindowListener((WindowListener) new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		    super.windowClosing(e);
		    list.dispose(); //System.exit(0);
		      		  		
		      		  			    		  }		           
		      			   	   		     	});               
		      			   	   		       }
		      			   	   		     }); // �r�n ekleme Ekran�
	     		     	   		        
	        �r�n.setLayout(null);
	        �r�n.setLocationRelativeTo(null);
	        �r�n.setVisible(true);
	        	     		     		     	 	        
	�r�n.addWindowListener((WindowListener) new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	super.windowClosing(e);
	�r�n.dispose(); //System.exit(0);
	   		     		     		   }		           
	   		     	                });               
	   		     		     	   }
                                  }



