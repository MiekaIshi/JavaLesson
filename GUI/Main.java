import javax.swing.*;
import java.awt.event.*;;

class Main extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label;
    // 追加部分
    private JButton button;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        panel = new JPanel();
        label = new JLabel("おめでとう");
        // 追加部分
        button = new JButton("クリック");
        panel.setLayout(null);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(200, 150);
        button.setLocation(50, 200);
        button.setSize(100, 50);
        button.addActionListener(this);
        panel.add(button);

        panel.add(label);
        this.add(panel);
        this.setSize(200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("ここをクリック");
    }
    
}