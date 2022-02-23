package com.mycompany.kertasbatugunting;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Muhammad Hazim
 */

public class something extends JFrame{
    private Random random;
    private String nama1,nama2,tangan;
    ImageIcon icon = null;
    public void setnama1 (String n){nama1 =n;}
    public String getnama1(){return nama1;}
    public void setnama2 (String n){nama2 =n;}
    public String getnama2(){return nama2;}
    public ImageIcon pilihtangan(int n)
    {
        switch (n) {
            case 0:
                icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\kertas.png");
                break;
            case 1:
                icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\batu.png");
                break;
            case 2:
                icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\gunting.png");
                break;

        }       return icon;
    }
        public String gettangan(int n)
    {
        switch (n) {
            case 0:
                tangan = "kertas";
                break;
            case 1:
                tangan = "batu";
                break;
            case 2:
                tangan = "gunting";
                break;

        }       return tangan;
    }
    public ImageIcon setgambar(int n)
    {
        
        switch (n) {
            case 0 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\man.png");
            case 1 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\woman.png");
            case 2 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\boy.png");
            case 3 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\girl.png");
            case 4 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\artistman.png");
            case 5 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\artistwoman.png");
            case 6 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\captainman.png");
            case 7 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\captainwoman.png");
            case 8 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\Decman.png");
            case 9 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\Decwoman.png");
            case 10 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\cat.png");
            case 11 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\chicken.png");
            case 12 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\cow.png");
            case 13 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\doplhin.png");
            case 14 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\squirrel.png");
            case 15 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\ship.png");
            case 16 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\rocket.png");
            case 17 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\lorry.png");
            case 18 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\helicopter.png");
            default -> {
            }
        }
        return icon;       
    }
    public ImageIcon randomsetgambar()
    {   

        random = new Random();
        random.nextInt(1, 4);
        ImageIcon icon = null;
        switch (random.nextInt(1,19)) {
            case 0 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\man.png");
            case 1 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\woman.png");
            case 2 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\boy.png");
            case 3 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\girl.png");
            case 4 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\artistman.png");
            case 5 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\artistwoman.png");
            case 6 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\captainman.png");
            case 7 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\captainwoman.png");
            case 8 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\Decman.png");
            case 9 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\Decwoman.png");
            case 10 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\cat.png");
            case 11 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\chicken.png");
            case 12 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\cow.png");
            case 13 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\doplhin.png");
            case 14 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\squirrel.png");
            case 15 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\ship.png");
            case 16 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\rocket.png");
            case 17 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\lorry.png");
            case 18 -> icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\helicopter.png");
            default -> {
            }
        }
        return icon;       
    }
        public ImageIcon gambarrobot()
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\robot.png");
        return icon;
    }
            public ImageIcon heart()
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\heart.png");
        return icon;
    }
    
        public ImageIcon heartbreak()
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Muhammad Hazim\\Downloads\\heartbreak.png");
        return icon;
    }

}
