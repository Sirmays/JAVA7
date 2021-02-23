public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 10, false),
                new Cat("Zayats", 15, false),
                new Cat("Begemot", 12, false)};

        Plate plate = new Plate(100);

        plate.infoFood();

        feedCats(cats, plate);

        plate.infoFood();

        feedCats(cats, plate);

        plate.infoFood();


        int morefood = 20;          //указываем, сколько добавить еды
        plate.addFood(morefood);

        plate.infoFood();
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            if (plate.isEnoughFood(plate.getFood(), cats[i].getAppetite())) {
                cats[i].eatFood(plate);
            } else {
                System.out.println("Not enough food");
            }
            System.out.println("Is it true, that " + cats[i].getName() + " is well-fed now? " + cats[i].isWellfed());
        }
        System.out.println(" ");
    }
}
