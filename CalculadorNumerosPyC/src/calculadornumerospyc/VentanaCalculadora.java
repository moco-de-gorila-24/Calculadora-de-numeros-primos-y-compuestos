/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadornumerospyc;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Chomp
 */
public class VentanaCalculadora extends JFrame {
    
    public VentanaCalculadora(){
        setTitle("Calculadora Numeros Primos y Compuestos");
        setSize(1200,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        iniciarComponentes();
   
    }
    
    public void iniciarComponentes() {
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        add(panelPrincipal);
        
        //Dialogos del programa
        JLabel ingresarDirecto = new JLabel("¡Ingrese un numero!" );
        JLabel ingresarCalculadora = new JLabel("¡O calculelo aqui!");
        JLabel titulo = new JLabel("¿Es compuesto o primo?");
        JLabel creditos = new JLabel("Hecho por Andres Duarte, Alonso Ortiz y Mario ??"); //agregarle apellido al mario lol
        JLabel lblCalculadora = new JLabel("El resultado de la calculadora se ve reflejado aqui");
        
        //JTextField donde el usuario ingresa el numero directamente
        JTextField usuarioIngresar = new JTextField();
        
        //JTextField donde se ve reflejado el numero calculado de la calculadora
        JTextField usuarioCalcular = new JTextField();
        
        //JTextArea donde se ponen los resultados
        JTextArea terminal = new JTextArea();
        
        //botones de la calculadora
        JButton btnCero = new JButton("0");
        JButton btnUno = new JButton("1");
        JButton btnDos = new JButton("2");
        JButton btnTres = new JButton("3");
        JButton btnCuatro = new JButton("4");
        JButton btnCinco = new JButton("5");
        JButton btnSeis = new JButton("6");
        JButton btnSiete = new JButton("7");
        JButton btnOcho = new JButton("8");
        JButton btnNueve = new JButton("9");
        JButton btnSumar = new JButton("+");
        JButton btnRestar = new JButton("-");
        JButton btnMultiplicar = new JButton("*");
        JButton btnDividir = new JButton("÷");
        JButton btnResultado = new JButton("="); //al darle click la calculadora plasma en el JTextField de la calculadora el resultado
        JButton btnBorrar = new JButton("DEL"); //al darle click borra el ultimo numero ingresado
        
        //especificaciones de los botones
        btnCero.setFont(new Font("Arial", Font.BOLD, 70));
        btnUno.setFont(new Font("Arial", Font.BOLD, 70));
        btnDos.setFont(new Font("Arial", Font.BOLD, 70));
        btnTres.setFont(new Font("Arial", Font.BOLD, 70));
        btnCuatro.setFont(new Font("Arial", Font.BOLD, 70));
        btnCinco.setFont(new Font("Arial", Font.BOLD, 70));
        btnSeis.setFont(new Font("Arial", Font.BOLD, 70));
        btnSiete.setFont(new Font("Arial", Font.BOLD, 70));
        btnOcho.setFont(new Font("Arial", Font.BOLD, 70));
        btnNueve.setFont(new Font("Arial", Font.BOLD, 70));
        btnSumar.setFont(new Font("Arial", Font.BOLD, 70));
        btnRestar.setFont(new Font("Arial", Font.BOLD, 70));
        btnDividir.setFont(new Font("Arial", Font.BOLD, 70));
        btnMultiplicar.setFont(new Font("Arial", Font.BOLD, 70));
        btnResultado.setFont(new Font("Arial", Font.BOLD, 70));
        btnBorrar.setFont(new Font("Arial", Font.BOLD, 40));
        
        //ESPECIFICACIONES LABELS
        ingresarDirecto.setFont(new Font("Arial", Font.BOLD, 55));
        ingresarCalculadora.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setFont(new Font("Arial", Font.BOLD, 62));
        creditos.setFont(new Font("Arial", Font.BOLD, 15));
        lblCalculadora.setFont(new Font("Arial", Font.BOLD, 15));
        
        //ESPECIFICACIONES JTEXTFIELDS
        usuarioCalcular.setEditable(false);
        usuarioCalcular.setFont(new Font("Arial", Font.BOLD, 40));
        usuarioCalcular.setBorder(new LineBorder(Color.BLUE, 3, true));
        
        usuarioIngresar.setFont(new Font("Arial", Font.BOLD, 40));
        usuarioIngresar.setBorder(new LineBorder(Color.BLUE, 3, true));
        usuarioIngresar.setCaretColor(Color.YELLOW);
        
        //ESPECIFICACIONES JTEXTAREA
        terminal.setEditable(false);
        terminal.setFont(new Font("Courier New", Font.PLAIN, 16));
        terminal.setForeground(Color.GREEN);
        terminal.setBorder(new LineBorder(Color.GREEN, 2, true));
        JScrollPane scrollTerminal = new JScrollPane(terminal);
        scrollTerminal.setBounds(650, 310, 500, 400);
        
        //LOCALIZACIONES DE LOS BOTONES
        //Primera fila
        btnUno.setBounds(45, 300, 120, 120);
        btnDos.setBounds(195, 300, 120, 120);
        btnTres.setBounds(345, 300, 120, 120);
        btnResultado.setBounds(495, 300, 120, 120);
        
        //Segunda fila
        btnCuatro.setBounds(45, 440, 120, 120);
        btnCinco.setBounds(195, 440, 120, 120);
        btnSeis.setBounds(345, 440, 120, 120);
        btnBorrar.setBounds(495, 440, 120, 120);
        
        //Tercera fila
        btnSiete.setBounds(45, 570, 120, 120);
        btnOcho.setBounds(195, 570, 120, 120);
        btnNueve.setBounds(345, 570, 120, 120);
        btnCero.setBounds(495, 570, 120, 120);

        //Cuarta fila
        btnSumar.setBounds(45, 700, 120, 120);
        btnRestar.setBounds(195, 700, 120, 120);
        btnMultiplicar.setBounds(345, 700, 120, 120);
        btnDividir.setBounds(495, 700, 120, 120);
        
        //LOCALIZACIONES DE LOS LABELS
        ingresarDirecto.setBounds(90, 100, 590, 65);
        ingresarCalculadora.setBounds(172, 230, 500, 45);
        titulo.setBounds(210, 5, 800, 70);
        creditos.setBounds(45, 830, 600, 20);
        lblCalculadora.setBounds(730, 210, 500, 20);
        
        //LOCALIZACIONES DE LOS JTEXTFIELDS
        usuarioCalcular.setBounds(650, 230, 500, 60);
        usuarioIngresar.setBounds(650, 100, 500, 60);
        
        //LOCALIZACION TERMINAL
        scrollTerminal.setBounds(650, 310, 500, 520);
        
        //Agregamos botones
        panelPrincipal.add(btnCero);
        panelPrincipal.add(btnUno);
        panelPrincipal.add(btnDos);
        panelPrincipal.add(btnTres);
        panelPrincipal.add(btnCuatro);
        panelPrincipal.add(btnCinco);
        panelPrincipal.add(btnSeis);
        panelPrincipal.add(btnSiete);
        panelPrincipal.add(btnOcho);
        panelPrincipal.add(btnNueve);
        panelPrincipal.add(btnSumar);
        panelPrincipal.add(btnRestar);
        panelPrincipal.add(btnMultiplicar);
        panelPrincipal.add(btnDividir);
        panelPrincipal.add(btnBorrar);
        panelPrincipal.add(btnResultado);
        
        //agregamos labels
        panelPrincipal.add(ingresarDirecto);
        panelPrincipal.add(ingresarCalculadora);
        panelPrincipal.add(titulo);
        panelPrincipal.add(creditos);
        panelPrincipal.add(lblCalculadora);
        
        //agregamos jtextfields
        panelPrincipal.add(usuarioIngresar);
        panelPrincipal.add(usuarioCalcular);
        
        //agrega la terminal
        panelPrincipal.add(scrollTerminal);
    }
}
