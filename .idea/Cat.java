public class Cat {
    private final String name;
    private final int appetite;
    private boolean wellfed;

    public Cat(String name, int appetite, boolean wellfed) {
        this.name = name;
        this.appetite = appetite;
        this.wellfed = wellfed;
    }

    public void eatFood(Plate plate) {
            if (!wellfed) {
            plate.decreaseFood(appetite);
            wellfed = true;
            System.out.println("Cat " + name + " enjoyed " + appetite + " units of food!");
        } else {
                System.out.println("Cat " + name + " is not hungry yet!");
            }
    }

       public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isWellfed() {
        return wellfed;
    }
}
