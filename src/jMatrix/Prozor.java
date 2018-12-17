package jMatrix;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.Insets;

public class Prozor {

	private JFrame frmJmatrix;
	private JTextField textRedA;
	private JTextField textRedB;
	private JTextField textKolA;
	private JTextField textKolB;

	JButton btnUnosA = new JButton("Unos [A]");
	JButton btnPotvrdiA = new JButton("Potvrdi [A]");
	JButton btnUnosB = new JButton("Unos [B]");
	JButton btnPotvrdiB = new JButton("Potvrdi [B]");
	JButton btnIzracunaj = new JButton("Izracunaj AxB");

	JPanel panel = new JPanel(); //Ovo nam je panel u kom drzimo nasa tekst polja

	static int brRedA=-1;
	static int brKolA=-1;
	static int brRedB=-1;
	static int brKolB=-1;

	Vector<Integer> v = new Vector<Integer>();
	Vector<Integer> v1 = new Vector<Integer>();
	Vector<Integer> rez = new Vector<Integer>(); //Volim stack mnogo, ali ovde mi je nezgodan kako sam resio :(

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prozor window = new Prozor();
					window.frmJmatrix.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJmatrix = new JFrame();
		frmJmatrix.setResizable(false);
		frmJmatrix.setTitle("jMatrix");
		frmJmatrix.setBounds(100, 100, 400, 500);
		frmJmatrix.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJmatrix.getContentPane().setLayout(null);

		JLabel lblBrojRedova = new JLabel("Broj redova");
		lblBrojRedova.setBounds(10, 64, 70, 14);
		frmJmatrix.getContentPane().add(lblBrojRedova);

		JLabel lblBrojKolona = new JLabel("Broj kolona");
		lblBrojKolona.setBounds(10, 93, 70, 14);
		frmJmatrix.getContentPane().add(lblBrojKolona);

		JLabel lblMatricaA = new JLabel("Matrica A");
		lblMatricaA.setBounds(90, 26, 70, 14);
		frmJmatrix.getContentPane().add(lblMatricaA);

		JLabel lblMatricaB = new JLabel("Matrica B");
		lblMatricaB.setBounds(199, 26, 60, 14);
		frmJmatrix.getContentPane().add(lblMatricaB);

		textRedA = new JTextField();
		textRedA.setHorizontalAlignment(SwingConstants.CENTER);
		textRedA.setBounds(90, 61, 99, 20);
		frmJmatrix.getContentPane().add(textRedA);
		textRedA.setColumns(10);

		textRedB = new JTextField();
		textRedB.setEditable(false);
		textRedB.setHorizontalAlignment(SwingConstants.CENTER);
		textRedB.setBounds(199, 61, 99, 20);
		frmJmatrix.getContentPane().add(textRedB);
		textRedB.setColumns(10);

		textKolA = new JTextField();
		textKolA.setHorizontalAlignment(SwingConstants.CENTER);
		textKolA.setBounds(90, 90, 99, 20);
		frmJmatrix.getContentPane().add(textKolA);
		textKolA.setColumns(10);

		textKolB = new JTextField();
		textKolB.setEditable(false);
		textKolB.setHorizontalAlignment(SwingConstants.CENTER);
		textKolB.setBounds(199, 90, 99, 20);
		frmJmatrix.getContentPane().add(textKolB);
		textKolB.setColumns(10);

		JScrollPane scrollPane = new JScrollPane(); //Pravimo scroll pane da mozemo da radimo sa dzinovskim matricama :)
		scrollPane.setBounds(10, 287, 316, 177);
		frmJmatrix.getContentPane().add(scrollPane);

		scrollPane.setViewportView(panel); //U njega postavljamo panel

		btnIzracunaj.setEnabled(false);
		btnIzracunaj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{

				int[][] matA = new int[brRedA][brKolA];
				for(int i = 0; i < brRedA; i++) 
				{
					for(int j = 0; j < brKolA; j++) 
					{
						matA[i][j] = v.elementAt(j + brKolA * i);
					}
				}

				int[][] matB = new int[brRedB][brKolB];
				for(int i = 0; i < brRedB; i++) 
				{
					for(int j = 0; j < brKolB; j++) 
					{
						matB[i][j] = v1.elementAt(j + brKolB * i);
					}
				}

				int[][] matAxB = new int[brRedA][brKolB];
				for(int i = 0; i < brRedA; i++) 
				{
					for(int j = 0; j < brKolB; j++) 
					{
						for(int k = 0; k < brKolA; k++) 
						{
							matAxB[i][j] += matA[i][k] * matB[k][j];
						}
						rez.add(matAxB[i][j]);
					}
				}

				dodajPolja(brRedA, brKolB, panel); 

				for (Component com: panel.getComponents())
				{
					//Kada generisemo tekst polja imenujemo ih po rednom broju od 0 pa sa ((JTextField)com).getName() dobijemo tacan indeks za rezultat :)
					//(JTextField)com -- radimo direktan cast jer znamo da su sve komponente u ovom panelu tekst polja pa smo sigurni

					((JTextField)com).setText(String.valueOf(rez.get(Integer.parseInt(((JTextField)com).getName()))));
				}
				btnIzracunaj.setEnabled(false);
			}
		});
		
		btnIzracunaj.setBounds(127, 241, 132, 35);
		frmJmatrix.getContentPane().add(btnIzracunaj);

		btnPotvrdiB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (unesiVrednosti(panel, v1))
				{

					btnPotvrdiB.setEnabled(false);
					btnIzracunaj.setEnabled(true);
				}
			}
		});
		
		btnPotvrdiB.setEnabled(false);
		btnPotvrdiB.setBounds(199, 182, 99, 23);
		frmJmatrix.getContentPane().add(btnPotvrdiB);

		btnUnosB.setEnabled(false);
		btnUnosB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					brRedB = Integer.parseInt(textRedB.getText());
					brKolB = Integer.parseInt(textKolB.getText());
				}catch(NumberFormatException e) {}


				if(brRedB >= 1 && brKolB >= 1 && brRedB <= 5 && brKolB <= 5)
				{
					dodajPolja(brRedB, brKolB, panel);

					btnUnosB.setEnabled(false);
					textKolB.setEditable(false);
					btnPotvrdiB.setEnabled(true);
				}
			}
		});
		
		btnUnosB.setBounds(196, 135, 102, 23);
		frmJmatrix.getContentPane().add(btnUnosB);

		btnPotvrdiA.setEnabled(false);
		btnPotvrdiA.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (unesiVrednosti(panel, v))
				{

					btnPotvrdiA.setEnabled(false);
					textRedB.setText(String.valueOf(brKolA));
					textRedB.setEditable(false);
					btnUnosB.setEnabled(true);
					textKolB.setEditable(true);
				}
			}
		});
		
		btnPotvrdiA.setBounds(90, 182, 99, 23);
		frmJmatrix.getContentPane().add(btnPotvrdiA);

		btnUnosA.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					brRedA = Integer.parseInt(textRedA.getText());
					brKolA = Integer.parseInt(textKolA.getText());
				}catch(NumberFormatException e) {}


				if(brRedA >= 1 && brKolA >= 1) 
				{
					dodajPolja(brRedA, brKolA, panel);

					btnUnosA.setEnabled(false);
					textRedA.setEditable(false);
					textKolA.setEditable(false);
					btnPotvrdiA.setEnabled(true);	
				}else
				{
					JOptionPane.showMessageDialog(frmJmatrix, "Unesite cijele pozitivne brojeve!",
							"Greska!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnUnosA.setBounds(90, 135, 99, 23);
		frmJmatrix.getContentPane().add(btnUnosA);

		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(240, 240, 240));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				resetuj();
			}
		});
		btnC.setBounds(336, 429, 48, 35);
		frmJmatrix.getContentPane().add(btnC);
	}

	public void dodajPolja(int red, int kol, JPanel panel)
	{
		panel.removeAll(); //Prvo sve uklonimo
		panel.setLayout(new GridBagLayout()); //layout koji koristimo
		GridBagConstraints con = new GridBagConstraints(); //Za gridBag definisemo ogranicenja koja primenjujemo na svaku komponentu koju dodajemo
		con.insets = new Insets(5, 5, 5, 5); //Kazem da hocu po 5 piksela razmaka izmedju komponenti na svaku stranu

		for (int j = 0; j < red; j++) 
		{
			for (int i = 0; i < kol; i++)
			{
				con.gridx = i; //GridBag se organizuje kao tabela pa mu ovde kazem
				con.gridy = j; //koju celiju ce koje dugme da zauzima
				JTextField txtPolje = new JTextField();
				txtPolje.setName(String.valueOf(i + (j * red))); //Kada napravim dugme, imenujem ga rednim brojem da bi mogli posle da znamo koje je koje :)
				txtPolje.setColumns(2); //Stavljamo mu sirinu
				panel.add(txtPolje, con); //Dodajemo ga i primenjujemo ogranicenja koja smo definisali
			}
		}
		panel.revalidate(); //Ponovo iscrtavamo panel posle izmena
	}

	public boolean unesiVrednosti(JPanel panel, Vector<Integer> vektor)
	{
		try 
		{

			for (Component comp: panel.getComponents()) //Za svaku komponentu (sto ce kod nas biti tekstualno polje) iz panela
			{
				if(!((JTextField)comp).getText().isEmpty()) //Ako nije prazna
				{
					vektor.add(Integer.parseInt(((JTextField)comp).getText())); //Dodajemo vrednost u vektor
				} else
				{
					throw new NumberFormatException(); //ako je prazno, bacamo exception rucno, moze i to ;)
				}
			}
		}catch(NumberFormatException e) 
		{
			resetuj();
			JOptionPane.showMessageDialog(panel, "Brojevi nisu A-OK :(!!", "Greska!!", JOptionPane.ERROR_MESSAGE);
			vektor.removeAllElements();
			panel.removeAll();
			panel.repaint();
			return false;
		}

		panel.removeAll();
		panel.repaint();
		return true;
	}

	public void resetuj() //Samo sam pomerio resetovanje forme u svoju fju :)
	{
		textRedA.setEditable(true);
		textRedA.setText(null);
		textKolA.setEditable(true);
		textKolA.setText(null);
		btnUnosA.setEnabled(true);
		btnPotvrdiA.setEnabled(false);
		textRedB.setEditable(false);
		textRedB.setText(null);
		textKolB.setEditable(false);
		textKolB.setText(null);
		btnUnosB.setEnabled(false);
		btnPotvrdiB.setEnabled(false);
		btnIzracunaj.setEnabled(false);

		panel.removeAll();
		panel.repaint();

		v.removeAllElements();
		v1.removeAllElements();
		rez.removeAllElements();

		brRedA=-1;
		brKolA=-1;
		brRedB=-1;
		brKolB=-1;
	}
}
