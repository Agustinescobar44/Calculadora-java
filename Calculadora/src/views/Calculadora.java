package views;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import logica.LogicaCalculadora;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;

import java.awt.Color;

public class Calculadora {
	private JLabel valorA;
	private JLabel valorB;
	private JLabel operadorCuenta;
	private JLabel resultado;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 401,501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); 

		LogicaCalculadora calculadora = new LogicaCalculadora();
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(10, 127, 365, 324);
		frame.getContentPane().add(panelBotones);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		int anchoCelda = panelBotones.getWidth()/4;
		int altoCelda = panelBotones.getHeight()/5;
		gbl_panelBotones.columnWidths = new int[]{anchoCelda, anchoCelda, anchoCelda, anchoCelda};
		gbl_panelBotones.rowHeights = new int[]{altoCelda, altoCelda, altoCelda, altoCelda, altoCelda};
		gbl_panelBotones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_panelBotones.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		panelBotones.setLayout(gbl_panelBotones);
		
		JButton botonBorrar = new JButton("Borrar");
		GridBagConstraints gbc_botonBorrar = new GridBagConstraints();
		gbc_botonBorrar.gridwidth = 2;
		gbc_botonBorrar.fill = GridBagConstraints.BOTH;
		gbc_botonBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_botonBorrar.gridx = 0;
		gbc_botonBorrar.gridy = 0;
		panelBotones.add(botonBorrar, gbc_botonBorrar);
		
		JButton botonBorrarTodo = new JButton("C");
		GridBagConstraints gbc_botonBorrarTodo = new GridBagConstraints();
		gbc_botonBorrarTodo.fill = GridBagConstraints.BOTH;
		gbc_botonBorrarTodo.insets = new Insets(0, 0, 5, 5);
		gbc_botonBorrarTodo.gridx = 2;
		gbc_botonBorrarTodo.gridy = 0;
		panelBotones.add(botonBorrarTodo, gbc_botonBorrarTodo);
		
		//numeros
		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_boton7 = new GridBagConstraints();
		gbc_boton7.fill = GridBagConstraints.BOTH;
		gbc_boton7.insets = new Insets(0, 0, 5, 5);
		gbc_boton7.gridx = 0;
		gbc_boton7.gridy = 1;
		panelBotones.add(boton7, gbc_boton7);
		
		JButton boton8 = new JButton("8");
		GridBagConstraints gbc_boton8 = new GridBagConstraints();
		gbc_boton8.fill = GridBagConstraints.BOTH;
		gbc_boton8.insets = new Insets(0, 0, 5, 5);
		gbc_boton8.gridx = 1;
		gbc_boton8.gridy = 1;
		panelBotones.add(boton8, gbc_boton8);
		
		JButton boton9 = new JButton("9");
		GridBagConstraints gbc_boton9 = new GridBagConstraints();
		gbc_boton9.fill = GridBagConstraints.BOTH;
		gbc_boton9.insets = new Insets(0, 0, 5, 5);
		gbc_boton9.gridx = 2;
		gbc_boton9.gridy = 1;
		panelBotones.add(boton9, gbc_boton9);
		
		JButton boton4 = new JButton("4");
		GridBagConstraints gbc_boton4 = new GridBagConstraints();
		gbc_boton4.fill = GridBagConstraints.BOTH;
		gbc_boton4.insets = new Insets(0, 0, 5, 5);
		gbc_boton4.gridx = 0;
		gbc_boton4.gridy = 2;
		panelBotones.add(boton4, gbc_boton4);
		
		JButton boton5 = new JButton("5");
		GridBagConstraints gbc_boton5 = new GridBagConstraints();
		gbc_boton5.fill = GridBagConstraints.BOTH;
		gbc_boton5.insets = new Insets(0, 0, 5, 5);
		gbc_boton5.gridx = 1;
		gbc_boton5.gridy = 2;
		panelBotones.add(boton5, gbc_boton5);
		
		JButton boton6 = new JButton("6");
		GridBagConstraints gbc_boton6 = new GridBagConstraints();
		gbc_boton6.fill = GridBagConstraints.BOTH;
		gbc_boton6.insets = new Insets(0, 0, 5, 5);
		gbc_boton6.gridx = 2;
		gbc_boton6.gridy = 2;
		panelBotones.add(boton6, gbc_boton6);
		
		JButton boton1 = new JButton("1");
		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.fill = GridBagConstraints.BOTH;
		gbc_boton1.insets = new Insets(0, 0, 5, 5);
		gbc_boton1.gridx = 0;
		gbc_boton1.gridy = 3;
		panelBotones.add(boton1, gbc_boton1);
		
		JButton boton2 = new JButton("2");
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.fill = GridBagConstraints.BOTH;
		gbc_boton2.insets = new Insets(0, 0, 5, 5);
		gbc_boton2.gridx = 1;
		gbc_boton2.gridy = 3;
		panelBotones.add(boton2, gbc_boton2);
		
		JButton boton3 = new JButton("3");
		GridBagConstraints gbc_boton3 = new GridBagConstraints();
		gbc_boton3.fill = GridBagConstraints.BOTH;
		gbc_boton3.insets = new Insets(0, 0, 5, 5);
		gbc_boton3.gridx = 2;
		gbc_boton3.gridy = 3;
		panelBotones.add(boton3, gbc_boton3);
		
		
		
		JButton botonDecimal = new JButton(".");
		GridBagConstraints gbc_botonDecimal = new GridBagConstraints();
		gbc_botonDecimal.fill = GridBagConstraints.BOTH;
		gbc_botonDecimal.insets = new Insets(0, 0, 0, 5);
		gbc_botonDecimal.gridx = 0;
		gbc_botonDecimal.gridy = 4;
		panelBotones.add(botonDecimal, gbc_botonDecimal);
		
		JButton boton0 = new JButton("0");
		GridBagConstraints gbc_boton0 = new GridBagConstraints();
		gbc_boton0.insets = new Insets(0, 0, 0, 5);
		gbc_boton0.fill = GridBagConstraints.BOTH;
		gbc_boton0.gridx = 1;
		gbc_boton0.gridy = 4;
		panelBotones.add(boton0, gbc_boton0);
		
		
		//operadores
		JButton botonIgual = new JButton("=");
		GridBagConstraints gbc_botonIgual = new GridBagConstraints();
		gbc_botonIgual.gridwidth = 2;
		gbc_botonIgual.fill = GridBagConstraints.BOTH;
		gbc_botonIgual.gridx = 2;
		gbc_botonIgual.gridy = 4;
		panelBotones.add(botonIgual, gbc_botonIgual);
		
		JButton botonMenos = new JButton("-");
		GridBagConstraints gbc_botonMenos = new GridBagConstraints();
		gbc_botonMenos.fill = GridBagConstraints.BOTH;
		gbc_botonMenos.insets = new Insets(0, 0, 5, 0);
		gbc_botonMenos.gridx = 3;
		gbc_botonMenos.gridy = 3;
		panelBotones.add(botonMenos, gbc_botonMenos);
		
		JButton botonMas = new JButton("+");
		GridBagConstraints gbc_botonMas = new GridBagConstraints();
		gbc_botonMas.fill = GridBagConstraints.BOTH;
		gbc_botonMas.insets = new Insets(0, 0, 5, 0);
		gbc_botonMas.gridx = 3;
		gbc_botonMas.gridy = 2;
		panelBotones.add(botonMas, gbc_botonMas);
		
		JButton botonPor = new JButton("*");
		GridBagConstraints gbc_botonPor = new GridBagConstraints();
		gbc_botonPor.fill = GridBagConstraints.BOTH;
		gbc_botonPor.insets = new Insets(0, 0, 5, 0);
		gbc_botonPor.gridx = 3;
		gbc_botonPor.gridy = 1;
		panelBotones.add(botonPor, gbc_botonPor);
		
		JButton botonDividir = new JButton("/");
		GridBagConstraints gbc_botonDividir = new GridBagConstraints();
		gbc_botonDividir.fill = GridBagConstraints.BOTH;
		gbc_botonDividir.insets = new Insets(0, 0, 5, 0);
		gbc_botonDividir.gridx = 3;
		gbc_botonDividir.gridy = 0;
		panelBotones.add(botonDividir, gbc_botonDividir);
		
		agregarActionListener(panelBotones, calculadora);
		estiloBotones(panelBotones);
		
		JPanel panelRender = new JPanel();
		panelRender.setBounds(10, 11, 365, 105);
		frame.getContentPane().add(panelRender);
		GridBagLayout gbl_panelRender = new GridBagLayout();
		int anchoValor=panelRender.getWidth()/5;
		int altoValor = panelRender.getHeight()/2;
		gbl_panelRender.columnWidths = new int[] {anchoValor,anchoValor,anchoValor,anchoValor,anchoValor};
		gbl_panelRender.rowHeights = new int[]{altoValor,altoValor};
		gbl_panelRender.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelRender.rowWeights = new double[]{0.0, 0.0};
		panelRender.setLayout(gbl_panelRender);
		
		JLabel resultadoTexto = new JLabel("Resultado=");
		resultadoTexto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_resultadoTexto = new GridBagConstraints();
		gbc_resultadoTexto.insets = new Insets(0, 0, 0, 5);
		gbc_resultadoTexto.gridx = 0;
		gbc_resultadoTexto.gridy = 1;
		panelRender.add(resultadoTexto, gbc_resultadoTexto);
		
		resultado = new JLabel("");
		resultado.setBorder(UIManager.getBorder("CheckBox.border"));
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_resultado = new GridBagConstraints();
		gbc_resultado.gridwidth = 4;
		gbc_resultado.fill = GridBagConstraints.BOTH;
		gbc_resultado.gridx = 1;
		gbc_resultado.gridy = 1;
		panelRender.add(resultado, gbc_resultado);
		
		operadorCuenta = new JLabel("");
		operadorCuenta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		operadorCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_operadorCuenta = new GridBagConstraints();
		gbc_operadorCuenta.fill = GridBagConstraints.BOTH;
		gbc_operadorCuenta.insets = new Insets(0, 0, 5, 5);
		gbc_operadorCuenta.gridx = 2;
		gbc_operadorCuenta.gridy = 0;
		panelRender.add(operadorCuenta, gbc_operadorCuenta);
		
		valorA = new JLabel("");
		valorA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valorA.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_valorA = new GridBagConstraints();
		gbc_valorA.gridwidth = 2;
		gbc_valorA.fill = GridBagConstraints.BOTH;
		gbc_valorA.insets = new Insets(0, 0, 5, 5);
		gbc_valorA.gridx = 0;
		gbc_valorA.gridy = 0;
		panelRender.add(valorA, gbc_valorA);
		
		valorB = new JLabel("");
		valorB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valorB.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_valorB = new GridBagConstraints();
		gbc_valorB.gridwidth = 2;
		gbc_valorB.insets = new Insets(0, 0, 5, 0);
		gbc_valorB.fill = GridBagConstraints.BOTH;
		gbc_valorB.gridx = 3;
		gbc_valorB.gridy = 0;
		panelRender.add(valorB, gbc_valorB);
	}

	private void estiloBotones(JPanel panel) {
		ArrayList<JButton> botones= getBotones(panel);
		for(JButton boton: botones) {
			boton.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
	}

	private void agregarActionListener(JPanel panel, LogicaCalculadora calculadora) {
		ArrayList<JButton> botones= getBotones(panel);
		for(JButton boton: botones) {
			boton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					calculadora.agregarValor(boton.getText());
					render(calculadora);
				}
			});
		}
		
	}
	
	private ArrayList<JButton> getBotones(JPanel panel){
		ArrayList<JButton> ret = new ArrayList<JButton>();
		for (Component  componente: panel.getComponents()) {
			if(componente instanceof JButton) ret.add((JButton) componente);
		}
		return ret;
	}
	
	private void render(LogicaCalculadora calculadora) {
		valorA.setText(calculadora.get_valorA());
		operadorCuenta.setText(calculadora.get_operador());
		valorB.setText(calculadora.get_valorB());
		resultado.setText(calculadora.get_resultado());
	}
}
