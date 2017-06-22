package org.eumetsat.usd.gcp.shared.action;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;

/**
 * Get Versions Action Input. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class GetVersions extends UnsecuredActionImpl<GetVersionsResult>
{
    /** Catalog. */
    private String catalog;
    /** GPRC. */
    private String gprc;
    /** Correction Type. */
    private String corrType;
    /** Sat/instr. */
    private String satInstr;
    /** Reference sat/instr. */
    private String refSatInstr;
    /** Mode. */
    private String mode;
    /** Year. */
    private String year;
    /** Date. */
    private String date;

    /**
     * Constructor (for serialisation only).
     */
    @SuppressWarnings("unused")
    private GetVersions()
    {
        // For serialisation only
    }

    /**
     * Constructor.
     * 
     * @param catalog
     *            catalog.
     * @param gprc
     *            GPRC.
     * @param corrType
     *            correction type.
     * @param satInstr
     *            sat/instr.
     * @param refSatInstr
     *            reference sat/instr.
     * @param mode
     *            mode.
     * @param year
     *            year.
     * @param date
     *            date.
     */
    public GetVersions(final String catalog, final String gprc, final String corrType, final String satInstr,
            final String refSatInstr, final String mode, final String year, final String date)
    {
        this.catalog = catalog;
        this.gprc = gprc;
        this.corrType = corrType;
        this.satInstr = satInstr;
        this.refSatInstr = refSatInstr;
        this.mode = mode;
        this.year = year;
        this.date = date;
    }

    /**
     * Get catalog.
     * 
     * @return catalog.
     */
    public final String getCatalog()
    {
        return catalog;
    }

    /**
     * Get GPRC.
     * 
     * @return GPRC.
     */
    public final String getGPRC()
    {
        return gprc;
    }

    /**
     * Get correction type.
     * 
     * @return correction type.
     */
    public final String getCorrType()
    {
        return corrType;
    }

    /**
     * Get sat/instr.
     * 
     * @return sat/instr.
     */
    public final String getSatInstr()
    {
        return satInstr;
    }

    /**
     * Get reference sat/instr.
     * 
     * @return reference sat/instr.
     */
    public final String getRefSatInstr()
    {
        return refSatInstr;
    }

    /**
     * Get mode.
     * 
     * @return mode.
     */
    public final String getMode()
    {
        return mode;
    }

    /**
     * Get year.
     * 
     * @return year.
     */
    public final String getYear()
    {
        return year;
    }

    /**
     * Get date.
     * 
     * @return date.
     */
    public final String getDate()
    {
        return date;
    }
}
