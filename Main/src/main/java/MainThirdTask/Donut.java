package MainThirdTask;

class Donut extends Present {

    Donut() {
        super(1, (int)(20 + (Math.random() * 150)), 100);
    }

    @Override
    public String toString(){
        return "Donut date: " + getDate()  + "; sugar: " + getSugar() + "; weight: " + getWeight() + "\n";
    }

}
