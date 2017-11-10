/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thai.demo3.java.ui;

import com.sun.jndi.toolkit.url.Uri;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author 段晓强
 */
public class CustomPanel extends JPanel {
    Image image=null;
    @Override
    public void paint(Graphics g){
        try {
            image = ImageIO.read(new File(getClass().getResource("/com/thai/demo3/java/resources/trans_demo.png").toURI()));
            g.drawImage(image, 0, 0, 768, 1024, null);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
      
    }
}
