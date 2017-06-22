package org.eumetsat.usd.gcp.shared.action;

import java.util.List;
import java.util.Map;

import com.gwtplatform.dispatch.rpc.shared.Result;

/**
 * Prepare Data Action Result. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class PrepareDataResult implements Result
{
    /** Auto-generated serial version UID. */
    private static final long serialVersionUID = -407694605800244123L;
    
    /** Datasets names. */
    private List<String> datasetsNames;
    
    /** Download links. */
    private Map<String, String> downloadLinks;

    /**
     * Constructor (for serialisation only).
     */
    @SuppressWarnings("unused")
    private PrepareDataResult()
    {
        // For serialisation only
    }

    /**
     * Constructor.
     * 
     * @param datasetsNames
     *            datasets names.
     * @param downloadLinks
     *            download links.
     */
    public PrepareDataResult(final List<String> datasetsNames, final Map<String, String> downloadLinks)
    {
        this.datasetsNames = datasetsNames;
        this.downloadLinks = downloadLinks;
    }

    /**
     * Get datasets names.
     * 
     * @return datasets names.
     */
    public final List<String> getDatasetsNames()
    {
        return datasetsNames;
    }

    /**
     * Get download links.
     * 
     * @return download links.
     */
    public final Map<String, String> getDownloadLinks()
    {
        return downloadLinks;
    }
}
