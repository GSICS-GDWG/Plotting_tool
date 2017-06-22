package org.eumetsat.usd.gcp.server.action;

import org.eumetsat.usd.gcp.server.catalog.CatalogNavigator;
import org.eumetsat.usd.gcp.server.data.CalibrationDataManager;
import org.eumetsat.usd.gcp.server.guice.CatalogNavigatorFactory;
import org.eumetsat.usd.gcp.shared.action.GetStdSceneTb;
import org.eumetsat.usd.gcp.shared.action.GetStdSceneTbResult;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

/**
 * Get Std Scene Tb Action Handler. Generated by GWTP Plugin.
 * 
 * @author USD/C/PBe
 */
public class GetStdSceneTbActionHandler implements ActionHandler<GetStdSceneTb, GetStdSceneTbResult>
{
    /** Catalog Navigator Factory. */
    private CatalogNavigatorFactory catalogNavigatorFactory;

    /** Calibration Data Manager. */
    private CalibrationDataManager calibrationDataManager;

    /**
     * Constructor.
     */
    @Inject
    public GetStdSceneTbActionHandler(final CatalogNavigatorFactory catalogNavigatorFactory,
            final CalibrationDataManager calibrationDataManager)
    {
        this.catalogNavigatorFactory = catalogNavigatorFactory;
        this.calibrationDataManager = calibrationDataManager;
    }

    @Override
    public final GetStdSceneTbResult execute(final GetStdSceneTb action, final ExecutionContext context)
            throws ActionException
    {
        // Get corresponding catalog navigator.
        CatalogNavigator catalogNavigator = catalogNavigatorFactory.create(action.getCatalog());

        // Get url pointing to NetCDF file.
        String datasetURL = catalogNavigator.getDatasetURL(action.getGPRC(), action.getCorrType(),
                action.getSatInstr(), action.getRefSatInstr(), action.getMode(), action.getYear(), action.getDate(),
                action.getVersion());

        return new GetStdSceneTbResult(calibrationDataManager.stdSceneTbFrom(datasetURL, action.getChannel()));
    }

    @Override
    public final void undo(final GetStdSceneTb action, final GetStdSceneTbResult result, final ExecutionContext context)
            throws ActionException
    {
    }

    @Override
    public final Class<GetStdSceneTb> getActionType()
    {
        return GetStdSceneTb.class;
    }
}
