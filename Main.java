public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Nero",23);
        Dog dog1 = new Dog("Ben",47);
        Dog dog2 = new Dog("Argo",25);
        Dog dog3 = new Dog("Snoopy",12);
        dog.Bark();

        DogHotel hotel = new DogHotel();
        hotel.addDog(0,dog);
        hotel.addDog(1,dog1);
        hotel.addDog(2,dog2);
        hotel.addDog(3,dog3);

        System.out.println(hotel.lowestWeight());

    }
}
