package br.com.desafio1;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    //Construtor para receber os dados como parâmetros
    public HeartRates(String nome, String sobrenome, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    //Get e Set dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }


    //Método para calcular e retornar a idade
    public int calcularIdade() {
        LocalDate dateAtual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        Period periodo = Period.between(dataNascimento, dateAtual);
        return periodo.getYears();
    }

    //Método para calcular e retornar a frequência cardíaca máxima
    public int calculaFrequenciaCardiacaMax(){
        int idade = calcularIdade();
        int frequencia = 200;
        int frequenciaMax = frequencia - idade;
        return  frequenciaMax;
    }

    // Método para calcular e retornar a frequência cardíaca alvo
    public String calculaFrequenciaCardiacaAlvo(){
        int frequenciaMaxima = calculaFrequenciaCardiacaMax();
        int frequenciaMinima = (int) (frequenciaMaxima * 0.5);
        int frequenciaAlvo = (int) (frequenciaMaxima * 0.85);
        return "Sua frequência cardíaca alvo é um intervalo entre "+ frequenciaMinima + " - " + frequenciaAlvo;

    }



}