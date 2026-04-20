//Escreva instruções para realizar cada uma das tarefas a seguir:
//a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
//b) Solicite que o usuário insira um inteiro.
//c) Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler
//um valor digitado pelo usuário.
//d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.
//e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método
//System.out.printf e dois especificadores de formato %s.
//f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".

package capitulo02;

import java.util.Scanner;

public class Revisão2_3
{
    public static void main(String[] args)
    {
        int c, thisIsAVariable, q76354, number;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o um número inteiro: ");
        
        number = input.nextInt();
        
        System.out.println("This is a Java program");
        System.out.printf("%s%n%s%n", "This is a Java", "program");
        
        if (number != 7)
            System.out.println("The variable number is not equal to 7");
     }
}