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

public class men� {
	
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
	        
	        	     
	        // Giris Ekran�
	        
	                   
	 button.addActionListener((ActionListener) new ActionListener() {
	 public void  actionPerformed(ActionEvent e) {
	     
	     	 Frame men� = new Frame();
	     	 men�.setTitle(" Men� ");
	     	 men�.setSize(400,380);
	     	     	    
	     	 Label label = new Label(" Men�'ye Hosgeldiniz ");
	     	 label.setBounds(150, 50, 200, 50);
	     	 men�.add(label);
	     	      	     	      
	     	 Button button1 = new Button("�ye ol");
	     	 button1.setBounds(75, 120,250, 50);
	     	 men�.add(button1);
	     	  	   
	     	 button1.addActionListener((ActionListener) new ActionListener() {
	     		   public void  actionPerformed(ActionEvent e) {
	     			   
	     			 kaydol yeniform = new kaydol(); 
	     			 yeniform.Show();
	     		 	   	   
	     	     }
	     	   });        //�ye kaydol ekran�na gider
	     	 	    
	     	 
    	     Button button2 = new Button("�ye Giris");
	     	 button2.setBounds(75, 200, 250, 50);
	     	 men�.add(button2);
	     	 	    
	     	 button2.addActionListener((ActionListener) new ActionListener() {
	     		   public void  actionPerformed(ActionEvent e) {
	     			   
	     			 �ye_giris yeniform = new �ye_giris(); 
	     			 yeniform.Show();
	     			   	   
	     	     }
	     	   });       //�ye giris ekran�na gider
	     	 
	         Button button3 = new Button("�r�n Ekleme");
	     	 button3.setBounds(75, 280, 250, 50);
	     	 men�.add(button3);	  
	     	 
	     	 button3.addActionListener((ActionListener) new ActionListener() {
	     		   public void  actionPerformed(ActionEvent e) {
	     			   
	     			 �r�n yeniform = new �r�n(); 
	     			 yeniform.Show();
	     			   	   
	     	     }
	     	   });     //�r�n ekleme ekran�na gider
	     	   

	     	  men�.setLayout(null);
	     	  men�.setLocationRelativeTo(null);
	     	  men�.setVisible(true);    
	     	  
	     	  	     	
	     	          // Men� Ekran�
	     	  
	     	    	     	 	     	     	 	        
     men�.addWindowListener((WindowListener) new WindowAdapter() {
	 public void windowClosing(WindowEvent e) {
	 super.windowClosing(e);
	 men�.dispose(); //System.exit(0);
	         	 
	     		     }
	               });               
	        	  }
	            });  // men� ekran� kapatma kodu
	  
	 
	 ana.addWindowListener((WindowListener) new WindowAdapter() {
	 public void windowClosing(WindowEvent e) {
	 super.windowClosing(e);
	 ana.dispose(); //System.exit(0);
	                
	         }          
           });       
          }
         }   //ana ekran� kapatma kodu,



