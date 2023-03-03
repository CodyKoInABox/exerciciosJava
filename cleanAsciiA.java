public class cleanAsciiA {
    public static void main(String[] args) {
        char[][] arr = letraA();
        escrever(arr);
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
    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
