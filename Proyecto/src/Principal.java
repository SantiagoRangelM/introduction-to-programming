//AUTHOR: Julian Santiago Rangel Manrique
//DATE:
//DESCRIPTION: Proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{
    JLabel label1, label2, label3;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    
    public Principal(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 750, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setTitle("Principal");
        getContentPane().setBackground(new Color(44,92,167));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon image = new ImageIcon("images/letrero.png");
        label1 = new JLabel(image);
        label1.setBounds(320, 200, 300, 150);
        add(label1);

        label2 = new JLabel("MENÚ PRINCIPAL");
        label2.setBounds(310, 210, 360, 30);
        label2.setFont(new Font("Calibri", 1, 16));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Creado por: Santiago Rangel");
        label3.setBounds(290, 450, 300, 30);
        label3.setFont(new Font("Calibri", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        boton1 = new JButton("Estudiantes");
        boton1.setBounds(280, 250, 170, 40);
        boton1.setFont(new Font("Calibri", 1, 16));
        boton1.setForeground(new Color(0,0,0));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Facultades");
        boton2.setBounds(280, 300, 170, 40);
        boton2.setFont(new Font("Calibri", 1, 16));
        boton2.setForeground(new Color(0,0,0));
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Acerca de");
        boton3.setBounds(280, 350, 170, 40);
        boton3.setFont(new Font("Calibri", 1, 16));
        boton3.setForeground(new Color(0,0,0));
        boton3.addActionListener(this);
        add(boton3);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Estudiantes Estudiantes = new Estudiantes();
            this.setVisible(false);
        }
        if(e.getSource() == boton2){
            Facultades Facultades = new Facultades();
            this.setVisible(false);
        }
        if(e.getSource() == boton3){
            Acerca_de acerca_de1 = new Acerca_de();
            this.setVisible(false);
        }
    }

    public static void main(String[] args) throws Exception {
        Principal principal1 = new Principal();
    }

}