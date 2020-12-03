//AUTHOR: Julian Santiago Rangel Manrique
//DATE:
//DESCRIPTION: Proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Facultades extends JFrame implements ActionListener{
    JLabel id_facultad, codigo, nombre, decano, semestres, label1;
    JButton Guardar, imp, Ver_d;
    JTextField id, Nomb, dec, semes, cod;
	private Component add;
    
    public Facultades(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 750, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        setTitle("Facultades");
        getContentPane().setBackground(new Color(44,92,167));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon image = new ImageIcon("images/letrero.png");
        label1 = new JLabel(image);
        label1.setBounds(320, 200, 300, 150);
        add(label1);

        id_facultad = new JLabel("Id Facultad:");
        id_facultad.setBounds(30, 200, 360, 30);
        id_facultad.setFont(new Font("Calibri", 1, 16));
        id_facultad.setForeground(new Color(255,255,255));
        add(id_facultad);
        
        id = new JTextField();
        id.setBounds(120, 200, 40, 25);
        id.setFont(new Font("Calibri", 0, 16));
        id.setForeground(new Color(0,0,0));
        add(id);
        
        codigo = new JLabel("Código SNIES:");
        codigo.setBounds(200, 200, 360, 30);
        codigo.setFont(new Font("Calibri", 1, 16));
        codigo.setForeground(new Color(255,255,255));
        add(codigo);

        cod = new JTextField();
        cod.setBounds(310, 200, 230, 20);
        cod.setFont(new Font("Calibri", 0, 16));
        cod.setForeground(new Color(0,0,0));
        add(cod);

        nombre = new JLabel("Nombre:");
        nombre.setBounds(30, 250, 360, 30);
        nombre.setFont(new Font("Calibri", 1, 16));
        nombre.setForeground(new Color(255,255,255));
        add(nombre);

        Nomb = new JTextField();
        Nomb.setBounds(120, 250, 230, 30);
        Nomb.setFont(new Font("Calibri", 0, 16));
        Nomb.setForeground(new Color(0,0,0));
        add(Nomb);


        decano = new JLabel("Decano:");
        decano.setBounds(30, 300, 360, 30);
        decano.setFont(new Font("Calibri", 1, 16));
        decano.setForeground(new Color(255,255,255));
        add(decano);

        dec = new JTextField();
        dec.setBounds(120, 300, 230, 30);
        dec.setFont(new Font("Calibri", 0, 16));
        dec.setForeground(new Color(0,0,0));
        add(dec);

        semestres = new JLabel("Semestre:");
        semestres.setBounds(30, 350, 360, 30);
        semestres.setFont(new Font("Calibri", 1, 16));
        semestres.setForeground(new Color(255,255,255));
        add(semestres);

        semes = new JTextField();
        semes.setBounds(120, 350, 40, 25);
        semes.setFont(new Font("Calibri", 0, 16));
        semes.setForeground(new Color(0,0,0));
        add(semes);


        Guardar = new JButton("Guardar");
        Guardar.setBounds(500, 450, 170, 40);
        Guardar.setFont(new Font("Calibri", 1, 16));
        Guardar.setForeground(new Color(0,0,0));
        Guardar.addActionListener(this);
        add(Guardar);

        imp = new JButton("Imprimir");
        imp.setBounds(300, 450, 170, 40);
        imp.setFont(new Font("Calibri", 1, 16));
        imp.setForeground(new Color(0,0,0));
        imp.addActionListener(this);
        add(imp);

        Ver_d = new JButton("Ver Detalles");
        Ver_d.setBounds(100, 450, 170, 40);
        Ver_d.setFont(new Font("Calibri", 1, 16));
        Ver_d.setForeground(new Color(0,0,0));
        Ver_d.addActionListener(this);
        add(Ver_d);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Guardar){
            String ID = id.getText();
            String COD = cod.getText();
            String NOMB = Nomb.getText();
            String DEC = dec.getText();
            String SEMES = semes.getText();
             if(ID.equals("") || COD.equals("") || NOMB.equals("") || DEC.equals("") || SEMES.equals("")){
                 JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
 
             }else{
                 Principal principal1 = new Principal();
                 this.setVisible(false);
             }

        }
        if(e.getSource() == imp){
            
        }
        if(e.getSource() == Ver_d){
            
        }
        
    
    }
    public static void main(String[] args) throws Exception {
        Facultades Facultades = new Facultades();
    }

}