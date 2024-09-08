public abstract class CuentaBancaria {

    private Double saldo = 0.0;

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double newSaldo) {
        this.saldo = newSaldo;
    }

    public void depositar(Double unaCantidad) {
        if (unaCantidad > 0) {
            this.saldo += unaCantidad;
        }
    }

    public abstract void extraer(Double unaCantidad);
}
