package src.br.ufrpe;

import java.util.ArrayList;

public class BoyerMooreMatch {

    public BoyerMooreMatch() {
        
    }

    public int boyerMooreMatch(char[] alfabeto, char[] P, char[] T, int[] L) {
        int k, i = 0, j = 0, l = 0, y = 0;
        //inicia o array L com -1 em todas as posições
        for (k = 0; k < alfabeto.length; k++) {
            L[k] = -1;
        }
        for (k = 0; k < P.length; k++) {
            //acha a ocorrência mais à direita do elemento do alfabeto no Padrão
            switch(P[k]) {
                case 'a': 
                    L[y] = k;
                    break;
                case 'b':
                    y = 1;
                    L[y] = k;
                    break;
                case 'c':
                    y = 2;
                    L[y] = k;
                    break;
                case 'd':
                    y = 3;
                    L[y] = k;
                    break;
            }
            
            //a.setL(k, P[k]);
            //L[P[k]] = k;
        }
        
        i = P.length - 1;
        j = P.length - 1;
        
        do {
            if(T[i] == P[j]){
                if(j == 0) return i;
                else{i--; j--;}
            }else{
                switch(T[i]) {
                case 'a': 
                    l = L[0];
                    break;
                case 'b':
                    l = L[1];
                    break;
                case 'c':
                    l = L[2];
                    break;
                case 'd':
                    l = L[3];
                    break;
            }
                //l = a.getTexto(i); //L[T[i]];
                i += P.length - min(j, l + 1);
                j = P.length - 1;
            }
        } while (i < T.length - 1);   
            
        
        
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
