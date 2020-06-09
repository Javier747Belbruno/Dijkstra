package interfaz;

import soporte.*;

/**
 * Una clase para contener un main de prueba para la implementación de grafos
 * por listas de adyancencia.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Marzo de 2014.
 */
public class Principal 
{
    public static void main(String args[])
    {
        DirectedGraph <String> dg1 = new DirectedGraph<>(true);//Allow Parallel edges
       
        dg1.add("0");
        dg1.add("1");
        dg1.add("2");
        dg1.add("3");

        
        dg1.addArc("0", "1", 1);
        dg1.addArc("0", "2", 5);  
        dg1.addArc("1", "2", 2);
        dg1.addArc("1", "3", 7);
        dg1.addArc("2", "3", 3);
    
        //Resultado = 10 Con x = 0
        /*
        dg1.add("1");
        dg1.add("2");
        dg1.add("3");
        dg1.add("4");
        dg1.add("5");
        dg1.add("6");
        
        dg1.addArc("1", "2", 2);
        dg1.addArc("1", "3", 1);  
        dg1.addArc("2", "4", 1); 
        dg1.addArc("3", "4", 3);
        dg1.addArc("3", "5", 4);
        dg1.addArc("4", "6", 2);
        dg1.addArc("5", "6", 2);
        */
        //Resultado = 16 con x = 1
        
        //ug1.addArc("c", "f", 2);  // probar con este arco paralelo... ok!!

        //ug1.addArc("g", "h", 2);    // grafo no conexo...
        
        
        System.out.println("Grafo 1 (Dirigido - sin arcos paralelos, conexo: ");
        System.out.println(dg1);
        System.out.println();
        
        Node<String> initialNode = new Node<>("0");
        System.out.println();
        System.out.println("Grafo 1: Valor del SPT (Dijkstra): " + dg1.getShortestPathValue_Dijkstra(initialNode));
        
    }
}
