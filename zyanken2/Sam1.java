
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
  
  
  class Sam1 extends JFrame implements ActionListener{
    JRadioButton[] radio;
  
    public Sam1(String title){
      setTitle(title);
      setBounds(100, 100, 300, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  
      JPanel p = new JPanel();
  
      radio = new JRadioButton[3];
      radio[0] = new JRadioButton("グー");
      radio[1] = new JRadioButton("チョキ", true);
      radio[2] = new JRadioButton("パー");
  
      ButtonGroup group = new ButtonGroup();
      group.add(radio[0]);
      group.add(radio[1]);
      group.add(radio[2]);
  
      p.add(radio[0]);
      p.add(radio[1]);
      p.add(radio[2]);
  
      JPanel buttonpanel = new JPanel();
  
      JButton button = new JButton("ボタン");
      button.addActionListener(this);
  
      buttonpanel.add(button);
  
      Container contentPane = getContentPane();
      contentPane.add(p, BorderLayout.CENTER);
      contentPane.add(buttonpanel, BorderLayout.SOUTH);
  
     // Judgement judge = new Judgement();
    }
  
    public static void main(String args[]){
      Sam1 frame = new Sam1("じゃんけん");
      frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
     // String name = "";
  
      for (int i = 0 ; i < radio.length; i++){
        if (radio[i].isSelected()){
          Judgement.setYourHand = radio[i];
        }
      }
    /*
    public void actionPerformed(ActionEvent e){
      String name = "";
  
      for (int i = 0 ; i < radio.length; i++){
        if (radio[i].isSelected()){
          name = radio[i].getText();
        }
      }
  
      JLabel msg = new JLabel(name);
      JOptionPane.showMessageDialog(this, msg);
    }  
    */
  }

