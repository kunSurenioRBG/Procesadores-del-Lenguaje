
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\003\004\000\002\002\004\000\002\003" +
    "\003\000\002\004\004\000\002\004\004\000\002\010\006" +
    "\000\002\010\006\000\002\010\006\000\002\010\006\000" +
    "\002\002\005\000\002\011\003\000\002\011\003\000\002" +
    "\011\005\000\002\011\005\000\002\011\005\000\002\011" +
    "\005\000\002\011\003\000\002\007\005\000\002\007\005" +
    "\000\002\005\005\000\002\005\003\000\002\005\007\000" +
    "\002\005\005\000\002\006\005\000\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\014\004\005\023\013\024\007\025\004\026" +
    "\010\001\002\000\004\010\072\001\002\000\004\016\070" +
    "\001\002\000\004\015\067\001\002\000\004\010\064\001" +
    "\002\000\004\010\061\001\002\000\016\002\057\004\005" +
    "\023\013\024\007\025\004\026\010\001\002\000\004\015" +
    "\056\001\002\000\004\010\015\001\002\000\016\002\uffff" +
    "\004\uffff\023\uffff\024\uffff\025\uffff\026\uffff\001\002\000" +
    "\020\004\016\006\021\012\022\023\013\024\007\025\004" +
    "\026\010\001\002\000\016\011\ufff1\015\ufff1\017\ufff1\020" +
    "\ufff1\021\ufff1\022\ufff1\001\002\000\016\011\ufff6\015\ufff6" +
    "\017\ufff6\020\ufff6\021\ufff6\022\ufff6\001\002\000\014\011" +
    "\051\017\045\020\046\021\050\022\047\001\002\000\006" +
    "\005\024\006\025\001\002\000\006\005\024\006\025\001" +
    "\002\000\016\011\ufff7\015\ufff7\017\ufff7\020\ufff7\021\ufff7" +
    "\022\ufff7\001\002\000\012\007\uffe9\013\uffe9\014\uffe9\015" +
    "\uffe9\001\002\000\004\005\024\001\002\000\012\007\uffed" +
    "\013\uffed\014\034\015\uffed\001\002\000\010\013\030\014" +
    "\031\015\032\001\002\000\016\011\ufff0\015\ufff0\017\ufff0" +
    "\020\ufff0\021\ufff0\022\ufff0\001\002\000\004\006\036\001" +
    "\002\000\004\005\024\001\002\000\012\007\uffee\013\uffee" +
    "\014\034\015\uffee\001\002\000\004\005\035\001\002\000" +
    "\012\007\uffea\013\uffea\014\uffea\015\uffea\001\002\000\004" +
    "\005\024\001\002\000\006\007\040\014\034\001\002\000" +
    "\012\007\uffec\013\uffec\014\uffec\015\uffec\001\002\000\006" +
    "\007\042\014\034\001\002\000\012\007\uffeb\013\uffeb\014" +
    "\uffeb\015\uffeb\001\002\000\010\007\044\014\031\015\032" +
    "\001\002\000\016\011\uffef\015\uffef\017\uffef\020\uffef\021" +
    "\uffef\022\uffef\001\002\000\020\004\016\006\021\012\022" +
    "\023\013\024\007\025\004\026\010\001\002\000\020\004" +
    "\016\006\021\012\022\023\013\024\007\025\004\026\010" +
    "\001\002\000\020\004\016\006\021\012\022\023\013\024" +
    "\007\025\004\026\010\001\002\000\020\004\016\006\021" +
    "\012\022\023\013\024\007\025\004\026\010\001\002\000" +
    "\016\011\ufffc\015\ufffc\017\ufffc\020\ufffc\021\ufffc\022\ufffc" +
    "\001\002\000\016\011\ufff3\015\ufff3\017\ufff3\020\ufff3\021" +
    "\ufff3\022\ufff3\001\002\000\016\011\ufff2\015\ufff2\017\ufff2" +
    "\020\ufff2\021\ufff2\022\ufff2\001\002\000\016\011\ufff4\015" +
    "\ufff4\017\ufff4\020\ufff4\021\050\022\047\001\002\000\016" +
    "\011\ufff5\015\ufff5\017\ufff5\020\ufff5\021\050\022\047\001" +
    "\002\000\016\002\ufffd\004\ufffd\023\ufffd\024\ufffd\025\ufffd" +
    "\026\ufffd\001\002\000\004\002\000\001\002\000\016\002" +
    "\001\004\001\023\001\024\001\025\001\026\001\001\002" +
    "\000\020\004\016\006\021\012\022\023\013\024\007\025" +
    "\004\026\010\001\002\000\014\011\063\017\045\020\046" +
    "\021\050\022\047\001\002\000\016\011\ufff9\015\ufff9\017" +
    "\ufff9\020\ufff9\021\ufff9\022\ufff9\001\002\000\020\004\016" +
    "\006\021\012\022\023\013\024\007\025\004\026\010\001" +
    "\002\000\014\011\066\017\045\020\046\021\050\022\047" +
    "\001\002\000\016\011\ufffa\015\ufffa\017\ufffa\020\ufffa\021" +
    "\ufffa\022\ufffa\001\002\000\016\002\ufffe\004\ufffe\023\ufffe" +
    "\024\ufffe\025\ufffe\026\ufffe\001\002\000\020\004\016\006" +
    "\021\012\022\023\013\024\007\025\004\026\010\001\002" +
    "\000\014\015\ufff8\017\045\020\046\021\050\022\047\001" +
    "\002\000\020\004\016\006\021\012\022\023\013\024\007" +
    "\025\004\026\010\001\002\000\014\011\074\017\045\020" +
    "\046\021\050\022\047\001\002\000\016\011\ufffb\015\ufffb" +
    "\017\ufffb\020\ufffb\021\ufffb\022\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\012\002\011\003\010\004\013\010\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\002\011\004" +
    "\057\010\005\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\007\022\010\016\011\017\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\042\006\025\001\001\000\006\005\026\006" +
    "\025\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\040\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\006\032\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\036\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\007\022\010\016\011\054\001\001" +
    "\000\010\007\022\010\016\011\053\001\001\000\010\007" +
    "\022\010\016\011\052\001\001\000\010\007\022\010\016" +
    "\011\051\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\007" +
    "\022\010\016\011\061\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\007\022\010\016\011\064\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\007\022\010\016\011\070\001\001\000\002\001\001\000" +
    "\010\007\022\010\016\011\072\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public void syntax_error(Symbol cur_token){
    }

    public void unrecovered_syntax_error(Symbol cur_token){
        System.err.println("Syntax error en linea" + Matrices.lex.getLine() + ", columna " + Matrices.lex.getColumn() + " con el token "+ sym.terminalNames[cur_token.sym]);
        // report_error("Syntax error", null);
        done_parsing();
    }




/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    ArrayList<ArrayList<Double>> filas = new ArrayList<>();
    ArrayList<Double> fila = new ArrayList<>();

    double[][] matriz;

    boolean excepcion = false;

    public void error(int id) {
        switch (id) {
            case 1 :
                System.out.println(Matrices.ERROR_FILAS);
                break;
            
            case 2 :
                System.out.println(Matrices.ERROR_INVERSA);
                break;

            case 3 :
                System.out.println(Matrices.ERROR_ADJUNTA);
                break;
                
            case 4 :
                System.out.println(Matrices.ERROR_PROD);
                break;
                
            case 5 :
                System.out.println(Matrices.ERROR_SUMA);
                break;
            
            case 6 :
                System.out.println(TablaSimbolos.ERROR_NOEXISTE);
                break;
            
            default:
                System.out.println("Error desconocido");
                break;
        }
        
        excepcion = true;
    }

    public double[][] crearMatriz(ArrayList<ArrayList<Double>> filas) {
        double[][] matriz = null;
        
        try {
            matriz = Matrices.toArray(filas);
            
        } catch (Exception e) {
            error(1);
        }
        
        return matriz;
    }

    public boolean cuadrada(double[][] matriz) {
        return Matrices.filas(matriz) == Matrices.columnas(matriz);
    }

    public boolean sumables(double[][] matrizA, double[][] matrizB) {
        return Matrices.filas(matrizA) == Matrices.filas(matrizB) && Matrices.columnas(matrizA) == Matrices.columnas(matrizB);
    }

    public boolean multiplicables(double[][] matrizA, double[][] matrizB) {
        return Matrices.columnas(matrizA) == Matrices.filas(matrizB);
    }


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // lineas ::= lineas linea 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lineas",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= lineas EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // lineas ::= linea 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lineas",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // linea ::= funcion PYC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // linea ::= definicion PYC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // funcion ::= PRINT AP argumento CP 
            {
              double[][] RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		double[][] m = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (m != null)                                       {Matrices.print(m);                             }
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funcion",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // funcion ::= TRANSPUESTA AP argumento CP 
            {
              double[][] RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		double[][] m = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (m != null)                                       {matriz = Matrices.transpuesta(m);              }
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funcion",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // funcion ::= INVERSA AP argumento CP 
            {
              double[][] RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		double[][] m = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (m != null && cuadrada(m))                        {matriz = Matrices.inversa(m);                  } else {error(2);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funcion",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // funcion ::= ADJUNTA AP argumento CP 
            {
              double[][] RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		double[][] m = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (m != null && cuadrada(m))                        {matriz = Matrices.adjunta(m);                  } else {error(3);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funcion",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // definicion ::= IDENT ASIG argumento 
            {
              Object RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int identright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double[][] a = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 TablaSimbolos.insertar(ident,a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("definicion",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // argumento ::= matriz 
            {
              double[][] RESULT =null;
		 RESULT = matriz; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // argumento ::= funcion 
            {
              double[][] RESULT =null;
		 RESULT = matriz; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // argumento ::= argumento MAS argumento 
            {
              double[][] RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		double[][] a = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double[][] b = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(sumables(a,b))                                    {matriz = Matrices.suma(a, b);                          RESULT = matriz;        } else {error(5);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // argumento ::= argumento MENOS argumento 
            {
              double[][] RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		double[][] a = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double[][] b = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(sumables(a,b))                                    {matriz = Matrices.suma(a,Matrices.producto(-1,b));     RESULT = matriz;        } else {error(5);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // argumento ::= argumento POR argumento 
            {
              double[][] RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		double[][] a = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double[][] b = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(multiplicables(a,b))                              {matriz = Matrices.producto(a,b);                       RESULT = matriz;        } else {error(4);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // argumento ::= argumento DIV argumento 
            {
              double[][] RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		double[][] a = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double[][] b = (double[][])((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(multiplicables(a,b))                              {matriz = Matrices.producto(a, Matrices.inversa(b));    RESULT = matriz;        } else {error(4);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // argumento ::= IDENT 
            {
              double[][] RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = TablaSimbolos.buscar(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumento",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // matriz ::= AC filas CC 
            {
              double[][] RESULT =null;
		 matriz = crearMatriz(filas);     filas.clear(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("matriz",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // matriz ::= ALL filas CLL 
            {
              double[][] RESULT =null;
		 matriz = crearMatriz(filas);     filas.clear(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("matriz",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // filas ::= filas PYC fila 
            {
              Object RESULT =null;
		 filas.add((ArrayList<Double>)    fila.clone());     fila.clear(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("filas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // filas ::= fila 
            {
              Object RESULT =null;
		 filas.add((ArrayList<Double>)    fila.clone());     fila.clear(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("filas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // filas ::= filas COMA ALL fila CLL 
            {
              Object RESULT =null;
		 filas.add((ArrayList<Double>)    fila.clone());     fila.clear(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("filas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // filas ::= ALL fila CLL 
            {
              Object RESULT =null;
		 filas.add((ArrayList<Double>)    fila.clone());     fila.clear(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("filas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // fila ::= fila COMA NUMERO 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double n = (double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 fila.add(new Double(n)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fila",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // fila ::= NUMERO 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		double n = (double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 fila.add(new Double(n)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fila",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}