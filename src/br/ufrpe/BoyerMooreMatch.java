package br.ufrpe;

/**
 * @author EraNetbook
 *
 */
public class BoyerMooreMatch {

    public BoyerMooreMatch() {
        
    }
    
    /**
     * @param alfabeto: alfabeto utilizado
     * @param P: padrão que deseja se identificar no texto
     * @param T: texto recebido para pesquisar o padrão
     * @param L: vetor auxiliar que guarda o índice da última posição da letra do alfabeto no padrão.
     */
    public int boyerMooreMatch(char[] alfabeto, char[] P, char[] T, int[] L) {
        int k, i = 0, j = 0, l = 0;
        //inicia o array L com -1 em todas as posições
        for (k = 0; k < alfabeto.length; k++) {
            L[k] = -1;
        }
        for (k = 0; k < P.length; k++) {
            /**acha a ocorrência mais à direita do elemento do alfabeto no Padrão
             * e preenche o vetor auxiliar L */
            switch(P[k]) {
                case 'a': 
                    L[0] = k;
                    break;
                case 'b':
                    L[1] = k;
                    break;
                case 'c':
                    L[2] = k;
                    break;
                case 'd':
                    L[3] = k;
                    break;
            }
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
