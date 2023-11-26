
%%

%int

Palabras = [a-zA-Z]*

%%

{Palabras}  {wc.palabras++;
            wc.caracteres += yylength();}

[\n]         {wc.lineas++;
             wc.caracteres++;}

[^]          {wc.caracteres++;}