package controller;

public class SomadoraDois {
	
	private int numero1;
	private int numero2;
	
	public SomadoraDois(int n1, int n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}
	public int soma() {
		return this.numero1 + this.numero2;
	}
}
