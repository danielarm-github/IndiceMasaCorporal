import java.util.Scanner;

public class MasaCorporal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dijite un peso (kg) ");
        double kg = entrada.nextDouble();
        System.out.println("Digite una altura (m)");
        double metros = entrada.nextDouble();
        
        double indice = kg / (metros * metros);
       
        if(indice < 18.5){
            System.out.println("Bajo peso.");
        }else if(indice >= 18.5 && indice <= 24.9){
            System.out.println("Peso normal.");  
        }else if(indice >= 25 && indice <= 29.9){
            System.out.println("Pre-obesidad.");  
        }else if(indice >= 30 && indice <= 34.9){
            System.out.println("Obesidad clase 1.");  
        }else if(indice >= 35 && indice <= 39.9){
            System.out.println("Obesidad clase 2.");  
        }else if(indice >= 40){
            System.out.println("Obesidad clase 3.");  
        }        
    }
    
}
