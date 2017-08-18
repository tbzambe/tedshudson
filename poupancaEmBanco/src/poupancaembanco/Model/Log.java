/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupancaembanco.Model;

import java.util.ArrayList;


/**
 *
 * @author alunodev05
 */
public class Log {
     static ArrayList<Transacao> arrayList = new ArrayList<Transacao>();
    
    public static void addTransacao(Transacao transacao){
        arrayList.add(transacao);
    }

    public static ArrayList<Transacao> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Transacao> arrayList) {
        Log.arrayList = arrayList;
    }
    
    
}
