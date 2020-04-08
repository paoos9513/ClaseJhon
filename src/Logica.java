public class Logica {

        Vehiculo carro;
        Vehiculo moto;
        public Logica () {
            this.carro = new Vehiculo(4,2,"Carro","Gris");
            this.moto = new Vehiculo(2, 0, "Moto", "Negro");
            this.show();
        }

        public void show () {
            System.out.println(this.carro.isProhibido());
            System.out.println(this.moto.isProhibido());
        }
}
