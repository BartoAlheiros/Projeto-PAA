package src.br.ufrpe;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
            char[] Alfabeto = {'a', 'b', 'c', 'd'};
            char[] Padrao =  {'a', 'a', 'b', 'c', 'c'};
            char[] Texto = {'a', 'a', 'b', 'd', 'd','a', 'a', 'c', 'a', 'a', 'b', 'c', 'c', 'b', 'b', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'c'};
            BoyerMooreMatch bMM = new BoyerMooreMatch();
            int resultado = bMM.boyerMooreMatch(Alfabeto, Padrao, Texto);
            /*  exibe o resultado de boyer moore: 
            *   1 - índice em que foi encontrado o padrão
            *   (caso ele foi encontrado);
            *   
            *   2 - o inteiro -1, caso o padrão não tenha sido encontrado.
            **/
            System.out.println(resultado);
	}

}
