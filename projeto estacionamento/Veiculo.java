
public abstract class Veiculo{
    public String cor;
    public String modelo;

    public abstract void acelerar();

    public void darPartida(){
        System.out.println("Colocar a chave na ignição");
        System.out.println("Virar a chave");
        System.out.println("Acionar motor de arranque");
        this.acelerar();
    }

    public abstract void engatarRe();
}
