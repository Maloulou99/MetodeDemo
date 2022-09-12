public class Person {


    private double højde;
    private int alder;


    public Person (int alder, double højde){
        this.alder = alder;
        this.højde = højde;
    }

    public Person(){

    }
    public double getHøjde(){
        return højde;
    }
    public void setHøjde(double højde){
        this.højde = højde;
    }
    public void harFødselsdag(){
        alder++;
    }

    public int getAlder() {
        return alder;
    }
}

