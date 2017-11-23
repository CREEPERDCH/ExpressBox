/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thai.demo3.java.ui;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author 段晓强
 */
public class CustomPanel1 extends JPanel {
    Image image=null;
    @Override
    public void paint(Graphics g){
        try {
            image = ImageIO.read(new File(getClass().getResource("/com/thai/demo3/java/resources/custom_new.png").toURI()));
            g.drawImage(image, 0, 0, 768, 370, null);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
