public class CuentaSueldo extends CuentaBancaria{

    @Override
    public void extraer(Double unaCantidad) {
        if (unaCantidad <= this.getSaldo() && unaCantidad > 0) {
            this.setSaldo(this.getSaldo() - unaCantidad);
        }
    }
}
