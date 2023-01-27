package Homeworks;

public class Formula {
    public static void main(String[] args) {

    }
}
  /*  Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
                int Agee = scan.nextInt();
                scan.nextLine(); /* it is band-aid. by putting this here we are jumping to other user input. otherwise
        java system will pass the "String FavoriteTeam = scan.nextLine();" and directly go to
        System.out.println("Your team is " + FavoriteTeam + " your age is "+ Age); and it will NOT open user input for
        favorite team. !!!!if u didnt understand delete line 11 and run the code and enter the user input see
        what will happen.*/
      /*          System.out.println("Please enter your favourite team");
                String FavoriteTeam = scan.nextLine();
                System.out.println("Your team is " + FavoriteTeam + " your age is " + Agee);

                // IF FORMULA
                int Age = 3;
                if (Age >= 18) {
                System.out.println("Yes you can vote");
                } else {
                System.out.println("No you can NOT vote");
                }

                // FINDING ODD & EVEN IN IF
                int Number = 100;
                int Remainder = Number % 2;
                System.out.println("Remainder = " + Remainder);
                if (Remainder == 1) { //this condition can be written "Remainder != 0" as well
                System.out.println(Number + " is an odd number!");
                } else {
                System.out.println(Number + " is an even number!");
                }

                //ELSE IF FORMULA
                int x = 10;
                if (x == 10) {
                System.out.println(" x is equal to 10");
                } else if (x == 15) {
                System.out.println("x is equal to 15");

                } else if (x == 20) {
                System.out.println("x is equal to 20");

                } else {
                System.out.println(" x is something else");
                }

                //SWITCH FORMULA
                switch (Number) { //the variable we gonna check goes in brackets
                case 10:                                     //after case "iki nokta(colon)" comes
                System.out.println("print number is 10");
                break;                                     //after every case write"break" otherwise java will print all
                case 20:
                System.out.println("print number is 20");
                break;
                case 30:
                System.out.println("print number is 30");
                break;
default:
        System.out.println("the number is not 10,20 or 30");
        }
        //TERNARY IF FORMULA
        int Number12 = 44;
        int Number22 = 55;
        String Max = (Number12 > Number22) ? " sayi 1 " + Number12 : " sayi 2 " + Number22;
        //We need to create new string for output. new variable has created named "Max"
        System.out.println(Max);

        //NESTED IF FORMULA
        int Number15 = scan.nextInt();
        if (Number15 == 0) {
        System.out.println("Number = " + Number15);
        } else if (Number15 % 2 == 0) {
        if (Number15 <= 50) {  //
        Number15 = Number15 * 2;
        System.out.println("Number = " + Number15);
        } else {
        Number15 = Number15 * 3;
        System.out.println("Number = " + Number15);
        }
        } else {
        Number = (Number15 < 70) ? Number * 3 : Number15 / 2;
        System.out.println("Number = " + Number15);
        }

        //NESTED TERNARY IF FORMULA
        // ()?:    ()?:   ()?:  ()?:    at teh and we have add an else condition after last iki nokta :
        int a = 300;
        String ab = (a > 0) ? "0 dan buyuk" : (a < 0) ? "0 dan kucuk" : "sayi 0";
        //       1. kosul+ ? + string  + : 2.kosul + ? + String+ : + else kosulu

        // FOR LOOP FORMULA
        //  for (){}  for loop creating formula
        // starting point, ending point, increase value in to bracket of for loop
        for (int P = 0; P < 100; P++) {  // "int i" is iterator
        // it will count from 0 to 99 (int total 100 times) for dismissing this
        // we should make it i<=100 like that it will count until 100(it will print 101 time "hello")in total
        System.out.println("hello"); //it will print hello (100 times)
        }

        //FACTORIAL FORMULA IN FOR LOOP
        int Tata = 8;
        for (int i = 7; i >= 1; i--) { // Calculating 20! (factorial) until 5
        Tata = Tata * i;
        }
        System.out.println("Tata = " + Tata);//prints 40320
        // sout is out of curly brackets because we want to see just result's itself
        // not whole calculation

        // PRIME NUMBER FORMULA IN FOR LOOP
        int Numero = scan.nextInt();
        boolean It_Is_Asal = true;
        for (int i = 2; i <=Numero-1 ; i++) {
        int   Remaining = Numero % i;
        if (Remaining==0){
        It_Is_Asal = false;
        break;
        }
        }if (It_Is_Asal==true){
        System.out.println("prime");
        }else {
        System.out.println("NOTTTTTT prime");
        }
        //WHILE LOOP FORMULA
        int Kount =1;
        while (Kount <=5){
        System.out.println("Kount = " + Kount);
        Kount++;

        }

 /*       //WHILE LOOP FORMULA WITH IF
        System.out.println("enter a number");
        int Number99 = scan.nextInt();

        int i = 0;   // iterator
        int Count = 0;
        while ( i <= Number99 ) {  // i<=Number starting point
        if (i % 2 == 1) {           // i%2==1 and i%2 != 0 same thing
        Count ++;
        }
        i++;// ending point  Watch out! it have to be in while {} curly brackets not in if
        }
        System.out.println("Count = " + Count);

        //REVERSE STRING
        String Word = "Ali";
        String Reverse = ""; //Create a variable and leave it empty
        for (int u = Word.length()-1; u >= 0 ; u--) { // it will count from last index to 0.th index.
        Reverse = Reverse + Word.charAt(u);   // reattend your empty variable here.
        System.out.println("Reserve of the word is = " + Reverse);
        // if you wanna see all the result give print command in for curly brackets. for "ali" result will be
            /*
            i
            il
            ila
             */
  /*      }
        System.out.println("Reserve of the word is = " + Reverse);
        // if you want to see just result("ila" for "ali"), print this out of "for{}" brackets

        //STRING REVERSE FORMULA WITH DELETING A INDEX

        String Sentence = "alisan";
        String Revese = "";
        for (int L = Sentence.length()-1; L >=0; i--) {
        if (Sentence.charAt(L) == 'l' || Sentence.charAt(L)=='L'){
        continue; //continue napiyodu; girilen kosula esitlendiginnde onu atliyodu. eger burada continue koymaz isek
        // "l" harfini atlamayacak ve ismi tam yazdiracak.
        }
        Revese = Revese + Sentence.charAt(L);

        }
        System.out.println(Revese);

/*
        // CONTINUE how it works

        for (int r = 1; r <5 ; r++) {
        // System.out.println("this is before continue = " + i); //this will print all until 5
        if (i == 3) {
        continue; // it will not print 3 when the if  condition happens if(i==3), it will pass to 4 from 2.
        }
        System.out.println("this AFTER continue = " + r);
        }

        System.out.println("Please enetr a number");

        //HOW TO COUNT INT DIGITS FORMULA
        int Numbere = scan.nextInt();

        int Counte = 1;//if I enter here 0 result will be false
        while (Numbere / 10 > 0){
        Counte++; // or Count = Count + 1;
        Numbere = Numbere / 10;
        }
        System.out.println("Count = " + Counte);


        //FINDING SUMMARY OF DIGITS FORMULA

        System.out.println("Please enter a number ");
        int Numberoo = scan.nextInt();
        int Totalee = 0;

        while (Numberoo > 0){
        int Remainderr = Numberoo % 10;
        Totalee = Totalee + Remainderr;
        Numberoo = Numberoo/10;
        }

        System.out.println("Total = " + Totalee);

        //INTEGER REVERSE FORMULA
        int Input = scan.nextInt();
        int reverse= 0;
        int remainder=0;

        while(Input!=0){
        remainder = Input%10;
        reverse = reverse*10+remainder;
        System.out.print( remainder);// this sout command with print not println will print what exactly we want.
        Input = Input/10;
        }
        System.out.println("reverse = " + reverse);// if a number includes 0 at last index or indexes(like 100 or 150)
        // this sout command won't give 001 or 051. it will give 1 or 51.
        // but it will work for the numbers like 105,855,255


        // STRING REVERSE  WITH WHILE

        String url =  "www.google.com";
        int iStrLength=url.length();
        while(iStrLength >0)
        {
        System.out.print(url.charAt(iStrLength -1));
        iStrLength--;

        }

        //TO.STRING METHOD
        int [] Numbers = {1,7,99,66};         //for int
        System.out.println(Arrays.toString(Numbers));

        String [] Cities = {"London", "Toronto"}; // for string
        System.out.println(Arrays.toString(Cities));



        // SORTING INT ARRAY AND PRINT IT
        int [] MyNumbers = {78,34,5,-230,67};
        Arrays.sort(MyNumbers);
        System.out.println("after sorting : "+ Arrays.toString(MyNumbers));


        //ANAGRAM FORMULA
        String mm = "kalem";
        String nn ="kemal";
        char [] mmm =mm.toCharArray();
        char [] nnn =nn.toCharArray();
        Arrays.sort(mmm);
        Arrays.sort(nnn);
        String w = "";
        String q = "";
        for (int U = 0; U < mmm.length ; U++) {
        w +=mmm[U];
        }
        for (int U = 0; U < nnn.length ; U++) {
        q +=nnn[U];
        }
        if (w.equals(q)){
        System.out.println("ayni harflere sahiptir" );
        }else if (!mmm.equals(nnn)){
        System.out.println(" ayni harflere sahip DEGILDIR" );
        }

/// FINDING DUPLICATE CHARACTER FORMULA

        System.out.println("please enter your word or sentence");
        String UserIn = scan.nextLine();
        String What_We_Want = "";
        for (int Z = 0; Z <UserIn.length() ; Z++) {
        String DontNeed = "";
        DontNeed = DontNeed + UserIn.charAt(Z);
        if (!What_We_Want.contains(DontNeed)){
        What_We_Want = What_We_Want + UserIn.charAt(Z);
        }
        }
        System.out.println("Duplicating characters of your sentence/s are/is \""+What_We_Want+"\"");


        // INT ARRAY REVERSE FORMULA
        int [] Array1 = {1,2,3};
        int [] Array2 = new int[Array1.length];

  /*      for (int B = Array1.length-1; B >=0 ; B--) {
        Array2[Array1.length-1-B] = Array1[B];
        }

        System.out.println("Array2 = " +Arrays.toString( Array2));

        // MATH POW USAGE
        double MyDouble =  Math.pow(4,2);  // 4 number and 2 is power. result comes as double
        System.out.println("MyDouble = " + MyDouble);

        // GETTING DECIMALS AFTER COMMA
        double pi =   3.1408902300206643;
        System.out.println(Math.round(pi*100.0)/100.0); // it gets 3.14 -- 2 decimals after comma
        System.out.println(Math.round(pi*1000.0)/1000.0);// it gets 3.140 -- 3 decimals after comma and we can make it longer bye adding one more zero    */