//AUTHOR: Julian Santiago Rangel Manrique
//DATE:
//DESCRIPTION: Proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Acerca_de extends JFrame implements ActionListener{
    JLabel label1, desarrollador, facultad, correo, github;
    JButton boton2;
    
    public Acerca_de(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 750, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        setTitle("Acerca de");
        getContentPane().setBackground(new Color(44,92,167));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon image = new ImageIcon("images/letrero.png");
        label1 = new JLabel(image);
        label1.setBounds(320, 200, 300, 150);
        add(label1);

        desarrollador = new JLabel("Desarrollador: Julian Santiago Rangel Manrique");
        desarrollador.setBounds(30, 200, 360, 30);
        desarrollador.setFont(new Font("Calibri", 1, 16));
        desarrollador.setForeground(new Color(255,255,255));
        add(desarrollador);
        
        facultad = new JLabel("Facultad: Ingenieria de Sistemas");
        facultad.setBounds(30, 250, 360, 30);
        facultad.setFont(new Font("Calibri", 1, 16));
        facultad.setForeground(new Color(255,255,255));
        add(facultad);

        correo = new JLabel("Correo: julian.rangel@usantoto.edu.co");
        correo.setBounds(30, 300, 360, 30);
        correo.setFont(new Font("Calibri", 1, 16));
        correo.setForeground(new Color(255,255,255));
        add(correo);

        github = new JLabel("Github: https://github.com/SantiagoRangelM");
        github.setBounds(30, 350, 360, 30);
        github.setFont(new Font("Calibri", 1, 16));
        github.setForeground(new Color(255,255,255));
        add(github);

        boton2 = new JButton("Volver");
        boton2.setBounds(300, 450, 170, 40);
        boton2.setFont(new Font("Calibri", 1, 16));
        boton2.setForeground(new Color(0,0,0));
        boton2.addActionListener(this);
        add(boton2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton2){
            Principal principal1 = new Principal();
            this.setVisible(false);
        }
    }
    public static void main(String[] args) throws Exception {
        Acerca_de acerca_de1 = new Acerca_de();
    }
}