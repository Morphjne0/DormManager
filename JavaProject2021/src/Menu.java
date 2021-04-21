import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {

    JButton bt1 = new JButton("현재원 관리");
    JButton bt2 = new JButton(" 특이사항 ");
    JButton bt3 = new JButton("외박자 관리");
    JButton bt4 = new JButton("상.벌점 관리");
    JButton bt5 = new JButton("로그아웃");
    JLabel trash = new JLabel("                                                                                         ");
    ManageTab ManTab;
    StdTab STab;
    Login login;
    Menu menu;
    CenterPanel cenP;
    JPanel MP = new JPanel();
    JPanel LP = new JPanel();
    public Menu() {
        setLayout(new BorderLayout());
        Color color = new Color(0xFFFF99);//0xDEDEDE
        setBackground(color);
            MP.setBackground(color);
            LP.setBackground(color);
        add(MP,BorderLayout.CENTER);
        add(LP,BorderLayout.EAST);
        MP.add(bt1);
        MP.add(bt2);
        MP.add(bt3);
        MP.add(bt4);
        LP.add(bt5);
        bt1.addActionListener(new MenuAL());
        bt2.addActionListener(new MenuAL());
        bt3.addActionListener(new MenuAL());
        bt4.addActionListener(new MenuAL());
        bt5.addActionListener(new MenuAL());


    }
    class MenuAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            DormManager DM = (DormManager) getTopLevelAncestor();



            Object[]option={"확인"};
            if (b.getText().equals("현재원 관리")) {

                JOptionPane.showOptionDialog(null, "현재원 관리 화면으로 이동합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);
                DM.viewP(new ManageTab());


            } if (b.getText().equals("특이사항")) {
                JOptionPane.showOptionDialog(null, "특이사항 화면으로 이동합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);

                //DM.viewP(new EditPanel());
            } if (b.getText().equals("외박자 관리")) {
                JOptionPane.showOptionDialog(null, "삭제화면으로 이동합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);

                //main.viewPanel(new DeletePanel());
            } if (b.getText().equals("조회")) {
                System.out.println("조회창으로 이동합니다.");
                JOptionPane.showOptionDialog(null, "조회화면으로 이동합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);
                //       DM.viewP(new ListPanel());

            } if (b.getText().equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                JOptionPane.showOptionDialog(null, "프로그램을 종료합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);

                System.exit(0);
            }
        }
    }
}

