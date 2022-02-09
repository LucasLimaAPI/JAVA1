package Etapa_técnica.Livraria;

import java.util.ArrayList;

public class Leitor {

    private String nome;
    private String livrofav;
    private ArrayList<String>livro;

    




public void retonaInfos(){
   System.out.println("Nome: "+ getNome());
   System.out.println("Livro favorito: "+ getLivrofav());
   System.out.println("Lista: "+ getLivro() );
    }

    public String getNome() {
        return "Lucas";
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLivrofav() {
        return "Os mentirosos";
    }


    public void setLivrofav(String livrofav) {
        this.livrofav = livrofav;
    }


    public String getLivro() {
        return "Os mentirosos, madruga, a noite, Musicale";
    }


    public void setLivro(ArrayList<String> livro) {
        this.livro = livro;
    }


    public void addLivro(){
 for(int i = 0; i <= 10; i++){
     System.out.println("Adicionando livros a sua coleção");
 }

    }

    public void remLivro(){

        for(int i = 0; i <= 10; i--){
            System.out.println("Adicionando livros a sua coleção");
        }
    }
    
}
