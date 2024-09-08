public class CuentaCorriente extends CuentaBancaria{
    private Double descubierto=0.0;

    @Override
    public void extraer(Double unaCantidad) {
        if (unaCantidad <= this.getSaldo() && unaCantidad > 0){
            this.setSaldo(this.getSaldo()-unaCantidad);
        } else if (unaCantidad <= (this.getSaldo() + this.descubierto) && unaCantidad > 0) {
            this.setSaldo(this.getSaldo()-(unaCantidad + this.adicionalDelDescubierto(unaCantidad-this.getSaldo())));
        }
    }

    public void setDescubierto(Double unaCantidad) {
        this.descubierto = unaCantidad;
    }

    public Double adicionalDelDescubierto(Double unaCantidad) {
        unaCantidad = (unaCantidad * 5)/100;
        return unaCantidad;
    }

}
