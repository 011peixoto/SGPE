package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Produto;

import java.util.Scanner;

public class Menu {
    public void executarMenu(){

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
         while (continuar){

             System.out.println("|========================================|");
             System.out.println("|========Bem-vindo=======================|");
             System.out.println("|1- Cadastrar Cliente====================|");
             System.out.println("|2- Cadastrar Pruduto====================|");
             System.out.println("|3- Pesquisar Cliete=====================|");
             System.out.println("|4- Pesquisar Produto====================|");
             System.out.println("|5- Listar Produto=======================|");
             System.out.println("|6- Listar Cliente=======================|");
             System.out.println("|7- Consultar Cliente====================|");
             System.out.println("|8- Consultar Produto====================|");
             System.out.println("|9- Sair=================================|");
             System.out.println("|========================================|");
             System.out.println("|E melhor ser REI por uma noite do que um|");
             System.out.println("|========Idiota-a-vida-inteira :D========|");


             int opcaoUser = scanner.nextInt();
             scanner.nextLine();
             switch (opcaoUser){

                 case 1:
                     Cliente cliente = new Cliente();
                     cliente.cadastrarCliente();
                     break;
                 case 2:
                     Produto produto = new Produto();
                     produto.cadastrarProduto();
                     break;
                 case 3:
                     break;
                 case 4:
                     break;
                 case 5:
                     break;
                 case 6:
                     break;
                 case 7:
                     break;
                 case 8:
                     continuar = false;
                     break;



             }
         }
    }
}