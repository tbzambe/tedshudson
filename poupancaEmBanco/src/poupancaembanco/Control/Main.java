/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupancaembanco.Control;

import poupancaembanco.Model.PoupancaEmBanco;
import Persistencia.poupancaDAO;
import static View.View.*;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import poupancaembanco.Model.Log;
import poupancaembanco.Model.Transacao;

public class Main {
    


	static public PoupancaEmBanco poupanca = new PoupancaEmBanco(0.05 , 1234 , 0001 , 100.00 , "Juca Robson", 1.02, "Itau");
        //static public PoupancaEmBanco poupanca = new PoupancaEmBanco();
        static public Log loglog = new Log();
	static public poupancaDAO daodao = new poupancaDAO();
        static public Transacao deal = new Transacao();

    /**
     *
     */
        public static Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        //static public PoupancaEmBanco poupanca2 = new PoupancaEmBanco(0.0 , 0000 , 0000 , 000.00 , "EM BRANCO", 0.00, "NENHUM");
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int opcao = 0;
            Double valor = 0.0;
            Scanner scan = new Scanner(System.in);
            
            while(opcao != 9)
            {
                if(opcao != 2 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7 ){
                printMenu();
                getOpcao();
                opcao = scan.nextInt();
                }
                switch (opcao) {
                case 1:
                    poupanca = poupancaDAO.restaurarPoupanca();
                    poupanca.exibeTudo();
                    loglog = poupancaDAO.restaurarLog();
                    poupancaCarregada();
                    logCarregado();
                    
                    
                break;
                
                case 2:
                    printMenuOperacoes();
                    opcao = scan.nextInt();
                break;
                
                case 3:
                    daodao.salvarPoupanca(poupanca);
                    daodao.salvarLog(loglog);
                    poupancaSalva();
                    logSalvo();
                break;
                
                case 4:
                    valorDeposito();
                    valor = scan.nextDouble();
                    poupanca.operacao('1', valor);
                    //int dia, int mes, int ano, int hora, int minuto, int segundo, String operacao, Double saldoAtual
                    deal = new Transacao(calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.MONTH),calendar.get(Calendar.YEAR),calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND),"Deposito",poupanca.getSaldo());
                    loglog.addTransacao(deal);
                    
                    opcao = 2;                                       
                break;
                    
                case 5:
                    valorSaque();
                    valor = scan.nextDouble();
                    poupanca.operacao('2', valor);
                    opcao = 2;
                break;

                case 6:
                   valorJuros();
                   valor = scan.nextDouble();
                   poupanca.operacao('3', valor);
                   opcao = 2;
                    
                break;
                
                case 7:
                   poupanca.exibeTudo();
                   opcao = 2;
                break;
                
                case 8:
                    opcao = 0;
                    
                break;
                
                

                                
            }
            }
	}


}
