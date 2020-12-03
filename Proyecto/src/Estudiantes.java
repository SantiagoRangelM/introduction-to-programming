//AUTHOR: Julian Santiago Rangel Manrique
//DATE:
//DESCRIPTION: Proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Estudiantes extends JFrame implements ActionListener{
    JLabel label1, label2, label3, label4, label5;
    JButton boton1, boton2;
    JTextField id, Nombre, Email, Fecha;
	public static String texto = "";
    
    public Estudiantes(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 750, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        setTitle("Estudiantes");
        getContentPane().setBackground(new Color(44,92,167));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon image = new ImageIcon("images/letrero.png");
        label1 = new JLabel(image);
        label1.setBounds(320, 200, 300, 150);
        add(label1);

        label2 = new JLabel("Identificación:");
        label2.setBounds(30, 200, 360, 30);
        label2.setFont(new Font("Calibri", 1, 16));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        id = new JTextField();
        id.setBounds(170, 200, 230, 30);
        id.setFont(new Font("Calibri", 0, 16));
        id.setForeground(new Color(0,0,0));
        add(id);
        
        label3 = new JLabel("Nombre completo:");
        label3.setBounds(30, 250, 360, 30);
        label3.setFont(new Font("Calibri", 1, 16));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        Nombre = new JTextField();
        Nombre.setBounds(170, 250, 230, 30);
        Nombre.setFont(new Font("Calibri", 0, 16));
        Nombre.setForeground(new Color(0,0,0));
        add(Nombre);

        label4 = new JLabel("Email:");
        label4.setBounds(30, 300, 360, 30);
        label4.setFont(new Font("Calibri", 1, 16));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        Email = new JTextField();
        Email.setBounds(170, 300, 230, 30);
        Email.setFont(new Font("Calibri", 0, 16));
        Email.setForeground(new Color(0,0,0));
        add(Email);


        label5 = new JLabel("Fecha Nacimiento:");
        label5.setBounds(30, 350, 360, 30);
        label5.setFont(new Font("Calibri", 1, 16));
        label5.setForeground(new Color(255,255,255));
        add(label5);

        Fecha = new JTextField("");
        Fecha.setBounds(170, 350, 230, 30);
        Fecha.setFont(new Font("Calibri", 0, 16));
        Fecha.setForeground(new Color(0,0,0));
        add(Fecha);


        boton1 = new JButton("Guardar");
        boton1.setBounds(500, 450, 170, 40);
        boton1.setFont(new Font("Calibri", 1, 16));
        boton1.setForeground(new Color(0,0,0));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Volver");
        boton2.setBounds(300, 450, 170, 40);
        boton2.setFont(new Font("Calibri", 1, 16));
        boton2.setForeground(new Color(0,0,0));
        boton2.addActionListener(this);
        add(boton2);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
           String ID = id.getText();
           String NOM = Nombre.getText();
           String EMAIL = Email.getText();
           String FECHA = Fecha.getText();
            if(ID.equals("") || NOM.equals("") || EMAIL.equals("") || FECHA.equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese todos los datos");

            }else{
                Principal principal1 = new Principal();
                this.setVisible(false);
            }
        }
        if(e.getSource() == boton2){
            Principal principal1 = new Principal();
            this.setVisible(false);
        }
        
    
    }
    public static void main(String[] args) throws Exception {
        Estudiantes Estudiantes = new Estudiantes();
    }

}