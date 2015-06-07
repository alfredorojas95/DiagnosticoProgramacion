package sudoku;

public class Test_Sudoku {

    public static void main(String[] args) {
      
        GUISudoku A = new GUISudoku();
        A.setTitle("");
        A.setLocationRelativeTo(null);//Centrar ventana
        A.setResizable(false);//inhabilitar maximizar ventana
        A.setVisible(true);
    }
    
}
