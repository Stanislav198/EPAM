package MainThirdTask;

class Pudding extends Present {

    Pudding() {
        super(2, (int)(20 + (Math.random() * 150)), 150);
    }

    @Override
    public String toString(){
        return "Pudding date: " + getDate()  + "; sugar: " + getSugar() + "; weight: " + getWeight() + "\n";
    }
}
