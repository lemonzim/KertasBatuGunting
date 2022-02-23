package com.mycompany.kertasbatugunting;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Muhammad Hazim
 */
public class selepaslawanrobot extends JFrame implements ActionListener{
    JLabel mesej, gambar;
    JButton retry, Menu;
    private Container a;
    JPanel aa,aaa;
    something info = new something();
    public selepaslawanrobot(int c, int d){
     
    super("Kertas Batu Gunting");
    a = getContentPane();
    a.setLayout(new GridLayout(2,1));
    
    aa = new JPanel();
    aa.setLayout(new FlowLayout());
    
    aaa = new JPanel();
    aaa.setLayout(new FlowLayout());
    
    if(c>=5)
    {
        mesej = new JLabel("Tahniah! Kerana anda manusia menang!");
        gambar= new JLabel();
        gambar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\manusia.png"));
    }
    if(d>=5)
    {
        mesej = new JLabel("Oh tidak! Manusia Tewas!");
        gambar= new JLabel();
        gambar.setIcon(info.gambarrobot());
    }
    
    retry = new JButton("Retry");
    retry.addActionListener(this);
    
    Menu= new JButton("Menu");
    Menu.addActionListener(this);
    
    aa.add(gambar);
    aa.add(mesej);
    aaa.add(retry);
    aaa.add(Menu);
    
    a.add(aa);
    a.add(aaa);
    setSize(525,350);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==retry)
        {
            vsrobot kbg = new vsrobot();
            dispose();
        }
        else if(e.getSource()==Menu)
        {
            Menu mn = new Menu();
            dispose();
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
