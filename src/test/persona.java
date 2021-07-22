package test;

public class persona implements Cloneable{
    public String nombre;
    public int edad;

    public static persona clone() throws CloneNotSupportedException{
        return (persona) super.clone();
    }
}
