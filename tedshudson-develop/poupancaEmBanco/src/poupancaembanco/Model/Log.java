/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupancaembanco.Model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author alunodev05
 */
public class Log implements Serializable {
    
    private static final long serialVersionUID = 5110749514942051395L;
    
    public static ArrayList<Transacao> arrayList = new ArrayList<Transacao>();
    
    public static void addTransacao(Transacao transacao){
        arrayList.add(transacao);
    }

    public static ArrayList<Transacao> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Transacao> arrayList) {
        Log.arrayList = arrayList;
    }
    
    static private void metodozinhoqueelevaichamardentrodoforeach(Transacao transacao){
        
        System.out.println("---##---##---##---##---##---");
        System.out.println("Data: " + transacao.getAno() + "/" + transacao.getMes() + "/" + transacao.getDia());
        System.out.println("Horario da operação: " + transacao.getHora() + ":" + transacao.getMinuto() + ":" + transacao.getSegundo());
        System.out.println("Operação: " + transacao.getOperacao());
        System.out.println("Valor: " + transacao.getValor());
        System.out.println("Saldo atual: " + "R$ " + transacao.getSaldoAtual());        
      
        
    }
    
    static public void imprimeExtrato(){
        arrayList.forEach(Transacao->metodozinhoqueelevaichamardentrodoforeach(Transacao) /*action here*/);
        System.out.println("---##---##---#FIM#---##---##---");
    }
    
}
