import java.util.ArrayList;
public class Zookeeper {
    String name;

    public Zookeeper(String name) {
        this.name=name;
    }

    public void feedAnimals(ArrayList<Animal> animal,String food){
        System.out.println(name + " is feedeing " + food + " to " + animal.size() +  " animals out of a total of " + Animal.population);
        for(int i=0;i<animal.size(); i++){

            animal.get(i).eat(food);
        }


    }

}



