//package Practicas.JFlex.CalSec;

import java.io.FileReader;

public class CalcSec {
    public static void main(String[] args) {
        if (args.length > 0) { // .txt tiene valor
            // Declaro objeto
            Yylex lex = null;

            try {
                lex = new Yylex(new FileReader(args[0]));
                lex.yylex();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
