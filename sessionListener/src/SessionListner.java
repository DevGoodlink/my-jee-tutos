

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class sessionListner
 *
 */
@WebListener
public class SessionListner implements HttpSessionListener {
	public static int compteur=0;
    public SessionListner() {
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	compteur++;
    	System.out.println("sessionCreated, compteur = "+compteur);
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	compteur--;    
    	System.out.println("session destroyed, compteur = "+compteur);
    }
	
}
