import javax.swing.JOptionPane;
public class b225{
public static void main(String[] args){
	String num1, num2;
	num1=JOptionPane.showInputDialog("Enter the first number:");
	num2=JOptionPane.showInputDialog("Enter the second number:");
	double n1=Double.parseDouble(num1);
	double n2=Double.parseDouble(num2);
	JOptionPane.showMessageDialog(null, "sum: "+ (n1+n2));
	JOptionPane.showMessageDialog(null, "different: "+ (n1-n2));
	JOptionPane.showMessageDialog(null, "product: "+ n1*n2);
	JOptionPane.showMessageDialog(null, "quotient: "+ n1/n2);
}
}