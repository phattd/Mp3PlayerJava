package ui.component;

import javax.swing.*;
import java.awt.*;

public class ListMusic extends JPanel {
    // data variable
    private int widthScreen = 0;
    private int heightScreen = 0;
    private int width = 0;
    private int height = 0;

    public ListMusic(int width, int height) {
        this.widthScreen = width;
        this.heightScreen = height;
        this.width = this.widthScreen*2/5;
        this.height = this.heightScreen - (this.heightScreen/10);
        this.setPreferredSize(new Dimension(this.width, this.height));
        this.setBackground(new Color(10,8,100,255));

        //rgba(98,4,174,255)

    }
}