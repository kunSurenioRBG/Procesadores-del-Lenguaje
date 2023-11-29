
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.HashMap;
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
    "\000\020\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\004\000\002\004\005" +
    "\000\002\005\006\000\002\006\003\000\002\006\003\000" +
    "\002\006\005\000\002\006\012\000\002\006\005\000\002" +
    "\007\003\000\002\007\007\000\002\007\005\000\002\007" +
    "\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\050\000\006\014\007\020\006\001\002\000\004\011" +
    "\052\001\002\000\010\002\051\014\007\020\006\001\002" +
    "\000\004\006\046\001\002\000\004\007\013\001\002\000" +
    "\004\011\012\001\002\000\010\002\uffff\014\uffff\020\uffff" +
    "\001\002\000\010\002\ufffd\014\ufffd\020\ufffd\001\002\000" +
    "\010\007\016\017\017\020\014\001\002\000\012\004\ufff9" +
    "\010\ufff9\011\ufff9\012\ufff9\001\002\000\010\004\022\010" +
    "\045\012\021\001\002\000\010\007\016\017\017\020\014" +
    "\001\002\000\012\004\ufffa\010\ufffa\011\ufffa\012\ufffa\001" +
    "\002\000\010\004\022\010\023\012\021\001\002\000\004" +
    "\015\025\001\002\000\010\007\016\017\017\020\014\001" +
    "\002\000\012\004\ufff6\010\ufff6\011\ufff6\012\ufff6\001\002" +
    "\000\012\004\ufff8\010\ufff8\011\ufff8\012\021\001\002\000" +
    "\004\007\026\001\002\000\012\007\016\017\017\020\014" +
    "\021\027\001\002\000\012\004\ufff5\005\ufff5\010\ufff5\013" +
    "\ufff5\001\002\000\006\004\022\012\041\001\002\000\010" +
    "\004\033\005\034\013\032\001\002\000\012\007\016\017" +
    "\017\020\014\021\027\001\002\000\012\007\016\017\017" +
    "\020\014\021\027\001\002\000\012\007\016\017\017\020" +
    "\014\021\027\001\002\000\012\004\ufff3\005\ufff3\010\ufff3" +
    "\013\ufff3\001\002\000\012\004\ufff2\005\ufff2\010\ufff2\013" +
    "\ufff2\001\002\000\010\004\033\005\034\010\040\001\002" +
    "\000\012\004\ufff7\010\ufff7\011\ufff7\012\ufff7\001\002\000" +
    "\006\015\025\016\042\001\002\000\004\007\043\001\002" +
    "\000\004\010\044\001\002\000\012\004\ufff4\005\ufff4\010" +
    "\ufff4\013\ufff4\001\002\000\004\011\ufffb\001\002\000\010" +
    "\007\016\017\017\020\014\001\002\000\010\004\022\011" +
    "\ufffc\012\021\001\002\000\010\002\001\014\001\020\001" +
    "\001\002\000\004\002\000\001\002\000\010\002\ufffe\014" +
    "\ufffe\020\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\050\000\012\002\004\003\010\004\003\005\007\001" +
    "\001\000\002\001\001\000\010\003\047\004\003\005\007" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\023\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\027\007\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\006\027\007\036\001\001\000\006\006\027" +
    "\007\035\001\001\000\006\006\027\007\034\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\046" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

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


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    public HashMap<String, String> tabla = new HashMap<>();

    public String buscar(String id) {
        return tabla.get(id);
    }

    public void insertar(String id, String cadena) {
        tabla.put(id, cadena);
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lineas",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lineas",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // linea ::= definicion PYC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // linea ::= funcion PYC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // definicion ::= ID IGUAL cadena 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 insertar(id, c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("definicion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // funcion ::= PRINT AP cadena CP 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.println(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funcion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // cadena ::= CADENA 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // cadena ::= ID 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = buscar(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // cadena ::= cadena MAS cadena 
            {
              String RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String c1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = c1 + c2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // cadena ::= cadena PUNTO SUBSTR AP tam COMA tam CP 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new String(c.substring(n1,n2+n1)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // cadena ::= AP cadena CP 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // tam ::= NUMERO 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tam",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // tam ::= cadena PUNTO SIZE AP CP 
            {
              Integer RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		 RESULT = c.length(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tam",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tam ::= tam MENOS tam 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n1 - n2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tam",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tam ::= tam MAS tam 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n1 + n2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tam",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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