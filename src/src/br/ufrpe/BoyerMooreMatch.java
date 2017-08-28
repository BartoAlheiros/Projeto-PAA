package src.br.ufrpe;

import java.util.ArrayList;

public class BoyerMooreMatch {

    int[] L, P;

    public BoyerMooreMatch() {
        
    }

    public int boyerMooreMatch(char[] Alfabeto, char[] P, char[] T) {
        int k, i = 0, m = 0, j = 0, l = 0;
        L = new int[Alfabeto.length];
        P = new char[P.length];
        //inicia o array L com -1 em todas as posições
        for (k = 0; k < Alfabeto.length; k++) {
            L[k] = -1;
        }
        for (k = 0; k < Alfabeto.length; k++) {
            //acha a ocorrência mais à direita do elemento do alfabeto no Padrão
            L[P[k]] = k;
            i = m - 1;
            j = m - 1;

            do {
                if(T[i] == P[j])
                    if(j == 0) return i;
                    else{i--; j--;}
                else{
                    l = L[T[i]];
                    i += m - min(j, l + 1);
                    j = m - 1;
                }
            } while (i > T.length - 1);
            
        }
        
        return -1;
    }
    
    //funcao que retorna o mínimo inteiro entre dois inteiros quaisquer
    public int min(int j, int l){
        if(l < j)
            return l;
        else
            return j;
    }
}
