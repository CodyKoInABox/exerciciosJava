import java.util.HashMap;

public class exercicio11 {
    private final HashMap<Character, Letra> letras = new HashMap<>();

    public Escritor() {
        letras.put('A', new LetraA());
        letras.put('B', new LetraB());
        letras.put('C', new LetraC());
        // Adicionar outras letras
    }

    public void escreverPalavra(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            Letra letraObj = letras.getOrDefault(letra, new LetraDesconhecida());
            char[][] arr = letraObj.desenhar();
            escrever(arr);
        }
    }

    private void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Exemplo {
    public static void main(String[] args) {
        Escritor escritor = new Escritor();
        escritor.escreverPalavra("JAVA");
    }
}