public class PrimeiroPrograma{
    public static void main(String[] args) {
        int a = 22;
        int b = 22;
        System.out.println("Olá pessoal do github essa é minha primeira experiencia no JAVA!!" +" "+ (a+b));
        livros livros = new livros();
        System.out.println(livros);


    }
}

class livros{
    private String nome;

    public livros() {
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

}


