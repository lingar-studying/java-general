package swingAndGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

//TODO: 
/**
 * Do some window that you can insert check boxes, radios, free input.
 * 
 * Here is some good tutorial.
 * 
 * https://www.javatpoint.com/java-swing
 * 
 * 
 * 
 * Take it and retrieve it from some object.
 * 
 * Choose some folder and show the files names (run on them).
 * 
 * in the next - files, and show the
 * 
 * 
 */
public class DemoGui {
	public static void main(String[] args) {

		System.out.println("hey ... ");

		System.out.println("Pass over this: \n" + "https://www.javatpoint.com/java-swing");

		SomeBasicExample someBasicExample = new SomeBasicExample();
//		SomeBasicExample.ShowVeryBasic();
		//
		//someBasicExample.ShowVeryBasic();
		someBasicExample.ShowBasicFormComponents();

	}

}

class SomeBasicExample {
	int count = 1;

	boolean checkbox1Bool = true;
	String dropDownOptions[] = { "C", "C++", "C#", "Java", "PHP" };

	public void ShowVeryBasic() {

		// J frame stand for -
		// https://stackoverflow.com/questions/4358574/what-is-the-j-in-jframe
		JFrame f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("click");// creating instance of JButton
		b.setBounds(10, 100, 100, 40);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame

		JPanel panel = new JPanel();
		panel.setBounds(200, 400, 50, 60);
		panel.setBackground(Color.WHITE);
		f.add(panel);

		f.setSize(400, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible

		// adding window listeners
		f.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Button clicked... " + count++);
				panel.setVisible(!panel.isVisible());
			}
		});
	}

	// Do some window that you can insert check boxes, radios, free input.
	public void ShowBasicFormComponents() {

		// creating the container JFrame
		JFrame container = new JFrame();
		container.setBounds(20, 40, 400, 1000);// x axis, y axis, width, height
		container.setVisible(true);
		container.addWindowListener(new WindowDefaultListenter());
		JCheckBox checkbox1 = new JCheckBox("C++", checkbox1Bool);
		checkbox1.setBounds(10, 10, 50, 50);//bound is relative to the parent-container.
		//container.add(checkbox1);
		
		//adding checkbox
		//https://www.javatpoint.com/java-jcheckbox
		checkbox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
				
				checkbox1Bool = e.getStateChange() == 1;
				System.out.println("bool = " + checkbox1Bool + " e = " + e.getStateChange());
			
			}
		});
		
		//adding dropdown. 
//		https://www.javatpoint.com/java-jcombobox
		JComboBox<String> dropDown=new JComboBox<String>(dropDownOptions);    
	 	dropDown.setBounds(10, 20, 50, 50);    
	 	dropDown.setBounds(50, 100,90,20);    

	 	//dropDown.setSize(350,350);    

	 	dropDown.setBackground(Color.ORANGE);
	 	dropDown.setVisible(true);
	    container.add(dropDown);
//		    f.add(label); f.add(b);    
//		    f.setLayout(null);    
		  					
	    dropDown.addActionListener(new ActionListener() {  
		        public void actionPerformed(ActionEvent e) {       
		String data = "option selected: "   
		   + dropDown.getItemAt(dropDown.getSelectedIndex()) 
				   +" |at data - " + dropDownOptions[dropDown.getSelectedIndex()];  
		
		System.out.println(data);
		
		//label.setText(data);  
		}  

	});
	}
}

class WindowDefaultListenter implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	// on closing window...
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Closing 2...");
		System.exit(0);// closing process on close
	}

	@Override
	public void windowClosed(WindowEvent e) {
//		System.out.println("Closing...");
//		System.exit(0);//closing process on close

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub//
		System.out.println("Closing 3...");
		System.exit(0);// closing process on close

	}

}