package app;

import java.util.Scanner;

public class App{
	public static void main(String[] args) {
		int o,t;
		Scanner leer= new Scanner(System.in);
		
		
		do {
			
		System.out.println("Seleccione una de las tareas");
		o=leer.nextInt();
		switch (o) {
		case 1:
			Tarea1 t1=new Tarea1();
			break;
		case 2:
			Tarea2 t2=new Tarea2();
			break;
		case 3:
			Tarea3 t3= new Tarea3();
			break;
		case 4:
			Tarea4 t4= new Tarea4();
			break;
		default:
			break;
		}
		
		System.out.println("Elejir otra tarea  1:Si  2:No");
		t=leer.nextInt();
		} while (t==1);
		System.exit(0);
	}
}