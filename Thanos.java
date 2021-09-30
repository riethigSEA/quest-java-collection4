
import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");
        Map<Hero, Flower> party = new TreeMap<>(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        party.put(hulk,rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        // Vision has a Tulip
        party.put(vision,tulip);
        // Captain America has a Lily
        party.put(captainAmerica, lily);
        // Doctor Strange and Black Widow have a Violet
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);
        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(party.containsValue(begonia));
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Flower flower : party.values()) {
            System.out.println(flower.getName());
        }
    }
}
