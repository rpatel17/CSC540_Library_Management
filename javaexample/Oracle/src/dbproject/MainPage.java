package dbproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton books = new JButton("Books");
		books.setBounds(15, 67, 115, 29);
		contentPane.add(books);
		
		JButton journals = new JButton("Journals");
		journals.setBounds(160, 67, 115, 29);
		contentPane.add(journals);
		
		JButton conferenceproceedings = new JButton("Conf_Proceedings");
		conferenceproceedings.setBounds(298, 67, 115, 29);
		contentPane.add(conferenceproceedings);
		
		JButton rooms = new JButton("Rooms");
		rooms.setBounds(91, 148, 115, 29);
		contentPane.add(rooms);
		
		JButton camera = new JButton("Camera");
		camera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		camera.setBounds(247, 148, 115, 29);
		contentPane.add(camera);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new HomePage().setVisible(true);
			}
		});
		back.setBounds(15, 215, 115, 29);
		contentPane.add(back);
		
		JButton profile = new JButton("Profile");
		profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayValues();
			}
		});
		profile.setBounds(15, 0, 115, 29);
		contentPane.add(profile);
	}

}
