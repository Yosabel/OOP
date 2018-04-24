public class Unicorn extends Animal {

    public Unicorn(String name){
        super(name, "marshmallows" );
    }
    public void sleep() {
        System.out.println(name + " sleeps in a cloud");

    }
    public void eat(String food) {
        System.out.println(name + " eats "+ food);
        if(favoriteFood.equals (food)){
            System.out.println("YUM!!!" + name + " wants more " + food);
        }else{
            System.out.println(name + " sleeps in a cloud");
        }


    }
}
