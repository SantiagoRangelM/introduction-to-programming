//AUTHOR: Julian Santiago Rangel Manrique
//DATE:
//DESCRIPTION: Proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Inicio extends JFrame implements ActionListener{
    JLabel label1, label2, label3;
    JButton boton1;

    public Inicio(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 750, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setTitle("Inicio");
        getContentPane().setBackground(new Color(44,92,167));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon image = new ImageIcon("images/letrero.png");
        label1 = new JLabel(image);
        label1.setBounds(200, 10, 150, 50);
        add(label1);
    
        label2 = new JLabel("SAC-USTA");
        label2.setBounds(320, 230, 360, 30);
        label2.setFont(new Font("Calibri", 1, 20));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Version1.0");
        label3.setBounds(335, 375, 300, 30);
        label3.setFont(new Font("Calibri", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        boton1 = new JButton("Empezar");
        boton1.setBounds(280, 280, 170, 40);
        boton1.setFont(new Font("Calibri", 1, 20));
        boton1.setForeground(new Color(0,0,0));
        boton1.addActionListener(this);
        add(boton1);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Principal principal1 = new Principal();
            this.setVisible(false);
            
        }
    }

    public static void main(String[] args) throws Exception {
        Inicio inicio1 = new Inicio();
    }
}