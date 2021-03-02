package OOPConceptPart2.Inheritance;

public class StaticChildOverriding extends StaticMethodOverriding { // the child class



    //@Override : i commented down this @override annotation because i made the superclass method static , which caused an error in subclass method . i had to make this subclass method static as well just to remove the error , but the method is no longer overridden , because we can override a static method
    public static void carNavigation(){ // this supposed to be the overridden method , but its no longer an overridden method because we made it static, static method can not be overrode
        System.out.println("the car had a brand new and sophisticated navigation system ");
    }

    public void backUpCamera(){
        System.out.println("the car has been featured with a back up camera");
    }
}
