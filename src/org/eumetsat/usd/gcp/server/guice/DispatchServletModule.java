package org.eumetsat.usd.gcp.server.guice;

import org.eumetsat.usd.gcp.server.FileDownloadServlet;
import org.eumetsat.usd.gcp.server.GWTCacheControlFilter;
import org.eumetsat.usd.gcp.server.GWTGzipFilter;
import org.eumetsat.usd.gcp.server.ManifestServlet;
import org.eumetsat.usd.gcp.shared.util.Constants;

import com.google.inject.servlet.ServletModule;
import com.gwtplatform.dispatch.rpc.server.guice.DispatchServiceImpl;
import com.gwtplatform.dispatch.rpc.shared.ActionImpl;

/**
 * Dispatch Servlet Module. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class DispatchServletModule extends ServletModule
{
    @Override
    public final void configureServlets()
    {
        serve("/" + ActionImpl.DEFAULT_SERVICE_NAME + "*").with(DispatchServiceImpl.class);
        serve("/" + Constants.SERVER_FILES_PATH + "/*").with(FileDownloadServlet.class);

        serve("/plotter.appcache").with(ManifestServlet.class);

        // Properly set HTTP headers to tell the browser when to cache a static resource.
        filter("/*").through(GWTCacheControlFilter.class);

        // Properly set HTTP headers when a gzipped version of a requested file is available.
        filter("/*").through(GWTGzipFilter.class);
    }
}
