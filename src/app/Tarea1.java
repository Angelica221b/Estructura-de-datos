package app;

import java.awt.EventQueue;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Tarea1 {
	int [][]array1= new int [4][5];
	public Tarea1(){
			
				
			for(int i=0; i<array1.length; i++){
				if(array1[i][i]== array1[i][i]){
								array1[i][i]=1;
				}
						
			}		
			imprimir();
			
		}
	public void imprimir(){
		//Imprimir matriz
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
	}
	}