package futbol;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class futbol extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					futbol frame = new futbol();
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
	public futbol() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int alto=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		int ancho=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int x=(ancho/2)-(450/2);
		int y=(alto/2)-(300/2);
		setBounds(x, y, 450, 300);
		//SetBounds(x,y,45)
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("nuevo");
		mntmNuevo.setIcon(new ImageIcon(futbol.class.getResource("/com/sun/java/swing/plaf/windows/icons/HardDrive.gif")));
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmGuardar = new JMenuItem("guardar");
		mntmGuardar.setIcon(new ImageIcon(futbol.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mnArchivo.add(mntmGuardar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmReglas = new JMenuItem("reglas");
		mntmReglas.addActionListener(new ActionListener() {
			
			/*Evento del menu*/
			public void actionPerformed(ActionEvent e) {
				System.out.println("Juegooo");
			}
			
			
			
			
			
		});
		mnAyuda.add(mntmReglas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.NORTH);
		
		JButton btnPlay = new JButton("Play");
		
		panelBotones.add(btnPlay);
		
		JButton btnPause = new JButton("pause");
		panelBotones.add(btnPause);
		
		 final JPanel panelJuego = new JPanel();
		contentPane.add(panelJuego, BorderLayout.CENTER);
		panelJuego.setLayout(new CardLayout(0, 0));
		
		
		Silvato pnlPresentacion = new Silvato();
		panelJuego.add(pnlPresentacion, "silbato");
		
		Cancha pnlCancha = new Cancha();
		panelJuego.add(pnlCancha,"cancha");
		
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout c= (CardLayout) panelJuego.getLayout();
				c.next(panelJuego);
				c.show(panelJuego, "Cancha");
				
				
				
			}
		});
		
		
		
		
		
		
		
		
		
	}

}
