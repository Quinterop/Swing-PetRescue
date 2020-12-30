import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class Menu extends JFrame {
	String[] noms;
	private final JPanel panel = new JPanel();
	private final JButton slot1 = new JButton();
	private final JButton slot2 = new JButton();
	private final JButton slot3 = new JButton();
	private final JButton slot4 = new JButton();
	private final JButton slot5 = new JButton();
	

	//utiliser imageicon si envie d'image sur buttons

	Menu() {
		JButton[] buttons = new JButton[5];
		buttons[0]=slot1;
		buttons[1]=slot2;
		buttons[2]=slot3;
		buttons[3]=slot4;
		buttons[4]=slot5;
		
		for(int i=0;i<5;i++) {
			if(noms[i]==null)
				buttons[i].setText("nouveau nom");
			else
				buttons[i].setText(noms[i]);
		}
		
		setResizable(false);
		setTitle("Choisissez votre nom ");
		getContentPane().setForeground(Color.YELLOW);
		setForeground(Color.MAGENTA);
		setBackground(new Color(204, 204, 51));
		// Image img = Toolkit.getDefaultToolkit().getImage("E:\\rahul.jpg");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(255, 160, 122), new Color(153, 51, 51), new Color(102, 51, 0)));
		
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		slot1.setFont(new Font("Ravie", Font.PLAIN, 16));
		slot1.setBounds(23, 148, 142, 115);
		slot1.setForeground(Color.BLUE);
		slot1.setBackground(Color.BLUE);
		
		panel.add(slot1);
		slot2.setBounds(175, 148, 69, 74);
		slot2.setForeground(Color.RED);
		slot2.setBackground(Color.RED);
		
		panel.add(slot2);
		slot3.setBounds(254, 148, 77, 74);
		slot3.setForeground(Color.GREEN);
		slot3.setBackground(Color.GREEN);
		
		panel.add(slot3);
		slot4.setBounds(341, 148, 91, 86);
		slot4.setForeground(Color.ORANGE);
		slot4.setBackground(Color.ORANGE);
		slot4.setMnemonic('f');
		
		panel.add(slot4);
		slot5.setIcon(new ImageIcon("C:\\Users\\Alass\\Desktop\\584856b4e0bb315b0f7675ac.png"));
		slot5.setBounds(442, 160, 91, 74);
		slot5.setForeground(Color.MAGENTA);
		slot5.setBackground(Color.MAGENTA);
		
		panel.add(slot5);
		setSize(584, 510);
		
		
		
		
		
		slot1.addActionListener((ActionEvent e) -> {
			if (noms[0] == null) 
				scan(0);
				Map map = new Map(noms[0]);
			
		});
		slot2.addActionListener((ActionEvent e) -> {
			if (noms[1] == null) 
				scan(1);
				Map map = new Map(noms[1]);
			
		});
		slot3.addActionListener((ActionEvent e) -> {
			if (noms[2] == null) 
				scan(2);
				Map map = new Map(noms[2]);
			
		});
		slot4.addActionListener((ActionEvent e) -> {
			if (noms[3] == null) 
				scan(3);
			
				Map map = new Map(noms[3]);
			
		});
		slot5.addActionListener((ActionEvent e) -> {
			if (noms[4] == null) 
				scan(4);
			
				Map map = new Map(noms[4]);
			
		});
	}
	void scan(int x) {
		//implémenter scanner et mettre résultat dans noms[x]
		
	}

}
