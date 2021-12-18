public class DogHotel {
   private Dog[] dogs = new Dog[4];
   public void addDog(int integer, Dog dog){
       dogs[integer] = dog;
   }
   Dog[] getDogs(){return this.dogs;}

    public Dog lowestWeight(){
       Dog lowest = dogs[0];

       for (int i = 0; i < dogs.length; ++i){
           if (dogs[i].getWeight() < lowest.getWeight()){
               lowest = dogs[i];

           }
       }
       return lowest;
   }







}
