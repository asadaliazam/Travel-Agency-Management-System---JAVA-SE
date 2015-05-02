/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

/**
 *
 * @author Asad
 */
public class Singleton
{
    
	private static Singleton instance;
	public Singleton()
	{
		
	}

	public static Singleton getInstance()
	{
		if (instance == null)
                {
			instance = new Singleton();
                }

		return instance;
	}
	
	
}
    

