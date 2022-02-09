package Etapa_técnica.RPG;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int vida, int mana, int xp, int inteligencia, int força, int level) {
        super(nome, vida, mana, xp, inteligencia, força, level);

        calcularTotalXp();
        


    }
    
}
