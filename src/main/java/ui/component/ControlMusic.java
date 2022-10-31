package ui.component;

import entity.ControlCommand;
import entity.TransferAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControlMusic extends JPanel{
    // data variable
    private int widthParent = 0;
    private int heightParent = 0;
    private int width = 0;
    private int height = 0;
    private boolean isRepeat = false, isMute = false, isPlay = true;

    // component variable
    private JLabel lbtitleMusic = new JLabel("No name");
    private JProgressBar jProgressBar = new JProgressBar(0, 100);
    private JPanel controlBar = new JPanel();
    private JLabel play, next, prev, repeat,mute;

    public String getTitleMusic() {
        return lbtitleMusic.getText();
    }

    public void setTitleMusic(String titleMusic) {
        this.lbtitleMusic.setText(titleMusic);
    }

    public boolean isPlay() {
        return isPlay;
    }

    public void setPlay(boolean play) {
        isPlay = play;
    }

    public ControlMusic(int width, int height) {
        this.widthParent = width;
        this.heightParent = height;
        this.width = this.widthParent;
        this.height = this.heightParent/3;
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(this.width, this.height));
        initilize();

    }
    private void initilize(){
        delarceComponent();
        setLocationComponent();

    }
    private void delarceComponent() {
        play = new JLabel();
        next =new JLabel();
        prev = new JLabel();
        repeat = new JLabel();
        mute = new JLabel();

    }
    private void setLocationComponent() {
        lbtitleMusic.setPreferredSize(new Dimension(width, height/8));
        lbtitleMusic.setForeground(Color.white);
        lbtitleMusic.setHorizontalAlignment(SwingConstants.CENTER);
        lbtitleMusic.setFont(new Font("iCiel Gotham Medium", 0, 18));
        this.add(lbtitleMusic);

        jProgressBar.setPreferredSize(new Dimension(width*2/3, height/12));
        jProgressBar.setStringPainted(true);
        jProgressBar.setString("Thời lượng");
        jProgressBar.setValue(20);
        this.add(jProgressBar);

        controlBar.setPreferredSize(new Dimension(width*4/5, height/2));
        controlBar.setOpaque(false);
        controlBar.setLayout(new FlowLayout(FlowLayout.CENTER, width/15, height/15));
        repeat.setIcon(new ImageIcon("src/main/java/resource/img/repeat.png"));

        prev.setIcon(new ImageIcon("src/main/java/resource/img/prev.png"));
        play.setIcon(new ImageIcon("src/main/java/resource/img/play.png"));
        play.setName("play");
        play.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isPlay == true) {
                    isPlay = false;
                    play.setIcon(new ImageIcon("src/main/java/resource/img/pause.png"));
                    TransferAction.setControlCommand(ControlCommand.PAUSE);
                } else {
                    isPlay = true;
                    play.setIcon(new ImageIcon("src/main/java/resource/img/play.png"));
                    TransferAction.setControlCommand(ControlCommand.PLAY);
                }
            }
        });


        next.setIcon(new ImageIcon("src/main/java/resource/img/next.png"));
        mute.setIcon(new ImageIcon("src/main/java/resource/img/sound.png"));

        controlBar.add(repeat);
        controlBar.add(prev);
        controlBar.add(play);
        controlBar.add(next);
        controlBar.add(mute);
        this.add(controlBar);

    }
}
