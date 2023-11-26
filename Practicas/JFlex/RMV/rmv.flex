


%%
%int

// definicion expresiones regulares
Variable = [a-zA-Z\_][0-9a-zA-Z\_]*
Comando = [a-zA-Z\_][0-9a-zA-Z\_]*
CarEspecial = (\\)    // son los caracteres \ y caracteres especiales que lo continuen (\n, \t, \$, \", ...)

%{
    String var = "";
    String valor = "";
%}

%xstate VARIABLE
%xstate TEXTO
%xstate ARGUMENTOS


%%

<YYINITIAL> {
    // Por la Shell podemos pasar dos tipos de instrucciones. 
    /* 1-> Variables 
       2-> Comandos
    */


    // 1
    {Variable}=     {var = yytext().substring(0,yytext().length() - 1);
                    yybegin(VARIABLE);}

    // 2
    {Comando}" "    {System.out.println(yytext());
                    yybegin(ARGUMENTOS);}

    // Para todo lo demas
    [^]             {}

}

<VARIABLE> {
    // Inicio de texto (se hace en un estado diferente porque admite espacios en blanco)
    [\"]              {yybegin(TEXTO);}

    // valor de otra variable
    \${Variable}    {valor += TablaSimbolos.get(yytext());}

    // reconoce una variable sin caracteres especiales al principio que lo pueda hacer texto u otra cosa diferente
    {CarEspecial} | [^\t\n\;\|]   {valor += yytext();}
    
    // final de linea (\t = tabular     \n = salto de linea)
    [\t\n\;\|]        {TablaSimbolos.put(var,valor);
                        var = ""; valor = "";
                      yybegin(YYINITIAL);}

}

<TEXTO> {
    // valor de otra variable
    \${Variable}    {valor += TablaSimbolos.get(yytext());}

    // reconoce una variable sin caracteres especiales 
    {CarEspecial} | [^\"]   {valor += yytext();}

    // fin del texto
    [\"]  {TablaSimbolos.put(var,valor);
        yybegin(VARIABLE);}

}

<ARGUMENTOS> {
    // reconoce una variable
    \${Variable}         {System.out.println(TablaSimbolos.get(yytext()));}

    [a-zA-Z0-9]+          {System.out.println(yytext());}

    [\;\n\t\|]          {System.out.println(yytext());}

    [^]                  {System.out.println(yytext());}
}