package com.thechinesemuppet;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import java.io.*;
import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.rmi.RemoteException;
import java.sql.Time;
import java.util.concurrent.TimeoutException;

public class InstallerFrame extends JFrame{
ImageIcon icon = new ImageIcon("logo.png");
JButton install;
String release = "https://github.com/whatsaxis/No-Lye-Overlay/releases/latest/download/No.Lye.Overlay.1.1.0.exe";

    InstallerFrame(JFrame main) throws IOException{

        File apipath = new File(FileUtils.getTempDirectoryPath() + "no_lye_installer_gh_api.json");
        FileUtils.copyURLToFile(
                new URL("https://api.github.com/repos/whatsaxis/No-Lye-Overlay/releases/latest"),apipath);

        try {
            File path = new File(FileUtils.getUserDirectoryPath() + "/Desktop/" + "No Lye Overlay.exe");
            FileUtils.copyURLToFile(
                    new URL("https://github.com/whatsaxis/No-Lye-Overlay/releases/latest/download/No.Lye.Overlay.1.1.0.exe"),path);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }

            Runtime.getRuntime().exec(FileUtils.getUserDirectoryPath() + "/Desktop/No Lye Overlay.exe", null, new File(FileUtils.getUserDirectoryPath() + "/Desktop/"));
        }catch (Exception e){
            if(e instanceof TimeoutException || e instanceof IOException || e instanceof MalformedURLException || e instanceof ProtocolException){
                main.dispose();
            }


        }



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }



    }

