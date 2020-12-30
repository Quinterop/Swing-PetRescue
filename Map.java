import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;




public class Map extends JFrame{
	JButton level1 = new JButton("1");
	JButton level2 = new JButton("2");
	JButton level3 = new JButton("3");

	Map(String nom){
		setTitle("ImageEdit");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton level_1= new JButton("level 1");
		level_1.setBounds(155, 112, 85, 21);
		panel.add(level_1);
		
		JButton level_2 = new JButton("level 2");
		level_1.setBounds(413, 160, 85, 21);
		panel.add(level_1);
		
		JButton level_3 = new JButton("level 3");
		level_2.setBounds(299, 278, 85, 21);
		panel.add(level_2);
		
		JButton level_4 = new JButton("level 5");
		level_3.setBounds(81, 380, 85, 21);
		panel.add(level_3);
		
		JButton level_5 = new JButton("New button");
		level_4.setBounds(366, 428, 85, 21);
		panel.add(level_4);
		setVisible(true);
		//setbackground
		
		level_1.addActionListener((ActionEvent e) -> {
			BoardControler a =new BoardControler(nom,1);
			
		});
		level_2.addActionListener((ActionEvent e) -> {
			BoardControler a =new BoardControler(nom,2);
			
		});
		level_3.addActionListener((ActionEvent e) -> {
			BoardControler a =new BoardControler(nom,3);
			
		});
		level_4.addActionListener((ActionEvent e) -> {
			BoardControler a =new BoardControler(nom,4);
			
		});
		level_5.addActionListener((ActionEvent e) -> {
			BoardControler a =new BoardControler(nom,5);
			
		});
		
		
		
		

	}
}
