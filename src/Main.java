public class Main {
    public static void main(String[] args) {
        Vehicles car= Vehicles.CAR;
        System.out.println(car.getColor());
        System.out.println(
                car.toString()
        );

        Animals lion= Animals.LION;
        System.out.println(lion);

        Animals zebra= Animals.ZEBRA;
        System.out.println(zebra);
    }
}
