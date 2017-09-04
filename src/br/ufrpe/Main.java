package br.ufrpe;

public class Main {

	public static void main(String[] args) {
            char[] Alfabeto = {'a', 'b', 'c', 'd'};
            
            char[] Padrao1 =  {'a', 'a', 'b', 'a', 'c'};
            char[] Texto1 = {'a', 'a', 'b', 'd', 'c','a', 'a', 'c', 'a', 'a', 'b', 'c', 'c', 'b', 'b', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            
            char[] Texto2 = {'a', 'a', 'b', 'd', 'c', 'a', 'a', 'b', 'c', 'a', 'b', 'c', 'c', 'b', 'b', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            char[] Padrao2 =  {'a', 'b', 'c', 'a', 'c'};
            
            int[] L = new int[Alfabeto.length];
            BoyerMooreMatch bMM = new BoyerMooreMatch();
            int resultado = bMM.boyerMooreMatch(Alfabeto, Padrao2, Texto2, L);
            /*  exibe o resultado de boyer moore:
            *   1 - índice em que foi encontrado o padrão
            *   (caso ele foi encontrado);
            *
            *   2 - o inteiro -1, caso o padrão não tenha sido encontrado.
            **/
            System.out.println(resultado);
	}

}