
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class mainGUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    mainGUI frame = new mainGUI();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public mainGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 495, 380);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	textField = new JTextField();
	textField.setBounds(21, 21, 427, 41);
	contentPane.add(textField);
	textField.setColumns(10);

	JButton btn7 = new JButton("7");
	btn7.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {

		textField.setText(util.getReturnString(textField.getText(), "7"));
	    }
	});
	btn7.setBounds(21, 93, 86, 35);
	contentPane.add(btn7);

	JButton btn8 = new JButton("8");
	btn8.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		// textField.setText("8");
		textField.setText(util.getReturnString(textField.getText(), "8"));

	    }
	});
	btn8.setBounds(128, 93, 86, 35);
	contentPane.add(btn8);

	JButton btn9 = new JButton("9");
	btn9.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "9"));

	    }
	});
	btn9.setBounds(235, 93, 86, 35);
	contentPane.add(btn9);

	JButton btnPlus = new JButton("+");
	btnPlus.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "+"));

	    }
	});

	btnPlus.setBounds(342, 93, 86, 35);
	contentPane.add(btnPlus);

	JButton btn4 = new JButton("4");
	btn4.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "4"));

	    }
	});

	btn4.setBounds(21, 149, 86, 35);
	contentPane.add(btn4);

	JButton btn5 = new JButton("5");
	btn5.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "5"));

	    }
	});

	btn5.setBounds(128, 149, 86, 35);
	contentPane.add(btn5);

	JButton btn6 = new JButton("6");
	btn6.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "6"));

	    }
	});

	btn6.setBounds(235, 149, 86, 35);
	contentPane.add(btn6);

	JButton btnSubtract = new JButton("-");
	btnSubtract.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "-"));

	    }
	});
	btnSubtract.setBounds(342, 149, 86, 35);
	contentPane.add(btnSubtract);

	JButton btn1 = new JButton("1");
	btn1.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "1"));

	    }
	});

	btn1.setBounds(21, 205, 86, 35);
	contentPane.add(btn1);

	JButton btn2 = new JButton("2");
	btn2.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "2"));

	    }
	});
	btn2.setBounds(128, 205, 86, 35);
	contentPane.add(btn2);

	JButton btn3 = new JButton("3");
	btn3.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "3"));

	    }
	});
	btn3.setBounds(235, 205, 86, 35);
	contentPane.add(btn3);

	JButton btnMultiply = new JButton("x");
	btnMultiply.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "x"));

	    }
	});
	btnMultiply.setBounds(342, 205, 86, 35);
	contentPane.add(btnMultiply);

	JButton btn0 = new JButton("0");
	btn0.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "0"));

	    }
	});
	btn0.setBounds(128, 261, 86, 35);
	contentPane.add(btn0);

	JButton btnClear = new JButton("C");
	btnClear.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		// textField.setText(util.getReturnString(textField.getText(), "."));
		textField.setText("");

	    }
	});
	btnClear.setBounds(21, 261, 86, 35);
	contentPane.add(btnClear);

	JButton btnDivide = new JButton("/");
	btnDivide.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "/"));

	    }
	});
	btnDivide.setBounds(342, 261, 86, 35);
	contentPane.add(btnDivide);

	JButton btnEquals = new JButton("=");
	btnEquals.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		textField.setText(util.getReturnString(textField.getText(), "="));

	    }
	});

	btnEquals.setBounds(235, 261, 86, 35);
	contentPane.add(btnEquals);
    }
}
