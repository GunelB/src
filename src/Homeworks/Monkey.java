package Homeworks;

class MonkeyClass {
    boolean IsSmiling ;
    String name1;
    String name2;
    public MonkeyClass (){
    }
    public boolean monkeyTrouble(boolean p_Monkey1,boolean p_Monkey2) {

        if (p_Monkey1 == p_Monkey2) {
            return IsSmiling= true;

        } else {
              return IsSmiling=false;
        }

    }

    }

//    Please create a method that takes 2 booleans. Returns a boolean.
//  Name your method as monkeyTrouble.



//   Your will pass MonkeyA.IsSmiling and MonkeyB.IsSmiling to your method and you should get below results based on if they are smiling or not.

//           monkeyTrouble(true,   true)   →   true
//    monkeyTrouble(false,   false)   →   true
//  monkeyTrouble(true,   false)   →   false
//  monkeyTrouble(false,   true)   →   false
