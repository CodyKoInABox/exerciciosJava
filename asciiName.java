public class asciiName {
    public static void main(String args[]){
        char[][] letraM = criarLetraM();
        char[][] letraA = criarLetraA();
        char[][] letraR = criarLetraR();
        char[][] letraU = criarLetraU();
        char[][] letraN = criarLetraN();

        escrever(letraM);
        escrever(letraA);
        escrever(letraR);
        escrever(letraU);
        escrever(letraA);
        escrever(letraN);
    }

    public static char[][] criarLetraM(){
        char[][] letraM = {
                {'M', ' ', ' ', ' ', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', ' ', 'M', ' ', 'M'},
                {'M', ' ', 'M', ' ', 'M'}
        };
        return letraM;
    }

    public static char[][] criarLetraA(){
        char[][] letraA = {
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'}
        };
        return letraA;
    }

    public static char[][] criarLetraR(){
        char[][] letraR = {
                {'R', 'R', 'R', ' ', ' '},
                {'R', ' ', 'R', ' ', ' '},
                {'R', 'R', 'R', ' ', ' '},
                {'R', 'R', ' ', ' ', ' '},
                {'R', ' ', 'R', ' ', ' '}
        };
        return letraR;
    }

    public static char[][] criarLetraU(){
        char[][] letraU = {
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', 'U', 'U', 'U', 'U'}
        };
        return letraU;
    }

    public static char[][] criarLetraN(){
        char[][] letraN = {
                {'N', ' ', ' ', ' ', 'N'},
                {'N', 'N', ' ', ' ', 'N'},
                {'N', ' ', 'N', ' ', 'N'},
                {'N', ' ', ' ', 'N', 'N'},
                {'N', ' ', ' ', ' ', 'N'}
        };
        return letraN;
    }

    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
