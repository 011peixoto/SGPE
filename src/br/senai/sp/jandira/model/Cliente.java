package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    String nome, sobrenome;
    long cpf, rg;

    public void cadastrarCliente(){
        System.out.println("Informe o seu Nome:      ");
        nome = scanner.nextLine();
        System.out.println("Informe o seu Sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Informe seu Cpf:         ");
        cpf = scanner.nextLong();
        System.out.println("Informe seu Rg:          ");
        rg = scanner.nextLong();
        scanner.nextLine();



    }
}
