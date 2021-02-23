public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int morefood) {
        food += morefood;
        System.out.println("We added " + morefood + " units of food");
    }

    public boolean isEnoughFood(int food, int appetite) {
        return food >= appetite;
    }


    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void infoFood() {
        System.out.println("plate contains " + food + " units of food");
        System.out.println("");
    }

    public int getFood() {
        return food;
    }

}
