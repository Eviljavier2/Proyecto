/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacelist;
import java.util.ArrayList;
/**
 *
 * @author ernst
 */
public class InterfaceList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
        ArrayList<String> list = new ArrayList();//Constructor de la lista
        list.add("Hola");//Elelemnto de inicio 
        list.add("Mundo");//elemento del final
        System.out.println(list);//Metodo que imprime la lista
        System.out.println(list.size());//Elemento que imprime en numero de elementods 
        System.out.println(list.get(0));//Metodos que imptimen un elelento especifico
        System.out.println(list.get(1));
    
    }
    
}
