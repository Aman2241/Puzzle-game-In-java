/* save     ----  Puzzle.java
   compile  ----- javac Puzzle.java
   run      ----- java Puzzle
*/
import javax.swing.*;
import java.awt.event.*;
public class Puzzle extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
	String name;
	Puzzle(){
		super("Puzzle Game");
		name=JOptionPane.showInputDialog(this,"Enter Name");
		b1=new JButton("1");  
		b1.setBounds(10,30,100,100);
		add(b1);
		 
		b2=new JButton("2");  
		b3=new JButton("3");  
		b4=new JButton("4");  
		b5=new JButton("5");  
		b6=new JButton("6");  
		b7=new JButton("7");  
		b8=new JButton(" ");  
		b9=new JButton("8");  
        next=new JButton("next");
		
		b2.setBounds(120,30,100,100);  
		b3.setBounds(230,30,100,100);  
		b4.setBounds(10,140,100,100);  
		b5.setBounds(120,140,100,100);  
		b6.setBounds(230,140,100,100);  
		b7.setBounds(10,250,100,100);  
		b8.setBounds(120,250,100,100);  
		b9.setBounds(230,250,100,100);  
		next.setBounds(100,370,150,50);
		add(b2); add(b3); add(b4);
		add(b5); add(b6); add(b7);
		add(b8); add(b9); add(next);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		next.addActionListener(this);
		
		setLayout(null); 
		setVisible(true);
		
		setSize(360,480);		
		setLocation(100,100); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end of constructor
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			String s=b1.getText();
			if(b2.getText()==" "){
				b1.setText(" ");
				b2.setText(s);
			}
			else if(b4.getText()==" "){
				b4.setText(s);
				b1.setText(" ");
			}
		}
		
		if(e.getSource()==b2){
		  	String s=b2.getText();  
			if(b1.getText()==" "){ 
				b1.setText(s); b2.setText(" ");
			}  
			else if(b3.getText()==" "){ 
				b3.setText(s); b2.setText(" ");
			}  
			else if(b5.getText()==" "){ 
				b5.setText(s); b2.setText(" ");
			}  
		}
		
		if(e.getSource()==b3){
			String s=b3.getText();  
			if(b2.getText().equals(" ")){
				b2.setText(s); b3.setText(" ");
			}  
			else if(b6.getText()==" "){
				b6.setText(s); b3.setText(" ");
			}  
		}
		
		if(e.getSource()==b4){
			String s=b4.getText();  
			if(b1.getText()==" "){ 
				b1.setText(s); b4.setText(" ");
			}  
			else if(b7.getText()==" "){ 
				b7.setText(s); b4.setText(" ");
			}  
			else if(b5.getText()==" "){ 
				b5.setText(s); b4.setText(" ");
			} 
			else if(b8.getText()==" "){
				JOptionPane.showMessageDialog(this,"Invalid Move","Worning",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		if(e.getSource()==b5){
			String s=b5.getText();  
			if(b2.getText()==" "){ 
				b2.setText(s); b5.setText(" ");
			}  
			else if(b4.getText()==" "){ 
				b4.setText(s); b5.setText(" ");
			}  
			else if(b6.getText()==" "){ 
				b6.setText(s); b5.setText(" ");
			}  
			else if(b8.getText()==" "){ 
				b8.setText(s); b5.setText(" ");
			}  
		}
		
		if(e.getSource()==b6){
			String s=b6.getText();  
			if(b9.getText()==" "){ 
				b9.setText(s); b6.setText(" ");
			}  
			else if(b3.getText()==" "){ 
				b3.setText(s); b6.setText(" ");
			}  
			else if(b5.getText()==" "){ 
				b5.setText(s); b6.setText(" ");
			}  
		}
		
		if(e.getSource()==b7){
			String s=b7.getText();  
			if(b4.getText()==" "){ 
				b4.setText(s); b7.setText(" ");
			}  
			else if(b8.getText()==" "){ 
				b8.setText(s); b7.setText(" ");
			}  
		}
		
		if(e.getSource()==b8){
			String s=b8.getText();  
			if(b7.getText()==" "){ 
				b7.setText(s); b8.setText(" ");
			}  
			else if(b9.getText()==" "){ 
				b9.setText(s); b8.setText(" ");
			}  
			else if(b5.getText()==" "){ 
				b5.setText(s); b8.setText(" ");
			}
		}
		
		if(e.getSource()==b9){
			String s=b9.getText();  
			if(b6.getText()==" "){ 
				b6.setText(s); b9.setText(" ");
			}   
			else if(b8.getText()==" "){ 
				b8.setText(s); b9.setText(" ");
			}
			if(b1.getText()=="1" && b2.getText().equals("2")&&b3.getText()  
				.equals("3")&&b4.getText().equals("4")
			     &&b5.getText().equals("5")  
				&&b6.getText().equals("6")&&b7.getText().equals("7")
				&&b8.getText()  
				.equals("8")&&b9.getText().equals(" ")){
				JOptionPane.showMessageDialog(this,name+" You Won The Game");
			}
		}
		
		if(e.getSource()==next){
			String s1=b1.getText();
			b1.setText(b5.getText());
			b5.setText(s1);
			String s2=b4.getText();
			b4.setText(b9.getText());
			b9.setText(s2);
			String s3=b2.getText();
			b2.setText(b7.getText());
			b7.setText(s3);
			String s4=b3.getText();
			b3.setText(b4.getText());
			b4.setText(s4);
		}
	}
	
	public static void main(String []args)
	{
		new Puzzle();
	}
}



