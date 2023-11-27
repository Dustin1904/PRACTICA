import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //objeto
        Clase1 perro1;
        Clase1 perro2;

        perro1 = new Clase1("Pepito");
        perro2 = new Clase1("Carlitos");

        //objeto y metodo
        perro1.entradaDatos();
        perro2.entradaDatos();

        System.out.println("Perro: "+ perro1.getNombre());
        perro1.salidaDatos();

        System.out.println("perro: " + perro2.getNombre());
        perro2.salidaDatos();

        //modiciar el atributo con un dato quemado
        Scanner casa=new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre: ");

        perro1.setNombre(casa.nextLine());

        System.out.println("Perro: "+ perro1.getNombre());
    }
}
