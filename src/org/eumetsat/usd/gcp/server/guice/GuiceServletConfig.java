package org.eumetsat.usd.gcp.server.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Guice Servlet Configuration. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class GuiceServletConfig extends GuiceServletContextListener
{
    @Override
    protected final Injector getInjector()
    {
        return Guice.createInjector(new ServerModule(), new DispatchServletModule(), new GuiceModule());
    }
}
