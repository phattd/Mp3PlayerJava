package ui.component;

import entity.TransferAction;

import javax.swing.*;
import java.awt.*;

public class MusicPlayer extends JPanel {
    // data variable
    private int widthScreen = 0;
    private int heightScreen = 0;
    private int width = 0;
    private int height = 0;

    //component variable
    private ControlMusic controlMusic;
    private JPanel pnBackground;
    private LabelRotate dvdAnimation;

    public MusicPlayer(int width, int height) {
        this.widthScreen = width;
        this.heightScreen = height;
        this.width = this.widthScreen*3/5;
        this.height = this.heightScreen - (this.heightScreen/10);
        this.setPreferredSize(new Dimension(this.width, this.height));
        this.setBackground(new Color(10,8,125,255));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        initilize();
    }
    private void initilize(){
        delarceComponent();
        setLocationComponent();
    }
    private void delarceComponent() {
        controlMusic = new ControlMusic(this.width, this.height);
        pnBackground = new JPanel();
        dvdAnimation = new LabelRotate(this.width, this.height);

    }

    private void setLocationComponent() {
        pnBackground.setOpaque(false);
        pnBackground.setPreferredSize(new Dimension(this.width, this.height*2/3));
        dvdAnimation.setHorizontalAlignment(SwingConstants.CENTER);
        dvdAnimation.repaint();
        pnBackground.setLayout(new BorderLayout());
        pnBackground.add(dvdAnimation);
        this.add(pnBackground, BorderLayout.CENTER);
        this.add(controlMusic, BorderLayout.SOUTH);
    }
    public void playStatus() {
        dvdAnimation.setStop(false);
        dvdAnimation.repaint();
    }
    public void pauseStatus() {
        dvdAnimation.setStop(true);
        System.out.println("stop");
        dvdAnimation.repaint();
    }




}
