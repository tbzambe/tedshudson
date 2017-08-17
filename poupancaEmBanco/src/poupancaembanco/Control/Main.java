/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupancaembanco.Control;

import poupancaembanco.Model.PoupancaEmBanco;
import Persistencia.poupancaDAO;
import static View.view.*;
import java.util.Scanner;

public class Main {
    


	static public PoupancaEmBanco poupanca = new PoupancaEmBanco(0.05 , 1234 , 0001 , 100.00 , "Juca Robson", 1.02, "Itau");
        //static public PoupancaEmBanco poupanca = new PoupancaEmBanco();

	static public poupancaDAO daodao = new poupancaDAO();
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
                    poupanca = poupancaDAO.restaurar();
                    poupanca.exibeTudo();
                    poupancaCarregada();
                    
                    
                break;
                
                case 2:
                    printMenuOperacoes();
                    opcao = scan.nextInt();
                break;
                
                case 3:
                    daodao.salvar(poupanca);
                    poupancaSalva();
                break;
                
                case 4:
                    valorDeposito();
                    valor = scan.nextDouble();
                    poupanca.operacao('1', valor);
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
