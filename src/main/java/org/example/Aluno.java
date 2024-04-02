package org.example;

public class Aluno{

    private String nome;
    private String turma;
    private double notat1;
    private double notat2;
    private double notat3;

    public Aluno(String nome, String turma, double notat1, double notat2, double notat3) {


        this.nome = nome;
        this.turma = turma;
        this.notat1 = notat1;
        this.notat2 = notat2;
        this.notat3 = notat3;

    }

    /////////////gets//////////////////////
    public String getNome(){return nome;}
    public String getTurma(){return turma;}
    public double getNotat1(){return notat1;}
    public double getNotat2(){return notat2;}
    public double getNotat3(){return notat3;}

    ////////////////sets////////////////////////

    public void setNome(String nome){this.nome = nome;}
    public void setTurma(String turma){this.turma = turma;}
    public void setNotat1(double notat1){this.notat1 = notat1;}
    public void setNotat2(double notat2){this.notat2 = notat2;}
    public void setNotat3(double notat3){this.notat3 = notat3;}

    //////////////////metodos//////////////////////

    public String media(){
        double num = (notat1 + notat2 + notat3) / 3;
        return String.format("%.2f",num);
    }

    public String aprovado(){
        double num = (notat1 + notat2 + notat3) / 3;
        if(num >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

}