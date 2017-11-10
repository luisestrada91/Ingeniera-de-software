
package Tikect;

import javax.swing.JOptionPane;

public class Principal {
   
    public static void main(String[] args) {
        
        Lista popo = new Lista();
        
        int opc;
        String pro;
        int pre;
        do {
            opc=Integer.parseInt(JOptionPane.showInputDialog("1 Insertar \\n 2 Mostar \\n 3 Salir \""));
            if (opc==1) {
                pro=JOptionPane.showInputDialog("Dame nombre");
                popo.insertarInicioSS(pro);
                pre=Integer.parseInt(JOptionPane.showInputDialog("Dame precio"));
                popo.insertarInicioII(pre);
            }
            if (opc==2) {
                popo.mostrarListaDEFINITIVAPRO();
            }
            if (opc==3) {
                popo.mensaje();
                
            }
        } while (true);
        
        
    }
    
}
