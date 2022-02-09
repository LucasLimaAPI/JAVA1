package Etapa_técnica.Livraria;

public class Livro {
    private String livro;
    private int paginas;
    private int paginaslidas;


    

    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginaslidas() {
        return paginaslidas;
    }
    public void setPaginaslidas(int paginaslidas) {
        this.paginaslidas = paginaslidas;
        
    }

    public void verificar() {

        if(paginas == 100){
      System.out.println("seu livro tem 100 paginas");
        }
        
    }
    public void lidos() {
        if (paginas <= 50) {
            System.out.println("Você Leu 50 paginas");
            
        }
        
    }

    

    
}
