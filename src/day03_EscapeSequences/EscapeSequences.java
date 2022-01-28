package day03_EscapeSequences;
/*
\n: starts a new line
\t: paragraph space(tab)
\\: single backward slash
\": double quote(in order to write quotes)
 */

import org.w3c.dom.ls.LSOutput;
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nc#");//\n makes new line.

        System.out.println("Hello Cydeo, \nHow are you all today? \nIt is nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------------------");

        System.out.println("\tJawa is a cool programming language");
        /*
        \\t you sghould use it whenyou start a new paragraph.
        it gives space for paragraph.
         */
        System.out.println("-------------------------------------------");

        System.out.println("\\");// when you type two back slash it prints one.

        System.out.println("-------------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\" ");//in order too put double quote


    }






}
