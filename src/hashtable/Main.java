package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();

        myHT.set("paint", 20);
        myHT.set("bolts", 40);
        myHT.set("nails", 100);
        myHT.set("tile", 50);
        myHT.set("lumber", 80);

//        myHT.set("bolts", 200);
//        myHT.set("screws", 140);

//        myHT.printTable();
//        System.out.println(myHT.get("lumber"));
//        System.out.println(myHT.get("bolts"));
        myHT.printTable();
        System.out.println(myHT.keys());
    }
}
