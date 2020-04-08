public class Vehiculo {

    private int llantas;
    private int puertas;
    private String marca;
    private String color;
    private boolean prohibido;

    public Vehiculo(int llantas, int puertas, String marca, String color) {
        this.llantas = llantas;
        this.puertas = puertas;
        this.marca = marca;
        this.color = color;
        this.checkSiEsProhibido();
    }

    private void checkSiEsProhibido () {
        if (this.llantas > 3) {
            this.prohibido = true;
        } else {
            this.prohibido = false;
        }
    }

    public boolean isProhibido() {
        return prohibido;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
        this.checkSiEsProhibido();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}