import java.util.Scanner;
public class Clase1 {
    //atributos
    public String nombre;
    public String raza;
    public int edad;

    //constructor

    public Clase1(String nombre) {
        this.nombre = nombre;
    }

    //metodo getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo entrada de datos
    public void entradaDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la raza: ");
        setRaza(entrada.nextLine());

        System.out.println("Ingrese el edad: ");
        setEdad(entrada.nextLine());

    }

    public void salidaDatos(){
        System.out.println("raza: " + getRaza());
        System.out.println("edad: " + getEdad());
    }
}
