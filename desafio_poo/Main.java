package desafio_poo;

import java.time.LocalDate;

import desafio_poo.dominio.Curso;
import desafio_poo.dominio.Devs;
import desafio_poo.dominio.Mentoria;

public class Main {
public static void main(String[] args) {
  
    Curso curso1= new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2= new Curso();
    curso2.setTitulo("curso javascript");
    curso2.setDescricao("descrição curso javascript");
    curso2.setCargaHoraria(10);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    // System.out.println(curso1);
    // System.out.println(curso2);
    // System.out.println(mentoria);


    BootCamp bootCamp = new BootCamp();
    bootCamp.setNome("Boot Java Developer");
    bootCamp.setDescricao("Aprenda Java da melhor maneira!");
    bootCamp.getConteudos().add(curso1);
    bootCamp.getConteudos().add(curso2);
    bootCamp.getConteudos().add(mentoria);

    Devs devLucas = new Devs();
    devLucas.setNome("Lucas");
    devLucas.inscreverBootcamp(bootCamp);
    System.out.println("Conteúdos Inscritos Lucas"+ devLucas.getConteudosIscritos());

    devLucas.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Lucas"+ devLucas.getConteudosIscritos());
    System.out.println("Conteúdos Concluidos Lucas"+ devLucas.getConteudosConcluidos());
    System.out.println("XP:" + devLucas.calcularTotalXp());

    System.out.println("-------");

    Devs devErick = new Devs();
    devErick.setNome("Erick");
    devLucas.inscreverBootcamp(bootCamp);
    System.out.println("Conteúdos Inscritos Erick"+ devErick.getConteudosIscritos());
    devErick.progredir();
    System.out.println("-");
    
    System.out.println("Conteúdos Inscritos Erick"+ devErick.getConteudosIscritos());
    System.out.println("Conteúdos Concluidos Erick"+ devErick.getConteudosConcluidos());
    System.out.println("XP:" + devLucas.calcularTotalXp());

}
    
}
