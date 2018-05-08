public class ManobristaDeMoto extends Manobrista{
    public ManobristaDeMoto(Documento habilitacao){
        this.habilitacao = habilitacao;
    }

    public Boolean possoEstacionar(Veiculo veiculo, Estacionamento estacionamento){
    }

    public Boolean estaHabilitado(Veiculo veiculo){
        boolean veiculoEMoto = typeof(veiculo) == Moto.class;
        boolean habilitacaoValida = this.habilitacao.tipo == "A" && this.habilitacao.vencimento > DateTime.today();

        return veiculoEMoto && habilitacaoValida;
    }
}
