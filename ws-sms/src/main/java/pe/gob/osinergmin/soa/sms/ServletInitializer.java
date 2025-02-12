package pe.gob.osinergmin.soa.sms;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	/*
	 * @Override public void onStartup(ServletContext servletContext) throws
	 * ServletException { servletContext.setInitParameter("contextConfigLocation",
	 * "<NONE>"); }
	 */

}
