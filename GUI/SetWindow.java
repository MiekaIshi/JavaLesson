import javax.swing.JFrame;

public class SetWindow {
    public static void main(String args[]){
        JFrame frame = new JFrame("タイトル");
        frame.setBounds(100, 100, 200, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
}