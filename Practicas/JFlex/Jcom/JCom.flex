


%%
%int

// la suma de los caracteres lo hacemos en el JCom (nos dan variables int declaradas)

%xstate LINEA
%xstate BLOQUE
%xstate DOCUMENTACION
%xstate STRING

%%
// 3 estados (//) (/* */) (/** */)

<YYINITIAL> {
    \/\/      {yybegin(LINEA);}

    \/\*      {yybegin(BLOQUE);}

    \/\*\*     {yybegin(DOCUMENTACION);}

    \"          {yybegin(STRING);}

    [^]       {} 

}

<LINEA> {
    // \R (cualquier salto, retorno de carro, tab,...)
    //IMPORTANTE EL ORDEN EN ESTE CASO DE LOS CARACTERES
    \n              {yybegin(YYINITIAL);}  

    \s              {}

    \t              {}
    
    .               {JCom.linea++;}

    /* Cualquier otra cosa */
    [^]             {}
}

<BLOQUE> {
    \*\/            {yybegin(YYINITIAL);}

    \n              {}

    \s             {}

    \t              {}

    .               {JCom.bloque++;}

    /* Cualquier otra cosa */
    [^]              {}

}

<DOCUMENTACION> {
    \*\/            {yybegin(YYINITIAL);}

    \n              {}

    \s             {}

    \t              {}

    .               {JCom.documentacion++;}

    /* Cualquier otra cosa */
    [^]              {}

}

<STRING> {
    \"      {yybegin(YYINITIAL);}

    \       {} 
    
    [^]     {}
}
