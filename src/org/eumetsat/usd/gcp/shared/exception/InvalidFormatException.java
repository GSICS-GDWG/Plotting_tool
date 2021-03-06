package org.eumetsat.usd.gcp.shared.exception;

import com.gwtplatform.dispatch.shared.ActionException;

/**
 * Signals a format which is not compliant with WMO conventions.
 * 
 * @author USD/C/PBe
 */
public class InvalidFormatException extends ActionException
{
    /** Automatically generated. */
    private static final long serialVersionUID = -7687813155725582138L;

    /**
     * Constructs an {@code InvalidFormatException} with {@code null} as its error detail message.
     */
    public InvalidFormatException()
    {
        super();
    }
    
    /**
     * Constructor.
     * 
     * @param msg
     *            Exception message.
     */
    public InvalidFormatException(final String msg)
    {
        super(msg);
    }

    /**
     * Constructor.
     * 
     * @param msg
     *            Exception message.
     * @param t
     *            Throwable object.
     */
    public InvalidFormatException(final String msg, final Throwable t)
    {
        super(msg, t);
    }

}
