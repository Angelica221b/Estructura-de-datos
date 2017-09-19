package app;

import java.util.Scanner;

public class Tarea4
{	
	int n = 0;
	Scanner leer = new Scanner (System.in);
	int numeros[][];

	public Tarea4()
	{
		
 
        System.out.println("Dimension de la matriz:");
        n = leer.nextInt();
 
        numeros = new int[n][n];
 
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
        	for (int j = 0; j < numeros.length; j++) {
        		numeros[i][j] = (int)(Math.random()*9+1);
        	}
        }
        System.out.println();
        imprimir();
    
    }
	public void imprimir(){
		 //imprimir
    	for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
    	
    	System.out.println();
    	imprimirT();
 
        
	}
	public void imprimirT(){
		MayorMenor validar = new MayorMenor (numeros);
	
	validar.mayor();
	System.out.println("El numero mayor es "+validar.getMayor());
	System.out.println("Se encuentra en la posición "+(validar.getAuxf()+1)+","+(validar.getAuxc()+1));
	
	validar.menor();
	System.out.println("El numero menor es "+validar.getMenor());
	System.out.println("Se encuentra en la posición "+(validar.getAuxi()+1)+","+(validar.getAuxj()+1));
	}
}