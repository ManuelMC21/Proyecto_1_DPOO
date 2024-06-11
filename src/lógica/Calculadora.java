package lógica;

public class Calculadora {

	private double suma (double num1, double num2){
		return num1 + num2;
	}
	
	private double resta (double num1, double num2){
		return num1 - num2;
	}
	
	private double mult (double num1, double num2){
		return num1 * num2;
	}
	
	private double div (double num1, double num2){
		return num1 / num2;
	}
	
	public double unDivX (double num1){
		return 1/num1;
	}
	
	public double cuadrado (double num1){
		return num1 * num1;
	}
	
	public double raiz (double num1){
		return Math.sqrt(num1);
	}
	
	public String sinComas (double num){
		String salida;
		if(num == (long)num)
			salida = String.valueOf((long)num);
		else
			salida = String.valueOf(num);
		return salida;
	}
	
	public double igual (double num1, double num2 , int operacion){
		double result = 0;
		switch (operacion){
		case 1 :{
			result = this.suma(num1,num2);
			break;
		}
		case 2 :{
			result = this.resta(num1, num2);
			break;
		}
		}
		
		return result;
	}

}
