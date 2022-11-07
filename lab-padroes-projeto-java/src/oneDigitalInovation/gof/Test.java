package oneDigitalInovation.gof;

import oneDigitalInovation.gof.Facade.Facade;
import oneDigitalInovation.gof.singleton.SingletonEager;
import oneDigitalInovation.gof.singleton.SingletonLazy;
import oneDigitalInovation.gof.singleton.SingletonLazyHolder;
import oneDigitalInovation.gof.strategy.ComportamentoAgresivo;
import oneDigitalInovation.gof.strategy.ComportamentoDefensivo;
import oneDigitalInovation.gof.strategy.ComportamentoNormal;
import oneDigitalInovation.gof.strategy.Robo;

public class Test {
	public static void main(String[] args) {		
		// Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstacia();
		System.out.println(eager);
		eager = SingletonEager.getInstacia();
		System.out.println(eager);
	
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstacia();
		System.out.println(lazyHolder);
		
		// Strategy:
		
		ComportamentoDefensivo defenssivo = new ComportamentoDefensivo();
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoAgresivo agressivo = new ComportamentoAgresivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defenssivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Jhon Lenon", "14801788");
		
	}

}
