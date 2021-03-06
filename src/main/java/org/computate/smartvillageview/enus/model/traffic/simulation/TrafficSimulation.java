package org.computate.smartvillageview.enus.model.traffic.simulation;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.smartvillageview.enus.model.base.BaseModel;

/**
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * Map.Integer.sqlSort: 3
 * 
 * ApiTag.enUS: Traffic Simulation
 * ApiUri.enUS: /api/traffic-simulation
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * ApiContentTypeRequestPUTImport: application/xml
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: TrafficSimulationPage
 * PageSuperSearchPage.enUS: BaseModelPage
 * ApiUriSearchPage.enUS: /traffic-simulation
 * 
 * ApiMethod.enUS: MapSearchPage
 * PageMapSearchPage.enUS: TrafficSimulationMapPage
 * PageSuperMapSearchPage.enUS: BaseModelPage
 * ApiUriMapSearchPage.enUS: /traffic-simulation-map
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a traffic simulation
 * Color: blue
 * IconGroup: duotone
 * IconName: traffic-light-stop
 * NameVar.enUS: trafficSimulation
 * Rows: 100
 */
public class TrafficSimulation extends TrafficSimulationGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: simulation name
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _simulationName(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: start seconds
	 * Description: -b, --begin TIME Defines the begin time in seconds; The simulation starts at this time
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _startSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: end seconds
	 * Description: -e, --end TIME Defines the end time in seconds; The simulation ends at this time
	 * HtmlRow: 4
	 * HtmlCell: 2
	 * Facet: true
	 */
	protected void _endSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: step seconds
	 * Description: --step-length TIME Defines the step duration in seconds
	 * HtmlRow: 4
	 * HtmlCell: 3
	 * Facet: true
	 */
	protected void _stepSeconds(Wrap<BigDecimal> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: floating car data output geo-coordinates
	 * Description: --fcd-output.geo Save the Floating Car Data using geo-coordinates (lon/lat)
	 * HtmlRow: 5
	 * HtmlCell: 1
	 * Facet: true
	 */
	protected void _fcdOutputGeo(Wrap<Boolean> w) {
		w.o(true);
	}
}
