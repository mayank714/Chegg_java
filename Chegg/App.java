package Chegg;

public class App {
    public static void main(String[] args) {
        BikeStore obje = new BikeStore();
        obje.setBike("Honda Showroom",256);
        String name =obje.getName();
        int BikeNum=obje.getNumbers();
        //Address of the Showroom
        obje.main();
        //BikeStore Deatils
        System.out.println("The showrooms details are\nThe name of the showrrom: "+name+
        "\nNumber of bikes"+BikeNum);

    }
    
}
