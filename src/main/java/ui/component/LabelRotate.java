package ui.component;

import bll.PictureHelpers;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LabelRotate extends JLabel {
    private BufferedImage dvdImage = null;
    private float i = 0;
    private boolean isStop = false;
    private int width, height;
    public LabelRotate(int width, int height) {
        this.width = width;
        this.height =height;
        try {
            dvdImage = ImageIO.read(new File("src/main/java/resource/img/cd.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedImage scaleImage = PictureHelpers.resizeImg(dvdImage, height*2/3, height*2/3);
        this.dvdImage = scaleImage;

    }

    public void setStop(boolean stop) {
        isStop = stop;
    }

    public void paintComponent(Graphics g) {
        BufferedImage image = (BufferedImage) dvdImage;
        AffineTransform at = AffineTransform.getTranslateInstance(width/5,height/20);
        at.rotate(Math.toRadians(i+=0.2), image.getWidth()/2, image.getHeight()/2);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, at, null);
        if (isStop == false) {
            repaint();
        }
    }
}
