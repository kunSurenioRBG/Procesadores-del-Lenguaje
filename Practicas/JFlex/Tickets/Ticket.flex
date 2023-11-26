

%%
%{
    
    int unidades;
    float descuento,precio;

%}

%int

%xstate COMPRA

%%
    


<YYINITIAL>{

    ^\-         {yybegin(COMPRA);descuento = 1;  // DEBE ESTAR AL COMIENZO DE LA LINEA (especificado en el PDF)
                unidades = 1;
                precio = 0;}

    [^]         {}


}


<COMPRA>{
    /* /% (si hay % en la expresion, se aplica el lexema) */
    [0-9]+(.[0-9])? / %         {descuento = (100 - Float.valueOf(yytext()))/100;}

    /* /uds (si hay uds en la expresion, se aplica el lexema) */
    [0-9]+ / uds                {unidades = Integer.valueOf(yytext());}

    /* [0-9]{1,2}   (que el conjunto de 0-9 se repita 1 o 2 veces) */
    [0-9]+(\.[0-9]{1,2})?       {precio = unidades*descuento*Float.valueOf(yytext());
                                yybegin(YYINITIAL);
                                Ticket.addItemsDistintos(1);
                                Ticket.addItems(unidades);
                                Ticket.addCompra(precio);}

    /* Cualquier otra cosa (espacios, caracteres raros,..) no se cuentan */
    [^] {}

}