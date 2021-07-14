package github;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Barsikobras", 55),
                     new Cat("MissKisa", 5),
                     new Cat("KisaBaby", 10),
                     new Cat("BigBed", 155)
        };
        Plate plate = new Plate(350);

        for (int i = 0; i < 4; i++) {
            plate.info(cat[i].FullTank);
            cat[i].eat(plate);
            plate.info(cat[i].FullTank);

            System.out.println();
        }

        plate.reFuel(100);
    }
}
