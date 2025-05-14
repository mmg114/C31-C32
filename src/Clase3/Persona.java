package Clase3;

public class Persona {



    public Persona(String cc, int altura, String nombre, int edad, char genero, float peso, String apellido, String estadoCivil) {
        this.cc = cc;
        this.altura = altura;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
    }

    private String cc;
    private int altura;
    private String nombre;
    private int edad;
    private char genero;
    private float peso;
    private String apellido;
    private String estadoCivil;

    public void caminar(){
        System.out.println(nombre + ": Caminando");
    }
    public void hablar(){
        System.out.println("Hablando");
    }
    public void comer(){
        System.out.println("Comiendo");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cc='" + cc + '\'' +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", peso=" + peso +
                ", apellido='" + apellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
