package jMatrix;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Prozor {

	private JFrame frmJmatrix;
	private JTextField textRedA;
	private JTextField textRedB;
	private JTextField textKolA;
	private JTextField textKolB;
	
	static int brRedA=-1;
	static int brKolA=-1;
	static int brRedB=-1;
	static int brKolB=-1;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	
	Vector<Integer> v = new Vector<Integer>();
	Vector<Integer> v1 = new Vector<Integer>();
	Stack<Integer> s = new Stack<Integer>();

	

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
		
		textField = new JTextField();
		textField.setBounds(10, 317, 25, 20);
		frmJmatrix.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 317, 25, 20);
		frmJmatrix.getContentPane().add(textField_1);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 317, 25, 20);
		frmJmatrix.getContentPane().add(textField_2);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 317, 25, 20);
		frmJmatrix.getContentPane().add(textField_3);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(150, 317, 25, 20);
		frmJmatrix.getContentPane().add(textField_4);
		textField_4.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 348, 25, 20);
		frmJmatrix.getContentPane().add(textField_5);
		textField_5.setVisible(false);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(45, 348, 25, 20);
		frmJmatrix.getContentPane().add(textField_6);
		textField_6.setVisible(false);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(80, 348, 25, 20);
		frmJmatrix.getContentPane().add(textField_7);
		textField_7.setVisible(false);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(115, 348, 25, 20);
		frmJmatrix.getContentPane().add(textField_8);
		textField_8.setVisible(false);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(151, 348, 25, 20);
		frmJmatrix.getContentPane().add(textField_9);
		textField_9.setVisible(false);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 379, 25, 20);
		frmJmatrix.getContentPane().add(textField_10);
		textField_10.setVisible(false);															
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(45, 379, 25, 20);
		frmJmatrix.getContentPane().add(textField_11);
		textField_11.setVisible(false);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(80, 379, 25, 20);
		frmJmatrix.getContentPane().add(textField_12);
		textField_12.setVisible(false);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(115, 379, 25, 20);
		frmJmatrix.getContentPane().add(textField_13);
		textField_13.setVisible(false);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(151, 379, 25, 20);
		frmJmatrix.getContentPane().add(textField_14);
		textField_14.setVisible(false);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(10, 410, 25, 20);
		frmJmatrix.getContentPane().add(textField_15);
		textField_15.setVisible(false);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(45, 410, 25, 20);
		frmJmatrix.getContentPane().add(textField_16);
		textField_16.setVisible(false);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(80, 410, 25, 20);
		frmJmatrix.getContentPane().add(textField_17);
		textField_17.setVisible(false);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(115, 410, 25, 20);
		frmJmatrix.getContentPane().add(textField_18);
		textField_18.setVisible(false);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(151, 410, 25, 20);
		frmJmatrix.getContentPane().add(textField_19);
		textField_19.setVisible(false);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(10, 441, 25, 20);
		frmJmatrix.getContentPane().add(textField_20);
		textField_20.setVisible(false);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(45, 441, 25, 20);
		frmJmatrix.getContentPane().add(textField_21);
		textField_21.setVisible(false);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(80, 441, 25, 20);
		frmJmatrix.getContentPane().add(textField_22);
		textField_22.setVisible(false);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(115, 441, 25, 20);
		frmJmatrix.getContentPane().add(textField_23);
		textField_23.setVisible(false);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(151, 441, 25, 20);
		frmJmatrix.getContentPane().add(textField_24);
		textField_24.setVisible(false);
		
		JButton btnIzracunaj = new JButton("Izracunaj AxB");
		btnIzracunaj.setEnabled(false);
		btnIzracunaj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				switch(brRedA) 
				{
				case 5:
					textField_20.setVisible(true);
					textField_21.setVisible(true);
					textField_22.setVisible(true);
					textField_23.setVisible(true);
					textField_24.setVisible(true);
				case 4:
					textField_15.setVisible(true);
					textField_16.setVisible(true);
					textField_17.setVisible(true);
					textField_18.setVisible(true);
					textField_19.setVisible(true);
				case 3:
					textField_10.setVisible(true);
					textField_11.setVisible(true);
					textField_12.setVisible(true);
					textField_13.setVisible(true);
					textField_14.setVisible(true);
				case 2:
					textField_5.setVisible(true);
					textField_6.setVisible(true);
					textField_7.setVisible(true);
					textField_8.setVisible(true);
					textField_9.setVisible(true);
				case 1:
					textField.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					textField_3.setVisible(true);
					textField_4.setVisible(true);		
				}
				
				switch(brKolB) 
				{
				case 1:
					textField_1.setVisible(false);
					textField_6.setVisible(false);
					textField_11.setVisible(false);
					textField_16.setVisible(false);
					textField_21.setVisible(false);
				case 2:
					textField_2.setVisible(false);
					textField_7.setVisible(false);
					textField_12.setVisible(false);
					textField_17.setVisible(false);
					textField_22.setVisible(false);
				case 3:
					textField_3.setVisible(false);
					textField_8.setVisible(false);
					textField_13.setVisible(false);
					textField_18.setVisible(false);
					textField_23.setVisible(false);
				case 4:
					textField_4.setVisible(false);
					textField_9.setVisible(false);
					textField_14.setVisible(false);
					textField_19.setVisible(false);
					textField_24.setVisible(false);
				}
				
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
						s.push(matAxB[i][j]);
					}
				}
				
	
				if(textField_24.isVisible()) textField_24.setText(String.valueOf(s.pop()));
				if(textField_23.isVisible()) textField_23.setText(String.valueOf(s.pop()));
				if(textField_22.isVisible()) textField_22.setText(String.valueOf(s.pop()));
				if(textField_21.isVisible()) textField_21.setText(String.valueOf(s.pop()));
				if(textField_20.isVisible()) textField_20.setText(String.valueOf(s.pop()));
				if(textField_19.isVisible()) textField_19.setText(String.valueOf(s.pop()));
				if(textField_18.isVisible()) textField_18.setText(String.valueOf(s.pop()));
				if(textField_17.isVisible()) textField_17.setText(String.valueOf(s.pop()));
				if(textField_16.isVisible()) textField_16.setText(String.valueOf(s.pop()));
				if(textField_15.isVisible()) textField_15.setText(String.valueOf(s.pop()));
				if(textField_14.isVisible()) textField_14.setText(String.valueOf(s.pop()));
				if(textField_13.isVisible()) textField_13.setText(String.valueOf(s.pop()));
				if(textField_12.isVisible()) textField_12.setText(String.valueOf(s.pop()));
				if(textField_11.isVisible()) textField_11.setText(String.valueOf(s.pop()));
				if(textField_10.isVisible()) textField_10.setText(String.valueOf(s.pop()));
				if(textField_9.isVisible()) textField_9.setText(String.valueOf(s.pop()));
				if(textField_8.isVisible()) textField_8.setText(String.valueOf(s.pop()));
				if(textField_7.isVisible()) textField_7.setText(String.valueOf(s.pop()));
				if(textField_6.isVisible()) textField_6.setText(String.valueOf(s.pop()));
				if(textField_5.isVisible()) textField_5.setText(String.valueOf(s.pop()));
				if(textField_4.isVisible()) textField_4.setText(String.valueOf(s.pop()));
				if(textField_3.isVisible()) textField_3.setText(String.valueOf(s.pop()));
				if(textField_2.isVisible()) textField_2.setText(String.valueOf(s.pop()));
				if(textField_1.isVisible()) textField_1.setText(String.valueOf(s.pop()));
				if(textField.isVisible()) textField.setText(String.valueOf(s.pop()));
				
				btnIzracunaj.setEnabled(false);
			}
		});
		btnIzracunaj.setBounds(127, 241, 132, 35);
		frmJmatrix.getContentPane().add(btnIzracunaj);
		
		JButton btnPotvrdiB = new JButton("Potvrdi [B]");
		btnPotvrdiB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if(!textField.getText().isEmpty()) v1.add(Integer.parseInt(textField.getText()));
					if(!textField_1.getText().isEmpty()) v1.add(Integer.parseInt(textField_1.getText()));
					if(!textField_2.getText().isEmpty()) v1.add(Integer.parseInt(textField_2.getText()));
					if(!textField_3.getText().isEmpty()) v1.add(Integer.parseInt(textField_3.getText()));
					if(!textField_4.getText().isEmpty()) v1.add(Integer.parseInt(textField_4.getText()));
					if(!textField_5.getText().isEmpty()) v1.add(Integer.parseInt(textField_5.getText()));
					if(!textField_6.getText().isEmpty()) v1.add(Integer.parseInt(textField_6.getText()));
					if(!textField_7.getText().isEmpty()) v1.add(Integer.parseInt(textField_7.getText()));
					if(!textField_8.getText().isEmpty()) v1.add(Integer.parseInt(textField_8.getText()));
					if(!textField_9.getText().isEmpty()) v1.add(Integer.parseInt(textField_9.getText()));
					if(!textField_10.getText().isEmpty()) v1.add(Integer.parseInt(textField_10.getText()));
					if(!textField_11.getText().isEmpty()) v1.add(Integer.parseInt(textField_11.getText()));
					if(!textField_12.getText().isEmpty()) v1.add(Integer.parseInt(textField_12.getText()));
					if(!textField_13.getText().isEmpty()) v1.add(Integer.parseInt(textField_13.getText()));
					if(!textField_14.getText().isEmpty()) v1.add(Integer.parseInt(textField_14.getText()));
					if(!textField_15.getText().isEmpty()) v1.add(Integer.parseInt(textField_15.getText()));
					if(!textField_16.getText().isEmpty()) v1.add(Integer.parseInt(textField_16.getText()));
					if(!textField_17.getText().isEmpty()) v1.add(Integer.parseInt(textField_17.getText()));
					if(!textField_18.getText().isEmpty()) v1.add(Integer.parseInt(textField_18.getText()));
					if(!textField_19.getText().isEmpty()) v1.add(Integer.parseInt(textField_19.getText()));
					if(!textField_20.getText().isEmpty()) v1.add(Integer.parseInt(textField_20.getText()));
					if(!textField_21.getText().isEmpty()) v1.add(Integer.parseInt(textField_21.getText()));
					if(!textField_22.getText().isEmpty()) v1.add(Integer.parseInt(textField_22.getText()));
					if(!textField_23.getText().isEmpty()) v1.add(Integer.parseInt(textField_23.getText()));
					if(!textField_24.getText().isEmpty()) v1.add(Integer.parseInt(textField_24.getText()));
				}catch(NumberFormatException e) {}
				
				if(v1.size() == brRedB * brKolB) 
				{
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					textField_8.setText(null);
					textField_9.setText(null);
					textField_10.setText(null);
					textField_11.setText(null);
					textField_12.setText(null);
					textField_13.setText(null);
					textField_14.setText(null);
					textField_15.setText(null);
					textField_16.setText(null);
					textField_17.setText(null);
					textField_18.setText(null);
					textField_19.setText(null);
					textField_20.setText(null);
					textField_21.setText(null);
					textField_22.setText(null);
					textField_23.setText(null);
					textField_24.setText(null);
					
					textField.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					textField_5.setVisible(false);
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_10.setVisible(false);
					textField_11.setVisible(false);
					textField_12.setVisible(false);
					textField_13.setVisible(false);
					textField_14.setVisible(false);
					textField_15.setVisible(false);
					textField_16.setVisible(false);
					textField_17.setVisible(false);
					textField_18.setVisible(false);
					textField_19.setVisible(false);
					textField_20.setVisible(false);
					textField_21.setVisible(false);
					textField_22.setVisible(false);
					textField_23.setVisible(false);
					textField_24.setVisible(false);
					
					btnPotvrdiB.setEnabled(false);
					btnIzracunaj.setEnabled(true);
				}else 
				{
					JOptionPane.showMessageDialog(frmJmatrix, "Unesite cijele brojeve!"
							+ "\nPopunite sve clanove matrice!", "Greska!", JOptionPane.ERROR_MESSAGE);
					v1.removeAllElements();
				}
			}
		});
		btnPotvrdiB.setEnabled(false);
		btnPotvrdiB.setBounds(199, 182, 99, 23);
		frmJmatrix.getContentPane().add(btnPotvrdiB);
		
		JButton btnUnosB = new JButton("Unos [B]");
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
					btnUnosB.setEnabled(false);
					textKolB.setEditable(false);
					btnPotvrdiB.setEnabled(true);
					
					switch(brRedB) 
					{
					case 5:
						textField_20.setVisible(true);
						textField_21.setVisible(true);
						textField_22.setVisible(true);
						textField_23.setVisible(true);
						textField_24.setVisible(true);
					case 4:
						textField_15.setVisible(true);
						textField_16.setVisible(true);
						textField_17.setVisible(true);
						textField_18.setVisible(true);
						textField_19.setVisible(true);
					case 3:
						textField_10.setVisible(true);
						textField_11.setVisible(true);
						textField_12.setVisible(true);
						textField_13.setVisible(true);
						textField_14.setVisible(true);
					case 2:
						textField_5.setVisible(true);
						textField_6.setVisible(true);
						textField_7.setVisible(true);
						textField_8.setVisible(true);
						textField_9.setVisible(true);
					case 1:
						textField.setVisible(true);
						textField_1.setVisible(true);
						textField_2.setVisible(true);
						textField_3.setVisible(true);
						textField_4.setVisible(true);		
					}

					switch(brKolB) 
					{
					case 1:
						textField_1.setVisible(false);
						textField_6.setVisible(false);
						textField_11.setVisible(false);
						textField_16.setVisible(false);
						textField_21.setVisible(false);
					case 2:
						textField_2.setVisible(false);
						textField_7.setVisible(false);
						textField_12.setVisible(false);
						textField_17.setVisible(false);
						textField_22.setVisible(false);
					case 3:
						textField_3.setVisible(false);
						textField_8.setVisible(false);
						textField_13.setVisible(false);
						textField_18.setVisible(false);
						textField_23.setVisible(false);
					case 4:
						textField_4.setVisible(false);
						textField_9.setVisible(false);
						textField_14.setVisible(false);
						textField_19.setVisible(false);
						textField_24.setVisible(false);
					}
				}else 
				{
					JOptionPane.showMessageDialog(frmJmatrix, "Unesite cijele pozitivne brojeve!"
							+ "\nProgram radi sa matricama dimenzija maksimalno 5x5!", "Greska!", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnUnosB.setBounds(196, 135, 102, 23);
		frmJmatrix.getContentPane().add(btnUnosB);
		
		JButton btnPotvrdiA = new JButton("Potvrdi [A]");
		btnPotvrdiA.setEnabled(false);
		btnPotvrdiA.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if(!textField.getText().isEmpty()) v.add(Integer.parseInt(textField.getText()));
					if(!textField_1.getText().isEmpty()) v.add(Integer.parseInt(textField_1.getText()));
					if(!textField_2.getText().isEmpty()) v.add(Integer.parseInt(textField_2.getText()));
					if(!textField_3.getText().isEmpty()) v.add(Integer.parseInt(textField_3.getText()));
					if(!textField_4.getText().isEmpty()) v.add(Integer.parseInt(textField_4.getText()));
					if(!textField_5.getText().isEmpty()) v.add(Integer.parseInt(textField_5.getText()));
					if(!textField_6.getText().isEmpty()) v.add(Integer.parseInt(textField_6.getText()));
					if(!textField_7.getText().isEmpty()) v.add(Integer.parseInt(textField_7.getText()));
					if(!textField_8.getText().isEmpty()) v.add(Integer.parseInt(textField_8.getText()));
					if(!textField_9.getText().isEmpty()) v.add(Integer.parseInt(textField_9.getText()));
					if(!textField_10.getText().isEmpty()) v.add(Integer.parseInt(textField_10.getText()));
					if(!textField_11.getText().isEmpty()) v.add(Integer.parseInt(textField_11.getText()));
					if(!textField_12.getText().isEmpty()) v.add(Integer.parseInt(textField_12.getText()));
					if(!textField_13.getText().isEmpty()) v.add(Integer.parseInt(textField_13.getText()));
					if(!textField_14.getText().isEmpty()) v.add(Integer.parseInt(textField_14.getText()));
					if(!textField_15.getText().isEmpty()) v.add(Integer.parseInt(textField_15.getText()));
					if(!textField_16.getText().isEmpty()) v.add(Integer.parseInt(textField_16.getText()));
					if(!textField_17.getText().isEmpty()) v.add(Integer.parseInt(textField_17.getText()));
					if(!textField_18.getText().isEmpty()) v.add(Integer.parseInt(textField_18.getText()));
					if(!textField_19.getText().isEmpty()) v.add(Integer.parseInt(textField_19.getText()));
					if(!textField_20.getText().isEmpty()) v.add(Integer.parseInt(textField_20.getText()));
					if(!textField_21.getText().isEmpty()) v.add(Integer.parseInt(textField_21.getText()));
					if(!textField_22.getText().isEmpty()) v.add(Integer.parseInt(textField_22.getText()));
					if(!textField_23.getText().isEmpty()) v.add(Integer.parseInt(textField_23.getText()));
					if(!textField_24.getText().isEmpty()) v.add(Integer.parseInt(textField_24.getText()));
				}catch(NumberFormatException e) {}
				
				if(v.size() == brRedA * brKolA) 
				{
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					textField_8.setText(null);
					textField_9.setText(null);
					textField_10.setText(null);
					textField_11.setText(null);
					textField_12.setText(null);
					textField_13.setText(null);
					textField_14.setText(null);
					textField_15.setText(null);
					textField_16.setText(null);
					textField_17.setText(null);
					textField_18.setText(null);
					textField_19.setText(null);
					textField_20.setText(null);
					textField_21.setText(null);
					textField_22.setText(null);
					textField_23.setText(null);
					textField_24.setText(null);
					
					textField.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					textField_5.setVisible(false);
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_10.setVisible(false);
					textField_11.setVisible(false);
					textField_12.setVisible(false);
					textField_13.setVisible(false);
					textField_14.setVisible(false);
					textField_15.setVisible(false);
					textField_16.setVisible(false);
					textField_17.setVisible(false);
					textField_18.setVisible(false);
					textField_19.setVisible(false);
					textField_20.setVisible(false);
					textField_21.setVisible(false);
					textField_22.setVisible(false);
					textField_23.setVisible(false);
					textField_24.setVisible(false);
					
					btnPotvrdiA.setEnabled(false);
					textRedB.setText(String.valueOf(brKolA));
					textRedB.setEditable(false);
					btnUnosB.setEnabled(true);
					textKolB.setEditable(true);
				}else
				{
					JOptionPane.showMessageDialog(frmJmatrix, "Unesite cijele brojeve!"
							+ "\nPopunite sve clanove matrice!", "Greska!", JOptionPane.ERROR_MESSAGE);
					v.removeAllElements();
				}
				
			}
		});
		btnPotvrdiA.setBounds(90, 182, 99, 23);
		frmJmatrix.getContentPane().add(btnPotvrdiA);
		
		
		
		JButton btnUnosA = new JButton("Unos [A]");
		btnUnosA.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					brRedA = Integer.parseInt(textRedA.getText());
					brKolA = Integer.parseInt(textKolA.getText());
				}catch(NumberFormatException e) {}
			
				
				if(brRedA >= 1 && brKolA >= 1 && brRedA <= 5 && brKolA <= 5) 
				{
					btnUnosA.setEnabled(false);
					textRedA.setEditable(false);
					textKolA.setEditable(false);
					btnPotvrdiA.setEnabled(true);
					
					switch(brRedA) 
					{
					case 5:
						textField_20.setVisible(true);
						textField_21.setVisible(true);
						textField_22.setVisible(true);
						textField_23.setVisible(true);
						textField_24.setVisible(true);
					case 4:
						textField_15.setVisible(true);
						textField_16.setVisible(true);
						textField_17.setVisible(true);
						textField_18.setVisible(true);
						textField_19.setVisible(true);
					case 3:
						textField_10.setVisible(true);
						textField_11.setVisible(true);
						textField_12.setVisible(true);
						textField_13.setVisible(true);
						textField_14.setVisible(true);
					case 2:
						textField_5.setVisible(true);
						textField_6.setVisible(true);
						textField_7.setVisible(true);
						textField_8.setVisible(true);
						textField_9.setVisible(true);
					case 1:
						textField.setVisible(true);
						textField_1.setVisible(true);
						textField_2.setVisible(true);
						textField_3.setVisible(true);
						textField_4.setVisible(true);		
					}

					switch(brKolA) 
					{
					case 1:
						textField_1.setVisible(false);
						textField_6.setVisible(false);
						textField_11.setVisible(false);
						textField_16.setVisible(false);
						textField_21.setVisible(false);
					case 2:
						textField_2.setVisible(false);
						textField_7.setVisible(false);
						textField_12.setVisible(false);
						textField_17.setVisible(false);
						textField_22.setVisible(false);
					case 3:
						textField_3.setVisible(false);
						textField_8.setVisible(false);
						textField_13.setVisible(false);
						textField_18.setVisible(false);
						textField_23.setVisible(false);
					case 4:
						textField_4.setVisible(false);
						textField_9.setVisible(false);
						textField_14.setVisible(false);
						textField_19.setVisible(false);
						textField_24.setVisible(false);
					}
				}else
				{
					JOptionPane.showMessageDialog(frmJmatrix, "Unesite cijele pozitivne brojeve!"
							+ "\nProgram radi sa matricama dimenzija maksimalno 5x5!", "Greska!", JOptionPane.ERROR_MESSAGE);
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
				
				textField.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				textField_5.setVisible(false);
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
				textField_9.setVisible(false);
				textField_10.setVisible(false);
				textField_11.setVisible(false);
				textField_12.setVisible(false);
				textField_13.setVisible(false);
				textField_14.setVisible(false);
				textField_15.setVisible(false);
				textField_16.setVisible(false);
				textField_17.setVisible(false);
				textField_18.setVisible(false);
				textField_19.setVisible(false);
				textField_20.setVisible(false);
				textField_21.setVisible(false);
				textField_22.setVisible(false);
				textField_23.setVisible(false);
				textField_24.setVisible(false);
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				textField_15.setText(null);
				textField_16.setText(null);
				textField_17.setText(null);
				textField_18.setText(null);
				textField_19.setText(null);
				textField_20.setText(null);
				textField_21.setText(null);
				textField_22.setText(null);
				textField_23.setText(null);
				textField_24.setText(null);
				
				v.removeAllElements();
				v1.removeAllElements();
				s.removeAllElements();
				
				brRedA=-1;
				brKolA=-1;
				brRedB=-1;
				brKolB=-1;
			}
		});
		btnC.setBounds(336, 429, 48, 35);
		frmJmatrix.getContentPane().add(btnC);
			
	}
}
