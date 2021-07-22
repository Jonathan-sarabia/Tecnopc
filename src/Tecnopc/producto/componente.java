package Tecnopc.producto;

public abstract class componente {
    private  String name;
    private  int amont;
    private  Double price;

    public componente (){}
    public componente (String n){
        this.name=n;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrince() {
        return price;
    }

    public void setPrince(Double price) {

        if(price<0){
            System.out.println("No puede asignar una cantidad negativa");
            return;
        }
        this.price = price;
    }

    public int getAmont() {
        return amont;
    }

    public void setAmont(int amont) {

        if(amont<0){
            System.out.println("No puede asignar una cantidad negativa");
            return;
        }
        this.amont = amont;
    }
    @Override
    public String toString(){
        return this.name+" - "+this.amont+" - "+this.price;
    }
}
