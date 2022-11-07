package oneDigitalInovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @author jhon-lenon
 */
public class SingletonLazyHolder {
	
	private static class InstaceHolder{
	public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstacia() {
		return InstaceHolder.instancia;
	}

}
