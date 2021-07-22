package test;

import Tecnopc.almacenamiento.Datos;
import Tecnopc.producto.componente;

public class Main {
        public static void main(String[] args){
            Datos datos=new Datos();
            componente Componente = datos.getindice(0);
            System.out.println(Componente);

        }
}
