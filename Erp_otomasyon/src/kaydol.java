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
		
  	   Frame kayýt = new Frame();
  	   kayýt.setTitle(" Üye Ol ");
  	   kayýt.setSize(400,550);
  		     	     	    
  	   Label label1 = new Label(" Kayýt Olunuz ");
  	   label1.setBounds(150, 50, 200, 50);
  	   kayýt.add(label1);
  	   
  	   Label label2 = new Label(" Tc No : ");
  	   label2.setBounds(50, 110, 100, 50);
  	   kayýt.add(label2);
  	   	     	   
  	   TextField txtAd1 = new TextField(); 
  	   txtAd1.setText(" ");
  	   txtAd1.setBounds(150, 120, 200, 25); 
  	   kayýt.add(txtAd1);
  	   
  	   Label label3 = new Label(" Adý Soyadý : ");
  	   label3.setBounds(50, 150, 100, 50);
  	   kayýt.add(label3);
  	   	     	   
  	   TextField txtAd2 = new TextField(); 
  	   txtAd2.setText(" ");
  	   txtAd2.setBounds(150, 160, 200, 25); 
  	   kayýt.add(txtAd2);
  	   
 	   Label label4 = new Label(" E-posta : ");
  	   label4.setBounds(50, 190, 100, 50);
  	   kayýt.add(label4);
  	   	     	   
  	   TextField txtAd3 = new TextField(); 
  	   txtAd3.setText(" ");
  	   txtAd3.setBounds(150, 200, 200, 25); 
  	   kayýt.add(txtAd3);
  	   
  	   Label label5 = new Label("Ýl Ýlce Adres : ");
  	   label5.setBounds(50, 230, 100, 50);
  	   kayýt.add(label5);
  	   	     	   
  	   TextArea txtAd4 = new TextArea(); 
  	   txtAd4.setText(" ");
  	   txtAd4.setBounds(150, 240, 200, 100); 
  	   kayýt.add(txtAd4);
  	   
  	   Label label6 = new Label("Sifre : ");
  	   label6.setBounds(50, 350, 100, 50);
  	   kayýt.add(label6);
  	   	     	   
  	   TextField txtAd5 = new TextField(); 
  	   txtAd5.setText(" ");
  	   txtAd5.setBounds(150, 360, 200, 25); 
  	   kayýt.add(txtAd5);
  	   	  
  	   Button button1 = new Button("Kayýt Ol");
	   button1.setBounds(80, 440,100, 50);
	   kayýt.add(button1);
	   	       	     	   
	   Button button2 = new Button("Giris Yap");
	   button2.setBounds(220, 440,100, 50);
	   kayýt.add(button2);
	       
	   button2.addActionListener((ActionListener) new ActionListener() {
   		   public void  actionPerformed(ActionEvent e) {
   			   
   			 üye_giris yeniform = new üye_giris(); 
   			 yeniform.Show();
   			   	   
   	      }
   	     });   //üye giris ekranýna gider
	       	  
	  	 
	    kayýt.setLayout(null);
	    kayýt.setLocationRelativeTo(null);
	    kayýt.setVisible(true);
	    
	      		     	 	        
    kayýt.addWindowListener((WindowListener) new WindowAdapter() {
  	public void windowClosing(WindowEvent e) {
  	super.windowClosing(e);
  	kayýt.dispose(); //System.exit(0);
	   	 
	   	 }   				           
	   });               
	  }
	 } // kayýt ekranýný kapatma 
  

	

