import java.io.FileReader;
import java.io.IOException;

public class Prep {
    static String caracteres;

    public static void main(String[] args) {
        if (args.length > 0) {
        
            try {
                Yylex lex = new Yylex(new FileReader(args[0]));

                while (lex.yylex() != -1) {
                    System.out.println(caracteres + " ");
                }

            } catch (IOException e) {
                System.err.println("Error: '" + e.getMessage() + "'.");
            }
        }
    }
}
