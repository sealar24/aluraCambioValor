public class CambioDivisas {
    String monedaBase;
    String monedaCambio;
    double tipoDeCambio;
    double cambioResultante;

    public CambioDivisas(CambioBase cambioBase){
        this.monedaBase = cambioBase.base_code();
        this.monedaCambio = cambioBase.target_code();
        this.tipoDeCambio = cambioBase.conversion_rate();
        this.cambioResultante = cambioBase.conversion_result();
    }

    @Override
    public String toString() {
        return "moneda Base= " + "["+ monedaBase + "]" + " | moneda Cambio= " + "[" + monedaCambio + "]" +
                " | tipo de Cambio 1 "+monedaBase+" = " + tipoDeCambio +
                " | Total convertido= " +cambioResultante;

    }

}
