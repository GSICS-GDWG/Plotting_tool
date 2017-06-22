package org.eumetsat.usd.gcp.shared.action;

import com.gwtplatform.dispatch.rpc.shared.Result;

/**
 * Register Action Result. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class RegisterResult implements Result
{
    /** Auto-generated serial version UID. */
    private static final long serialVersionUID = 7731867712680074762L;

    /** Flag if user existed already. */
    private boolean userExistedAlready;

    /**
     * Constructor (for serialization only).
     */
    @SuppressWarnings("unused")
    private RegisterResult()
    {
        // For serialization only
    }

    /**
     * Constructor.
     * 
     * @param userExistedAlready
     *            <code>true</code> if user existed already.
     */
    public RegisterResult(final boolean userExistedAlready)
    {
        this.userExistedAlready = userExistedAlready;
    }

    /**
     * Check if user existed already.
     * 
     * @return <code>true</code> if user existed already.
     */
    public final boolean userExistedAlready()
    {
        return userExistedAlready;
    }
}
