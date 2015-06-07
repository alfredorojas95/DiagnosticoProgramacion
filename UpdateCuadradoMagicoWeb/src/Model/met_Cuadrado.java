package Model;

public class met_Cuadrado {

	private boolean gano = false;

	public met_Cuadrado() {// Constructor

	}
	
	//M�tododos	


	public boolean sumar(int[][] cuadrado) {
		int[] resFila = new int[3];// arreglos para almacenar resultados
		int[] resCol = new int[3];
		int[] resDiag = new int[2];
		int sumaFila = 0, sumaColumna = 0;
		for (int i = 0; i < cuadrado.length; i++) {
			sumaFila = 0;
			sumaColumna = 0;
			for (int j = 0; j < cuadrado[i].length; j++) {
				sumaFila += cuadrado[i][j];// sumar filas de la matriz
				sumaColumna += cuadrado[j][i];// sumar columnas de la matriz
			}
			resFila[i] = sumaFila;// almacenar resultados en un arreglo
			resCol[i] = sumaColumna;
			System.out.println(sumaFila);// imprimir el valor de las filas
			System.out.println(sumaColumna);// imprimir el valor de las columnas
		}
		// suma diagonal
		for (int i = 0; i < cuadrado.length; i++) {
			resDiag[0] += cuadrado[i][i];
		}
		// Suma diagonal inversa
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				if (i + j == cuadrado.length - 1) {
					resDiag[1] += cuadrado[i][j];
				}
			}
		}

		System.out.println("Diagonales: " + resDiag[0] + "-" + resDiag[1]);// imprimir valor de las diagonales
		// comprobar si es cuadrado m�gico(suman 15 cada fila, columna y
		// diagonales)
		if (((comprobar(resFila, 3)) == true) && (comprobar(resCol, 3) == true)
				&& ((comprobar(resDiag, 2) == true))) {
			gano = true;
		}
		return gano;
	}

	public boolean comprobar(int[] arreglo, int a) {
		// comprueba que la suma de filas, columnas y diagonales almacenada en
		// arreglos es igual a 15
		int suma = 0;
		boolean suma15 = false;
		for (int i = 0; i < a; i++) {// recorre el arreglo
			suma += arreglo[i];
			if (suma == 15) {// evalua si la suma es 15
				suma15 = true;// se cumple la condici�n
			}
		}
		return suma15;
	}

}
