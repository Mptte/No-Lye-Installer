package com.thechinesemuppet;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;




public class Main {


    public static void main(String[] args) throws IOException, FontFormatException {

        SplashScreen splashScreen = new SplashScreen();
        InstallerFrame installerFrame = new InstallerFrame();

        splashScreen.revalidate();
        splashScreen.repaint();




    }
}

