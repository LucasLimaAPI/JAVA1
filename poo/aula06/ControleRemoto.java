package poo.aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigando() {
        return ligando;
    }

    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
      setLigando(true);
    }

    @Override
    public void desligar() {
        setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(isLigando());
        System.out.println(getVolume());
        for(int i = 0; i == getVolume()%2;i++){
            System.out.println("|");
        }
        System.out.println(isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if(isLigando()){
            setVolume(getVolume()+ 1);
        }
    }

    @Override
    public void menosVolume() {
        if(isLigando()){
            setVolume(getVolume()- 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(isLigando() && getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desliMudo() {
        if(isLigando() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigando() != isTocando() ){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigando() && isTocando() ){
            setTocando(false);
        }
    }
    
    

}
