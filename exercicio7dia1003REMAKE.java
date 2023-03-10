import java.util.Scanner;

public class exercicio7dia1003REMAKE {

    


    static class Astro{
        String nome;
        double gravidade;
    }

    static class Planeta extends Astro{
        int index;
        public void pedirPlaneta(Planeta[] listaDePlanetas){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha um planeta para viajar:");
        for (int i = 0; i < listaDePlanetas.length; i++) {
            System.out.println(i + ". " + listaDePlanetas[i].nome);
        }
        System.out.print("Digite o número do planeta escolhido: ");
        int temp = scanner.nextInt();
        if(temp > listaDePlanetas.length || temp < 0){
            System.out.println("ERRO: O planeta selecionado nao existe!");
            System.exit(1);
        }
        else{
            index = temp;
        }
        }
    }

    static class Pessoa{
        double peso;
        public void pedirPeso(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o seu peso em kg: ");
            double temp = scanner.nextDouble();
            if(temp <= 0){
                System.out.println("ERRO: O peso digitado nao e valido! Use um valor acima de 0.");
                System.exit(1); 
            }
            else{
                peso = temp;
            }
        }
    }

    static class Astronauta extends Pessoa{
        double pesoAstronauta;
        public void calcularPeso(double peso, double gravidade){
            pesoAstronauta = peso * gravidade;
        }
    }



    public static void main(String[] args){
       
       
       //criar planetas

       //criar um planeta "geral" para usar um metodo sem precisar usar algum planeta especifico
       Planeta planeta = new Planeta();
       
       //criar mercurio
        Planeta mercurio = new Planeta();
        mercurio.nome = "Mercurio";
        mercurio.gravidade = 0.38;

        //criar venus
        Planeta venus = new Planeta();
        venus.nome = "Venus";
        venus.gravidade = 0.91;

        //criar terra
        Planeta terra = new Planeta();
        terra.nome = "Terra";
        terra.gravidade = 1.00;

        //criar marte
        Planeta marte = new Planeta();
        marte.nome = "Marte";
        marte.gravidade = 0.38;

        //criar jupiter
        Planeta jupiter = new Planeta();
        jupiter.nome = "Jupiter";
        jupiter.gravidade = 2.34;

        //criar saturno
        Planeta saturno = new Planeta();
        saturno.nome = "Saturno";
        saturno.gravidade = 0.93;

        //criar urano
        Planeta urano = new Planeta();
        urano.nome = "Urano";
        urano.gravidade = 0.92;

        //criar netuno
        Planeta netuno = new Planeta();
        netuno.nome = "Netuno";
        netuno.gravidade = 1.12;

        //criar array com todos os planetas
        Planeta planetas[] = {mercurio, venus, terra, marte, jupiter, saturno, urano, netuno}; 


        //criar um astronauta
        Astronauta astronauta = new Astronauta();
        //pedir ao usuario o seu peso
        astronauta.pedirPeso();

        //pedir o usuario que escolha o planeta que ele quer ir
        planeta.pedirPlaneta(planetas);

        //calcular o peso da pessoa naquele planeta
        astronauta.calcularPeso(astronauta.peso, planetas[planeta.index].gravidade);

        //imprimir o resultado
        System.out.println("Seu peso no planeta " + planetas[planeta.index].nome + " e de " + astronauta.pesoAstronauta + " kg.");

        
    }  
}
