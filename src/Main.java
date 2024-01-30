public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        conta1.depositar(5000);
        conta1.sacar(500);
        System.out.println("Cobrar Tarifa mensal: " + conta1.cobrarTarifaMensal(conta1.consultarSaldo()));


    }
}