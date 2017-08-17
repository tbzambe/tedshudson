
package Persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import poupancaembanco.Model.PoupancaEmBanco;

public class poupancaDAO {
     

    public static void salvar(PoupancaEmBanco objeto) {

 
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




 

    public static PoupancaEmBanco restaurar() {



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
