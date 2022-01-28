package desafio_poo.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import desafio_poo.BootCamp;

public class Devs {
    private String nome;
    private Set<Conteudo> conteudosIscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp(BootCamp bootCamp){
        this.conteudosIscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIscritos.remove(conteudo.get());
        }else{
            System.err.println("Voce não está matriculado em nenhum conteudo!!");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream()
        .mapToDouble(Conteudo :: calcularXP)
        .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIscritos() {
        return conteudosIscritos;
    }

    public void setConteudosIscritos(Set<Conteudo> conteudosIscritos) {
        this.conteudosIscritos = conteudosIscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        result = prime * result + ((conteudosIscritos == null) ? 0 : conteudosIscritos.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Devs other = (Devs) obj;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        if (conteudosIscritos == null) {
            if (other.conteudosIscritos != null)
                return false;
        } else if (!conteudosIscritos.equals(other.conteudosIscritos))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    

    

}
