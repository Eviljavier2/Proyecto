/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;
import java.util.Stack;
/**
 *
 * @author ernst
 */
public class Pilas {


  
public static void main(String[] args) {
    Stack pila =new Stack();//constructor
    pila.push("Hola");//Agrega un elemento al tope de la estructura.
    pila.push("Mundo");
    System.out.println(pila.pop());//Saca el elemento del tope y lo regresa. El puntero al tope se mueve al anterior elemento.

    System.out.println(pila.peek());//Consulta el elemento en el tope, sin sacarlo.
    System.out.println(pila.empty());//¿Está vacía?
            

    }
    
}
