public abstract class Manobrista{
    public string nome;
    public Documento habilitacao;

    public void estacionar(Veiculo veiculo, Vaga vaga){
        if(this.estaHabilitado(veiculo) && this.possoEstacionar(veiculo, vaga)){
            veiculo.darPartida();
            veiculo.engatarRe();
            veiculo.acelerar();
        }
    }

    public abstract boolean possoEstacionar(Veiculo veiculo, Estacionamento estacionamento);
    public abstract boolean estaHabilitado(Veiculo veiculo);
}
