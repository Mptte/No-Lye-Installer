package com.thechinesemuppet;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;




public class Main {


    public static void main(String[] args) throws IOException, FontFormatException {

        SplashScreen splashScreen = new SplashScreen();
        InstallerFrame installerFrame = new InstallerFrame();
        splashScreen.imgLabel.setText("Installed No Lye Overlay");
        splashScreen.done.setText("Press any key to escape");
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

