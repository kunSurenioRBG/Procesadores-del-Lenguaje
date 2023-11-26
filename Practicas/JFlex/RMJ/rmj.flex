
%%

%int

variable = [a-zA-Z\_][a-zA-Z0-9\_]*

%{
    String var,valor;
%}

%xstate CAMBIO
%xstate VARIABLE
%xstate COMILLAV
%xstate CODIGO
%xstate IMPRIMIR
%xstate COMILLAI

%%

<YYINITIAL>{

    \{                          {System.out.print("{");yybegin(CODIGO);}

    class                       {System.out.print("class");yybegin(CAMBIO);}

    [^{]                         {System.out.print(yytext());}

    

}

<CAMBIO>{

    {variable}                  {System.out.print(yytext()+"_rmj");}

    [{]                         {System.out.print(yytext());yybegin(YYINITIAL);}

    [^]                         {System.out.print(yytext());}


}

<CODIGO>{

    [=]                         {valor = "";yybegin(VARIABLE);}

    [\n]                        {System.out.print(yytext());}

    [\r]                        {System.out.print(yytext());}

    [\s]                        {System.out.print(yytext());}

    {variable}                  {var = yytext();}

    System.out.print(ln)?       {System.out.print(yytext());
                                yybegin(IMPRIMIR);}

    [\}]                         {System.out.print("}");
                            yybegin(YYINITIAL);}

    [^]                          {}
}

<VARIABLE>{

    [;]                 {TablaSimbolos.put(var,valor);yybegin(CODIGO);}

    {variable}          {valor += TablaSimbolos.get(yytext());}

    [\"]                {yybegin(COMILLAV);}

    [^]                 {}

}

<COMILLAV>{

    /* [\\]     (caracter \) */
    /* [\\].    (conjunto \+caracter -> \n\r\s\t\.\$...) */

    [\\].           {valor += yytext();}      

    [\"]            {yybegin(VARIABLE);}

    [^]             {valor += yytext();}

}

<IMPRIMIR>{

    [;]             {System.out.print(yytext());yybegin(CODIGO);}

    {variable}      {System.out.print(TablaSimbolos.get(yytext()));}

    [(]             {System.out.print(yytext()+"\"");}

    [)]             {System.out.print("\""+")");}

    [\"]            {yybegin(COMILLAI);}

    [^\+]           {System.out.print(yytext());}

    [^]             {}

}

<COMILLAI>{
    
    [\"]            {yybegin(IMPRIMIR);}

    [^]             {System.out.print(yytext());}
    
}