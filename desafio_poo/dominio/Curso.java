package desafio_poo.dominio;

public class Curso extends Conteudo{
    
    
    private int cargaHoraria;
    
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    //COSNTRUTOR
    public Curso() {
    }
    
    
//GET/SETS
  
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
    }


    
    
}
