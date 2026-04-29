// Figura 3.6: AccountTest01.java
// Usando o construturo de Account01 para inicializar a variável de instância name no momento em que cada objeto Account01 é criado.

package capitulo03;

public class AccountTest01
{
    public static void main(String[] args)
    {
        Account01 account01 = new Account01("Jane Green");
        Account01 account02 = new Account01("John Blue");
        
        // exibe o valor inicial do nome para cada Account01
        System.out.printf("account01 is : %s%n", account01.getName());
        System.out.printf("account02 is : %s%n", account02.getName());
    }
}