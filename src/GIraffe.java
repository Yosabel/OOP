public class GIraffe extends Animal {
    public GIraffe(String name){
        super(name, "leaves");

    }
    public void eat(String food) {
        System.out.println(name + " eats "+ food);
        if(favoriteFood.equals (food)){
            System.out.println("YUM!!!" + name + " wants more " + food);
        }else{
            System.out.println(name + " sleeps for 8 hours");
            System.out.println("YUCK!!!" + name + " will not eat " + food);
        }



    }
}
