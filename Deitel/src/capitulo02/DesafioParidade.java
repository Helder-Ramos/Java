package capitulo02;

import java.util.Scanner;

public class DesafioParidade
{
    public static void main(String[] args)
    {
        int number1, number2, soma;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        number2 = input.nextInt();
        
        soma = number1 + number2;
        System.out.printf("%d%n", soma);
        
        if(soma % 2 == 0)
        {
            System.out.println("O número é par");
        }
        else
        {
            System.out.println("O número é ímpar");
        }
    }
}
