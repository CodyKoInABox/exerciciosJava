package prova1;

public class Retangulo {
    private int largura;

    private int altura;

    public int calcularArea(){
        return largura * altura;
    }

    public int calcularPerimetro(){
        return largura * 2 + altura * 2;
    }

    public int getLargura(){
        return largura;
    }

    public int getAltura(){
        return altura;
    }

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
}
