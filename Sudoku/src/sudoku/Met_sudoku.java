package sudoku;

public class Met_sudoku {

    int[][] sudoku = new int[9][9];
    //boolean suma15 = false;


    public void almacenar(int i, int j, int valor) {
        sudoku[i][j] = valor;
    }

    public boolean estaRepetido(int cor1, int cor2, int valor) {
//      cor1 y cor2 son las coordenadas del número en la matriz para validar que no se repita el numero en la fila ni columna,
//      recorreriendo la fila y columna segun la coordenada entregada por parámetros
        boolean repetido = false;
        for (int i = 0; i < sudoku.length; i++) {
            if ((sudoku[cor1][i] == valor) || (sudoku[i][cor2] == valor)) {
                repetido = true;//se cumple la condicion
            }
        }
        return repetido;
    }

    public boolean verificarMatrices(int cor1, int cor2, int numero) {
//      comprueba que no se repitan los números en las matrices de 3x3
        boolean esCuadrado = false;
        int filaCuadradoMag = ((cor1 - 1) / 3) * 3, columnaCuadradoMag = ((cor2 - 1) / 3) * 3;
//      Fórmula para identificar el cuadrante 

        for (int i = filaCuadradoMag; i < filaCuadradoMag+3; i++) {
            for (int j = columnaCuadradoMag; j <columnaCuadradoMag+3 ; j++) {
                if(sudoku[i][j]==numero){
                    esCuadrado=true;
                }
            }
        }
        return esCuadrado;
    }
    
    public void sumar() {
        int sumaFila = 0, sumaColumna = 0;
        for (int i = 0; i < sudoku.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < sudoku.length; j++) {
                sumaFila += sudoku[i][j];
                sumaColumna += sudoku[j][i];
            }
        }

    }
}
