package github;

public class Cat{
    private String name;
    private int appetite;

    public boolean FullTank;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.FullTank = false;
    }

    public void eat(Plate p) {
      FullTank = p.decreaseFood(appetite);
    }
}
