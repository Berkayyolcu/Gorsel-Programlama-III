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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class üye_giris {

	public void  Show() {
		
	       Frame giris = new Frame();
   	       giris.setTitle(" Üye Giris ");
   	       giris.setSize(400,350);
   		     	     	    
   	       Label label1 = new Label(" Giris Yapýnýz ");
   	       label1.setBounds(150, 50, 200, 50);
   	       giris.add(label1);
   	    
   	       Label label2 = new Label(" Adýnýz Soyadýnýz : ");
   	       label2.setBounds(30, 110, 100, 50);
   	       giris.add(label2);
   	   	     	   
   	       TextField txtAd1 = new TextField(); 
   	       txtAd1.setText(" ");
   	       txtAd1.setBounds(150, 120, 200, 25); 
   	       giris.add(txtAd1);
   	   
   	       Label label3 = new Label(" Sifre : ");
   	       label3.setBounds(50, 170, 100, 50);
   	       giris.add(label3);
   	   	     	   
   	       TextField txtAd2 = new TextField(); 
   	       txtAd2.setText(" ");
   	       txtAd2.setBounds(150, 180, 200, 25); 
   	       giris.add(txtAd2);
   	     	   
   	       Button button1 = new Button("Giris Yap");
   	       button1.setBounds(80, 250,100, 50);
   	       giris.add(button1);
   	       
   	button1.addActionListener((ActionListener) new ActionListener() {
	   	   public void  actionPerformed(ActionEvent e) {
	   	   		     		     		     
	        Frame ürün = new Frame();
  	        ürün.setTitle(" Ürün Siparis ");
  		    ürün.setSize(435,600);
  		     		     		     	     	    
  		    Label label = new Label(" Ürünler");
  		    label.setBounds(200, 50, 200, 50);
  		    ürün.add(label);
  		
  		    Label label2 = new Label(" Ürün Numarasý : ");
	        label2.setBounds(30, 100, 100, 50);
	        ürün.add(label2);
	     	   	     	   
	        TextField txtAd1 = new TextField(); 
	        txtAd1.setText(" ");
	        txtAd1.setBounds(200, 110, 200, 25); 
	        ürün.add(txtAd1);
	     	
	        Label label3 = new Label(" Ürün Adý : ");
	     	label3.setBounds(30, 150, 100, 50);
	     	ürün.add(label3);
	     	   	     	   
	     	TextField txtAd2 = new TextField(); 
	     	txtAd2.setText(" ");
	     	txtAd2.setBounds(200, 160, 200, 25); 
	     	ürün.add(txtAd2);
	     	
	     	Label label4 = new Label(" Ürün Adeti : ");
	     	label4.setBounds(30, 200, 100, 50);
	     	ürün.add(label4);
	     	   	     	   
	     	TextField txtAd3 = new TextField(); 
	     	txtAd3.setText(" ");
	     	txtAd3.setBounds(200, 210, 200, 25); 
	     	ürün.add(txtAd3);
	     	
	     	Label label5 = new Label(" Ürün Fiyatý : ");
	     	label5.setBounds(30, 250, 100, 50);
	     	ürün.add(label5);
	     	   	     	   
	     	TextField txtAd4 = new TextField(); 
	     	txtAd4.setText(" ");
	     	txtAd4.setBounds(200, 260, 200, 25); 
	     	ürün.add(txtAd4);
	     		     	
	     	Button button1 = new Button("Satýn Al");
	     	button1.setBounds(40,310,100,30);
	     	ürün.add(button1);
	     	
	     	Button button2 = new Button("Ürünü Sil");
	     	button2.setBounds(165,310,100,30);
	     	ürün.add(button2);
	     	
	    	Button button3 = new Button("Ürünü Güncelle");
	     	button3.setBounds(290,310,100,30);
	     	ürün.add(button3);
	     	
	     	Button button4 = new Button("Fatura Olustur");
	     	button4.setBounds(40,360,350,30);
	     	ürün.add(button4);
	     	
            DefaultTableModel  dtm = new DefaultTableModel(); 
 			    JTable table =new JTable();
 			    table.setBounds(0, 1000, 200, 200); 
 			    ürün.add(table);
 			    ürün.setVisible(true); 
 			    table.setModel(dtm);
 			    dtm.setColumnIdentifiers(new String  [] {"sid","Siparis_adý","Siparis_adet","Birim_fiyatý"});

	    
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
 	       	       JOptionPane.showMessageDialog(null," Veri Güncellendi ");  
 	 	   		    }  
 	 	   		   else{
 	        	       JOptionPane.showMessageDialog(null," Veri Secilmedi ");    
 	                }  	   		    
 		 	   	    }
 		           });
	     	
	     	
	     	 button4.addActionListener((ActionListener) new ActionListener() {
	   		   public void  actionPerformed(ActionEvent e) {
	   			   
	   			    Frame list = new Frame();
	    	        list.setTitle(" Listeleme ");
	    		    list.setSize(500,600);
	    		   	    	    		    	    		   
	    		    String[] columns=new String[]	    		  
	    		    {"sid","Siparis_adý","Siparis_adet","Birim_fiyatý","kid","mid"};  
	    		    
	    		    String[][] cells=new String[][]{
	    		    	{"1","Excalibur G770","1","7800 Tl","1","1"},
	    		    	{"2","Siyah Erkek Oversize Bisiklet Yaka Baskýlý","2","50 Tl","2","2"},
	    		    	{"3","LEGEND ESSENTIAL 2 Siyah","1","530 TL","3","3"},
	    		    	{"4","Aqua Di Polo Unisex Kol Saati APL12C195H02","2","70 Tl","4","4"},
	    		    	{"5","Pars Afrodizyak Parfüm 50ml Erkek Aphrodisiac","1","100 Tl","5","5"},
	    		    	{"6","Xiaomi Mi 10T Pro 256 GB Cosmic Black","1","6500 Tl","6","6"}};
	    		    	 
	    		    JTable table=new JTable(cells,columns);
	    			table.setBounds(50, 200, 400, 100); 
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
	      			   	   		     }); // fatura ekraný

	     	 
  		    ürün.setLayout(null);
  		    ürün.setLocationRelativeTo(null);
  		    ürün.setVisible(true);
  		    
  		     		     		     	 	        
  		ürün.addWindowListener((WindowListener) new WindowAdapter() {
  		public void windowClosing(WindowEvent e) {
  		super.windowClosing(e);
  		ürün.dispose(); //System.exit(0);
	   	   		     		     		   }		           
	   	   		     	                });               
	   	   		     		     	   }
	   	   		     		     	 }); // ürün ekraný 
   	
   	     	 
   	   Button button2 = new Button("Kayýt Ol");
   	   button2.setBounds(220, 250,100, 50);
   	   giris.add(button2);
   	   
   	 button2.addActionListener((ActionListener) new ActionListener() {
 		   public void  actionPerformed(ActionEvent e) {
 			   
 			 kaydol yeniform = new kaydol(); 
 			 yeniform.Show();
 			   	   
 	      }
 	     });  //üye kaydol ekranýna gider
   	 
   	      	   
   	   giris.setLayout(null);
   	   giris.setLocationRelativeTo(null);
   	   giris.setVisible(true);
	   	   	 	   
	giris.addWindowListener((WindowListener) new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	super.windowClosing(e);
	giris.dispose(); //System.exit(0);
	   	   
	   		}		           
	      });               
	     }
	    } // giris ekranýný kapatma 
   	 	



