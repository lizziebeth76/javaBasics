package com.tts;

//A CLASS IS A GROUPING OF DATA
//A CLASS IS OFTEN REFERED TO AS A "BLUEPRINT," BUT IT'S REALLY MORE LIKE A BLANK CANVAS FOR YOUR OBJECTS
public class Main {

    //BELOW (LINE 14-XX) IS THE *MAIN METHOD,* WHICH IS ALSO CALLED OUR "ENTRY POINT"
    //FOR CONSISTENCY, ALWAYS HAVE MAIN METHOD AT THE VERY END OF THE CLASS
    //"PUBLIC" IS AN *ACCESS MODIFIER* - DELINEATES ACCESS TO ANY PIECE OF INFO
    //"STATIC" DESCRIBES THE FACT THAT THE MM'S ASSOCIATED DATA BELONGS TO THE CLASS IN THIS CASE, CLASS "MAIN"
    //"VOID" IS THE *RETURN *TYPE** OF THE METHOD,
    //SIMILAR TO "NULL," VOID DESIGNATES STHG THAT REPRESENTS NOTHING

    public static void main(String[] args) {
        String myString = "Hello";
        //"myString" is the variable name (dev-named,) and "String" is its data *type*
        //"Hello" is the value of myString, captured in dbl-quotes, because strings require that
        //All declarations must end with a semicolon!!!
        int x = 4;
        //Declares a variable of type integer, names it x, and assigns it a value of 4
        System.out.println("This goes first " + myString);
        //"System.out.println" prints output to the screen, and adds a carriage return
        //("System.out.print" prints to screen, without adding a carriage return)
        //Line 21 code will print the words "This goes first " concatenated ( using the + symbol) the value of myString
        //Note: there is a space before the close-quote. Otherwise, concat would print: ...firstmyString,
        //                                                                  instead of: ...first myString
        System.out.println("Hello World!");
        //Will print Hello World! to the screen
        //Note: with the above two system outs, This goes first Hello
        // and                                  Hello World!
        //will be our total output

        //WHEN THIS CODE IS COMPILED LATER ON, JAVA WILL GIVE YOU A WARNING,
        //BECAUSE YOU DECLARED A VARIABLE, BUT DID NOT USE IT (int x = 4)
        //IT WILL STILL LET YOU RUN THE CODE, BUT OFFERS YOU THIS FFEDBACK
        //THAT YOU MAY EITHER USE THE VARIABLE, OR DELETE IT TO CLEAN UP YOUR CODE

        //CREATING OBJECTS:
        //BELOW IS A VARIABLE OF TYPE "Chapstick," called "newChapstick"
        // we give it the value of "new Chapstick()" which creates a new
        //instance of myChapstick
        //IN A SIBLING FILE, WE WILL CREATE THE CLASS "Chapstick," AND
        //USE IT HERE IN OUR MAIN METHOD
        Chapstick myChapstick = new Chapstick("cherry");

        // Q:
        // now i want to access the flavor property (declared in the "Chapstick" class)
        // of myChapstick and print it to the terminal
        //WE DO THIS USING A "GETTER":

        System.out.println(myChapstick.getFlavor());


        myChapstick.soothe();













    }
}
