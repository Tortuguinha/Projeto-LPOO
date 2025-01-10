package app.view.components;

import java.util.Date;

import java.util.Date;
import java.util.Scanner;

public class notification {
    // Representação básica de um cliente
    static class Cliente {
        String nome;
        String email;
        String cpfCnpj;

        Cliente(String nome, String email, String cpfCnpj) {
            this.nome = nome;
            this.email = email;
            this.cpfCnpj = cpfCnpj;
        }
    }

    // Representação de uma ordem de serviço
    static class OrdemServico {
        int id;
        String descricao;
        Date dataCriacao;

        OrdemServico(int id, String descricao) {
            this.id = id;
            this.descricao = descricao;
            this.dataCriacao = new Date();
        }
    }

    // Validação básica de CPF/CNPJ
    public static boolean validarCpfCnpj(String cpfCnpj) {
        return cpfCnpj.matches("\\d{11}|\\d{14}");
    }

    // Simulação de envio de e-mail
    public static void enviarEmail(Cliente cliente, OrdemServico ordemServico) {
        System.out.println("Enviando e-mail para: " + cliente.email);
        System.out.println("Olá " + cliente.nome + ", segue o detalhamento da sua ordem de serviço:");
        System.out.println("Ordem ID: " + ordemServico.id);
        System.out.println("Descrição: " + ordemServico.descricao);
        System.out.println("Data: " + ordemServico.dataCriacao);
        System.out.println("Email enviado com sucesso!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do cliente
        System.out.println("=== Cadastro de Cliente ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("CPF/CNPJ: ");
        String cpfCnpj = scanner.nextLine();

        if (!validarCpfCnpj(cpfCnpj)) {
            System.out.println("CPF/CNPJ inválido! Encerrando...");
            return;
        }

        Cliente cliente = new Cliente(nome, email, cpfCnpj);

        // Cadastro de ordem de serviço
        System.out.println("\n=== Cadastro de Ordem de Serviço ===");
        System.out.print("Descrição da Ordem: ");
        String descricao = scanner.nextLine();
        OrdemServico ordemServico = new OrdemServico(1, descricao);

        // Envio de notificação
        enviarEmail(cliente, ordemServico);

        scanner.close();
    }
}


