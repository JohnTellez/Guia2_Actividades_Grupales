/**
 *
 * @author John Jairo Tellez, Vivian Ramirez y Juan Sebastian Forero.
 * 2018
 */

import java.util.Scanner;

public class Guia2_ProyectoGrupal {

    public static void main(String[] args) {
       
         
        Scanner teclado=new Scanner(System.in);
        
        //----------------VARIABLES---------------
        double Peso,Estatura,imc;
        
        //----------------ENTRADAS----------------
        
        System.out.println("¿Cual es su peso actual? por Ejemplo (75): ");
        Peso = teclado.nextDouble();
        System.out.println("¿Cual es su estatura? por Ejemplo (1,70): ");
        Estatura = teclado.nextDouble();
        
        //----------------CALCULO----------------
        imc = Peso / Math.pow(Estatura, 2);
        
        
        System.out.println("Resultados: \n\n");
        System.out.println("SU IMC (Indice de Masa Corporal) ES: " + Math.round(imc));
        //--------SITUACION IMC POR PERSONA-------   
        
        if ( imc < 18.5) {
            System.out.println("\nSu estado actual es: BAJO PESO\n");
            System.out.println("Observaciones: Si te encuentras en situación de bajo peso, \n"
                                + "es posible que tu ingesta no sea suficiente para cubrir tus necesidades diarias. \n"
                                + "Acude a tu especialista quién te hará un estudio y determinará tu situación. \n\n");
            System.out.println("Gracias. \n\n");
            
        } else if ( imc >= 18.5 && imc <= 24.9) {
            System.out.println("Su estado actual es: NORMAL\n");
            System.out.println("Observaciones: Si te encuentras dentro de un peso saludable. \n"
                    + " De todas formas recuerda seguir una alimentación variada y equilibrada, \n"
                    + " sin olvidar los beneficios saludables que nos aporta el ejercicio físico. \n\n");
            System.out.println("Gracias. \n\n");
            
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Su estado actual es: SOBREPESO\n");
            System.out.println("Observaciones: Si te encuentras en situación de sobrepeso, es el momento de empezar a cuidarte. \n"
                    + " El exceso de grasa, sobretodo la situada en la zona abdominal,"
                    + " está asociada al aumento del riesgo de padecer enfermedades metabólicas como la diabetes o el aumento de colesterol. \n"
                    + " Por ello es muy importante seguir una alimentación saludable potenciando el consumo cereales integrales, fruta , verduras,"
                    + " y limitar el consumo de grasas especialmente saturadas y azúcares. \n"
                    + " Así como elegir cocciones saludables como: al vapor, horno, plancha o microondas, evitando fritos y rebozados. \n"
                    + " Además de la práctica de ejercicio físico de forma regular. \n"
                    + " Puedes acudir a un nutricionista que te asesorará y guiará hasta conseguir un peso saludable. \n\n");
            System.out.println("Gracias. \n\n");
        } else {
            System.out.println("Su estado actual es: OBESIDAD\n");
            System.out.println("Observaciones: Si te encuentras en situación de obesidad"
                    + " es muy importante acudir a un especialista. \n"
                    + " Las personas que padecen obesidad presentan un alto riesgo en la aparición de enfermedades asociadas a la obesidad,"
                    + " tanto metabólicas como cardiovasculares, \n "
                    + " este riesgo se ve aumentado a medida que incrementa el IMC tal y como afirma la OMS. \n"
                    + " Está demostrado que la reducción de peso se asocia a una disminución del riesgo cardiovascular. \n\n");
            System.out.println("Gracias. \n\n");
        }
    }
 
}

