package ESIIIBuilderVeichle.view;

import ESIIIBuilderVeichle.controller.MovimentacaoVeiculosController;
import ESIIIBuilderVeichle.model.TipoVeiculo;
import ESIIIBuilderVeichle.model.Veiculo;
import ESIIIBuilderVeichle.model.VeiculoBuilder;

public class Principal {
    public static void main(String[] args) {
        MovimentacaoVeiculosController mvc = new MovimentacaoVeiculosController();

        // Veiculo automovel = VeiculoBuilder.builder()
        // .addVeiculo(
        // TipoVeiculo.AUTOMOVEL,
        // "CCO5390",
        // "Ford",
        // "Fiesta",
        // "Preto",
        // 160)
        // .addPortas(5)
        // .get();

        Veiculo caminhao = VeiculoBuilder.builder()
                .addVeiculo(
                        TipoVeiculo.CAMINHAO,
                        "LCM0001",
                        "SCANIA",
                        "R450",
                        "Azul",
                        160)
                .addEixos(9)
                .addCargaMaxima(13600)
                .get();

        // Veiculo moto = VeiculoBuilder.builder()
        // .addVeiculo(
        // TipoVeiculo.MOTOCICLETA,
        // "GAT1515",
        // "HONDA",
        // "CG150",
        // "Vermelha",
        // 130)
        // .addCilindradas(150)
        // .get();

        // Veiculo van = VeiculoBuilder.builder()
        // .addVeiculo(
        // TipoVeiculo.VAN,
        // "EMA1012",
        // "Mercedes Benz",
        // "Sprinter",
        // "Branca",
        // 140)
        // .addPassageiros(12)
        // .addParadas(12)
        // .get();

        mvc.inicioMovimentacao(caminhao);
        mvc.movimentacaoVeiculo();
    }
}