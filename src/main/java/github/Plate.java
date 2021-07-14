package github;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food - n >= 0){
            food -= n;
            return true;
        }
        return false;
    }
    public void info(Boolean full) {
        if(full) System.out.println("plate: " + food + " кот сыт");
        else  System.out.println("plate: " + food + " кот голодный");
    }
    public void reFuel(int fuel){
        food += fuel;
    }
}
