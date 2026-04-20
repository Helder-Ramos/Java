/*Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
a) Declare que um programa calculará o produto de três inteiros.
b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
c) Declare as variáveis x, y, z e result como tipo int.
d) Solicite que o usuário insira o primeiro inteiro.
e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
f) Solicite que o usuário insira o segundo inteiro.
g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
h) Solicite que o usuário insira o terceiro inteiro.
i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result.*/

package capitulo02;

import java.util.Scanner;

public class Revisão2_5
{
    public static void main(String[] args)
    {
        System.out.println("Cálculo do produto de 3 inteiros.");
        
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        
        System.out.print("Insira o primeiro inteiro: ");
        x = input.nextInt();
        
        System.out.print("Insira o segundo inteiro: ");
        y = input.nextInt();
        
        System.out.print("Insira o terceiro inteiro: ");
        z = input.nextInt();
        result = x * y * z;
        
        System.out.printf("Product is %d%n", result);
    }
}
