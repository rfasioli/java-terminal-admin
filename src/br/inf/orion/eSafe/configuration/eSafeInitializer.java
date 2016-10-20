package br.inf.orion.eSafe.configuration;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class eSafeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("eSafeInitializer::getRootConfigClasses");
        return new Class[] { eSafeConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("eSafeInitializer::getServletMappings");
		return new String[] { "/" };
	}

    @Override
    protected Filter[] getServletFilters() {
        Filter [] singleton = { new CORSFilter() };
        return singleton;
    }
	
}
