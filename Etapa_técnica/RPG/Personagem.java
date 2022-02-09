package Etapa_técnica.RPG;


public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private int xp;
    private int inteligencia;
    private int força;
    private int level;

    
    public Personagem(String nome, int vida, int mana, int xp, int inteligencia, int força, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.força = força;
        this.level = level;
    }

    public void retornarinfs(){
        System.out.println("Seu nome: " + this.nome);
        System.out.println("Vida: "+ getVida());
        System.out.println("Mana: "+ getMana());
        System.out.println("Xp: "+ getXp());
        System.out.println("inteligencia: " + getInteligencia());
        System.out.println("Força: "+ getForça());
        System.out.println("Level "+ getLevel());


    }


    public void calcularTotalXp(){
        System.out.println("Voce matou um inimigo seu XP aumentou!");
      for(int i = 0 ; i <= inteligencia; i++){
          System.out.println("seu level é: "+level);
      }
    
        
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getXp() {
        return xp /2 * level;
    }
    public void setXp(int xp) {
        this.xp = xp ;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getForça() {
        return força;
    }
    public void setForça(int força) {
        this.força = força;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }



    
}
