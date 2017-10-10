import java.awt.event.*;
import javax.swing.*; 


public class FirstSwingExample {  
public static void main(String[] args) { 
	
JFrame f=new JFrame();         
JButton b=new JButton("Kliknij");  
final JTextField tf=new JTextField(); 

JLabel l1,l2;
l1=new JLabel("co to jest ?");
l1.setBounds(150,20,100,30);
l2=new JLabel("2x co to jest");
l2.setBounds(150,70,100,30);

tf.setBounds(110,50, 150,20);

b.setBounds(130,100,100, 40);  
          
f.add(b);f.add(tf); f.add(l1);f.add(l2);

f.setSize(300, 300);
f.setSize(400,300);  
f.setLayout(null);  
f.setVisible(true); 



b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){        
        }  
    });


}  
}
