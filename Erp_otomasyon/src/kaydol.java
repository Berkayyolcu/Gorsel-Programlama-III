import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class kaydol {
	
	public void Show() {
		
  	   Frame kay�t = new Frame();
  	   kay�t.setTitle(" �ye Ol ");
  	   kay�t.setSize(400,550);
  		     	     	    
  	   Label label1 = new Label(" Kay�t Olunuz ");
  	   label1.setBounds(150, 50, 200, 50);
  	   kay�t.add(label1);
  	   
  	   Label label2 = new Label(" Tc No : ");
  	   label2.setBounds(50, 110, 100, 50);
  	   kay�t.add(label2);
  	   	     	   
  	   TextField txtAd1 = new TextField(); 
  	   txtAd1.setText(" ");
  	   txtAd1.setBounds(150, 120, 200, 25); 
  	   kay�t.add(txtAd1);
  	   
  	   Label label3 = new Label(" Ad� Soyad� : ");
  	   label3.setBounds(50, 150, 100, 50);
  	   kay�t.add(label3);
  	   	     	   
  	   TextField txtAd2 = new TextField(); 
  	   txtAd2.setText(" ");
  	   txtAd2.setBounds(150, 160, 200, 25); 
  	   kay�t.add(txtAd2);
  	   
 	   Label label4 = new Label(" E-posta : ");
  	   label4.setBounds(50, 190, 100, 50);
  	   kay�t.add(label4);
  	   	     	   
  	   TextField txtAd3 = new TextField(); 
  	   txtAd3.setText(" ");
  	   txtAd3.setBounds(150, 200, 200, 25); 
  	   kay�t.add(txtAd3);
  	   
  	   Label label5 = new Label("�l �lce Adres : ");
  	   label5.setBounds(50, 230, 100, 50);
  	   kay�t.add(label5);
  	   	     	   
  	   TextArea txtAd4 = new TextArea(); 
  	   txtAd4.setText(" ");
  	   txtAd4.setBounds(150, 240, 200, 100); 
  	   kay�t.add(txtAd4);
  	   
  	   Label label6 = new Label("Sifre : ");
  	   label6.setBounds(50, 350, 100, 50);
  	   kay�t.add(label6);
  	   	     	   
  	   TextField txtAd5 = new TextField(); 
  	   txtAd5.setText(" ");
  	   txtAd5.setBounds(150, 360, 200, 25); 
  	   kay�t.add(txtAd5);
  	   	  
  	   Button button1 = new Button("Kay�t Ol");
	   button1.setBounds(80, 440,100, 50);
	   kay�t.add(button1);
	   	       	     	   
	   Button button2 = new Button("Giris Yap");
	   button2.setBounds(220, 440,100, 50);
	   kay�t.add(button2);
	       
	   button2.addActionListener((ActionListener) new ActionListener() {
   		   public void  actionPerformed(ActionEvent e) {
   			   
   			 �ye_giris yeniform = new �ye_giris(); 
   			 yeniform.Show();
   			   	   
   	      }
   	     });   //�ye giris ekran�na gider
	       	  
	  	 
	    kay�t.setLayout(null);
	    kay�t.setLocationRelativeTo(null);
	    kay�t.setVisible(true);
	    
	      		     	 	        
    kay�t.addWindowListener((WindowListener) new WindowAdapter() {
  	public void windowClosing(WindowEvent e) {
  	super.windowClosing(e);
  	kay�t.dispose(); //System.exit(0);
	   	 
	   	 }   				           
	   });               
	  }
	 } // kay�t ekran�n� kapatma 
  

	

