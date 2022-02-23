package com.mycompany.kertasbatugunting;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Muhammad Hazim
 */
public class selepaslawanmanusia extends JFrame implements ActionListener{
    JLabel mesej;
    JButton retry, Menu;
    private Container a;
    JPanel aa,aaa;
    something info = new something();
    public selepaslawanmanusia(String b, String c, int d, int e, JLabel f, JLabel g, ImageIcon player, ImageIcon player2){
     
    super("Kertas Batu Gunting");
    a = getContentPane();
    a.setLayout(new GridLayout(2,1));
    
    aa = new JPanel();
    aa.setLayout(new FlowLayout());
    
    aaa = new JPanel();
    aaa.setLayout(new FlowLayout());
    
    f= new JLabel();
    f.setIcon(player);
    g= new JLabel();
    g.setIcon(player2);
    
    if(d == e)
    {
        mesej = new JLabel("Seri! Anda berdua tidak menang!");

        aa.add(f);
        aa.add(g);
    
    }
    else if(d>=5)
    {
        mesej = new JLabel( "Tahniah! " + b +" Anda Menang!");;
        aa.add(f);
    }
    else if(e>=5)
    {
        mesej = new JLabel("Tahniah! " + c +" Anda Menang!");
        aa.add(g);
    }
    
    retry = new JButton("Retry");
    retry.addActionListener(this);
    
    Menu= new JButton("Menu");
    Menu.addActionListener(this);
    

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
            vsmanusia kbg = new vsmanusia();
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
