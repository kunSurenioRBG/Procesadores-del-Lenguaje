import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.io.FileReader;

class Parser {

    public final static int EOF = Yylex.EOF;
    public final static int NUMERO = Yylex.NUMERO;
    public final static int COMA = Yylex.COMA;
    public final static int AC = Yylex.AC; // Abre corchete
    public final static int CC = Yylex.CC; // Cierra corchete
    public final static int AP = Yylex.AP; // Abre parentesis
    public final static int CP = Yylex.CP; // Cierra parentesis
    public final static int NELEM = Yylex.NELEM;
    public final static int MAXDEPTH = Yylex.MAXDEPTH;
    public final static int MAXLENGTH = Yylex.MAXLENGTH;

    private static int token;
    private static Yylex lex;
    private static int n = 0;

    private static int yylex() {
        int token = 0;
        try {
            token = lex.yylex();
        } catch (IOException e) {
            System.out.println("ERROR");
            System.exit(0);
        }
        return token;
    }

    public static void main(String[] arg) throws ParseException {
        if (arg.length > 0) {
            try {
                lex = new Yylex(new FileReader(arg[0]));
                token = yylex();
                if (token == NELEM) {
                    avanzaNELEM(token);
                }

                if (token == AP) {
                    avanzaNELEM(token);
                }
                S();

            } catch (IOException e) {
            }
        }
    }

    private static void checkActual() throws ParseException {
        if (token == 0) {
            System.out.println("ERROR");
        }

    }

    private static void avanza(int tokenEsperado) {
        if (token == tokenEsperado) {
            token = yylex();
        }
    }

    private static void avanzaNELEM(int tokenEsperado) {
        if (token == tokenEsperado) {
            token = yylex();
        }
    }

    private static void S() throws ParseException {
        checkActual();

        switch (token) {
            case AC:
                A();
                avanza(EOF);
                System.out.println("CORRECTO");
                System.out.println("NELEM=" + n);

                break;

            default:
                System.out.println("ERROR");
                break;
        }
    }

    private static void A() throws ParseException {
        checkActual();

        switch (token) {
            case AC:
                avanza(AC);
                B();
                avanza(CC);
                break;

            default:
                System.out.println("ERROR");
                break;
        }

    }

    private static void B() throws ParseException {
        checkActual();

        switch (token) {
            case AC:
                A();
                C();
                break;

            case CC:
                break;

            case NUMERO:
                avanza(NUMERO);
                C();
                break;

            default:
                System.out.println("ERROR");
                break;
        }

    }

    private static void C() throws ParseException {
        checkActual();

        switch (token) {
            case CC:
                n++;
                break;

            case COMA:
                n++;
                avanza(COMA);
                D();
                break;

            default:
                System.out.println("ERROR");
                break;
        }

    }

    private static void D() throws ParseException {
        checkActual();

        switch (token) {
            case AC:
                A();
                C();
                break;

            case NUMERO:
                n++;
                avanza(NUMERO);
                C();
                break;

            default:
                System.out.println("ERROR");
                break;
        }

    }

}
