import java.util.Scanner;   

public class Fatorial{
    public int calc (int fatorial){
        int resultado = fatorial;

        if(fatorial==0 || fatorial==1){
            return 1;            
        }
        if(fatorial<0){
            System.out.println("não existe fatorial de numero negativo");
        }        
        else if(fatorial >1){
                for(int i=fatorial-1;i>1;i--){
                    resultado=resultado*i;
            }
        }       

        return resultado;
    }

    public static void main(String[] args) {        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para calculo do fatorial: ");
        int numero=teclado.nextInt();        
        
        Fatorial ex = new Fatorial();
        int resultado = ex.calc(numero);
        
        System.out.println(numero + "! = " + resultado);
        }
    }

