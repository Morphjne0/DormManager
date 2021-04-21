import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    CenterPanel(){
        setLayout(new BorderLayout());
        ImageIcon img = new ImageIcon("img/symbol.png");
        JLabel logo = new JLabel(img);

        add(logo,BorderLayout.CENTER);
        //Color color = new Color(0x66FFCC);
        Color color = new Color(0xDCD3B7);//0xC8000000,0xABE4EC,0xDCD3B7
        setBackground(color);
    }
}
