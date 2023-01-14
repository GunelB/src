package Day10_NestedLoops;

public class Topic4_HA_NestedLoops {
    public static void main(String[] args) {
        /*
        imagine we have 4 fruit types (Apple, orange, strawberry and blueberry
        and we have 3 kids
        each kid will get all fruits

        Kid1 this is your fruit1
        kid1 this is your fruit2
        kid1 this is your fruit3
        kid1 this is your fruit4

        Kid2 this is your fruit1
        kid2 this is your fruit2
        kid2 this is your fruit3
        kid2 this is your fruit4

        Kid3 this is your fruit1
        kid3 this is your fruit2
        kid3 this is your fruit3
        kid3 this is your fruit4
        --------------------
        Kid1 this is your fruit1
        Kid2 this is your fruit1
        Kid3 this is your fruit1

         */

        for (int i = 1; i <= 3 ; i++) { // Kids   <- outer loop
            //System.out.println("Kid" + i);
            for (int j = 1; j <=4 ; j++) { // fruits  <- inner loop
                //System.out.println("Fruit"+j);
                System.out.println("Kid"+i+" this is your fruit"+j);
            }
        }
    }
}
