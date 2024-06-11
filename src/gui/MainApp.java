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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class MainApp extends JFrame {

	private JPanel contentPane;
	private Calculadora calc = new Calculadora();
	private boolean recienCalc = true;
	private Errors error = new Errors();
	private int oper = 0;
	private double numUp;
	private JButton btn_por;
	private JButton btn_sqr;
	private JButton btn_pow;
	private JButton btn_unDiv;
	private JButton btn_ce;
	private JButton btn_c;
	private JButton btn_del;
	private JButton btn_div;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn_mult;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn_menos;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn_mas;
	private JButton btn_masmenos;
	private JButton btn0;
	private JButton btn_punto;
	private JButton btn_igual;

	public MainApp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Manuel Montero\\Downloads\\Proyecto_1_DPOO-main\\Proyecto_1_DPOO\\pngwing.com.png"));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 599);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		final JLabel lbl_secun = new JLabel("");
		lbl_secun.setOpaque(true);
		lbl_secun.setBackground(Color.GRAY);
		lbl_secun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_secun.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_secun.setBounds(10, 11, 367, 48);
		contentPane.add(lbl_secun);
		
		final JLabel lbl_princ = new JLabel("0");
		lbl_princ.setBackground(Color.GRAY);
		lbl_princ.setOpaque(true);
		lbl_princ.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_princ.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbl_princ.setBounds(10, 70, 365, 48);
		contentPane.add(lbl_princ);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(null);
		panel.setBounds(10, 129, 367, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btn_por = new JButton("%");
		btn_por.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_por.setBorderPainted(true);
				btn_por.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_por.setBorderPainted(false);
				btn_por.setBackground(Color.GRAY);
			}
		});
		btn_por.setFocusPainted(false);
		btn_por.setBackground(Color.GRAY);
		btn_por.setBorderPainted(false);
		btn_por.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_por.setBounds(10, 11, 80, 60);
		panel.add(btn_por);
		
		btn_sqr = new JButton("\u221A");
		btn_sqr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_sqr.setBorderPainted(true);
				btn_sqr.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_sqr.setBorderPainted(false);
				btn_sqr.setBackground(Color.GRAY);
			}
		});
		btn_sqr.setFocusPainted(false);
		btn_sqr.setBackground(Color.GRAY);
		btn_sqr.setBorderPainted(false);
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
		
		btn_pow = new JButton("X\u00B2");
		btn_pow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_pow.setBorderPainted(true);
				btn_pow.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_pow.setBorderPainted(false);
				btn_pow.setBackground(Color.GRAY);
			}
		});
		btn_pow.setFocusPainted(false);
		btn_pow.setBackground(Color.GRAY);
		btn_pow.setBorderPainted(false);
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
		
		btn_unDiv = new JButton("1/X");
		btn_unDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_unDiv.setBorderPainted(true);
				btn_unDiv.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_unDiv.setBorderPainted(false);
				btn_unDiv.setBackground(Color.GRAY);
			}
		});
		btn_unDiv.setFocusPainted(false);
		btn_unDiv.setBackground(Color.GRAY);
		btn_unDiv.setBorderPainted(false);
		btn_unDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_unDiv.setBounds(277, 11, 80, 60);
		panel.add(btn_unDiv);
		
		btn_del = new JButton("DEL");
		btn_del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_del.setBorderPainted(true);
				btn_del.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_del.setBorderPainted(false);
				btn_del.setBackground(Color.GRAY);
			}
		});
		btn_del.setFocusPainted(false);
		btn_del.setBackground(Color.GRAY);
		btn_del.setBorderPainted(false);
		btn_del.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_del.setBounds(190, 80, 80, 60);
		panel.add(btn_del);
		
		btn_c = new JButton("C");
		btn_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_c.setBorderPainted(true);
				btn_c.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_c.setBorderPainted(false);
				btn_c.setBackground(Color.GRAY);
			}
		});
		btn_c.setFocusPainted(false);
		btn_c.setBackground(Color.GRAY);
		btn_c.setBorderPainted(false);
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl_princ.setText("");
			}
		});
		btn_c.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_c.setBounds(100, 80, 80, 60);
		panel.add(btn_c);
		
		btn_ce = new JButton("CE");
		btn_ce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_ce.setBorderPainted(true);
				btn_ce.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_ce.setBorderPainted(false);
				btn_ce.setBackground(Color.GRAY);
			}
		});
		btn_ce.setFocusPainted(false);
		btn_ce.setBackground(Color.GRAY);
		btn_ce.setBorderPainted(false);
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
		
		btn_div = new JButton("\u00F7");
		btn_div.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_div.setBorderPainted(true);
				btn_div.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_div.setBorderPainted(false);
				btn_div.setBackground(Color.GRAY);
			}
		});
		btn_div.setFocusPainted(false);
		btn_div.setBackground(Color.GRAY);
		btn_div.setBorderPainted(false);
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_div.setBounds(277, 80, 80, 60);
		panel.add(btn_div);
		
		btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn3.setBorderPainted(true);
				btn3.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn3.setBorderPainted(false);
				btn3.setBackground(Color.GRAY);
			}
		});
		btn3.setFocusPainted(false);
		btn3.setBackground(Color.GRAY);
		btn3.setBorderPainted(false);
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
		
		btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn2.setBorderPainted(true);
				btn2.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn2.setBorderPainted(false);
				btn2.setBackground(Color.GRAY);
			}
		});
		btn2.setFocusPainted(false);
		btn2.setBackground(Color.GRAY);
		btn2.setBorderPainted(false);
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
		
		btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn1.setBorderPainted(true);
				btn1.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn1.setBorderPainted(false);
				btn1.setBackground(Color.GRAY);
			}
		});
		btn1.setFocusPainted(false);
		btn1.setBackground(Color.GRAY);
		btn1.setBorderPainted(false);
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
		
		btn_mult = new JButton("X");
		btn_mult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_mult.setBorderPainted(true);
				btn_mult.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_mult.setBorderPainted(false);
				btn_mult.setBackground(Color.GRAY);
			}
		});
		btn_mult.setFocusPainted(false);
		btn_mult.setBackground(Color.GRAY);
		btn_mult.setBorderPainted(false);
		btn_mult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_mult.setBounds(277, 150, 80, 60);
		panel.add(btn_mult);
		
		btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn6.setBorderPainted(true);
				btn6.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn6.setBorderPainted(false);
				btn6.setBackground(Color.GRAY);
			}
		});
		btn6.setFocusPainted(false);
		btn6.setBackground(Color.GRAY);
		btn6.setBorderPainted(false);
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
		
		btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn5.setBorderPainted(true);
				btn5.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn5.setBorderPainted(false);
				btn5.setBackground(Color.GRAY);
			}
		});
		btn5.setFocusPainted(false);
		btn5.setBackground(Color.GRAY);
		btn5.setBorderPainted(false);
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
		
		btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn4.setBorderPainted(true);
				btn4.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn4.setBorderPainted(false);
				btn4.setBackground(Color.GRAY);
			}
		});
		btn4.setFocusPainted(false);
		btn4.setBackground(Color.GRAY);
		btn4.setBorderPainted(false);
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
		
		btn_menos = new JButton("-");
		btn_menos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_menos.setBorderPainted(true);
				btn_menos.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_menos.setBorderPainted(false);
				btn_menos.setBackground(Color.GRAY);
			}
		});
		btn_menos.setFocusPainted(false);
		btn_menos.setBackground(Color.GRAY);
		btn_menos.setBorderPainted(false);
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
		
		btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn9.setBorderPainted(true);
				btn9.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn9.setBorderPainted(false);
				btn9.setBackground(Color.GRAY);
			}
		});
		btn9.setFocusPainted(false);
		btn9.setBackground(Color.GRAY);
		btn9.setBorderPainted(false);
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
		
		btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn8.setBorderPainted(true);
				btn8.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn8.setBorderPainted(false);
				btn8.setBackground(Color.GRAY);
			}
		});
		btn8.setFocusPainted(false);
		btn8.setBackground(Color.GRAY);
		btn8.setBorderPainted(false);
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
		
		btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn7.setBorderPainted(true);
				btn7.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn7.setBorderPainted(false);
				btn7.setBackground(Color.GRAY);
			}
		});
		btn7.setFocusPainted(false);
		btn7.setBackground(Color.GRAY);
		btn7.setBorderPainted(false);
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
		
		btn_mas = new JButton("+");
		btn_mas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_mas.setBorderPainted(true);
				btn_mas.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_mas.setBorderPainted(false);
				btn_mas.setBackground(Color.GRAY);
			}
		});
		btn_mas.setFocusPainted(false);
		btn_mas.setBackground(Color.GRAY);
		btn_mas.setBorderPainted(false);
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
		
		btn_masmenos = new JButton("\u00B1");
		btn_masmenos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_masmenos.setBorderPainted(true);
				btn_masmenos.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_masmenos.setBorderPainted(false);
				btn_masmenos.setBackground(Color.GRAY);
			}
		});
		btn_masmenos.setFocusPainted(false);
		btn_masmenos.setBackground(Color.GRAY);
		btn_masmenos.setBorderPainted(false);
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
		
		btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn0.setBorderPainted(true);
				btn0.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn0.setBorderPainted(false);
				btn0.setBackground(Color.GRAY);
			}
		});
		btn0.setFocusPainted(false);
		btn0.setBackground(Color.GRAY);
		btn0.setBorderPainted(false);
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
		
		btn_punto = new JButton(".");
		btn_punto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_punto.setBorderPainted(true);
				btn_punto.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_punto.setBorderPainted(false);
				btn_punto.setBackground(Color.GRAY);
			}
		});
		btn_punto.setFocusPainted(false);
		btn_punto.setBackground(Color.GRAY);
		btn_punto.setBorderPainted(false);
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
		
		btn_igual = new JButton("=");
		btn_igual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_igual.setBorderPainted(true);
				btn_igual.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_igual.setBorderPainted(false);
				btn_igual.setBackground(Color.GRAY);
			}
		});
		btn_igual.setFocusPainted(false);
		btn_igual.setBackground(Color.GRAY);
		btn_igual.setBorderPainted(false);
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
