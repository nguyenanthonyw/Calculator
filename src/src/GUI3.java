import javax.swing.*;

public class GUI3 extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;

    public GUI3(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new GUI3("Calculator");
        frame.setVisible(true);
    }


}