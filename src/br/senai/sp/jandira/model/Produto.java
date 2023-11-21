package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

     String nome, fornecedor;
     int codigo, quantidade, preco;

     public void cadastrarProduto(){
         System.out.println("// Informe o nome do Produto:      !_!");
         nome = scanner.nextLine();
         System.out.println("// Informe o Fornecedor do Produto:!_!");
         fornecedor = scanner.nextLine();
         System.out.println("// Informe o Codigo do Produto:    !_!");
         codigo = scanner.nextInt();
         System.out.println("// Infotme o Preço:                !_!");
         preco = scanner.nextInt();
         System.out.println("// Informe a Quantidade:           !_!");
         quantidade = scanner.nextInt();
         scanner.nextLine();



     }





}
