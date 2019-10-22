import javax.swing.*;
import java.awt.*;


public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        ImageIcon iijpg=new ImageIcon(GUI8_ImageIcon.class.getResource("img/youtubejpg.jpg"));
        ImageIcon iijpg_adit=new ImageIcon(iijpg.getImage().getScaledInstance(iijpg.getIconWidth()/4,iijpg.getIconHeight()/4,Image.SCALE_DEFAULT));
        JLabel lbII = new JLabel(iijpg_adit);
        ImageIcon iipng=new ImageIcon(GUI8_ImageIcon.class.getResource("img/youtubepng.png"));
        ImageIcon iipng_adit=new ImageIcon(iipng.getImage().getScaledInstance(iipng.getIconWidth()/2,iipng.getIconHeight()/2,Image.SCALE_DEFAULT));
        JButton btII = new JButton(iipng_adit);

        panel.add(lbII);
        panel.add(btII);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
