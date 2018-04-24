
public class Animal {
    String name;
    String favoriteFood;
    static int population=0;

    public Animal(String name, String favoriteFood) {
        this.name=name;
        this.favoriteFood=favoriteFood;
        population ++;

    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");

    }

    public void eat(String food) {
        System.out.println(name + " eats "+ food);
        if(favoriteFood.equals (food)){
            System.out.println("YUM!!!" + name + " wants more " + food);
        }else{
            System.out.println(name + " never sleeps");
            System.out.println("YUCK!!!" + name + " will not eat " + food);
        }


    }
}