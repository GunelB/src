package Homeworks;

class MonkeyClass {
    boolean IsSmiling =false;
    String name1;
    String name2;
    public MonkeyClass (String MonkeyA,String MonkeyB){
      name1= MonkeyA;
      name2 =MonkeyB;
    }

    //  Please create a Class named MonkeyClass. It will have a boolean Field called IsSmiling.
// Please create 2 instance of MonkeyClass and name them MonkeyA and MonkeyB.

    public boolean monkeyTrouble(boolean Monkey1,boolean Monkey2) {

        if ((Monkey1 == Monkey2 || !Monkey2) == Monkey1) {
            boolean IsSmiling = false;
            return false;
        } else if ((Monkey2 == Monkey1 && Monkey1) ==Monkey2) {

        }
        return IsSmiling;
    }

    }

//    Please create a method that takes 2 booleans. Returns a boolean.
//  Name your method as monkeyTrouble.



//   Your will pass MonkeyA.IsSmiling and MonkeyB.IsSmiling to your method and you should get below results based on if they are smiling or not.

//           monkeyTrouble(true,   true)   →   true
//    monkeyTrouble(false,   false)   →   true
//  monkeyTrouble(true,   false)   →   false
//  monkeyTrouble(false,   true)   →   false
