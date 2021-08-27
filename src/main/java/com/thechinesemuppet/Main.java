package com.thechinesemuppet;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class Main {


    public static void main(String[] args) throws IOException, TimeoutException{

        SplashScreen splashScreen = new SplashScreen();
        InstallerFrame installerFrame = new InstallerFrame(splashScreen);
        splashScreen.imgLabel.setText("Installed No Lye Overlay");
        splashScreen.done.setForeground(new Color(255, 255, 255));
        splashScreen.add(splashScreen.done);
        splashScreen.revalidate();
        splashScreen.repaint();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        splashScreen.dispose();
        splashScreen.revalidate();
        splashScreen.repaint();





    }
}

