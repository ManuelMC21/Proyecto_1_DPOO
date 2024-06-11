package gui.errors;

import javax.swing.JOptionPane;

public class Errors {
	public void errorComa (){
		JOptionPane.showMessageDialog(null, "El numero solo puede tener una coma", "ERROR" , JOptionPane.ERROR_MESSAGE);
	}
	
	public void errorEntre0(){
		JOptionPane.showMessageDialog(null, "No se puede dividir por 0", "ERROR" , JOptionPane.ERROR_MESSAGE);
	}
}
