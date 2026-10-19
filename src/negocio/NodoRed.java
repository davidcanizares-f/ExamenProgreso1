package negocio;

public class NodoRed {
    private int identificador;
    private int capacidadMaxima;
    private int conexionesActivas;
    private static int contadorNodos=0;

    //Constructor
    public NodoRed(int identificador, int capacidadMaxima){

        if(identificador >= 0){
            this.identificador = identificador;
        }
        setCapacidadMaxima(capacidadMaxima);
        this.conexionesActivas = 0;
        if(identificador >= 0 && capacidadMaxima >= 0){
            contadorNodos++;
        }

    }

    //Getters y setters

    public int getIdentificador(){
        return identificador;
    }

    public void setCapacidadMaxima(int capacidadMaxima){
        if(capacidadMaxima > 0){
            this.capacidadMaxima = capacidadMaxima;
        }
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

    public int getConexionesActivas(){
        return conexionesActivas;
    }



    //Metodos utilitarios
    public boolean conectar(){
        if(capacidadMaxima > 0){
            this.conexionesActivas++;
            this.capacidadMaxima--;
            System.out.println("Nodo Conectado");
            System.out.println("Conexiones activas: " + this.conexionesActivas);
            return true;


        }else{
            System.out.println("Nodo no Conectado (Nodo lleno)");
            System.out.println("Conexiones activas: " + this.conexionesActivas);
            return false;
        }

    }

    public boolean desconectar(){
        if(this.conexionesActivas >= 1){
            this.conexionesActivas--;
            this.capacidadMaxima++;
            System.out.println("Nodo Desconectado");
            System.out.println("Conexiones activas: " + this.conexionesActivas);
            return true;

        }else{
            System.out.println("Nodo no Desconectado (No existen conexiones)");
            System.out.println("Conexiones activas: " + this.conexionesActivas);
            return false;
        }

    }

    public static int getContadorNodos(){
        return contadorNodos;
    }



}
