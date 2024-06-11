package gui;

import gui.errors.Errors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import lógica.Calculadora;

public class MainApp extends JFrame {

	private JPanel contentPane;
	private Calculadora calc = new Calculadora();
	private boolean recienCalc = true;
	private Errors error = new Errors();
	private int oper = 0;
	private double numUp;

	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		final JLabel lbl_secun = new JLabel("");
		lbl_secun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_secun.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_secun.setBounds(10, 11, 367, 48);
		contentPane.add(lbl_secun);
		
		final JLabel lbl_princ = new JLabel("0");
		lbl_princ.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_princ.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbl_princ.setBounds(10, 70, 367, 69);
		contentPane.add(lbl_princ);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 150, 367, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn_por = new JButton("%");
		btn_por.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_por.setBounds(10, 11, 80, 60);
		panel.add(btn_por);
		
		JButton btn_sqr = new JButton("\u221A");
		btn_sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num2 = Double.parseDouble(lbl_princ.getText());
				num2 = calc.raiz(num2);
				lbl_princ.setText(calc.sinComas(num2));
				recienCalc = true;
			}
		});
		btn_sqr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_sqr.setBounds(100, 11, 80, 60);
		panel.add(btn_sqr);
		
		JButton btn_pow = new JButton("X\u00B2");
		btn_pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num2 = Double.parseDouble(lbl_princ.getText());
				num2 = calc.cuadrado(num2);
				lbl_princ.setText(calc.sinComas(num2));
			}
		});
		btn_pow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_pow.setBounds(190, 11, 80, 60);
		panel.add(btn_pow);
		
		JButton btn_unDiv = new JButton("1/X");
		btn_unDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_unDiv.setBounds(277, 11, 80, 60);
		panel.add(btn_unDiv);
		
		JButton btn_del = new JButton("DEL");
		btn_del.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_del.setBounds(190, 80, 80, 60);
		panel.add(btn_del);
		
		JButton btn_c = new JButton("C");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl_princ.setText("");
			}
		});
		btn_c.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_c.setBounds(100, 80, 80, 60);
		panel.add(btn_c);
		
		JButton btn_ce = new JButton("CE");
		btn_ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl_princ.setText("");
				lbl_secun.setText("");
				numUp = 0;
			}
		});
		btn_ce.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_ce.setBounds(10, 80, 80, 60);
		panel.add(btn_ce);
		
		JButton btn_div = new JButton("\u00F7");
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_div.setBounds(277, 80, 80, 60);
		panel.add(btn_div);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(190, 150, 80, 60);
		panel.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc)
					if(recienCalc){
						lbl_princ.setText("");
						recienCalc = false;
					}
				lbl_princ.setText(lbl_princ.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(100, 150, 80, 60);
		panel.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 150, 80, 60);
		panel.add(btn1);
		
		JButton btn_mult = new JButton("X");
		btn_mult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_mult.setBounds(277, 150, 80, 60);
		panel.add(btn_mult);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(190, 220, 80, 60);
		panel.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(100, 220, 80, 60);
		panel.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 220, 80, 60);
		panel.add(btn4);
		
		JButton btn_menos = new JButton("-");
		btn_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num2 = Double.parseDouble(lbl_princ.getText());
				if(recienCalc)
					lbl_princ.setText("");
				recienCalc = true;
				if(lbl_secun.getText() == "")
					numUp = num2;
				else
					numUp = calc.igual(numUp, num2, oper);
				lbl_secun.setText(lbl_secun.getText() + calc.sinComas(num2) + " - ");
				lbl_princ.setText(calc.sinComas(numUp));
				oper = 2;
			}
		});
		btn_menos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_menos.setBounds(277, 220, 80, 60);
		panel.add(btn_menos);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(190, 290, 80, 60);
		panel.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(100, 290, 80, 60);
		panel.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 290, 80, 60);
		panel.add(btn7);
		
		JButton btn_mas = new JButton("+");
		btn_mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num2 = Double.parseDouble(lbl_princ.getText());
				if(recienCalc)
					lbl_princ.setText("");
				recienCalc = true;
				if(lbl_secun.getText() == "")
					numUp = num2;
				else
					numUp = calc.igual(numUp, num2, oper);
				lbl_secun.setText(lbl_secun.getText() + calc.sinComas(num2) + " + ");
				lbl_princ.setText(calc.sinComas(numUp));
				oper = 1;
			}
		});
		btn_mas.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_mas.setBounds(277, 290, 80, 60);
		panel.add(btn_mas);
		
		JButton btn_masmenos = new JButton("\u00B1");
		btn_masmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				double num = Double.parseDouble(lbl_princ.getText());
				num = num * -1;
				lbl_princ.setText(calc.sinComas(num));
			}
		});
		btn_masmenos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_masmenos.setBounds(10, 361, 80, 60);
		panel.add(btn_masmenos);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					lbl_princ.setText("");
					recienCalc = false;
				}
				lbl_princ.setText(lbl_princ.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(100, 361, 80, 60);
		panel.add(btn0);
		
		JButton btn_punto = new JButton(".");
		btn_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(recienCalc){
					recienCalc = false;
					lbl_princ.setText("");
				}
				String numero = lbl_princ.getText();
				if(!numero.contains(".")){
					if(lbl_princ.getText() == "")
						lbl_princ.setText("0");
					lbl_princ.setText(lbl_princ.getText() + ".");
				}
				else
					error.errorComa();
			}
		});
		btn_punto.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_punto.setBounds(190, 361, 80, 60);
		panel.add(btn_punto);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num2 = Double.parseDouble(lbl_princ.getText());
				lbl_secun.setText(lbl_secun.getText() + calc.sinComas(num2));
				numUp = calc.igual(numUp, num2, oper);
				lbl_princ.setText(calc.sinComas(numUp));
			}
		});
		btn_igual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_igual.setBounds(277, 361, 80, 60);
		panel.add(btn_igual);
		
	}
}
