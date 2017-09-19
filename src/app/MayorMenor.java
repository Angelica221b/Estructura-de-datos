package app;

public class MayorMenor {
	private int matriz[][]; // arreglo numeros
    private int mayor;
    private int menor;
    private int auxf,auxc;
    private int auxi,auxj;
    
     
 
    public MayorMenor (int x[][]){
        this.matriz=x;
      
    }
 
    public void mayor (){
    	mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
        	for (int j = 0; j < matriz.length; j++) {
        		if (matriz[i][j]>mayor){
                	mayor=matriz[i][j];
                	auxf=i;
                	auxc=j;
                	
            	}
        	}
        }
    } 
 
    public void menor (){
        menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
        	for (int j = 0; j < matriz.length; j++) {
        		if (matriz[i][j]<menor){
                	menor=matriz[i][j];
                	auxi=i;
                	auxj=j;
              
            	}
        	}
        }
    }
    

	public int getAuxi() {
		return auxi;
	}

	public void setAuxi(int auxi) {
		this.auxi = auxi;
	}

	public int getAuxj() {
		return auxj;
	}

	public void setAuxj(int auxj) {
		this.auxj = auxj;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}

	public int getMenor() {
		return menor;
	}

	public void setMenor(int menor) {
		this.menor = menor;
	}

	public int getAuxf() {
		return auxf;
	}

	public void setAuxf(int auxf) {
		this.auxf = auxf;
	}

	public int getAuxc() {
		return auxc;
	}

	public void setAuxc(int auxc) {
		this.auxc = auxc;
	}


}

