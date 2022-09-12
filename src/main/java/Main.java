public class Main {


    public static void main(String[] args){
        Person p1 = new Person(14, 1.74);
       // Person p2 = new Person(1.70);
        System.out.println(p1.getHøjde());


        p1.setHøjde(1.90);
        System.out.println("Ny højde " + p1.getHøjde());
        p1.harFødselsdag();
        System.out.println(p1.getAlder());
    }

}
