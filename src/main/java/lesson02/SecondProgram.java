package lesson02;

public class SecondProgram {

    public static void main(String[] args) {
        int massa = 7;
        //System.out.println(kineticEnergy(massa));
        System.out.print("Значение энергии равно " + kineticEnergy(massa));
    }

    private static long kineticEnergy(int massa) {

        return massa * 299792458;

    }
}
