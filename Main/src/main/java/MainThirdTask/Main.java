package MainThirdTask;

public class Main {

    public static void main(String[] args){

        System.out.println("***********************");
        Jelly jelly = new Jelly(1, 15, 70);
        System.out.print(jelly);

        Lollipop lollipop = new Lollipop(2,3,200);
        System.out.print(lollipop);
        System.out.println("***********************");

        Presents myPresent = new Presents(3, 1, 2, 1, 1, 1);

        System.out.println("Sorted by date :");
        myPresent.sortPresents();
        System.out.println(myPresent);
        System.out.println("Weight of the present: " + myPresent.getWeight() + "\n");

        System.out.println("Founded presents by sugar from 1 to 100:");
        System.out.println(myPresent.findSugarInPresent(1, 100));


    }
}
