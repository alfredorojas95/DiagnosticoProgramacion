package cuadradomagico;

import javax.swing.JOptionPane;

public class Metodos {

    int[][] matriz = new int[3][3];

    public boolean estaRepetido(int a) {
//      recorre toda la matriz buscando si se encuntra la variable "a" (se repite la variable en la matriz)
        boolean repetido = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == a) {
                    repetido = true;//se cumple la condicion
                }
            }
        }
        return repetido;
    }

    public void almacenar(int i, int j, int valor) {
        //indices i y j son las coordenas de la posicion donde se almacenará el valor del textfiel
        matriz[i][j] = valor;
    }

    public void sumar() {
        int[] resFila = new int[3];// arreglos para almacenar resultados
        int[] resCol = new int[3];
        int[] resDiag = new int[2];
        int sumaFila = 0, sumaColumna = 0, sumaDiagP = 0, sumaDiagIn = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];//sumar filas de la matriz
                sumaColumna += matriz[j][i];//sumar columnas de la  matriz
            }
            resFila[i] = sumaFila;//almacenar resultados en un arreglo
            System.out.println(sumaFila);//imprimir el valor de las filas
            resCol[i] = sumaColumna;
            System.out.println(sumaColumna);//imprimir el valor de las columnas
        }
        //suma diagonal
        if (3 - 3 == 0) {//matriz[3][3]
            for (int i = 0; i < matriz.length; i++) {
                resDiag[0] += matriz[i][i];
            }
        }
        //Suma diagonal inversa  
        if (3 - 3 == 0) {//matriz[3][3]
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i + j == matriz.length - 1) {
                        resDiag[1] += matriz[i][j];
                    }
                }
            }
        }
        System.out.println("Diagonales: "+resDiag[0]+ "-"+resDiag[1]);//imprimir el valor de las diagonales
//      comprobar si es cuadrado mágico(suman 15 cada fila, columna y diagonales)
        if (((comprobar(resFila, 3)) == true) && (comprobar(resCol, 3) == true) && ((comprobar(resDiag, 2) == true))) {
            JOptionPane.showMessageDialog(null, "Felicidades, has completado el cuadrado mágico");
        } else {
            JOptionPane.showMessageDialog(null, "Has fallado,inténtelo nuevamente");//no es cuadrado mágico
        }
    }

    public boolean comprobar(int[] arreglo, int a) {
//      comprueba que la suma de filas, columnas y diagonales almacenada en arreglos es igual a 15
        int suma = 0;
        boolean suma15 = false;
        for (int i = 0; i < a; i++) {//recorre el arreglo 
            suma += arreglo[i];
            if (suma == 15) {//evalua si la suma es 15 
                suma15 = true;//se cumple la condición
            }
        }
        return suma15;
    }

//    public void limpiar() {
////      cambia los valores de los textfield a "" con el boton "limpiar"
//        GUICuadrado.text1.setText("");
//        GUICuadrado.text2.setText("");
//        GUICuadrado.text3.setText("");
//        GUICuadrado.text4.setText("");
//        GUICuadrado.text5.setText("");
//        GUICuadrado.text6.setText("");
//        GUICuadrado.text7.setText("");
//        GUICuadrado.text8.setText("");
//        GUICuadrado.text9.setText("");
//        matriz=null;
//    }
}
