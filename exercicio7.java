public class exercicio7 {
    public static void main(String[] args) {
      char[][] arrA = letraA();
      escrever(arrA);
  
      char[][] arrB = letraB();
      escrever(arrB);
  
      char[][] arrC = letraC();
      escrever(arrC);
    }
  
    public static char[][] letraA() {
      char[][] arr = {
        {'A', 'A', 'A', 'A', 'A'},
        {'A', ' ', ' ', ' ', 'A'},
        {'A', 'A', 'A', 'A', 'A'},
        {'A', ' ', ' ', ' ', 'A'},
        {'A', ' ', ' ', ' ', 'A'}
      };
      return arr;
    }
  
    public static char[][] letraB() {
      char[][] arr = {
        {'B', 'B', 'B', 'B', ' '},
        {'B', ' ', ' ', ' ', 'B'},
        {'B', 'B', 'B', 'B', ' '},
        {'B', ' ', ' ', ' ', 'B'},
        {'B', 'B', 'B', 'B', ' '}
      };
      return arr;
    }
  
    public static char[][] letraC() {
      char[][] arr = {
        {' ', ' ', 'C', 'C', 'C'},
        {' ', 'C', ' ', ' ', ' '},
        {'C', ' ', ' ', ' ', ' '},
        {' ', 'C', ' ', ' ', ' '},
        {' ', ' ', 'C', 'C', 'C'}
      };
      return arr;
    }
  
    public static void escrever(char[][] arr) {
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
  }