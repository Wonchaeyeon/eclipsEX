import javax.swing.*;
import java.awt.*;


public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        ImageIcon iijpg=new ImageIcon("src/img/youtubejpg.jpg");
        JLabel lbII = new JLabel(iijpg);
        ImageIcon iipng=new ImageIcon("src/img/youtubepng.png");
        JLabel btII = new JLabel(iipng);

        panel.add(lbII);
        panel.add(btII);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
