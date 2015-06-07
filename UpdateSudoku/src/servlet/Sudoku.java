package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sudoku
 */
public class Sudoku extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private int[][]sudoku = new int[9][9];
	private boolean ganoSudoku = false;
    public Sudoku() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String cor00 = request.getParameter("cor00");
		 String cor01 = request.getParameter("cor01");
		 String cor02 = request.getParameter("cor02");
		 String cor03 = request.getParameter("cor03");
		 String cor04 = request.getParameter("cor04");
		 String cor05 = request.getParameter("cor05");
		 String cor06 = request.getParameter("cor06");
		 String cor07 = request.getParameter("cor07");
		 String cor08 = request.getParameter("cor08");
		 

		 String cor10 = request.getParameter("cor10");
		 String cor11 = request.getParameter("cor11");
		 String cor12 = request.getParameter("cor12");
		 String cor13 = request.getParameter("cor13");
		 String cor14 = request.getParameter("cor14");
		 String cor15 = request.getParameter("cor15");
		 String cor16 = request.getParameter("cor16");
		 String cor17 = request.getParameter("cor17");
		 String cor18 = request.getParameter("cor18");
		 
	
		 String cor20 = request.getParameter("cor20");
		 String cor21 = request.getParameter("cor21");
		 String cor22 = request.getParameter("cor22");
		 String cor23 = request.getParameter("cor23");
		 String cor24 = request.getParameter("cor24");
		 String cor25 = request.getParameter("cor25");
		 String cor26 = request.getParameter("cor26");
		 String cor27 = request.getParameter("cor27");
		 String cor28 = request.getParameter("cor28");
		 

		 String cor30 = request.getParameter("cor30");
		 String cor31 = request.getParameter("cor31");
		 String cor32 = request.getParameter("cor32");
		 String cor33 = request.getParameter("cor33");
		 String cor34 = request.getParameter("cor34");
		 String cor35 = request.getParameter("cor35");
		 String cor36 = request.getParameter("cor36");
		 String cor37 = request.getParameter("cor37");
		 String cor38 = request.getParameter("cor38");
		 
	
		 String cor40 = request.getParameter("cor40");
		 String cor41 = request.getParameter("cor41");
		 String cor42 = request.getParameter("cor42");
		 String cor43 = request.getParameter("cor43");
		 String cor44 = request.getParameter("cor44");
		 String cor45 = request.getParameter("cor45");
		 String cor46 = request.getParameter("cor46");
		 String cor47 = request.getParameter("cor47");
		 String cor48 = request.getParameter("cor48");
		 
		 
		 String cor50 = request.getParameter("cor50");
		 String cor51 = request.getParameter("cor51");
		 String cor52 = request.getParameter("cor52"); 
		 String cor53 = request.getParameter("cor53");
		 String cor54 = request.getParameter("cor54");
		 String cor55 = request.getParameter("cor55");
		 String cor56 = request.getParameter("cor56");
		 String cor57 = request.getParameter("cor57");
		 String cor58 = request.getParameter("cor58");
		 
		 
		 String cor60 = request.getParameter("cor60");
		 String cor61 = request.getParameter("cor61");
		 String cor62 = request.getParameter("cor62");
		 String cor63 = request.getParameter("cor63");
		 String cor64 = request.getParameter("cor64");
		 String cor65 = request.getParameter("cor65");
		 String cor66 = request.getParameter("cor66");
		 String cor67 = request.getParameter("cor67");
		 String cor68 = request.getParameter("cor68");
		 
		
		 String cor70 = request.getParameter("cor70");
		 String cor71 = request.getParameter("cor71");
		 String cor72 = request.getParameter("cor72");
		 String cor73 = request.getParameter("cor73");
		 String cor74 = request.getParameter("cor74");
		 String cor75 = request.getParameter("cor75");
		 String cor76 = request.getParameter("cor76");
		 String cor77 = request.getParameter("cor77");
		 String cor78 = request.getParameter("cor78");
		 
		 
		 String cor80 = request.getParameter("cor80");
		 String cor81 = request.getParameter("cor81");
		 String cor82 = request.getParameter("cor82");
		 String cor83 = request.getParameter("cor83");
		 String cor84 = request.getParameter("cor84");
		 String cor85 = request.getParameter("cor85");
		 String cor86 = request.getParameter("cor86");
		 String cor87 = request.getParameter("cor87");
		 String cor88 = request.getParameter("cor88");
		 
		 
		 // Llenar matriz
		 llenarMatriz(cor00 ,0,0);
		 llenarMatriz(cor01 ,0,1);
		 llenarMatriz(cor02 ,0,2);
		 llenarMatriz(cor03 ,0,3);
		 llenarMatriz(cor04 ,0,4);
		 llenarMatriz(cor05 ,0,5);
		 llenarMatriz(cor06 ,0,6);
		 llenarMatriz(cor07 ,0,7);
		 llenarMatriz(cor08 ,0,8);
		 
		 llenarMatriz(cor10 ,1,0);
		 llenarMatriz(cor11 ,1,1);
		 llenarMatriz(cor12 ,1,2);
		 llenarMatriz(cor13 ,1,3);
		 llenarMatriz(cor14 ,1,4);
		 llenarMatriz(cor15 ,1,5);
		 llenarMatriz(cor16 ,1,6);
		 llenarMatriz(cor17 ,1,7);
		 llenarMatriz(cor18 ,1,8);
		 
		 llenarMatriz(cor20 ,2,0);
		 llenarMatriz(cor21 ,2,1);
		 llenarMatriz(cor22 ,2,2);
		 llenarMatriz(cor23 ,2,3);
		 llenarMatriz(cor24 ,2,4);
		 llenarMatriz(cor25 ,2,5);
		 llenarMatriz(cor26 ,2,6);
		 llenarMatriz(cor27 ,2,7);
		 llenarMatriz(cor28 ,2,8);
		 
		 
		 llenarMatriz(cor30 ,3,0);
		 llenarMatriz(cor31 ,3,1);
		 llenarMatriz(cor32 ,3,2);
		 llenarMatriz(cor33 ,3,3);
		 llenarMatriz(cor34 ,3,4);
		 llenarMatriz(cor35 ,3,5);
		 llenarMatriz(cor36 ,3,6);
		 llenarMatriz(cor37 ,3,7);
		 llenarMatriz(cor38 ,3,8);
		 
		 llenarMatriz(cor40 ,4,0);
		 llenarMatriz(cor41 ,4,1);
		 llenarMatriz(cor42 ,4,2);
		 llenarMatriz(cor43 ,4,3);
		 llenarMatriz(cor44 ,4,4);
		 llenarMatriz(cor45 ,4,5);
		 llenarMatriz(cor46 ,4,6);
		 llenarMatriz(cor47 ,4,7);
		 llenarMatriz(cor48 ,4,8);
		 
		 llenarMatriz(cor50 ,5,0);
		 llenarMatriz(cor51 ,5,1);
		 llenarMatriz(cor52 ,5,2);
		 llenarMatriz(cor53 ,5,3);
		 llenarMatriz(cor54 ,5,4);
		 llenarMatriz(cor55 ,5,5);
		 llenarMatriz(cor56 ,5,6);
		 llenarMatriz(cor57 ,5,7);
		 llenarMatriz(cor58 ,5,8);

		 
		 llenarMatriz(cor60 ,6,0);
		 llenarMatriz(cor61 ,6,1);
		 llenarMatriz(cor62 ,6,2);
		 llenarMatriz(cor63 ,6,3);
		 llenarMatriz(cor64 ,6,4);
		 llenarMatriz(cor65 ,6,5);
		 llenarMatriz(cor66 ,6,6);
		 llenarMatriz(cor67 ,6,7);
		 llenarMatriz(cor68 ,6,8);
		 
		 llenarMatriz(cor70 ,7,0);
		 llenarMatriz(cor71 ,7,1);
		 llenarMatriz(cor72 ,7,2);
		 llenarMatriz(cor73 ,7,3);
		 llenarMatriz(cor74 ,7,4);
		 llenarMatriz(cor75 ,7,5);
		 llenarMatriz(cor76 ,7,6);
		 llenarMatriz(cor77 ,7,7);
		 llenarMatriz(cor78 ,7,8);
		 
		 llenarMatriz(cor80 ,8,0);
		 llenarMatriz(cor81 ,8,1);
		 llenarMatriz(cor82 ,8,2);
		 llenarMatriz(cor83 ,8,3);
		 llenarMatriz(cor84 ,8,4);
		 llenarMatriz(cor85 ,8,5);
		 llenarMatriz(cor86 ,8,6);
		 llenarMatriz(cor87 ,8,7);
		 llenarMatriz(cor88 ,8,8);
		 
		 if (this.ganoSudoku==true){
			 request.setAttribute("mensaje","" + "Felicitaciones, completaste el sudoku exitosamente"); 
		 } else {
			 request.setAttribute("mensaje","Perdiste, Inténtalo de nuevo");
		 }
		 request.getRequestDispatcher("/sudoku.jsp").forward(request, response);
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * 
	 * @param dato dato extraido de input
	 * @param corX coordenada de la matriz en i
	 * @param corY coordenada de la matriz en j
	 */
	public void llenarMatriz(String dato, int corX, int corY) {
		int aux = Integer.parseInt(dato);
		sudoku[corX][corY] = aux;
	}
	
    public void sumar() {
        int[] resFila = new int[9];// arreglos para almacenar resultados
        int[] resCol = new int[9];

        int sumaFila = 0, sumaColumna = 0;
        for (int i = 0; i < sudoku.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < sudoku[i].length; j++) {
                sumaFila += sudoku[i][j];//sumar filas de la matriz
                sumaColumna += sudoku[j][i];//sumar columnas de la  matriz
            }
            resFila[i] = sumaFila;//almacenar resultados en un arreglo
            resCol[i] = sumaColumna;
            System.out.println(sumaFila);//imprimir el valor de las filas
            System.out.println(sumaColumna);//imprimir el valor de las columnas
        }

        if (((comprobar(resFila)) == true) && (comprobar(resCol) == true)) {
            this.ganoSudoku=true;
        } 
    }
    
    public boolean comprobar(int[] arreglo) {
        boolean suma45 = false;
        for (int i = 0; i < arreglo.length; i++) {//recorre el arreglo 
            if (arreglo[i] == 45) {//evalua si la suma es 15 
            	suma45 = true;//se cumple la condición
            } else {
            	return false;
            }
        }
        return suma45;
    }

}
