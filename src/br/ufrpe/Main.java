package src.br.ufrpe;

public class Main {

	public static void main(String[] args) {
            char[] Alfabeto = {'a', 'b', 'c', 'd'};
            char[] Padrao1 =  {'a', 'a', 'b', 'c', 'c'};
            char[] Texto1 = {'a', 'a', 'b', 'd', 'c','a', 'a', 'c', 'a', 'a', 'b', 'c', 'c', 'b', 'b', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            char[] Texto2 = {'a', 'a', 'b', 'a', 'd','a', 'a', 'c', 'a', 'a', 'b', 'c', 'd', 'b', 'b', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            char[] Padrao2 =  {'a', 'a', 'b', 'c', 'd'};
            int[] L = new int[Alfabeto.length];
            BoyerMooreMatch bMM = new BoyerMooreMatch();
            int resultado = bMM.boyerMooreMatch(Alfabeto, Padrao1, Texto1, L);
            /*  exibe o resultado de boyer moore:
            *   1 - índice em que foi encontrado o padrão
            *   (caso ele foi encontrado);
            *
            *   2 - o inteiro -1, caso o padrão não tenha sido encontrado.
            **/
            System.out.println(resultado);
	}

}