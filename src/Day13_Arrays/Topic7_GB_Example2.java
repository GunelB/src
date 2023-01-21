package Day13_Arrays;

public class Topic7_GB_Example2 {
    public static void main(String[] args) {

      int [] MyInt = {5,99,123,-9,0,55};
      int MaxNumb=-9999999;
        for (int i = 0; i <MyInt.length ; i++) {
            if (MaxNumb< MyInt[i]){
                MaxNumb = MyInt[i];

            }


        }
    }
}
