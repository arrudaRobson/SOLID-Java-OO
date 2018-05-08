public static void main(String[] args){
    estacionamentoDoZe = new Estacionamento();
    Carro subaru = new Carro();
    Moto suzuki = new Moto();

    estacionamentoDoZe.estacionar(subaru);
    estacionamentoDoZe.estacionar(suzuki);

    Manobrista manobrista;

    manobrista = new ManobristaDeMoto();
    manobrista = new ManobristaDeCarro();
}
