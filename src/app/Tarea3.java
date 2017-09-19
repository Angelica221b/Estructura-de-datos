package app;

import java.util.Scanner;

public class Tarea3 {
	int n;
	int [] vectorB;
	int [][] matriz;
	Scanner In = new Scanner(System.in);
	int []sumav;
	int suma;
	public Tarea3() 
	{					
			// Pedimos dimension
			System.out.print("Ingrese la dimension de la matriz");
			n = In.nextInt();
			System.out.println("");
			matriz = new int [n][n];
			
			//Agregamos valores a la matriz
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = (int)(Math.random()*9+1);
				}
			}
				
				
				imprimir();
			}
	
	public void imprimir(){
		//Imprimir matriz
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
				System.out.println();
			}		
		vector();
	}
	public void vector(){
		vectorB=new int[n];
		//sumav=new int[n];
		
		for (int i = 0; i < matriz.length; i++) {
			suma=0;
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j]%2==0){
					suma=suma+matriz[i][j];
					vectorB[i]=suma;
				}
			}
		}
		System.out.println();
		imprimirVector();
	}
	
	public void imprimirVector(){
		System.out.println("Vector");
		for (int i = 0; i < vectorB.length; i++) {
			System.out.println(vectorB[i]);
		}
	}
}