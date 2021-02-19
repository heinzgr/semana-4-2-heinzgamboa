/**
 * 
 */
package ucreativa.com;

/**
 * @author hp corei5
 *
 */
public interface Actor {
	public static String nombreArtistico = "Rebeca";
	public static int anniosExperiencia = 6;
	public static String tipo = "Principal";
	
	abstract void actuar();
	
	abstract void divertir();
	
	abstract void desaparecer();
	
	static String identificador() {
		return "Yo soy actor";
	}
	
	@Override
	String toString();
	
	void finalize() throws Throwable;
	
}
