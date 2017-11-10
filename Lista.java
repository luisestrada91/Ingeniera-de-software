
package Tikect;

import javax.swing.JOptionPane;

public class Lista {
     protected NodoS inicioS,finS;
     protected NodoI inicioI,finI;
     
     public Lista(){
       inicioI=null;
       finI=null;
       finS=null;
       inicioS=null;
       
    }
     public void insertarInicioSS(String elemento){
       inicioS= new NodoS(elemento, inicioS);
    }
     public void insertarInicioII(int elemento){
       inicioI= new NodoI(elemento, inicioI);
    }
     public void mostrarListaDEFINITIVAPRO(){
         NodoS recorrerS=inicioS;
         NodoI recorrerI=inicioI;
  
        while(recorrerI!=null && recorrerS!=null){                  
            System.out.println("["+recorrerS.datoS+"] = "+recorrerI.datoI);
            recorrerS=recorrerS.nodoSSig;
            recorrerI=recorrerI.nodoISig;
        }
       
    }
     public void mensaje(){
         JOptionPane.showMessageDialog(null,"Hola quesos");
     }
}
