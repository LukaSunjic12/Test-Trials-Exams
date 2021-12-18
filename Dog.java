import com.sun.tools.javac.Main;

public class Dog {
    private String name;
    private double weight;

    public Dog(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {return name;}
    public double getWeight(){return  weight;}


    public void setName(String newName){
        name = newName;}

    public void setWeight(double newWeight){
       weight = newWeight; }

    public void Bark(){
        System.out.println("Wouff");
    }

    public String toString(){
        return "name:" + " " + getName() + " " + "weight" + " " + getWeight();
    }


}


