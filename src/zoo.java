import java.util.ArrayList;
public class zoo {
String favoriteFood="bacon";

    public static void main(String[] args) {
        zoo z = new zoo();
//        z.sleep("Tigger");
//        z.eat("Tigger", "bacon");
//        z.eat("Tigger", "meat");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");

        GIraffe gemma= new GIraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("meat");

        Bee stinger=new Bee("Stinger");
        stinger.eat("pollen");

        Bee buzzer=new Bee("buzzer");

        Zookeeper zoebot=new Zookeeper("Zoebot");
        ArrayList<Animal> animals= new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(gemma);
        animals.add(stinger);

        zoebot.feedAnimals(animals,"carrot");

    }
//
//    public void sleep(String name) {
//        System.out.println(name + " sleeps for 8 hours");
//    }
//    public void eat(String name, String food){
//        System.out.println(name + " eats "+ food);
//       if(favoriteFood.equals (food)){
//           System.out.println("YUM!!!" + name + " wants more " + food);
//       }else{
//           System.out.println(name + " sleeps for 8 hours");
//       }
//
//    }
}
