package br.ufrpe;

public class Main {

	public static void main(String[] args) {
            char[] Alfabeto = {'a', 'b', 'c', 'd'};
            
            //caso 1
            char[] Texto_1 = {'a', 'a', 'b', 'd', 'c', 'a', 'a', 'c', 'a', 'a', 'b', 'c', 'c', 'b', 'b', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            char[] Padrao_1 =  {'a', 'b', 'c', 'a', 'c'};

            char[] Texto_2 = {'a', 'a', 'b', 'd', 'c', 'a', 'a', 'b', 'c', 'a', 'b', 'a', 'c', 'a', 'c', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            char[] Padrao_2 =  {'a', 'b', 'c', 'a', 'c'};
			
			char[] Texto_3 = {'a', 'a', 'b', 'd', 'c', 'a', 'a', 'b', 'c', 'a', 'c', 'a', 'c', 'a', 'c', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            char[] Padrao_3 =  {'a', 'b', 'c', 'a', 'c'};
            
            int[] L = new int[Alfabeto.length];
            BoyerMooreMatch bMM = new BoyerMooreMatch();
            int resultado = bMM.boyerMooreMatch(Alfabeto, Padrao_1, Texto_1, L);
            /*  exibe o resultado de boyer moore:
            *   1 - índice em que foi encontrado o padrão
            *   (caso ele foi encontrado);
            *
            *   2 - o inteiro -1, caso o padrão não tenha sido encontrado.
            **/
            System.out.println(resultado);
	}

}