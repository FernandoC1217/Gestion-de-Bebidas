package colaborador;

import usuario.Usuario;
import java.util.Arrays;
import java.util.Scanner;

public class Colaborador extends Usuario {

	public Colaborador(String tipousuario, String userpassword, String nameuser) {
		super(tipousuario, userpassword, nameuser);
		
		
	}

	
public void Menu_Colaborador(int desicion) {
	Scanner teclado = new Scanner (System.in);

	// Asignas colaborador (variable booleana) y tu método getTipoUsuario() recibe un parámetro cadena y tu función retorna una cadena
	// booleano != cadena. Esto está rompiendo el programa

	boolean colaborador = super.getTipousuario();
	String nameuserfinal = "colaborador123";
	String userpasswordfinal = "12345";
	// Boolean solo se usa para valores true or false, tu método getUserPassword no acepta parámetros.
	boolean contraseniacorrecta=super.getUserpassword(nameuserfinal, userpasswordfinal);
	while(colaborador=true && contraseniacorrecta ) {
		
		System.out.println("********************************************************"
				+ "\nGestion de Almacenamiento de la empresa: (Nombre)"
				+ "\n1. Acceder a datos"
				+ "\n2. Accesos especiales"
				+ "\n3. Comparaciones de Mayoreo o Menoreo"
				+ "\n4. Comparaciones por tiempo"
				+ "\n5. Comparaciones por precio"
				+ "\n6. Frecuencia de Actualizacion de Registros");
		desicion= teclado.nextInt();
		if(desicion==1) {
			String subdesicion = "";
			//Funcion 1 
			Acceder_a_datos( subdesicion);
			
		}
		
		
	}
	

	
}
public void Acceder_a_datos(String subdesicion) {
	Scanner teclado= new Scanner(System.in);
	System.out.println("a. Visualizacion total");
	System.out.println("b. Visualizacion parcial");
	subdesicion=teclado.nextLine();
	if(subdesicion.contentEquals("a")) {
	Lectura_y_Pinturatotal();	
	}
	
}
public void Lectura_y_Pinturatotal() {
	String ruta="tableconvert_csv_8oqpav.csv";
	int filas=48;
	int columnas=10;
	// No tienes los métodos lectura_csv ni PintarMatriz en tu superclase "Usuario"
	String [][] matriz=super.lectura_csv(ruta, filas, columnas);
	super.PintarMatriz(matriz);
}
public void Lectura_y_Pinturaparcial() {
	//Aqui se crea un array de cada seccion de la matriz
}
public void auxiliarArticulos(String seccion) {
	Scanner teclado = new Scanner (System.in);
	String ruta="tableconvert_csv_8oqpav.csv";
	int filas=48;
	int columnas=10;
	// No tienes los métodos lectura_csv ni PintarMatriz en tu superclase "Usuario"
	String [][] matriz=super.lectura_csv(ruta, filas, columnas);
	String[] arrayArticulos = new String [48];
	String[] arrayseccion = new String [48];
	int numero=0;
	System.out.println(matriz[0].length);
	int i=0;
	//for(  i=0;i<matriz.length;i++) {
	//	for(int j=0;j<matriz[0].length;j++) {
	seccion=teclado.nextLine();
	int posicion = 0;
		//while( i<48 && posicion<48) {
		
			
			//if(i==47) {
			for(i=1;i<arrayseccion.length;i++) {
				for(int k=1;k<matriz[0].length;k++) {
				arrayseccion[i]=matriz[i][0];
				
				for(int j=1;j<arrayArticulos.length;j++) {
					
						if(arrayseccion[i].contains(seccion) && j<9) {

							arrayArticulos[j]=matriz[j][1];
							//Hay que arreglar esto
							System.out.println( arrayArticulos[j]+"\t\t" +matriz[i][k]);
					}
						
					
				}
					
				}
				
			}
			
			
			
			/*if(arrayseccion[posicion].contentEquals(seccion) && posicion<10 ) {
				System.out.println(arrayArticulos[posicion]);
					
			
			}*/
			
			//}
		//	posicion++;
		//i++;
		//}
				
			
			
		//}
	//}

}
public void Porseccion(String seccion) {
	
	Scanner teclado = new Scanner (System.in);
	String ruta="tableconvert_csv_8oqpav.csv";
	int filas=48;
	int columnas=10;
	// No tienes los métodos lectura_csv ni PintarMatriz en tu superclase "Usuario"
	String [][] matriz=super.lectura_csv(ruta, filas, columnas);
	seccion= teclado.nextLine();
	
	for(int i=0;i<matriz.length;i++) {
		for(int j=0;j<matriz[0].length;j++) {
			
			if(matriz[i][0].equals(seccion)) {
				
				while(i<10) {
					System.out.println(matriz[i][1]);
				}
				
					
				
				
			}	
		}
			
	}
	
}

}
