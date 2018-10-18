package ispit9zd06;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	private JPanel panel;
	private JButton btnclear, btnlistall, btnizracunaj;
	private JTextArea tekst;
	private JTextField cijenaNovog;
	private JCheckBox ljetneG, zimskeG;
	private JComboBox<?> godStar;
	private JRadioButton regpolagod;
	private JRadioButton nereg;
	private JScrollPane scrollPane;
	private JLabel lblcijnanovog, lblgodstar;

	public MainFrame() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setResizable(false);
		setVisible(true);
		setSize(807, 762);
		setLocationRelativeTo(null);
		createComp();
		layoutComp();
		getContentPane().setLayout(null);
		getContentPane().add(panel);

	}

	public void createComp() {
		panel = new JPanel();
		panel.setBounds(12, 13, 777, 701);
		panel.setLayout(null);

		btnclear = new JButton("Clear");
		btnlistall = new JButton("lista all");
		btnizracunaj = new JButton("Izracunaj");

		cijenaNovog = new JTextField();
		cijenaNovog.setSize(150, 25);
		cijenaNovog.setLocation(327, 215);
		String[] god = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		godStar = new JComboBox<>(god);

		ljetneG = new JCheckBox("LJetne gume");
		zimskeG = new JCheckBox("Zimske gume");

		regpolagod = new JRadioButton("Ragistiran jos pola godine");
		nereg = new JRadioButton("Neregistriran");

		ButtonGroup btng = new ButtonGroup();
		btng.add(regpolagod);
		btng.add(nereg);

		lblcijnanovog = new JLabel("Cijena novog automobila");
		lblgodstar = new JLabel("Godine starosti");
		lblgodstar.setLocation(327, 260);
		lblgodstar.setSize(150, 25);

	}

	public void layoutComp() {
		panel.add(btnclear);
		btnclear.setBounds(5, 5, 100, 25);
		panel.add(btnlistall);
		btnlistall.setBounds(115, 5, 100, 25);
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 40, 777, 1);
		panel.add(separator);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 70, 500, 100);
		panel.add(scrollPane);
		tekst = new JTextArea();
		scrollPane.setViewportView(tekst);
		panel.add(lblcijnanovog);
		lblcijnanovog.setBounds(327, 177, 150, 25);
		panel.add(cijenaNovog);
		cijenaNovog.setBounds(327, 215, 150, 25);
		panel.add(lblgodstar);
		godStar.setBounds(0, 0, 300, 25);
		panel.add(godStar);
		godStar.setBounds(327, 298, 150, 25);
		panel.add(ljetneG);
		ljetneG.setBounds(150, 395, 200, 25);
		panel.add(zimskeG);
		zimskeG.setBounds(150, 440, 200, 25);
		panel.add(regpolagod);
		regpolagod.setBounds(386, 395, 300, 25);
		panel.add(nereg);
		nereg.setBounds(386, 440, 300, 25);
		panel.add(btnizracunaj);
		btnizracunaj.setBounds(355, 614, 100, 25);

	}

	public void activateComp() {

	}
}
