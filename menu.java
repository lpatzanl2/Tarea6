package Sobrecargar;

public class menu {

    public static void main (String [] args){
        Cargar cargar = new Cargar("Luis Lopez");
        cargar.imprimir();

        Cargar cargar1 = new Cargar(21);
        cargar1.imprimir(10);

    }

}
