package MainThirdTask;

abstract class Present {

   private int date;
   private int sugar;
   private int weight;

    Present(int date, int sugar, int weight) {
        this.date = date;
        this.sugar = sugar;
        this.weight = weight;
    }

    int getDate(){
        return date;
    }

    int getSugar() {
        return sugar;
    }

    public int getWeight() {
        return weight;
    }
}
