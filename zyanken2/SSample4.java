import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SSample4 extends JFrame{
  ButtonGroup group;

  public static void main(String args[]){
    SSample4 frame = new SSample4("タイトル");
    frame.setVisible(true);
  }

  SSample4(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JRadioButton radio1 = new JRadioButton("グー");
    JRadioButton radio2 = new JRadioButton("チョキ");
    JRadioButton radio3 = new JRadioButton("パー");
    JRadioButton radio4 = new JRadioButton("Grape");

    group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    group.add(radio3);
    group.add(radio4);

    JButton button = new JButton("clear");
    button.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          group.clearSelection();
        }
      }
    );

    p.add(radio1);
    p.add(radio2);
    p.add(radio3);
    p.add(radio4);
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
