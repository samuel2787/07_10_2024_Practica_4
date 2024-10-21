//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil(); // el constructor asigna una parte de espacio
        // se utiliza el set para asignar valores a los atributos de las clases cuando estan en private
        bmw.setMarca("BMW") ;
        bmw.setModelo("I320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3.2f);


        System.out.println("bmw.getMarca() = " + bmw.getMarca()); // es la forma de llamar a el atributo

        System.out.println("bmw.verDetalle() =" + bmw.verDetalle());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.fre = " + bmw.frenar(80));
        System.out.println("bmw.capacidad(40,0.7f) = " + bmw.capacidad(40,0.7f));
        System.out.println("bmw.capacidad(40,70) = " + bmw.capacidad(40,70f));

}
}