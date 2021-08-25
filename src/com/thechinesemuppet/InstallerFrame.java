package com.thechinesemuppet;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class InstallerFrame extends JFrame{
ImageIcon icon = new ImageIcon("logo.png");
JButton install;
    InstallerFrame(){
        Border border = BorderFactory.createLineBorder(new Color(1, 10, 73),1);
        this.getContentPane().setBackground(new Color(0,0,14));

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setSize(600,400);
        this.setResizable(false);
        this.setVisible(true);
        this.setIconImage(icon.getImage());
        this.getGraphics().draw3DRect(20,20,20,20,false);



        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
    public void typeFont(){

    }

    }

