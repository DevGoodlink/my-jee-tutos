

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.swing.*;

public class ClientRmi extends JFrame {
	JPanel contentPane= new JPanel();
	JLabel labelPersonne = new JLabel("Liste des personnes");
	JLabel labelMessage = new JLabel("Message à envoyer");
	JComboBox<String> listPersonne = new JComboBox<>();
	JTextField text1=new JTextField(20);
	//JList<String> listMessage=new JList<>();
	JButton btnSend = new JButton("Send");
	JButton btnAccount = new JButton("Create Account");
	JButton btnRefresh = new JButton("Refresh");
	
	JTextArea messages =new JTextArea(10,30);
	public ClientRmi(IntServeurRmi messagerie) {
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBounds(getBounds());
		setTitle("Client messagerie avec RMI");
		//contentPane.setLayout(new FlowLayout());
		contentPane.add(labelPersonne);
		listPersonne.addItem(new String("Personne1"));
		listPersonne.addItem(new String("Personne2"));
		listPersonne.addItem(new String("Personne3"));
		btnAccount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane ask=new JOptionPane();
				String value = JOptionPane.showInputDialog("Entrer le numéro du compte que vous souhaiter créer");
				try {
					messagerie.createAccount(Integer.parseInt(value));
					JOptionPane.showMessageDialog(getParent(),"Le compte "+value+" a été créé avec succés!");
				} catch (Exception ee) {
					// TODO Auto-generated catch block
					System.out.println(ee.getMessage());
				} 
				
			}
		});
		
		contentPane.add(listPersonne);
		contentPane.add(labelMessage);
		contentPane.add(text1);
		contentPane.add(btnSend);
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (text1.getText().equals("")) {
					JOptionPane.showMessageDialog(getParent(),"Veuillez saisir un message");
					return;
				}else{
					try {
						messagerie.sendMessage(listPersonne.getSelectedIndex(), destination, idMessage));
					} catch (Exception ee) {
						// TODO Auto-generated catch block
						System.out.println(ee.getMessage());
					} 
				}
				//String value = JOptionPane.showInputDialog("Entrer le numéro du compte que vous souhaiter créer");
				
				
			}
		});
		contentPane.add(btnRefresh);
		contentPane.add(btnAccount);
		contentPane.add(messages);
		contentPane.setVisible(true);
		setContentPane(contentPane);
	}
}
