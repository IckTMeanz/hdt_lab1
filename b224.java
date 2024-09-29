import javax.swing.JOptionPane;
public class b224{
public static void main(String[] args){
	String strNum1;
	String strNum2;
	String strNotification="You've just entered: ";
	strNum1 = JOptionPane.showInputDialog(null, "Please input te first numver: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
	strNotification+= strNum1+" and ";
	strNum2 = JOptionPane.showInputDialog(null, "Please input te second numver: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
	strNotification+= strNum2;

JOptionPane.showMessageDialog(null, strNotification, "show two numbers", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
}
}
	