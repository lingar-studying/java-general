package swingAndGui;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

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
		// someBasicExample.ShowVeryBasic();
		someBasicExample.ShowBasicFormComponents();
		//someBasicExample.draft();

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
	
	public void draft() {
		
		
			JFrame f; 
		    f=new JFrame("ComboBox Example");    
		    String country[]={"India","Aus","U.S.A","England","Newzealand"};        
		    JComboBox<String> cb=new JComboBox<String>(country);    
		    cb.setBounds(50, 50,90,20);    
		    f.add(cb);        
		    f.setLayout(null);    
		    f.setSize(400,500);    
		    f.setVisible(true);         
		
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "JPG & GIF Images", "jpg", "gif");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(f);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            chooser.getSelectedFile().getName());
	    }
	}

	// Do some window that you can insert check boxes, radios, free input.
	public void ShowBasicFormComponents() {
		int lastY = 10;
		int lastX = 500;
		// creating the container JFrame
		JFrame container = new JFrame();
		container.setBounds(500, 40, 500, 700);// x axis, y axis, width, height
		//container.setVisible(true); //make it visible only after you are adding all children
//		container.setHorizontalTextPosition(SwingConstants.LEFT);
		JCheckBox checkbox1 = new JCheckBox("C++", checkbox1Bool);
		// checkbox1.setBounds(500, 100, 500, 500);//bound is relative to the
		// parent-container.
		checkbox1.setBounds(lastX, (10), 50, 50);
//		checkbox1.setBackground(Color.BLACK);

		// changing rtl
		// jCheckBox.setHorizontalTextPosition(SwingConstants.LEFT);
		// pay attention - it's changing after the adding too... but it's resetting it
		checkbox1.setHorizontalTextPosition(SwingConstants.LEFT);

		// adding listners...
		// https://www.javatpoint.com/java-jcheckbox
		checkbox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));

				checkbox1Bool = e.getStateChange() == 1;
				System.out.println("bool = " + checkbox1Bool + " e = " + e.getStateChange());

			}
		});

		// checkbox1
		container.add(checkbox1);

		// end of checkbox

		// adding dropdown.
//		https://www.javatpoint.com/java-jcombobox
		JComboBox<String> dropDown = new JComboBox<String>(dropDownOptions);
		 dropDown.setBounds(lastX, lastY+=70,50,20);
			

		container.add(dropDown);
		
//		
//		
//		 container.setLayout(null);    
//		 
//		 container.setVisible(true);   
		//dropDown.setBounds(20, (lastYPos += 10), 20, 20);

		// dropDown.setSize(350,350);

		//dropDown.setBackground(Color.ORANGE);
		//dropDown.setVisible(true);
//		    f.add(label); f.add(b);    
		//dropDown.setLayout(null);    

		dropDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "option selected: " + dropDown.getItemAt(dropDown.getSelectedIndex()) + " |at data - "
						+ dropDownOptions[dropDown.getSelectedIndex()];

				System.out.println("here ?" + data);

				// label.setText(data);
			}

		});
		
		 JTextArea area=new JTextArea("טקסט לחיפוש");  
		 System.out.println("Here ? " + lastY);
	     area.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

	     area.setBounds(lastX-50, lastY+=80, 100,80);  
	    
	     //area.setBackground(Color.GREEN);
		container.add(area);
		//area.setVisible(true);
		
		//container.add(area2);

		
		//text area
		//for validation : https://docs.oracle.com/javase/1.5.0/docs/api/javax/swing/InputVerifier.html
		
	    JTextField textField1,textField2;  
	    textField1=new JTextField("Welcome to Javatpoint.");  
	    textField1.setBounds(lastX-250, lastY+=220, 200,30);  
	    textField1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);


        container.add(textField1);  
		
        
        //file chooser
//        https://docs.oracle.com/javase/8/docs/api/javax/swing/JFileChooser.html
        
		
		
		
		//after adding all components*****************************************HERE******************************** 
//		https://stackoverflow.com/questions/47895490/why-is-my-textarea-not-visible
		container.addWindowListener(new WindowDefaultListenter());
		//container.pack();
		container.setSize(600,700);  
		container.setLayout(null);  
		container.setVisible(true);
	}}

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
