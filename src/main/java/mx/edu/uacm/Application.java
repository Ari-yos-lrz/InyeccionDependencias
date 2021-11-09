package mx.edu.uacm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static final Logger log = LogManager.getLogger(Application.class);
	public static void main(String[] args) {
		/*Sin uso de spring
		Ninja ninja = new Ninja();
		//inyeccion de dependecias
		 *agregacion 
		 *ninja.setArma(new Chacos());
		 *
		 *
		 *inyeccion de dependecias
		 *agregacion
		 *ninja.setMision("pasr nivel uno");
		 *
		 *utilizamos spring para inyectar las dependencias
		*/
		
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("/context.xml");
		Ninja ninja =(Ninja) contenedor.getBean("ninja");
		log.debug("arma del ninja:"+ ninja.getArma());
		
	}
}
