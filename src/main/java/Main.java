public class Main {


    public static void main(String[] args){
        Person p1 = new Person(14, 1.74);
        Person p2 = new Person(45, 1.60);
        System.out.println(p1.getHøjde());
        System.out.println(p2.getHøjde());


        p1.setHøjde(1.90);
        p2.setHøjde(1.65);
        System.out.println("Person et har fået vokseværk og er nu " + p1.getHøjde());
        System.out.println("Person to har fået vokseværk og er nu " + p2.getHøjde());

        p1.harFødselsdag();
        p2.harFødselsdag();
        System.out.println("Person 1 har fødselsdag er er nu " + p1.getAlder());
        System.out.println("Person 2 har fødselsdag er er nu " + p2.getAlder());




    }

}
