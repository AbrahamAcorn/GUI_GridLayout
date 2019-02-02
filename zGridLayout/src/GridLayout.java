import javax.swing.*;
import java.awt.*;

class PantallaGridLayout extends JFrame{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	
	Font pl=new Font("Arial", Font.PLAIN, 12);
	
	PantallaGridLayout(){
	
	
	getContentPane().setLayout(gbl);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("GridBagLayout");
	setLocationRelativeTo(null);
	setVisible(true);
	
	JLabel lbl1=new JLabel("The classic form includes all visible fields for");
	gbc.gridx=0;
	gbc.gridy=0;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	lbl1.setFont(pl);
	gbl.setConstraints(lbl1, gbc);
	add(lbl1);
	
	JLabel lbl2=new JLabel("this list");
	gbc.gridx=0;
	gbc.gridy=1;
	gbc.gridwidth=0;
	gbc.gridheight=2;
	gbc.anchor=GridBagConstraints.LINE_START;
	lbl2.setFont(pl);
	gbl.setConstraints(lbl2, gbc);
	add(lbl2);
	
	JLabel lblx=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=4;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx, gbc);
	add(lblx);
	
	
	JLabel lbl3=new JLabel("Form Options");
	gbc.gridx=0;
	gbc.gridy=5;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lbl3, gbc);
	lbl3.setFont(new Font("Arial", Font.BOLD, 14));
	add(lbl3);
	
	JLabel lbl4=new JLabel("Include the following");
	gbc.gridx=0;
	gbc.gridy=6;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	lbl4.setFont(pl);
	gbl.setConstraints(lbl4, gbc);
	add(lbl4);
	
	
	JCheckBox check1=new JCheckBox("   a title for you form");
	gbc.gridx=0;
	gbc.gridy=7;
	gbc.gridwidth=2;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check1.setFont(pl);
	gbl.setConstraints(check1, gbc);
	add(check1);
	
	JTextField caja1=new JTextField("Subscribe to our mailing list");
	gbc.gridx=0;
	gbc.gridy=9;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbc.fill=GridBagConstraints.HORIZONTAL;
	caja1.setFont(pl);
	gbl.setConstraints(caja1, gbc);
	add(caja1);
	
	
	JLabel lblx2=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=10;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx2, gbc);
	add(lblx2);
	
	JLabel lblx3=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=11;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx3, gbc);
	add(lblx3);
	
	JRadioButton rbtn1=new JRadioButton("only required fields");
	gbc.gridx=0;
	gbc.gridy=12;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	rbtn1.setFont(pl);
	gbl.setConstraints(rbtn1, gbc);
	add(rbtn1);
	
	JRadioButton rbtn2=new JRadioButton("only required fields");
	gbc.gridx=0;
	gbc.gridy=13;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	rbtn2.setFont(pl);
	gbl.setConstraints(rbtn2, gbc);
	add(rbtn2);
	
	JLabel lbl5=new JLabel("(edit required fields in the form builder)");
	gbc.gridx=0;
	gbc.gridy=14;
	gbc.gridwidth=1;
	gbc.gridheight=3;
	gbc.anchor=GridBagConstraints.CENTER;
	lbl5.setFont(pl);
	gbl.setConstraints(lbl5, gbc);
	add(lbl5);
	
	JLabel lblx4=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=15;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx4, gbc);
	add(lblx4);
	
	JLabel lblx5=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=15;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx5, gbc);
	add(lblx5);
	
	JLabel lblx7=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=16;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx7, gbc);
	add(lblx7);
	
	JCheckBox check2=new JCheckBox("interest group fields",true);
	gbc.gridx=0;
	gbc.gridy=17;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check2.setFont(pl);
	gbl.setConstraints(check2, gbc);
	add(check2);
	
	JCheckBox check3=new JCheckBox("required field indicators",true);
	gbc.gridx=0;
	gbc.gridy=18;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check3.setFont(pl);
	gbl.setConstraints(check3, gbc);
	add(check3);
	
	JLabel lblx6=new JLabel(" ");
	gbc.gridx=0;
	gbc.gridy=19;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx6, gbc);
	add(lblx6);
	
	
	JLabel lbl6=new JLabel("Set form width");
	gbc.gridx=0;
	gbc.gridy=20;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	lbl6.setFont(pl);
	gbl.setConstraints(lbl6, gbc);
	add(lbl6);
	
	
	
	JTextField caja2=new JTextField();
	gbc.gridx=0;
	gbc.gridy=21;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.fill=GridBagConstraints.HORIZONTAL;
	caja2.setFont(pl);
	gbl.setConstraints(caja2, gbc);
	add(caja2);
	
	JLabel lbl7=new JLabel("enhance your form");
	gbc.gridx=0;
	gbc.gridy=22;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	lbl7.setFont(pl);
	gbl.setConstraints(lbl7, gbc);
	add(lbl7);
	
	JCheckBox check4=new JCheckBox("enable evil popup mode");
	gbc.gridx=0;
	gbc.gridy=23;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check4.setFont(pl);
	gbl.setConstraints(check4, gbc);
	add(check4);
	
	JCheckBox check5=new JCheckBox("disable all JavaScripts");
	gbc.gridx=0;
	gbc.gridy=24;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check5.setFont(pl);
	check5.setToolTipText("(!) info");
	gbl.setConstraints(check5, gbc);
	add(check5);
	
	JCheckBox check6=new JCheckBox("include archive link");
	gbc.gridx=0;
	gbc.gridy=25;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check6.setFont(pl);
	check6.setToolTipText("(!) info");
	gbl.setConstraints(check6, gbc);
	add(check6);
	
	JCheckBox check7=new JCheckBox("include MonkeyReward link");
	gbc.gridx=0;
	gbc.gridy=26;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	gbc.anchor=GridBagConstraints.LINE_START;
	check7.setFont(pl);
	gbl.setConstraints(check7, gbc);
	add(check7);
	
	JLabel lblx61=new JLabel("             ");
	gbc.gridx=1;
	gbc.gridy=0;
	gbc.gridwidth=1;
	gbc.gridheight=26;
	gbc.anchor=GridBagConstraints.LINE_START;
	gbl.setConstraints(lblx61, gbc);
	add(lblx61);
	
	JLabel lbl8=new JLabel("Preview                                    "
			+ "                                             ");
	gbc.gridx=2;
	gbc.gridy=0;
	gbc.gridwidth=2;
	gbc.gridheight=1;
	gbc.fill=GridBagConstraints.BOTH;
	lbl8.setFont(new Font("Arial", Font.BOLD, 14));
	gbl.setConstraints(lbl8, gbc);
	add(lbl8);
	
	JPanel panel= new JPanel();
	panel.setLayout(null);
	gbc.gridx=2;
	gbc.gridy=2;
	gbc.gridwidth=2;
	gbc.gridheight=15;
	gbc.fill=GridBagConstraints.BOTH;
	panel.setBackground(Color.WHITE);
	gbl.setConstraints(panel, gbc);
	
	
	JLabel lbl9=new JLabel("Email Adress");
	gbc.gridx=2;
	gbc.gridy=3;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	lbl9.setFont(pl);
	gbl.setConstraints(lbl9, gbc);
	
	panel.add(lbl9);

	JTextField caja3=new JTextField();
	gbc.gridx=2;
	gbc.gridy=4;
	gbc.gridwidth=15;
	gbc.gridheight=1;
	gbc.fill=GridBagConstraints.BOTH;
	gbl.setConstraints(caja3, gbc);
	panel.add(caja3);
	
	JLabel lbl91=new JLabel("First Name");
	gbc.gridx=2;
	gbc.gridy=6;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	lbl91.setFont(pl);
	gbl.setConstraints(lbl91, gbc);
	
	panel.add(lbl91);

	JTextField caja31=new JTextField();
	gbc.gridx=2;
	gbc.gridy=7;
	gbc.gridwidth=15;
	gbc.gridheight=1;
	gbc.fill=GridBagConstraints.BOTH;
	gbl.setConstraints(caja31, gbc);
	panel.add(caja31);
	
	JLabel lbl911=new JLabel("Lasta Name");
	gbc.gridx=2;
	gbc.gridy=9;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	lbl911.setFont(pl);
	gbl.setConstraints(lbl911, gbc);
	
	panel.add(lbl911);

	JTextField caja311=new JTextField();
	gbc.gridx=2;
	gbc.gridy=10;
	gbc.gridwidth=15;
	gbc.gridheight=1;
	gbc.fill=GridBagConstraints.BOTH;
	gbl.setConstraints(caja311, gbc);
	panel.add(caja311);
	
	add(panel);
	
	JLabel l11=new JLabel("Copy/Paste on your site");
	gbc.gridx=2;
	gbc.gridy=18;
	gbc.gridwidth=1;
	gbc.gridheight=1;
	l11.setFont(new Font("Arial", Font.BOLD, 14));
	gbl.setConstraints(l11, gbc);
	add(l11);
	
	JTextArea atxt=new JTextArea("escribe aqui :b spaninglish");
	gbc.gridx=2;
	gbc.gridy=19;
	gbc.gridwidth=2;
	gbc.gridheight=9;
	gbc.fill=GridBagConstraints.BOTH;
	gbl.setConstraints(atxt, gbc);
	
	add(atxt);
	pack();	
	}
}

public class GridLayout {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PantallaGridLayout();
			}
		});

	}

}
