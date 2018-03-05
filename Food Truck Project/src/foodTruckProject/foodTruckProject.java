package foodTruckProject;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;

public class foodTruckProject extends JFrame {
	private static final long serialVersionUID = 1L;
	
	double total = 0.0;
	double input = 0.0; 
	
	public static void main(String[] args)
	{
		foodTruckProject frame = new foodTruckProject();
		frame.setVisible(true);
	}

	public foodTruckProject() 
	{
		// Frame title
		setTitle("--- Food Truck Project---");
			
		//NumberFormat formatter = new DecimalFormat("#0.00");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// size of the frame
		setSize(975,800);
		
		// panel title
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(), 
				              "Food Truck Project"));;
		setContentPane(contentPane);
	
		//text view for the title 
		JLabel lblNewLabel_1 = new JLabel( "FOOD TRUCK PROJECT");
		lblNewLabel_1.setBounds(10, 41, 124 ,34);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(763, 11, 168, 382);
		textArea.setEditable(false);
		
		contentPane.add(textArea);
		

		// field where total accumulating price is being displayed
		JTextField textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(807, 420, 124, 34);
		contentPane.add(textField);
		textField.setColumns(10);
					
		// field where total change is displayed 
		JTextField textField3 = new JTextField();
		textField3.setEditable(false);
		textField3.setBounds(807, 590, 124, 34);
		contentPane.add(textField3);
		textField3.setColumns(10);
					
		//field where cash tendered is being input 
		JTextField textField2 = new JTextField(20); 
		textField2.setBounds(697, 490, 200, 23);
		contentPane.add(textField2);
		textField2.addActionListener(new ActionListener() {
			public void ActionPerformed ( final ActionEvent e) { 
					input = textField2.hashCode(); 
					
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
			}
		});
		
		
		
		
		//text field for main items, sides, and drinks 
	
		JLabel lblNewLabel_2 = new JLabel( "Main Items:");
		lblNewLabel_2.setBounds(10,100, 124 ,34);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel( "Sides:");
		lblNewLabel_3.setBounds(10,250, 124 ,34);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel( "Drinks:");
		lblNewLabel_4.setBounds(10,500, 124 ,34);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4);
		
		//Main Item Drop Down Button 
		JComboBox<Object> comboBoxMain = new JComboBox<Object>();
		comboBoxMain.setModel(new DefaultComboBoxModel<Object>(new String[] { "item", "Chicken Taco", "Beef Taco", "Shrimp Taco", "Crab Taco", "Cheese Burger", "Hot Dogs", "Burger" }));
		comboBoxMain.setBounds(10, 130, 126, 20);
		contentPane.add(comboBoxMain); 
		
		//Main Item sides 
		JComboBox<Object> comboBoxMainSides = new JComboBox<Object>();
		comboBoxMainSides.setModel(new DefaultComboBoxModel<Object>(new String[] {"lettuce", "mushroom", "onions", "bacon", "avocado"}));
		comboBoxMainSides.setBounds(15, 130, 126, 20);
		contentPane.add(comboBoxMainSides); 
		
	
		// Sides Drop Down Button 
		JComboBox<Object> comboBoxSides = new JComboBox<Object>();
		comboBoxSides.setModel(new DefaultComboBoxModel<Object>(new String[] { "rice", "lettuce", "beans", "french fries"}));
		comboBoxSides.setBounds(10, 260, 126, 20);
		contentPane.add(comboBoxSides); 
		
		// Sides Add onDrop Down Button 
		JComboBox<Object> comboBoxSidesAddOn = new JComboBox<Object>();
		comboBoxSidesAddOn.setModel(new DefaultComboBoxModel<Object>(new String[] { "ketchup", "mayo", "mustard", "honey mustard"}));
		comboBoxSidesAddOn.setBounds(15, 260, 126, 20);
		contentPane.add(comboBoxSidesAddOn); 
		
		// Drink Drop Down Button 
		JComboBox<Object> comboBoxDrinks = new JComboBox<Object>();
		comboBoxSidesAddOn.setModel(new DefaultComboBoxModel<Object>(new String[] { "diet coke", "coke", "sprite", "red bull"}));
		comboBoxDrinks.setBounds(15, 260, 126, 20);
		contentPane.add(comboBoxDrinks); 
		
		//Label for current transaction
		JLabel lblNewLabel_5 = new JLabel( "Current Transaction");
		lblNewLabel_5.setBounds(763,20, 200 ,23);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_5);
		
		// total price 
		JLabel lblNewLabel = new JLabel("    Total Price   $");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(697, 424, 100, 23);
		contentPane.add(lblNewLabel);
	}
}
