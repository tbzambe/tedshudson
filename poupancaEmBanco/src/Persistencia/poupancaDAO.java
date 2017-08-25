
package Persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import poupancaembanco.Model.Log;
import poupancaembanco.Model.Transacao;
import poupancaembanco.Model.PoupancaEmBanco;

public class poupancaDAO {
     

    public static void salvarPoupanca(PoupancaEmBanco objeto) {

 
           try {

             FileOutputStream saveFile = new FileOutputStream("arquivo.sav");

             ObjectOutputStream stream = new ObjectOutputStream(saveFile);

 

              // salva o objeto

             stream.writeObject(objeto);

 

             stream.close();

           } catch (Exception exc) {

             exc.printStackTrace();

           }

    }
    
    
    public static void salvarLog(Log log)
    {
        
 
           try {

             FileOutputStream saveFile = new FileOutputStream("loglog.sav");

             ObjectOutputStream stream = new ObjectOutputStream(saveFile);

 

              // salva o objeto

             stream.writeObject(log.arrayList);

 

             stream.close();

           } catch (Exception exc) {

             exc.printStackTrace();

           }
    }
    
    public static ArrayList<Transacao> restaurarLog()
    {
       

           ArrayList<Transacao> log = null;



           try {

                  FileInputStream restFile = new FileInputStream("loglog.sav");

                  ObjectInputStream stream = new ObjectInputStream(restFile);



                  // recupera o objeto

                  log = (ArrayList<Transacao>) stream.readObject();



                  stream.close();

           } catch (Exception e) {

                  e.printStackTrace();

           }



           return log;

    }
    
   
 

    public static PoupancaEmBanco restaurarPoupanca() {



           PoupancaEmBanco objeto = null;



           try {

                  FileInputStream restFile = new FileInputStream("arquivo.sav");

                  ObjectInputStream stream = new ObjectInputStream(restFile);



                  // recupera o objeto

                  objeto = (PoupancaEmBanco) stream.readObject();



                  stream.close();

           } catch (Exception e) {

                  e.printStackTrace();

           }



           return objeto;

    }

}
