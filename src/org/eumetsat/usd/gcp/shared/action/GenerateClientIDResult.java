package org.eumetsat.usd.gcp.shared.action;

import com.gwtplatform.dispatch.rpc.shared.Result;

/**
 * Generate Client ID Action Result. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class GenerateClientIDResult implements Result
{
    /** Auto-generated serial version UID. */
    private static final long serialVersionUID = 4243547014241195606L;
    
    /** User id. */
    private String userID;

    /**
     * Constructor (for serialisation only).
     */
    @SuppressWarnings("unused")
    private GenerateClientIDResult()
    {
        // For serialisation only
    }

    /**
     * Constructor.
     * 
     * @param userID
     *            user id.
     */
    public GenerateClientIDResult(final String userID)
    {
        this.userID = userID;
    }

    /**
     * Get user id.
     * 
     * @return user id.
     */
    public final String getUserID()
    {
        return userID;
    }
}
