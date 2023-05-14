import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameCrear extends JFrame {

	private static FrameCrear frame;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtVidaMax;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private DefaultComboBoxModel<Habilidad> modelo;
	private JComboBox comboBox;
	private JRadioButton rdbSireno;
	private JRadioButton rdbFenix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FrameCrear();
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
	public FrameCrear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(201, 38, 143, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtVidaMax = new JTextField();
		txtVidaMax.setBounds(201, 83, 143, 20);
		contentPane.add(txtVidaMax);
		txtVidaMax.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(82, 41, 68, 14);
		contentPane.add(lblNombre);
		
		JLabel lblVida = new JLabel("VIDA MÁXIMA");
		lblVida.setBounds(82, 86, 86, 14);
		contentPane.add(lblVida);
		
		JLabel lblNHabilitad = new JLabel("HABILIDAD");
		lblNHabilitad.setBounds(82, 135, 68, 14);
		contentPane.add(lblNHabilitad);
		
		modelo = new DefaultComboBoxModel<>();
		Habilidad hab1 = new Habilidad("Volar", 5, 0);
		modelo.addElement(hab1);
		
		comboBox = new JComboBox(modelo);
		comboBox.setBounds(201, 131, 143, 22);
		contentPane.add(comboBox);
		
		rdbSireno = new JRadioButton("SIRENO");
		buttonGroup.add(rdbSireno);
		rdbSireno.setBounds(201, 174, 68, 23);
		contentPane.add(rdbSireno);
		
		rdbFenix = new JRadioButton("FÉNIX");
		buttonGroup.add(rdbFenix);
		rdbFenix.setBounds(282, 174, 109, 23);
		contentPane.add(rdbFenix);
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = txtNombre.getText();
				int vida = Integer.parseInt(txtVidaMax.getText());
				Habilidad hab = (Habilidad) comboBox.getSelectedItem();
				if (rdbSireno.isSelected()) {
					Sireno sir = new Sireno(vida, vida, nom, hab);
					main.listaPodemon.add(sir);
					frame.dispose();
				}
				if (rdbSireno.isSelected()) {
					Fenix fen = new Fenix(vida, vida, nom, hab, false);
					main.listaPodemon.add(fen);
					frame.dispose();
				}
			}
		});
		btnCrear.setBounds(224, 204, 89, 23);
		contentPane.add(btnCrear);
	}
}
