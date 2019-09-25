package MainThirdTask;

class Marshmallow extends Present {

    Marshmallow() {
        super(7, (int)(20 + (Math.random() * 150)), 30);
    }

    @Override
    public String toString(){
        return "Marshmallow date: " + getDate() + "; sugar: " + getSugar() + "; weight: " + getWeight() + "\n";
    }
}
