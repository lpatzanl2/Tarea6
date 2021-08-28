package Sobrecargar;

public class Cargar {

    private String nombre;
    private int edad;

    public Cargar(String nombre) {
        this.nombre = nombre;
    }

    public Cargar(int edad) {
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("Su nombres es: " +nombre);

    }

    public void imprimir(int meses){

        System.out.println("con su edad: "+edad +" y meses: "+meses);
    }
}
