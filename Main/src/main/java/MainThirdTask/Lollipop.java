package MainThirdTask;

class Lollipop extends Present {

    Lollipop(int date, int sugar, int weight) {
        super(date, sugar, weight);
    }

    Lollipop() {
        super(4,(int)(20 + (Math.random() * 150)), 200);
    }

    @Override
    public String toString(){
        return "Lollipop date: " + getDate()  + "; sugar: " + getSugar() + "; weight: " + getWeight() + "\n";
    }
}
