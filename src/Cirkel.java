public class Cirkel {
    double radius;

    public Cirkel(double radius){
        this.radius = radius;
    }

    public double beregnAreal(){
        //Areal af cirkel er A = pi * r^2
        return (Math.PI * Math.pow(radius, 2));
    }
}
