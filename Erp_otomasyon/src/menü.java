import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;

public class menü {
	
	public static void main(String[] args) {
	
		    Frame ana = new Frame();
	        ana.setTitle(" Anasayfa ");
	        ana.setSize(400,200);
	        
	        Label label = new Label("ERP OTOMASYON");
	        label.setBounds(150, 50, 200, 50);
	        ana.add(label);
	        
	        Button button = new Button("Otomasyona Giris");
	        button.setBounds(75, 110,250, 50);
	        ana.add(button);
	       
	        ana.setLayout(null);
	        ana.setLocationRelativeTo(null);
	        ana.setVisible(true);
	        
	        	     
	        // Giris Ekraný
	        
	                   
	 button.addActionListener((ActionListener) new ActionListener() {
	 public void  actionPerformed(ActionEvent e) {
	     
	     	 Frame menü = new Frame();
	     	 menü.setTitle(" Menü ");
	     	 menü.setSize(400,380);
	     	     	    
	     	 Label label = new Label(" Menü'ye Hosgeldiniz ");
	     	 label.setBounds(150, 50, 200, 50);
	     	 menü.add(label);
	     	      	     	      
	     	 Button button1 = new Button("Üye ol");
	     	 button1.setBounds(75, 120,250, 50);
	     	 menü.add(button1);
	     	  	   
	     	 button1.addActionListener((ActionListener) new ActionListener() {
	     		   public void  actionPerformed(ActionEvent e) {
	     			   
	     			 kaydol yeniform = new kaydol(); 
	     			 yeniform.Show();
	     		 	   	   
	     	     }
	     	   });        //üye kaydol ekranýna gider
	     	 	    
	     	 
    	     Button button2 = new Button("Üye Giris");
	     	 button2.setBounds(75, 200, 250, 50);
	     	 menü.add(button2);
	     	 	    
	     	 button2.addActionListener((ActionListener) new ActionListener() {
	     		   public void  actionPerformed(ActionEvent e) {
	     			   
	     			 üye_giris yeniform = new üye_giris(); 
	     			 yeniform.Show();
	     			   	   
	     	     }
	     	   });       //üye giris ekranýna gider
	     	 
	         Button button3 = new Button("Ürün Ekleme");
	     	 button3.setBounds(75, 280, 250, 50);
	     	 menü.add(button3);	  
	     	 
	     	 button3.addActionListener((ActionListener) new ActionListener() {
	     		   public void  actionPerformed(ActionEvent e) {
	     			   
	     			 ürün yeniform = new ürün(); 
	     			 yeniform.Show();
	     			   	   
	     	     }
	     	   });     //ürün ekleme ekranýna gider
	     	   

	     	  menü.setLayout(null);
	     	  menü.setLocationRelativeTo(null);
	     	  menü.setVisible(true);    
	     	  
	     	  	     	
	     	          // Menü Ekraný
	     	  
	     	    	     	 	     	     	 	        
     menü.addWindowListener((WindowListener) new WindowAdapter() {
	 public void windowClosing(WindowEvent e) {
	 super.windowClosing(e);
	 menü.dispose(); //System.exit(0);
	         	 
	     		     }
	               });               
	        	  }
	            });  // menü ekraný kapatma kodu
	  
	 
	 ana.addWindowListener((WindowListener) new WindowAdapter() {
	 public void windowClosing(WindowEvent e) {
	 super.windowClosing(e);
	 ana.dispose(); //System.exit(0);
	                
	         }          
           });       
          }
         }   //ana ekraný kapatma kodu,



