public class CajaDeAhorro extends CuentaBancaria {

    private Integer counter=0;
    private final Integer counterLimit=4;
    private final Integer aditional=6;

    @Override
    public void extraer(Double unaCantidad) {
        if (unaCantidad <= this.getSaldo() && unaCantidad > 0 && this.counter <= counterLimit) {
            this.setSaldo(getSaldo() - unaCantidad);
            this.counter++;
        } else if (unaCantidad + aditional <= this.getSaldo() && unaCantidad > 0 && this.counter > counterLimit) {
            this.setSaldo (getSaldo() - (unaCantidad + aditional));
            this.counter++;
        }
    }
}
