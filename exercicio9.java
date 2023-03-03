public class exercicio9 {
    public interface Letra {
        char[][] desenhar();
    }
    
    public class LetraA implements Letra {
        public char[][] desenhar() {
            char[][] arr = {
              {'A', 'A', 'A', 'A', 'A'},
              {'A', ' ', ' ', ' ', 'A'},
              {'A', 'A', 'A', 'A', 'A'},
              {'A', ' ', ' ', ' ', 'A'},
              {'A', ' ', ' ', ' ', 'A'}
            };
            return arr;
        }
    }
    
    public class Escritor {
        public void escrever(char[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public class Exemplo {
        public void main(String[] args) {
            Letra letra = new LetraA();
            char[][] arr = letra.desenhar();
    
            Escritor escritor = new Escritor();
            escritor.escrever(arr);
        }
    }
}
