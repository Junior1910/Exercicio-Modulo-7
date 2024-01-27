package Pacote1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		NumberFormat formatoBrasileiro = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
		DecimalFormat formatopreco = new DecimalFormat("#,##0.00");
		formatopreco.applyPattern("###,###,###,###,##0.00");

		Terreno terreno = new Terreno();
		terreno.setLargura(10.0);
		terreno.setComprimento(30.0);
		terreno.setMetroQuadrado(200.00);
		double largura = terreno.getLargura();
		double comprimento = terreno.getComprimento();
		double metroQuadrado = terreno.getMetroQuadrado();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.println("Área do terreno: " + formatoBrasileiro.format(area)+ " m²");
		System.out.println("Preço do terreno: R$ " + formatopreco.format(preco));
	}
}
