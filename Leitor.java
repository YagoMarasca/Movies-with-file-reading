
/**
 * Os objetos da classe Leitor podem ser usados para estabelecer um diálogo 
 * com o usuário no qual fornecemos uma mensagem (o argumento String dos métodos)
 * e esperamos por uma informação. A informaçao pode ser um int, um double ou 
 * um String.
 * 
 * @author Marcos 
 * @version versao 0
 */

import java.util.Scanner;

public class Leitor
{
	/**
	 * atributos
	 */
    Scanner sc1; 	  //Lê a partir da linha de comando

    /**
     * Construtor de objetos do tipo Leitor
     */
    public Leitor()
    {
    	this.sc1 = new Scanner(System.in);
    }

    /**
     * Metodo que mostra uma mensagem e espera por um
     * valor fornecido pelo usuario, retornando esse valor como int
     * 
     * @param  mensagem   a mensagem a ser exibida
     * @return o int esperado 
     */
    public int leiaInt(String mensagem)
    {
    	// recriar objeto
    	this.sc1 = new Scanner(System.in);
    	
    	// leitura    	
    	try {
			// mostra mensagem
			System.out.println(mensagem);

			// lê do teclado
			int numero = this.sc1.nextInt();
			
			// devolve o valor lido
			return numero;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			return 0;
		}
    }

    /**
     * Metodo que mostra uma mensagem e espera por um
     * valor fornecido pelo usuario, retornando esse valor como double
     * 
     * @param  mensagem   a mensagem a ser exibida
     * @return     o double esperado 
     */
    public double leiaDouble(String mensagem)
    {
    	// recriar objeto
    	this.sc1 = new Scanner(System.in);
    	
    	// leitura
    	try {
			// mostra mensagem
			System.out.println(mensagem);
			
			// lê do teclado
			double numero = this.sc1.nextDouble();
			
			// devolve o valor lido
			return numero;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			return 0;
		}
    }

    /**
     * Metodo que mostra uma mensagem e espera por um
     * valor fornecido pelo usuario, retornando esse valor como String
     * 
     * @param  mensagem   a mensagem a ser exibida
     * @return     o String esperado 
     */
    public String leiaString(String mensagem)
    {
    	// recriar objeto
    	this.sc1 = new Scanner(System.in);
    	
    	// leitura
    	try {
			// mostra mensagem
			System.out.println(mensagem);
			
			// lê do teclado
			String valor =  sc1.nextLine();
			
			// devolve o valor lido
			return valor;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			return "";
		}
    }

}
                        