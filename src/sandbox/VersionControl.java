package sandbox;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class VersionControl {

	private JFrame frame;
	private JTextField textField;
	private Methods classMethods = new Methods();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VersionControl window = new VersionControl();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VersionControl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 595, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIcsuVersionControl = new JLabel("ICS4U Version Control");

		JLabel lblIcsuVersionControl1 = new JLabel("ICS3U Version Control");
		lblIcsuVersionControl1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIcsuVersionControl1.setBounds(204, 33, 234, 33);
		frame.getContentPane().add(lblIcsuVersionControl1);

		JButton keslerButton = new JButton("Kesler");
		keslerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		keslerButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		keslerButton.setBounds(169, 97, 89, 23);
		frame.getContentPane().add(keslerButton);

		JButton ethanButton = new JButton("Ethan");
		ethanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		ethanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		ethanButton.setBounds(169, 131, 89, 23);
		frame.getContentPane().add(ethanButton);

		JButton monaButton = new JButton("Mona");
		monaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			 classMethods.monaMethod(textField);

		}});
		
		monaButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		monaButton.setBounds(70, 192, 89, 23);
		frame.getContentPane().add(monaButton);

		JButton marianButton = new JButton("Marian");
		marianButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				 classMethods.marianMethod(textField);
				

			}
		});
		marianButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		marianButton.setBounds(70, 226, 89, 23);
		frame.getContentPane().add(marianButton);

		JButton joshButton = new JButton("Josh");
		joshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				 classMethods.joshMethod(textField);//


			}
		});
		joshButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		joshButton.setBounds(169, 226, 89, 23);
		frame.getContentPane().add(joshButton);

		JButton udaiButton = new JButton("Udai");
		udaiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		udaiButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		udaiButton.setBounds(70, 289, 89, 23);
		frame.getContentPane().add(udaiButton);

		JButton sofiaButton = new JButton("Sofia");
		sofiaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				// classMethods.<student>Method(textField);
				
				classMethods.UdaiMethod(textField);

			}
		});
		sofiaButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		sofiaButton.setBounds(169, 289, 89, 23);
		frame.getContentPane().add(sofiaButton);

		JButton liamButton = new JButton("Liam");
		liamButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		liamButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		liamButton.setBounds(70, 323, 89, 23);
		frame.getContentPane().add(liamButton);

		JButton davidButton = new JButton("David");
		davidButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		davidButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		davidButton.setBounds(169, 323, 89, 23);
		frame.getContentPane().add(davidButton);

		JButton cameronButton = new JButton("Cameron");
		cameronButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
				
				classMethods.CameronMethod(textField);
			}
		});
		cameronButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		cameronButton.setBounds(318, 97, 89, 23);
		frame.getContentPane().add(cameronButton);

		JButton valentinaButton = new JButton("Valentina");
		valentinaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		valentinaButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		valentinaButton.setBounds(417, 97, 89, 23);
		frame.getContentPane().add(valentinaButton);

		JButton annaButton = new JButton("Anna");
		annaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				classMethods.AnnaMethod(textField);
			}
		});
		annaButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		annaButton.setBounds(318, 131, 89, 23);
		frame.getContentPane().add(annaButton);

		JButton sunainaButton = new JButton("Sunaina");
		sunainaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		sunainaButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		sunainaButton.setBounds(417, 131, 89, 23);
		frame.getContentPane().add(sunainaButton);

		JButton bryanButton = new JButton("Bryan");
		bryanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		bryanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		bryanButton.setBounds(318, 192, 89, 23);
		frame.getContentPane().add(bryanButton);

		JButton coleButton = new JButton("Cole");
		coleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		coleButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		coleButton.setBounds(417, 192, 89, 23);
		frame.getContentPane().add(coleButton);

		JButton hadiButton = new JButton("Hadi");
		hadiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		hadiButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		hadiButton.setBounds(318, 226, 89, 23);
		frame.getContentPane().add(hadiButton);

		JButton rowanButton = new JButton("Rowan");
		rowanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		rowanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rowanButton.setBounds(417, 226, 89, 23);
		frame.getContentPane().add(rowanButton);

		JButton mohammadButton = new JButton("Mohammad");
		mohammadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		mohammadButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		mohammadButton.setBounds(318, 289, 89, 23);
		frame.getContentPane().add(mohammadButton);

		JButton zackButton = new JButton("Zack");
		zackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);

				
				classMethods.zackMethod(textField);
			}
		});
		zackButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		zackButton.setBounds(417, 289, 89, 23);
		frame.getContentPane().add(zackButton);

		JButton muhammadButton = new JButton("Muhammad");
		muhammadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		muhammadButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		muhammadButton.setBounds(318, 323, 89, 23);
		frame.getContentPane().add(muhammadButton);

		JButton athavanButton = new JButton("Athavan");
		athavanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// classMethods.<student>Method(textField);
			}
		});
		athavanButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		athavanButton.setBounds(417, 323, 89, 23);
		frame.getContentPane().add(athavanButton);

		textField = new JTextField();
		textField.setBounds(70, 376, 235, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Message");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(146, 420, 81, 23);
		frame.getContentPane().add(lblNewLabel);

		JButton mrWongButton = new JButton("Mr. Wong");
		mrWongButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				classMethods.mrWongMethod(textField);
			}
		});
		mrWongButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		mrWongButton.setBounds(368, 422, 89, 23);
		frame.getContentPane().add(mrWongButton);

		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clearButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		clearButton.setBounds(131, 451, 89, 23);
		frame.getContentPane().add(clearButton);

	}
}


