package negocio;

public class MainNodo {
    public static void main(){
        System.out.println("> Objetos creados: " + NodoRed.getContadorNodos());

        NodoRed nodo1 = new NodoRed(1, 2);
        mostrarInformacion(nodo1);

        System.out.println("\n==== PRUEBA CON DATOS INVALIDOS ===");
        NodoRed nodo2 = new NodoRed(-10, -2);
        mostrarInformacion(nodo2);

        System.out.println("> Objetos creados: " + NodoRed.getContadorNodos());

        System.out.println("\n=== CONECTAR NODO ===");
        System.out.println(nodo1.conectar());
        System.out.println(nodo1.conectar());
        System.out.println(nodo1.conectar());

        System.out.println("=== DESCONECTAR NODO ===");
        System.out.println(nodo1.desconectar());
        System.out.println(nodo1.desconectar());
        System.out.println(nodo1.desconectar());




    }
    public static void mostrarInformacion(NodoRed n){
        System.out.println("=== INFORMACION DEL NODO ===");
        System.out.println("Identificador: " + n.getIdentificador());
        System.out.println("Capacidad Maxima: " + n.getCapacidadMaxima());
        System.out.println("Conexiones Activas: " + n.getConexionesActivas());
        System.out.println("-----------------------------------------");
    }
}



