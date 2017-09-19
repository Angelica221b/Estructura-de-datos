package app;

public class Tarea2 {
	int [][]array1= new int [4][5];;
	public Tarea2(){
		
			
		for(int i=0; i<array1.length; i++){
			for (int j = 0; j < array1.length; j++) {
				array1[i][j]=0;
				if (i>j) {
					array1[i][j]=1;
				}
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