/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author alunodev05
 */
public class View {
    
    public static void printMenu() {
        System.out.println("Menu \n");
        System.out.println("1 - CARREGAR POUPANÇA \n");
        System.out.println("2 - Operações\n");
        System.out.println("3 - SALVAR POUPANÇA \n");
        System.out.println("9 - Sair \n");
    }
    
    public static void printMenuOperacoes() {
        System.out.println("\n Operações");
        System.out.println("4 - Depósito");
        System.out.println("5 - Saque");
        System.out.println("6 - Aplicar Juros");
        System.out.println("7 - Exibir status da conta");
        System.out.println("8 - Voltar");
    }

    public static void getOpcao() {
        System.out.println("Escolha uma opção: ");
    }
    
    public static void exibeSaldo(Double saldo) {
        System.out.println("Saldo atual: " + saldo);
    }
    
    public static void poupancaCarregada() {
        System.out.println("Poupança carregada!");
    }
    
    
    public static void logCarregado() {
        System.out.println("Log carregado!");
    }
    
    public static void poupancaSalva() {
        System.out.println("Poupança salva!");
    }
    public static void logSalvo() {
        System.out.println("Log salvo!");
    }
    
    public static void valorDeposito() {
        System.out.println("Quanto deseja depositar?");
    }
    
    public static void valorDepositado(Double valor) {
        System.out.println("Valor depositado: " + valor);
    }
    
    public static void valorSaque() {
        System.out.println("Quanto deseja sacar?");
    }
    
    public static void valorTaxaAdministrativa(Double taxa) {
        System.out.println("Taxa administrativa cobrada: " + taxa);
    }

  public static void valorJuros() {
    System.out.println("Que taxa de juros deve ser aplicada?");
  }
}
