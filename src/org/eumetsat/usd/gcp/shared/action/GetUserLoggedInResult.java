package org.eumetsat.usd.gcp.shared.action;

import com.gwtplatform.dispatch.rpc.shared.Result;

/**
 * Get User Logged In Action Result. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class GetUserLoggedInResult implements Result
{
    /** Auto-generated serial version UID. */
    private static final long serialVersionUID = 2197797359842694865L;
    
    /** Username. */
    private String username;

    /**
     * Constructor (for serialisation only).
     */
    @SuppressWarnings("unused")
    private GetUserLoggedInResult()
    {
        // For serialisation only
    }

    /**
     * Constructor.
     * 
     * @param username
     *            username.
     */
    public GetUserLoggedInResult(final String username)
    {
        this.username = username;
    }

    /**
     * Get username.
     * 
     * @return username.
     */
    public final String getUsername()
    {
        return username;
    }
}
