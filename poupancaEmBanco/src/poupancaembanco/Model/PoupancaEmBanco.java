/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupancaembanco.Model;

import java.io.Serializable;

public class PoupancaEmBanco implements Serializable {

  private static final long serialVersionUID = 5110549514946052395L;

  private double jurosMensal;
  private double saldo;
  private double taxaAdm;
  private int agencia;
  private int numeroPoupanca;
  private String banco;
  private String nomeCliente;

  //METODO CONSTRUTOR
  public PoupancaEmBanco(double jurosMensal, int agencia, int numeroPoupanca, double saldo, String nomeCliente,
      double taxaAdm, String banco) {
    this.setJurosMensal(jurosMensal);
    this.setAgencia(agencia);
    this.setNumeroPoupanca(numeroPoupanca);
    this.setSaldo(saldo);
    this.setNomeCliente(nomeCliente);
    this.setTaxaAdm(taxaAdm);
    this.setBanco(banco);
  }

  public void exibeTudo() {
    System.out.println("\n Taxa de juros mensal: " + this.getJurosMensal());
    System.out.println("\n Agencia: " + this.getAgencia());
    System.out.println("\n Num. poupança: " + this.getNumeroPoupanca());
    System.out.println("\n Saldo: " + this.getSaldo());
    System.out.println("\n Nome do cliente: " + this.getNomeCliente());
    System.out.println("\n Taxa adm. :" + this.getTaxaAdm());
    System.out.println("\n Banco: " + this.getBanco());
  }

  public double getJurosMensal() {
    return jurosMensal;
  }

  public void setJurosMensal(double jurosMensal) {
    this.jurosMensal = jurosMensal;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumeroPoupanca() {
    return numeroPoupanca;
  }

  public void setNumeroPoupanca(int numeroPoupanca) {
    this.numeroPoupanca = numeroPoupanca;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public double getTaxaAdm() {
    return taxaAdm;
  }

  public void setTaxaAdm(double taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  /**
   * Atualiza saldo com base nos juros mensais.
   */
  public void atualizaSaldo() {
    this.setSaldo((this.getSaldo() * this.getJurosMensal()));
  }

  /**
   * Atualiza saldo com base em uma taxa de juros.
   * @param taxaJuros
   */
  public void atualizaSaldo(Double taxaJuros) {
    this.setSaldo((this.getSaldo() * taxaJuros));
  }

  /**
   * Atualiza saldo com base em uma taxa de juros, porem valida o numero da poupanca antes.
   * @param numeroPoupanca
   * @param taxaJuros
   */
  public void atualizaSaldo(int numeroPoupanca, Double taxaJuros) {
    if ((this.getNumeroPoupanca() == numeroPoupanca)) {
      this.setSaldo(this.getSaldo() * taxaJuros);
    }
  }

  //OPERAÇÕES
  public void operacao(int operacao, Double valor) {
    switch (operacao) {
    case '1':
      this.setSaldo(this.getSaldo() + valor);
      break;
    case '2':
      this.setSaldo(this.getSaldo() - valor);
      this.setSaldo(this.getSaldo() - this.getTaxaAdm());
      break;
    case '3':
      this.setSaldo(this.getSaldo() * (1 + (valor / 100)));
      break;
    }
  }
}