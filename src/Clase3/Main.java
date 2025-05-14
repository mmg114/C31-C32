package Clase3;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona(
                "31460999",
                190,
                "Mauricio",
                34,
                'M',
                90F,
                "patino",
                "Soltero");

        System.out.println(persona.toString());
        persona.setNombre("camilo");

        persona.setEdad(50);
        System.out.println(persona.toString());
    }
}
