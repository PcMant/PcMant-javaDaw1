import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionEvent;

public class converTemp extends JFrame {

	private JPanel contentPane;
	private JTextField txtCel;
	private JTextField textFare;
	
	/**
	 * Método que redondea decimales de tipo float
	 * @param numero -número a formatear
	 * @param numeroDecimales - número de decimales
	 * @return - el valor redondeado
	 */
	public static float redondeoDecimales(float numero, int numeroDecimales) {
	    BigDecimal redondeado = new BigDecimal(numero).setScale(numeroDecimales, RoundingMode.HALF_EVEN);
	    return redondeado.floatValue();
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converTemp frame = new converTemp();
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
	public converTemp() {
		setResizable(false);
		setTitle("Conversor de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCelsi = new JLabel("\u00BAC");
		lblCelsi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCelsi.setBounds(136, 104, 20, 14);
		contentPane.add(lblCelsi);
		
		JLabel lbFare = new JLabel("\u00BAF");
		lbFare.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbFare.setBounds(305, 104, 46, 14);
		contentPane.add(lbFare);
		
		txtCel = new JTextField();
		txtCel.setText("0.0");
		txtCel.setBounds(45, 103, 86, 20);
		contentPane.add(txtCel);
		txtCel.setColumns(10);
		
		JLabel lblCelsi_1_1 = new JLabel("=");
		lblCelsi_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCelsi_1_1.setBounds(179, 102, 31, 14);
		contentPane.add(lblCelsi_1_1);
		
		textFare = new JTextField();
		textFare.setText("0.0");
		textFare.setBounds(209, 103, 86, 20);
		contentPane.add(textFare);
		textFare.setColumns(10);
		
		JButton btnFare = new JButton("A FAHRENHEIT");
		btnFare.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				float cel = Float.parseFloat(txtCel.getText());
				float calcu = (float) (cel*1.8+32);
				calcu = redondeoDecimales(calcu, 2);
				String far = String.valueOf(calcu);
				textFare.setText(far);
			}
		});
		btnFare.setBounds(45, 138, 124, 23);
		contentPane.add(btnFare);
		
		JButton btnNewButton_1 = new JButton("A CELSIUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float far = Float.parseFloat(textFare.getText());
				float calcu = (float) ((far-32)/1.8);
				calcu = redondeoDecimales(calcu, 2);
				String cel = String.valueOf(calcu);
				txtCel.setText(cel);
			}
		});
		btnNewButton_1.setBounds(184, 138, 111, 23);
		contentPane.add(btnNewButton_1);
	}
}
