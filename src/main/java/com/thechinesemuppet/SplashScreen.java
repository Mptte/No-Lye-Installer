package com.thechinesemuppet;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SplashScreen extends JFrame {
    public static void main(String[] args){

    }


    Font font = null;
    JLabel done;
    JLabel imgLabel;
    ImageIcon logo;
    JPanel ChildPanel1;

    SplashScreen(){
        new JFrame();
        logo = new ImageIcon(getClass().getResource("/logo.png"));
        imgLabel = new JLabel(new ImageIcon(getClass().getResource("/logo_splash.gif")));
        done  = new JLabel("");



        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 3);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 3);
        this.setLocation(x, y);

        Border border = BorderFactory.createLineBorder(new Color(1, 10, 73),1);

        imgLabel.setSize(300,300);
        imgLabel.setBorder(border);

        imgLabel.setText("Installing No Lye Overlay");
        imgLabel.setForeground(new Color(255,255,255));
        imgLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
        imgLabel.setIconTextGap(30);

        imgLabel.setHorizontalTextPosition(JLabel.CENTER);
        imgLabel.setVerticalTextPosition(JLabel.BOTTOM);
        imgLabel.setVerticalAlignment(JLabel.CENTER);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);

        done.setHorizontalTextPosition(JLabel.CENTER);
        done.setVerticalTextPosition(JLabel.BOTTOM);
        done.setVerticalAlignment(JLabel.BOTTOM);
        done.setHorizontalAlignment(JLabel.CENTER);


        this.add(done);
        this.add(imgLabel);



        this.setUndecorated(true);
        this.setIconImage(logo.getImage());
        this.setVisible(true);
        this.setSize(600,400);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0,0,15));


        this.add(imgLabel, BorderLayout.CENTER);

        this.setVisible(true);
        this.revalidate();
        this.repaint();




    }
    }
