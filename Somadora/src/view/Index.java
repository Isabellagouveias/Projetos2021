package view;

import controller.Somadora;
import controller.SomadoraDois;

public class Index {
	
	static	Somadora instanciaDaSomadora = new Somadora();
	static	SomadoraDois instanciaDaSomadoraDois = new SomadoraDois(5,10);
	
	public static void main(String[] args) {
		
		System.out.println (instanciaDaSomadora.SomaDois(267,543) );
		System.out.println (instanciaDaSomadora.SomaTres(5, 10, 20));
		System.out.println (instanciaDaSomadoraDois.soma());
	}

}
