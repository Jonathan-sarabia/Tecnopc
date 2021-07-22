package Tecnopc.almacenamiento;

import Tecnopc.producto.celular;
import Tecnopc.producto.componente;
import Tecnopc.producto.computador;
import Tecnopc.producto.lapto;

public class Datos {

    private componente[] componest;

    public Datos (){
        componest = new componente[3];
        componente celular=new celular("Sansung");
        componente lapto = new lapto("acer");
        componente computador =new computador("hp");

        componest[0]=celular;
        componest[1]=lapto;
        componest[2]=computador;
    }

    public  componente getindice(int i){
        if (i < 0 || i > 2) {
            System.out.println("indice no valido");
            return null;
        }
        return componest[i];
    }

    public componente[]  todocompo() {

        return componest;
    }
}
