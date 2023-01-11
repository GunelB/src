package Day8_ForLoop;

public class Topic8_GB_Break {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            System.out.println("i="+i);
            if(i==5){
            break;
        }
            for (int j = 0; j <5 ; j++) {
                if(i==1){
                    break;
                }
                System.out.println("i="+i);

            }

            }
    }
}
