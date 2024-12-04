public class CuentaBancaria {

    private static float saldoInicial = 1500f;
    public static void main(String[] args) {

        try {
            retirar(1000f);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error al retirar" + e.getMessage());
        }
    }

    public static float retirar(float retiro) throws SaldoInsuficienteException {
        float saldo = saldoInicial;
        if(retiro > saldoInicial){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }else{
            saldo = saldoInicial - retiro;
            System.out.println("Retiro realizado");
        }
        return saldo;
    }
}