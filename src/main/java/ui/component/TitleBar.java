package ui.component;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    // data variable
    private int widthScreen = 0;
    private int heightScreen = 0;
    private int width = 0;
    private int height = 0;
    private String title = "OPSC Music";
    // component variable
    private JLabel lbTitle = new JLabel();
    private JLabel lbClose = new JLabel("Close");
    public TitleBar (int width, int height) {

        this.widthScreen = width;
        this.heightScreen = height;
        this.width = this.widthScreen;
        this.height = this.heightScreen/10;
        this.setLayout(new BorderLayout());

        lbTitle.setPreferredSize(new Dimension(this.width/5, this.height));
        lbTitle.setText(title);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setFont(new Font("iCiel Gotham Medium", 0, 18));
        lbTitle.setForeground(Color.white);

        lbClose.setOpaque(true);
        lbClose.setPreferredSize(new Dimension(this.width/15, this.height));
        lbClose.setHorizontalAlignment(SwingConstants.CENTER);
        lbClose.setFont(new Font("iCiel Gotham Medium", 0, 18));
        lbClose.setForeground(Color.white);
        lbClose.setBackground(Color.RED);


        this.setPreferredSize(new Dimension(this.width, this.height));
        this.setBackground(new Color(29,8,73,255));
        this.add(lbTitle, BorderLayout.WEST);
        this.add(lbClose, BorderLayout.EAST);
    }
}
