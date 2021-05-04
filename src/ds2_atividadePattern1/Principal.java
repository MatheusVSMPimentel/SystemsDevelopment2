/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_atividadePattern1;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Principal {

    //Tem-se um Xbox2 mas deseja-se usar um controle ps2:
        
    
    
    public static void main(String[] args) {
        Kg quilos = new Kg();
        Gramas gramas = new Gramas();
        KgAdapterGramas adptator  = new KgAdapterGramas(gramas);
        
        Scanner scanner = new Scanner(System.in);
        float kgs = scanner.nextFloat();
        float kiloGrama = adptator.quilos(kgs);
        System.out.println(kiloGrama);
        
    }
    
    //Conecta-se o controle ao adapter
    
}
