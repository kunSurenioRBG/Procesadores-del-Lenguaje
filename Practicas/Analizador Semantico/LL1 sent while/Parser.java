import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.io.FileReader;

class Parser {

	// private static Yytoken actual; (en el caso de que usemos un objeto token para
	// contabilizar, como ej de clase de sumar valores)
	private static int token;
	private static Yylex lex;

	private static int yylex() {
		int token = 0;
		try {
			token = lex.yylex();
		} catch (IOException e) {
			System.out.println("IOException");
			System.exit(0);
		}
		return token;
	}

	public static void main(String[] arg) throws ParseException{
		if (arg.length > 0) {
			try {
				lex = new Yylex(new FileReader(arg[0]));
				token = yylex();
				S();
				// System.out.println("OK");
			} catch (IOException e) {
			}
		}
	}

	private static void checkActual() throws ParseException {
		if (token == 0) {
			Yytoken.error(token);
		}
		/*
		 * ------ Si fuera un objeto yytoken ------
		 * if (Object.isNull(actual)) {
		 * throw new ParseException("Fin de fichero inesperado");
		 * }
		 */
	}

	private static void avanza(int tokenEsperado, String mensaje) {
		if (token == tokenEsperado) {
			token = yylex();
		} else {
			Yytoken.error(token);
		}
	}

	private static void S() throws ParseException {
		checkActual();

		switch (token) {
			case Yytoken.EOF:
				Yytoken.regla(0);
				L();
				avanza(Yytoken.EOF, "ERROR EOF");
				break;

			case Yytoken.DO:
				Yytoken.regla(0);
				L();
				avanza(Yytoken.EOF, "ERROR DO");
				break;

			case Yytoken.IDENT:
				Yytoken.regla(0);
				L();
				avanza(Yytoken.EOF, "ERROR IDENT");
				break;

			case Yytoken.WHILE:
				Yytoken.regla(0);
				L();
				avanza(Yytoken.EOF, "ERROR WHILE");
				break;

			case Yytoken.ALL:
				Yytoken.regla(0);
				L();
				avanza(Yytoken.EOF, "ERROR ALL");
				break;

			default:
				Yytoken.error(token);
				break;
		}
	}

	private static void L() throws ParseException {
		checkActual();

		switch (token) {
			case Yytoken.EOF:
				Yytoken.regla(2);
				break;

			case Yytoken.DO:
				Yytoken.regla(1);
				E();
				L();
				break;

			case Yytoken.IDENT:
				Yytoken.regla(1);
				E();
				L();
				break;

			case Yytoken.WHILE:
				Yytoken.regla(1);
				E();
				L();
				break;

			case Yytoken.ALL:
				Yytoken.regla(1);
				E();
				L();
				break;

			case Yytoken.CLL:
				Yytoken.regla(2);
				break;

			default:
				Yytoken.error(token);
				break;
		}
	}

	private static void E() throws ParseException {
		checkActual();

		switch (token) {
			case Yytoken.DO:
				Yytoken.regla(4);
				avanza(Yytoken.DO, "ERROR DO");
				E();
				avanza(Yytoken.WHILE, "ERROR WHILE");
				avanza(Yytoken.AP, "ERROR AP");
				C();
				avanza(Yytoken.CP, "ERROR CP");
				avanza(Yytoken.PYC, "ERROR PYC");
				break;

			case Yytoken.IDENT:
				Yytoken.regla(5);
				avanza(Yytoken.IDENT, "ERROR IDENT");
				avanza(Yytoken.IGUAL, "ERROR IGUAL");
				V();
				avanza(Yytoken.PYC, "ERROR PYC");
				break;

			case Yytoken.WHILE:
				Yytoken.regla(3);
				avanza(Yytoken.WHILE, "ERROR WHILE");
				avanza(Yytoken.AP, "ERROR AP");
				C();
				avanza(Yytoken.CP, "ERROR CP");
				E();
				break;

			case Yytoken.ALL:
				Yytoken.regla(6);
				avanza(Yytoken.ALL, "ERROR ALL");
				L();
				avanza(Yytoken.CLL, "ERROR CPP");
				break;

			default:
				Yytoken.error(token);
				break;
		}
	}

	private static void C() throws ParseException{
		checkActual();

		switch (token) {
			case Yytoken.IDENT:
				Yytoken.regla(7);
				V();
				avanza(Yytoken.MENOR, "ERROR MENOR");
				V();
				break;

			case Yytoken.NUMERO:
				Yytoken.regla(7);
				V();
				avanza(Yytoken.MENOR, "ERROR MENOR");
				V();
				break;

			default:
				Yytoken.error(token);
				break;
		}
	}

	private static void V() throws ParseException{
		switch (token) {
			case Yytoken.IDENT:
				Yytoken.regla(8);
				avanza(Yytoken.IDENT, "ERROR IDENT");
				break;

			case Yytoken.NUMERO:
				Yytoken.regla(9);
				avanza(Yytoken.NUMERO, "ERROR NUMERO");
				break;

			default:
				Yytoken.error(token);
				break;
		}
	}

}