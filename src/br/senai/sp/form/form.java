package br.senai.sp.form;

import java.sql.SQLOutput;
import java.util.Scanner;

public class form {
    public static void main(String[] args) {

        /** Import class Scanner */
        Scanner teclado = new Scanner(System.in);

//        /** Coleta dados do User */
//        System.out.print("Bom dia ! Qual é o seu nome ? ");
//        String nome = teclado.nextLine();
//
//        System.out.print("Qual a sua idade ? ");
//        int idade = teclado.nextInt();
//
//        System.out.print("Qual o seu peso ? ");
//        int peso = teclado.nextInt();
//
//        System.out.print("Qual é a sua altura ? ");
//        float altura = teclado.nextFloat();
//
//        System.out.print("Qual é o seu rg ? ");
//        int rg = teclado.nextInt();
//
//        System.out.print("Qual é o seu cpf ? ");
//        long cpf = teclado.nextLong();
//
//        System.out.print("Qual sua profissão ? ");
//        String profissao = teclado.next();
//
//        System.out.print("Qual é o seu curso ? ");
//        String curso = teclado.next();
//
//        /** Printa as Informações */
//
//        System.out.println("-----------------------------------------------------------------------");
//        System.out.println("--------------------Formulario----------------------------------------\n");
//        System.out.println(("Olá " + nome + " Seja bem vindo !! "));
//        System.out.println("Sua idade é: "+ idade);
//        System.out.println("Seu peso é: " + peso);
//        System.out.println("Sua altura é: " + altura);
//        System.out.println("Seu rg: " + rg);
//        System.out.println("Seu CPF: " + cpf);
//        System.out.println("Sua profissão: " + profissao);
//        System.out.println("Seu curso: " + curso);
//        System.out.println("-----------------------------------------------------------------------");
//        System.out.println("-----------------------------------------------------------------------");

        String [] nomes = new String[2];

        System.out.println("Qual nome Prof 1 : ");
        nomes[0] = teclado.nextLine();

        System.out.println("Qual nome Prof 2 : ");
        nomes[1] = teclado.nextLine();

        System.out.println("Olá Profºs : " + nomes[0] + " e " + nomes[1] + " Sejam bem vindos !");

        String [] idade = new String[2];

        System.out.println("Qual a idade do Prof 1 : ");
        idade[0] = teclado.nextLine();

        System.out.println("Qual a idade do Prof 2 : ");
        idade[1] = teclado.nextLine();

        System.out.println("A idade do Prof 1 é " + idade[0] + " anos, e a idade do Prof 2 é " + idade[1] + " anos.");


    }
}
