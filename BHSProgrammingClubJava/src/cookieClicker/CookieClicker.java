package cookieClicker;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class CookieClicker {  
	public static void main(String[] args) {
		cookieClicker();
	}
	public static void cookieClicker() {
		final int width = 500;
		final int height = 500;
		
		JFrame f=new JFrame();//creating instance of JFrame  
        JTextField t1;
        t1 = new JTextField("0");
        t1.setBounds(100,100,50, 40);
		JButton b=new JButton("cookie");//creating instance of JButton  
		b.setBounds(width/2-100,width/2-40,100, 40);//x axis, y axis, width, height  
		f.add(b);//adding button in JFrame  
        f.add(t1);
		f.setSize(width,height);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cookie = Integer.parseInt(t1.getText());
				System.out.println(cookie);
				cookie++;
				t1.setText(cookie + "");
				System.out.println("cookie +1");
			}
		});
	}
}  