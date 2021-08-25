package com.thechinesemuppet;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class InstallerFrame extends JFrame{
ImageIcon icon = new ImageIcon("logo.png");
JButton install;

    InstallerFrame() throws IOException {
        System.getProperty("java.io.tmpdir");
        FileUtils.copyURLToFile(
                new URL("https://github.com/whatsaxis/No-Lye-Overlay/releases/latest/download/No.Lye.Overlay.1.1.0.exe"),new File(FileUtils.getUserDirectoryPath() + "/Desktop/" + "No Lye Overlay.exe"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        Runtime.getRuntime().exec(FileUtils.getUserDirectoryPath() + "/Desktop/No Lye Overlay.exe", null, new File(FileUtils.getUserDirectoryPath() + "/Desktop/"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }



    }

