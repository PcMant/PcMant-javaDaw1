import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class pruebaEditor {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEdad;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaEditor window = new pruebaEditor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pruebaEditor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JLabel lblMouse = new JLabel("Mouse:");
		lblMouse.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame = new JFrame();
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
				lblMouse.setText("Mouse: "+e.getX()+","+e.getY());
				
			}
		});
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 631, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBotn = new JButton("Registro");
		JTextArea Registros = new JTextArea();
		btnBotn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBotn.setForeground(Color.RED);
		btnBotn.setBackground(Color.CYAN);
		btnBotn.setBounds(33, 162, 241, 32);
		btnBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(frame/*donde va centrado*/, "Botón presionado");
				int edad = Integer.parseInt(txtEdad.getText());
				if(edad >= 18) {
					//JOptionPane.showMessageDialog(frame,"Registro OK!");
					Registros.setText(Registros.getText()+txtNombre.getText()+" "+txtApellido.getText()+"\n");
				}else {
					JOptionPane.showMessageDialog(frame,"Imposible registrar", "Error",0);
				}
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnBotn);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombre.setBounds(34, 26, 96, 19);
		frame.getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(144, 26, 130, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblApellido.setBounds(33, 56, 97, 19);
		frame.getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(143, 56, 130, 20);
		frame.getContentPane().add(txtApellido);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEdad.setBounds(33, 86, 97, 19);
		frame.getContentPane().add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(143, 86, 130, 20);
		frame.getContentPane().add(txtEdad);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelfono.setBounds(34, 120, 96, 19);
		frame.getContentPane().add(lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(144, 120, 130, 20);
		frame.getContentPane().add(txtTelefono);
		
		
		lblMouse.setBounds(33, 217, 209, 33);
		frame.getContentPane().add(lblMouse);
		
		
		Registros.setFont(new Font("Monospaced", Font.BOLD, 16));
		Registros.setEnabled(false);
		Registros.setEditable(false);
		Registros.setBounds(290, 25, 265, 169);
		frame.getContentPane().add(Registros);
	}
}
