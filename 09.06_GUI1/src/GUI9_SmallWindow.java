import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SmallWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton bt0=new JButton("작은 창1");
        JButton bt1=new JButton("작은 창2");

        JDialog dialog = new JDialog(frame,"다이얼로그",false);   //modal:(True)자신이 꺼지지 않으면 원래 창이 활성화 되지 않음
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);
        //dialog.pack();
        dialog.setSize(new Dimension(100,200));


        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(  frame,"메시지","제목",JOptionPane.INFORMATION_MESSAGE);
//                  int select=JOptionPane.showConfirmDialog(null,"저장할까요?.");
//                  System.out.println(select);
                String luckyNumber=JOptionPane.showInputDialog(frame,"너의 행운의 번호는?");
                System.out.println(luckyNumber);
            }
        });
//그냥 입력만 받을수 있는 작은 창,/ 버튼 등의 배치도 가능
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dialog.setVisible(true);
            }
        });


        panel.add(bt0);
        panel.add(bt1);
        frame.add(panel);


        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
