package MainThirdTask;

class Jelly extends Present {

    Jelly(int date, int sugar, int weight) {
        super(date, sugar, weight);
    }

    Jelly() {
        super(3, (int) (20 + (Math.random() * 150)), 70);
    }

    @Override
    public String toString() {
        return "Jelly date: " + getDate() + "; sugar: " + getSugar() + "; weight: " + getWeight() + "\n";
    }
}
