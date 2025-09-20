package Abstraction;

public class WhyWeNeedAbstraction  {

    abstract class WayOFEating{
        abstract void eat();
    }

    class IndianWayOfEating extends WayOFEating{

        @Override
        void eat(){
            System.out.println("Indian Pepoles use their Hand to eat");

        }

    }

    class WesternWayOfEating extends WayOFEating{

        @Override
        void eat(){
            System.out.println("Western Pepoles use Forks to eat");
        }

    }
}
