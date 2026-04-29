// Figura 3.5: Account01.java
// a classe Account com um construtor que inicializa o nome.

package capitulo03;

public class Account01
{
    private String name; // variável de instância
    
    // o construtor inicializa name com nome do parâmetro
    public Account01(String name) // o nome do construtor é o nome da classe
    {
        this.name = name;
    }
    
    // método para configurar o nome
    public void setName(String name)
    {
        this.name = name;
    }
    
    // método para recuperar o nome
    public String getName()
    {
        return name;
    }
}