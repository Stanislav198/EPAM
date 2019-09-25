package MainThirdTask;

import java.util.*;

class Presents {

    private ArrayList<Present> presents = new ArrayList<>();
    Presents(int lollipops, int jellies, int donuts, int marshmallows, int puddings, int cakes) {
        for(int i = 0; i < lollipops; i++)
            presents.add(new Lollipop());
            for(int i = 0; i < jellies; i++)
                presents.add(new Jelly());
                for(int i = 0; i < donuts; i++)
                    presents.add(new Donut());
                    for(int i = 0; i < marshmallows; i++)
                        presents.add(new Marshmallow());
                        for(int i = 0; i < puddings; i++)
                            presents.add(new Pudding());
                            for(int i = 0; i < cakes; i++)
                                presents.add(new Cake());

    }

    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i < presents.size(); i++)
            out +=presents.get(i);
        return out;
    }

    public int getWeight(){
        int sum = 0;
        for(int i = 0; i < presents.size(); i++){
            sum += presents.get(i).getWeight();
        }
        return sum;
    }

    public ArrayList sortPresents() {
        for(int j = presents.size() - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(presents.get(i).getDate() > presents.get(i + 1).getDate()){
                    Present count = presents.get(i);
                    presents.set(i, presents.get(i + 1));
                    presents.set(i + 1, count);
                }
            }
        }
        return presents;
    }


    public String findSugarInPresent(int from, int to){
        String result = "";
        for(int i = 0; i < presents.size(); i++){
            if(presents.get(i).getSugar() >= from && presents.get(i).getSugar() <= to){
                result += presents.get(i);
            }
        }
        return result;
    }


}
