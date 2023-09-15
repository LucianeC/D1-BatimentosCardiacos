package br.com.desafio1;

public class Main {
    public static void main(String[] args) {
        HeartRates c1 = new HeartRates("Luciane", "Costa", 2004,06,24 );
        c1.calcularIdade();
        c1.calculaFrequenciaCardiacaMax();
        c1.calculaFrequenciaCardiacaAlvo();

        System.out.println("Informações pessoais: " + c1.getNome() + " " + c1.getSobrenome());
        System.out.println("Com a idade de: " + c1.calcularIdade() + " anos");
        System.out.println("Seu intervalo de frequência cardíaca máxima é " + c1.calculaFrequenciaCardiacaMax() + " e " + c1.calculaFrequenciaCardiacaAlvo());

    }
}
