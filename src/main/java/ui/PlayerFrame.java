package ui;

import entity.TransferAction;
import ui.component.ListMusic;
import ui.component.MusicPlayer;
import ui.component.TitleBar;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class PlayerFrame extends JFrame {
    //data variable
    private final double SCREEN_RATION_MODE_1 = 0.6666666666666;
    private int height, width;
    //component variable
    private TitleBar titleBar;
    private ListMusic listMusic;
    private MusicPlayer musicPlayer;
    public PlayerFrame() {
        initComponent();
    }
    private void initComponent() {

        this.setLayout(new BorderLayout());
        this.setUndecorated(true);

        delarceComponent();
        setLocationComponent();
        eventHandling();
        this.setShape(new RoundRectangle2D.Double(0, 0, width, height, 20, 20));
        this.setSize(new Dimension(width, height));
        this.setLocationRelativeTo(null);



    }
    private void setFrameSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double widthScreen = screenSize.getWidth();
        double heightScreen = screenSize.getHeight();
        this.height = (int) (heightScreen * SCREEN_RATION_MODE_1);
        this.width = (int) (widthScreen * SCREEN_RATION_MODE_1);

    }
    private void delarceComponent() {
        setFrameSize();
        titleBar = new TitleBar(width, height);
        listMusic = new ListMusic(width, height);
        musicPlayer = new MusicPlayer(width, height);
    }
    private void setLocationComponent(){
        this.add(titleBar, BorderLayout.NORTH);
        this.add(listMusic, BorderLayout.WEST);
        this.add(musicPlayer, BorderLayout.EAST);
    }
    private void eventHandling() {
        TransferAction.addPropertyChangeListener(e ->
                System.out.println( e.getNewValue()));
    }

}
