public class Main {
    public static void main(String[] args) {

        Rainbow a = new Rainbow();
        Rainbow b = new Rainbow();
        Rainbow c;

        a.insert("red");
        a.insert("Blue");
        a.insert("GreeN");
        a.insert("pink");

        System.out.print("Content of a:");
        a.print();

        System.out.println();

        b.insert("Red");
        b.insert("orange");

        System.out.print("Content of b:");
        b.print();

        System.out.println();

        c = a.addiction(b);
        System.out.print("Content of c (addiction):");
        c.print();

        System.out.println();

        c = a.intersection(b);
        System.out.print("Content of c (intersection):");
        c.print();

        
    }
}