package swingAndGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
 *  in the next - files, and show the
 *  
 *  
 */
public class DemoGui {
	public static void main(String[] args) {
		
		System.out.println("hey ... ");
		
		System.out.println("Pass over this: \n"
				+ "https://www.javatpoint.com/java-swing");
		
		SomeBasicExample someBasicExample = new SomeBasicExample();
//		SomeBasicExample.ShowVeryBasic();
		someBasicExample.ShowVeryBasic();
		
	
				
				
	}

}

class SomeBasicExample{
	int count =1;

	public  void ShowVeryBasic() {  
		
		//J frame stand for - https://stackoverflow.com/questions/4358574/what-is-the-j-in-jframe
		JFrame f=new JFrame();//creating instance of JFrame  
		          
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(10,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Button clicked... " + count++);
			}
		});
		}  
	
	 //Do some window that you can insert check boxes, radios, free input. 
	public static void ShowBasicFormComponents() {
		
		
		
	}
}