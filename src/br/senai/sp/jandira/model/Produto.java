package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

     String nome, fornecedor;
     int codigo, quantidade;
     double preco;

     public void cadastrarProduto(){
         System.out.println("// Informe o nome do Produto:      !_!");
         nome = scanner.nextLine();
         System.out.println("// Informe o Fornecedor do Produto:!_!");
         fornecedor = scanner.nextLine();
         System.out.println("// Informe o Codigo do Produto:    !_!");
         codigo = scanner.nextInt();
         System.out.println("// Informe o Preço:                !_!");
         preco = scanner.nextDouble();
         System.out.println("// Informe a Quantidade:           !_!");
         quantidade = scanner.nextInt();
         scanner.nextLine();



     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco()         {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
