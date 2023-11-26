import java.util.List;
import java.util.LinkedList;

%%

%int
Numero = [0-9]+
Operador = [\+\-\*\/] //recomendado poner \ para separar caracteres de operacion


//inicializar codigo Java
%{
    List<Integer> lista = new LinkedList<>(); //NO ArrayList porque al meter los valores se ordenarian de menor a mayor
    String operador;

    public void operar(List pila, String operador){ //pila = lista
        int posA, posB;
        int a, b;
        int res = 0;

        a = (int)pila.get(pila.size() - 2);
        b = (int)pila.get(pila.size() - 1);

        posA = pila.size() - 2;
        posB = pila.size() - 1;
        
        switch(operador) {
            case "+":
                    res = a + b;
                break;
            case "-":
                    res = a - b;
                break;
            case "*":
                    res = a * b;
                break;
            case "/":
                    res = a / b;
                break;
            default:
                     System.err.println("Error: Va mal" + operador);
                 break;
        }

        // Por alguna razon, el if no es capaz de comparar bien el operador y acaba siempre en error 

        /*System.out.println(operador);
        if(operador == "+"){
            res = a + b;
        } else if (operador == "-"){
            res = a - b;
        } else if (operador == "*") {
            res = a * b;
        } else if (operador == "/") {
            res = a / b;
        } else {
            System.err.println("Error: Va mal" + operador);
              
        }
        */


        //reordenar los valores:
        //primero ponemos el "res" en la primera posicion y luego eliminamos el valor de b, dejando solo almacenado en la lista el resultado de la operacion
        pila.set(posA, res);
        pila.remove(posB);
    }
%}

//estados para el bloque 3
%xstate OPERACION
%xstate PARENTESIS

%%

<YYINITIAL> {
    //reconoce un numero
    {Numero} {lista.add(Integer.parseInt(yytext()));} //yytext es el valor del caracter del archivo

    //reconoce operador
    {Operador} {operador = yytext();
                    yybegin(OPERACION);} //salto al siguiente estado

    //reconoce un parentesis inicial
    "(" {yybegin(PARENTESIS);}

    //si es parentesis final, para multiplicar los valores de dentro
    ")" {if(lista.size() > 1){
            operar(lista,"*");};}

    //mostrar por pantalla el resultado final
    ";" {System.out.println(lista.get(0));
        lista.clear();}

    //cualquier otro lexema
    [^] { }


}




<OPERACION> {
    //reconoce un numero
    {Numero} {lista.add(Integer.parseInt(yytext()));
                operar(lista, operador);
                yybegin(YYINITIAL);} //para seguir leyendo caracteres
}




<PARENTESIS> {
    {Numero} {lista.add(Integer.parseInt(yytext()));}

    {Operador} {operador = yytext();
                yybegin(OPERACION);}

    ")" {if(lista.size() > 1){
            operar(lista,"*");};}

    ";" {System.out.println(lista.get(0));}

    [^] { }
}
