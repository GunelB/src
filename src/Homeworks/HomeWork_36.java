package Homeworks;

public class HomeWork_36 {
    public static void main(String[] args) {
        MonkeyClass m = new MonkeyClass();
        System.out.println(m.monkeyTrouble(true,true));
        System.out.println(m.monkeyTrouble(false,false));
        System.out.println(m.monkeyTrouble(true,false));
        System.out.println(m.monkeyTrouble(false,true));

}
 //   We have two monkeys,   MonkeyA   and MonkeyB.
 //   We are in trouble if they are both smiling or if neither of them is smiling.
    //   Return true if we are in trouble.

 //   Please create a Class named MonkeyClass. It will have a boolean Field called IsSmiling.
   // Please create 2 instance of MonkeyClass and name them MonkeyA and MonkeyB.
//    Please create a method that takes 2 booleans. Returns a boolean.
  //  Name your method as monkeyTrouble.
 //   Your will pass MonkeyA.IsSmiling and MonkeyB.IsSmiling to your method and you should get below results based on if they are smiling or not.

 //           monkeyTrouble(true,   true)   →   true
//    monkeyTrouble(false,   false)   →   true
  //  monkeyTrouble(true,   false)   →   false
  //  monkeyTrouble(false,   true)   →   false
}
