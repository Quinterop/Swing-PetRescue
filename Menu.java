import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;

public class Menu extends JFrame {
	String[] noms;
	JButton slot1 = new JButton();
	JButton slot2 = new JButton();
	JButton slot3 = new JButton();
	JButton slot4 = new JButton();
	JButton slot5 = new JButton();

	

	Menu() {
		// scanner pour choper les noms a partir des noms de levels et les mettre dans
		// noms
		slot1.setText(noms[0]);
		slot2.setText(noms[1]);
		slot3.setText(noms[2]);
		slot4.setText(noms[3]);
		slot5.setText(noms[4]);
		// Image img = Toolkit.getDefaultToolkit().getImage("E:\\rahul.jpg");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1600, 900);
		setVisible(true);

		slot1.addActionListener((ActionEvent e) -> {
			if (noms[0] == null) {
				scan(0);
			}
			Map map = new Map(noms[0]);
		});

		slot2.addActionListener((ActionEvent e) -> {
			if (noms[1] == null) {
				System.out.print("aaa");
			} else {
				Map map = new Map(noms[1]);
			}
		});

		slot3.addActionListener((ActionEvent e) -> {
			if (noms[2] == null) {
				System.out.print("aaa");
			} else {
				Map map = new Map(noms[2]);
			}
		});

		slot4.addActionListener((ActionEvent e) -> {
			if (noms[3] == null) {
				System.out.print("aaa");
			} else {
				Map map = new Map(noms[3]);
			}
		});

		slot5.addActionListener((ActionEvent e) -> {
			if (noms[4] == null) {
				System.out.print("aaa");
			} else {
				Map map = new Map(noms[4]);
			}
		});
	}
	void scan(int x) {
		//implémenter scanner et mettre résultat dans noms[x]
		
	}

}
