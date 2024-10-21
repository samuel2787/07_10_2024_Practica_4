

public class Automovil {
    // declaracion de atributos, todos deben ser private   los atributos tambien pueden ser llamados estados
    private String marca;
    private String modelo;
    private String color = "verde";
    private float cilindraje;
    private float consumo = 40 ;

    // Cosntructores

    // Getter y los Setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*public void leerMarca(String marca){
        this.marca = marca;
    }

    public void escribirMarca(String marca) {
        this.marca = marca ;
    }*/





    public String verDetalle(){
        String dv = "La marca es ->" + this.marca+ "\n" +
        "El modelo es ->" + this.modelo + "\n" +
        "El color es ->" + this.color +"\n" +
        "El cilindraje es ->" + this.cilindraje;
        return dv;
    }

    public String acelerar(){
        return "El auto marca:"+ this.marca + "\tEsta acelerando";
    }
    public String frenar(int kmph){
        return "El auto maodelo:"+ this.modelo + "\tEsta frenando a ->" + kmph;
    }
    public float capacidad(int cap, float porConsumo){
        float cm = consumo / (cap*porConsumo);
        return cm;
    }
    public float capacidad(int cap, int porConsumo){ // esto es una sobre carga de metodos ya que usa ell mismo nombre pero con diferentes parametros de recepcion, esto es un plimorfismo
        float cm = consumo / (cap*(porConsumo/100));
        return cm;
    }

}
