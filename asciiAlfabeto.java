public class asciiAlfabeto {

    public static void main(String args[]){

        char[][] letraA = criarLetraA();
        char[][] letraB = criarLetraB();
        char[][] letraC = criarLetraC();
        char[][] letraD = criarLetraD();
        char[][] letraE = criarLetraE();
        char[][] letraF = criarLetraF();
        char[][] letraG = criarLetraG();
        char[][] letraH = criarLetraH();
        char[][] letraI = criarLetraI();
        char[][] letraJ = criarLetraJ();
        char[][] letraK = criarLetraK();
        char[][] letraL = criarLetraL();
        char[][] letraM = criarLetraM();
        char[][] letraN = criarLetraN();
        char[][] letraO = criarLetraO();
        char[][] letraP = criarLetraP();
        char[][] letraQ = criarLetraQ();
        char[][] letraR = criarLetraR();
        char[][] letraS = criarLetraS();
        char[][] letraT = criarLetraT();
        char[][] letraU = criarLetraU();
        char[][] letraV = criarLetraV();
        char[][] letraW = criarLetraW();
        char[][] letraX = criarLetraX();
        char[][] letraY = criarLetraY();
        char[][] letraZ = criarLetraZ();

        escrever(letraA);
        escrever(letraB);
        escrever(letraC);
        escrever(letraD);
        escrever(letraE);
        escrever(letraF);
        escrever(letraG);
        escrever(letraH);
        escrever(letraI);
        escrever(letraJ);
        escrever(letraK);
        escrever(letraL);
        escrever(letraM);
        escrever(letraN);
        escrever(letraO);
        escrever(letraP);
        escrever(letraQ);
        escrever(letraR);
        escrever(letraS);
        escrever(letraT);
        escrever(letraU);
        escrever(letraV);
        escrever(letraW);
        escrever(letraX);
        escrever(letraY);
        escrever(letraZ);

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

    public static char[][] criarLetraB(){
        char[][] letraB = {
                {'B', 'B', 'B', ' ', ' '},
                {'B', ' ', 'B', ' ', ' '},
                {'B', 'B', ' ', ' ', ' '},
                {'B', ' ', 'B', ' ', ' '},
                {'B', 'B', 'B', ' ', ' '}
        };
        return letraB;
    }

    public static char[][] criarLetraC(){
        char[][] letraC = {
                {'C', 'C', 'C', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', 'C', 'C', ' ', ' '}
        };
        return letraC;
    }

    public static char[][] criarLetraD(){
        char[][] letraD = {
                {'D', 'D', ' ', ' ', ' '},
                {'D', ' ', 'D', ' ', ' '},
                {'D', ' ', 'D', ' ', ' '},
                {'D', ' ', 'D', ' ', ' '},
                {'D', 'D', ' ', ' ', ' '}
        };
        return letraD;
    }

    public static char[][] criarLetraE(){
        char[][] letraE = {
                {'E', 'E', 'E', ' ', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', ' ', ' ', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', ' ', ' '}
        };
        return letraE;
    }

    public static char[][] criarLetraF(){
        char[][] letraF = {
                {'F', 'F', 'F', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', 'F', ' ', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '}
        };
        return letraF;
    }

    public static char[][] criarLetraG(){
        char[][] letraG = {
                {'G', 'G', 'G', 'G', ' '},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', 'G', 'G', ' '},
                {'G', ' ', ' ', 'G', ' '},
                {'G', 'G', 'G', 'G', ' '}
        };
        return letraG;
    }

    public static char[][] criarLetraH(){
        char[][] letraH = {
                {'H', ' ', 'H', ' ', ' '},
                {'H', ' ', 'H', ' ', ' '},
                {'H', 'H', 'H', ' ', ' '},
                {'H', ' ', 'H', ' ', ' '},
                {'H', ' ', 'H', ' ', ' '}
        };
        return letraH;
    }

    public static char[][] criarLetraI(){
        char[][] letraI = {
                {'I', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'I', ' ', ' ', ' ', ' '},
                {'I', ' ', ' ', ' ', ' '},
                {'I', ' ', ' ', ' ', ' '}
        };
        return letraI;
    }

    public static char[][] criarLetraJ(){
        char[][] letraJ = {
                {'J', 'J', 'J', ' ', ' '},
                {' ', 'J', ' ', ' ', ' '},
                {' ', 'J', ' ', ' ', ' '},
                {' ', 'J', ' ', ' ', ' '},
                {'J', 'J', ' ', ' ', ' '}
        };
        return letraJ;
    }

    public static char[][] criarLetraK(){
        char[][] letraK = {
                {'K', ' ', 'K', ' ', ' '},
                {'K', 'K', ' ', ' ', ' '},
                {'K', 'K', 'K', ' ', ' '},
                {'K', ' ', 'K', ' ', ' '},
                {'K', ' ', 'K', ' ', ' '}
        };
        return letraK;
    }

    public static char[][] criarLetraL(){
        char[][] letraL = {
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', ' ', ' '}
        };
        return letraL;
    }

    public static char[][] criarLetraM(){
        char[][] letraM = {
                {'M', ' ', ' ', ' ', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', ' ', 'M', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'}
        };
        return letraM;
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

    public static char[][] criarLetraO(){
        char[][] letraO = {
                {'O', 'O', 'O', ' ', ' '},
                {'O', ' ', 'O', ' ', ' '},
                {'O', ' ', 'O', ' ', ' '},
                {'O', ' ', 'O', ' ', ' '},
                {'O', 'O', 'O', ' ', ' '}
        };
        return letraO;
    }

    public static char[][] criarLetraP(){
        char[][] letraP = {
                {'P', 'P', 'P', ' ', ' '},
                {'P', ' ', 'P', ' ', ' '},
                {'P', 'P', 'P', ' ', ' '},
                {'P', ' ', ' ', ' ', ' '},
                {'P', ' ', ' ', ' ', ' '}
        };
        return letraP;
    }

    public static char[][] criarLetraQ(){
        char[][] letraQ = {
                {'Q', 'Q', 'Q', ' ', ' '},
                {'Q', ' ', 'Q', ' ', ' '},
                {'Q', ' ', 'Q', ' ', ' '},
                {'Q', 'Q', 'Q', ' ', ' '},
                {' ', ' ', ' ', 'Q', ' '}
        };
        return letraQ;
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

    public static char[][] criarLetraS(){
        char[][] letraS = {
                {'S', 'S', 'S', ' ', ' '},
                {'S', ' ', ' ', ' ', ' '},
                {'S', 'S', 'S', ' ', ' '},
                {' ', ' ', 'S', ' ', ' '},
                {'S', 'S', 'S', ' ', ' '}
        };
        return letraS;
    }

    public static char[][] criarLetraT(){
        char[][] letraT = {
                {'T', 'T', 'T', 'T', 'T'},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '}
        };
        return letraT;
    }

    public static char[][] criarLetraU(){
        char[][] letraU = {
                {'U', ' ', 'U', ' ', ' '},
                {'U', ' ', 'U', ' ', ' '},
                {'U', ' ', 'U', ' ', ' '},
                {'U', ' ', 'U', ' ', ' '},
                {'U', 'U', 'U', ' ', ' '}
        };
        return letraU;
    }

    public static char[][] criarLetraV(){
        char[][] letraV = {
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {' ', 'V', ' ', 'V', ' '},
                {' ', 'V', ' ', 'V', ' '},
                {' ', ' ', 'V', ' ', ' '}
        };
        return letraV;
    }

    public static char[][] criarLetraW(){
        char[][] letraW = {
                {'W', ' ', ' ', ' ', 'W'},
                {'W', ' ', 'W', ' ', 'W'},
                {'W', ' ', 'W', ' ', 'W'},
                {'W', 'W', ' ', 'W', 'W'},
                {'W', ' ', ' ', ' ', 'W'}
        };
        return letraW;
    }

    public static char[][] criarLetraX(){
        char[][] letraX = {
                {'X', ' ', ' ', ' ', 'X'},
                {' ', 'X', ' ', 'X', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', 'X', ' '},
                {'X', ' ', ' ', ' ', 'X'}
        };
        return letraX;
    }

    public static char[][] criarLetraY(){
        char[][] letraY = {
                {' ', 'Y', ' ', 'Y', ' '},
                {' ', 'Y', ' ', 'Y', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '}
        };
        return letraY;
    }

    public static char[][] criarLetraZ(){
        char[][] letraZ = {
                {'Z', 'Z', 'Z', 'Z', 'Z'},
                {' ', ' ', ' ', 'Z', ' '},
                {' ', ' ', 'Z', ' ', ' '},
                {' ', 'Z', ' ', ' ', ' '},
                {'Z', 'Z', 'Z', 'Z', 'Z'}
        };
        return letraZ;
    }
}
