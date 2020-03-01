import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OknoWalut extends JFrame {

	OknoWalut() {

		JPanel p = new JPanel();
		JLabel tekst = new JLabel("Podaj kwotê do przeliczenia");
		JTextField liczba1;

		JButton usdTOpln = new JButton("USD > PLN");
		JButton plnTOusd = new JButton("PLN > USD");
		JButton euroTOpln = new JButton("EURO > PLN");
		JButton plnTOeuro = new JButton("PLN > EURO");
		JLabel wynik;
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("Kalkulator walut");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		liczba1 = new JTextField(20);

		wynik = new JLabel(" ");
//		p.setLayout(new FlowLayout(1));
		p.setLayout(new GridLayout(7, 1));

		usdTOpln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				if (s1.isEmpty()) {
					wynik.setText("WprowadŸ kwotê");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = l1 * 3.9255;
					wynik.setText(l1 + " USD = " + l2 + " PLN, po kursie: " + 3.9255);
				}
			}
		});
		plnTOusd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				if (s1.isEmpty()) {
					wynik.setText("WprowadŸ kwotê");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = l1 / 3.9255;
					wynik.setText(l1 + " PLN = " + l2 + " USD, po kursie: " + 3.9255);
				}
			}
		});
		euroTOpln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				if (s1.isEmpty()) {
					wynik.setText("WprowadŸ kwotê");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = l1 * 4.3355;
					wynik.setText(l1 + " EURO = " + l2 + " PLN, po kursie: " + 4.3355);
				}
			}
		});
		plnTOeuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				if (s1.isEmpty()) {
					wynik.setText("WprowadŸ kwotê");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = l1 / 4.3355;
					Math.round(l2);
					wynik.setText(l1 + " PLN = " + l2 + " EURO, po kursie: " + 4.3355);
				}
			}
		});

		p.setBackground(Color.pink);
		p.add(tekst);
		p.add(liczba1);
		p.add(usdTOpln);
		p.add(plnTOusd);
		p.add(euroTOpln);
		p.add(plnTOeuro);
		p.add(wynik);

		add(p);

	}
}
