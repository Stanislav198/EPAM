package MainThirdTask;

class Cake extends Present {

    Cake() {
        super(1, (int)(20 + (Math.random() * 150)), 210);
    }

    @Override
    public String toString(){
        return "Cake date: " + getDate()  + "; sugar: " + getSugar() + "; weight: " + getWeight() + "\n";
    }

}
