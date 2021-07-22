package test;

public class referencias {
    public static void main(String[] args) {
        persona Persona = new persona();
        Persona.nombre = "jose";
        Persona.edad = 29;
        persona segundapersona = new persona();
        try {
            segundapersona = persona.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
