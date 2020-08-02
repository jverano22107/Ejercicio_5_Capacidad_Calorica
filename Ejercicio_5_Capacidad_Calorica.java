
import java.util.Scanner;

// Kilómetros por galón(US) = mpg*1.609344
public class Ejercicio_5_Capacidad_Calorica
    {
        public static void main(String[] args)
        {
        double Masa,Capacidad_calorica,Temp1,Temp2,Energia,DeltaT;
        Temp1 = 0;
        Capacidad_calorica = 1 ;/// Aplica solo para agua
        Scanner Tecl = new Scanner(System.in);
        System.out.println("Calculo de cantidad de energia requerida para llevar el agua de 0°C a la temperatura deseada");
        System.out.print("Masa del agua en gramos = ");
        Masa = Tecl.nextDouble();
        System.out.print("Temperatura deseada en °C = ");
        Temp2 = Tecl.nextDouble();
        DeltaT= Math.abs(Temp1-Temp2);
        Energia = Masa * Capacidad_calorica * DeltaT;
        System.out.println("El total de energia requerida para llevar "+Masa+" gramos de agua de 0°C a " + Temp2+ " °C es = "+ Energia);
        
    }
    }
