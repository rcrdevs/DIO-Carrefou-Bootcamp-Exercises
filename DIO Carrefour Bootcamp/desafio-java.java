package java;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;
					
public class Desafio {
    
	public static void main(String[] args) {
	  try (//Lê os valores de Entrada:
	Scanner leitorDeEntradas = new Scanner(System.in)) {
		float valorSalario = leitorDeEntradas.nextFloat();
		  float valorBeneficios = leitorDeEntradas.nextFloat();
		  
		  float valorImposto = 0;
		  if (valorSalario >= 0 && valorSalario <= 1100) {
		    //Atribiu a aliquota de 5% mediante o salário:
		    valorImposto = 0.05F * valorSalario;
		  } 
		//Lê os valores de Entrada:
		  if (valorSalario >= 1100 && valorSalario <= 2500) {
		    //Atribiu a aliquota de 10% mediante o salário:
		    valorImposto = 0.10F * valorSalario;
		  } 
		//Lê os valores de Entrada:
		  if (valorSalario >= 2500 && valorSalario <= 100000000) {
		    //Atribiu a aliquota de 15% mediante o salário:
		    valorImposto = 0.15F * valorSalario;
		  } 
		  //Calcula e imprime a Saída (com 2 casas decimais):
		  float saida = valorSalario - valorImposto + valorBeneficios;
		  System.out.println(String.format("%.2f", saida));
	}
	}
}