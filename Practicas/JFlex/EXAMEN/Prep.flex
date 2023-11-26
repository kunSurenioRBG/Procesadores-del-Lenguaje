

%%
%int
Palabras = [a-zA-Z\_][a-zA-Z\_\.]*
ID = [a-zA-Z\_][a-zA-Z0-9\_]*
Valor = [a-zA-Z\_][a-zA-Z0-9\_]*


%{
    String clave = "";
    String valor = "";
%}


%xstate DEFINICIONVARIABLE
%xstate VALOR
%xstate SUSTITUCION
%xstate TEXTOENTRELINEAS

%%

<YYINITIAL> {
    \$           {yybegin(SUSTITUCION);}

    {Palabras}   {System.out.print(yytext());}

    \n          {System.out.print(yytext());}

    \s | \t      {System.out.print(yytext());}

    ^#define\s     {yybegin(DEFINICIONVARIABLE);}

    //10-11 = ID
    ^#ifdef\s{ID}       {if (TablaSimbolos.get(yytext().substring(10,11)) != "") {
                            yybegin(TEXTOENTRELINEAS);
                          } else {
                            System.out.print("");
                         }
                        }

    [^]             {}

}

<DEFINICIONVARIABLE> {
    {ID}" "        {clave = yytext().substring(0,yytext().length() - 1);
                    yybegin(VALOR);}

    [^]         {}
}

<VALOR> {
    {ID}     {valor += yytext();}

    \s | \t      {valor += yytext();}

    [\n\r\;]      {TablaSimbolos.put(clave,valor);
                    valor = "";
                    yybegin(DEFINICIONVARIABLE);}

    [^]         {}
}

<SUSTITUCION> {
    {ID}        {if (TablaSimbolos.get(yytext()) != "") {
                    valor += TablaSimbolos.get(yytext());
                  } else {
                    valor = "ID_NO_DEFINIDO";
                  }
                }
                
    [^]          {}
}

<TEXTOENTRELINEAS> {
    {Palabras}      {System.out.print(yytext());}

    \s | \t          {System.out.print(yytext());}

    \${ID}           {if (TablaSimbolos.get(yytext()) != "") {
                    System.out.print(yytext());
                        } else {
                    System.out.print("");
                     }}  

    [^]         {}
}