package org.computate.smartvillageview.enus.model.traffic.simulation.reader;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import java.lang.Object;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader">Find the class TrafficFcdReader in Solr. </a>
 * <br><br>Delete the class TrafficFcdReader in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation.reader in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project smart-village-view in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class TrafficFcdReaderGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficFcdReader.class);

	public TrafficFcdReaderGen(Vertx vertx, WorkerExecutor workerExecutor, SiteRequestEnUS siteRequest, JsonObject config) {
		super();
		setSiteRequest_(siteRequest);
		setConfig(config);
		setVertx(vertx);
		setWorkerExecutor(workerExecutor);
	}

	public TrafficFcdReaderGen() {
	}

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> w);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequestEnUS staticSetSiteRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFcdReader siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (TrafficFcdReader)this;
	}

	////////////
	// config //
	////////////

	/**	 The entity config
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject config;

	/**	<br> The entity config
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:config">Find the entity config in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _config(Wrap<JsonObject> w);

	public JsonObject getConfig() {
		return config;
	}

	public void setConfig(JsonObject config) {
		this.config = config;
	}
	@JsonIgnore
	public void setConfig(String o) {
		this.config = TrafficFcdReader.staticSetConfig(siteRequest_, o);
	}
	public static JsonObject staticSetConfig(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected TrafficFcdReader configInit() {
		Wrap<JsonObject> configWrap = new Wrap<JsonObject>().var("config");
		if(config == null) {
			_config(configWrap);
			setConfig(configWrap.o);
		}
		return (TrafficFcdReader)this;
	}

	public static JsonObject staticSearchConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrConfig(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqConfig(SiteRequestEnUS siteRequest_, String o) {
		return TrafficFcdReader.staticSearchStrConfig(siteRequest_, TrafficFcdReader.staticSearchConfig(siteRequest_, TrafficFcdReader.staticSetConfig(siteRequest_, o)));
	}

	///////////////
	// webClient //
	///////////////

	/**	 The entity webClient
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected WebClient webClient;

	/**	<br> The entity webClient
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:webClient">Find the entity webClient in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _webClient(Wrap<WebClient> w);

	public WebClient getWebClient() {
		return webClient;
	}

	public void setWebClient(WebClient webClient) {
		this.webClient = webClient;
	}
	public static WebClient staticSetWebClient(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFcdReader webClientInit() {
		Wrap<WebClient> webClientWrap = new Wrap<WebClient>().var("webClient");
		if(webClient == null) {
			_webClient(webClientWrap);
			setWebClient(webClientWrap.o);
		}
		return (TrafficFcdReader)this;
	}

	///////////
	// vertx //
	///////////

	/**	 The entity vertx
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Vertx vertx;

	/**	<br> The entity vertx
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:vertx">Find the entity vertx in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vertx(Wrap<Vertx> w);

	public Vertx getVertx() {
		return vertx;
	}

	public void setVertx(Vertx vertx) {
		this.vertx = vertx;
	}
	public static Vertx staticSetVertx(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFcdReader vertxInit() {
		Wrap<Vertx> vertxWrap = new Wrap<Vertx>().var("vertx");
		if(vertx == null) {
			_vertx(vertxWrap);
			setVertx(vertxWrap.o);
		}
		return (TrafficFcdReader)this;
	}

	////////////////////
	// workerExecutor //
	////////////////////

	/**	 The entity workerExecutor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected WorkerExecutor workerExecutor;

	/**	<br> The entity workerExecutor
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.reader.TrafficFcdReader&fq=entiteVar_enUS_indexed_string:workerExecutor">Find the entity workerExecutor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _workerExecutor(Wrap<WorkerExecutor> w);

	public WorkerExecutor getWorkerExecutor() {
		return workerExecutor;
	}

	public void setWorkerExecutor(WorkerExecutor workerExecutor) {
		this.workerExecutor = workerExecutor;
	}
	public static WorkerExecutor staticSetWorkerExecutor(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficFcdReader workerExecutorInit() {
		Wrap<WorkerExecutor> workerExecutorWrap = new Wrap<WorkerExecutor>().var("workerExecutor");
		if(workerExecutor == null) {
			_workerExecutor(workerExecutorWrap);
			setWorkerExecutor(workerExecutorWrap.o);
		}
		return (TrafficFcdReader)this;
	}
	public static final String importFcdComplete1 = "Syncing FCD files completed. ";
	public static final String importFcdComplete = importFcdComplete1;
	public static final String importFcdFail1 = "Syncing FCD files failed. ";
	public static final String importFcdFail = importFcdFail1;
	public static final String importFcdSkip1 = "Skip importing FCD files. ";
	public static final String importFcdSkip = importFcdSkip1;
	public static final String importFcdStarted1 = "Started importing FCD files. ";
	public static final String importFcdStarted = importFcdStarted1;

	public static final String importSystemEventStarted1 = "Syncing FCD record started: %s";
	public static final String importSystemEventStarted = importSystemEventStarted1;
	public static final String importSystemEventComplete1 = "Syncing FCD record completed: %s";
	public static final String importSystemEventComplete = importSystemEventComplete1;
	public static final String importSystemEventFail1 = "Syncing FCD record failed: %s";
	public static final String importSystemEventFail = importSystemEventFail1;
	public static final String importSystemEventWebSocket1 = "websocket%s";
	public static final String importSystemEventWebSocket = importSystemEventWebSocket1;

	public static final String importFcdFileListStarted1 = "Syncing FCD files started. ";
	public static final String importFcdFileListStarted = importFcdFileListStarted1;
	public static final String importFcdFileListComplete1 = "Syncing FCD files completed. ";
	public static final String importFcdFileListComplete = importFcdFileListComplete1;
	public static final String importFcdFileListSkip1 = "Syncing FCD files is disabled. ";
	public static final String importFcdFileListSkip = importFcdFileListSkip1;
	public static final String importFcdFileListFail1 = "Syncing FCD files failed. ";
	public static final String importFcdFileListFail = importFcdFileListFail1;

	public static final String importFcdFileStarted1 = "Syncing FCD file started: %s";
	public static final String importFcdFileStarted = importFcdFileStarted1;
	public static final String importFcdFileComplete1 = "Syncing FCD file completed: %s";
	public static final String importFcdFileComplete = importFcdFileComplete1;
	public static final String importFcdFileFail1 = "Syncing FCD file failed: %s";
	public static final String importFcdFileFail = importFcdFileFail1;

	public static final String importFcdHandleBodyStarted1 = "Syncing FCD record started: %s";
	public static final String importFcdHandleBodyStarted = importFcdHandleBodyStarted1;
	public static final String importFcdHandleBodyComplete1 = "Syncing FCD record completed: %s";
	public static final String importFcdHandleBodyComplete = importFcdHandleBodyComplete1;
	public static final String importFcdHandleBodyFail1 = "Syncing FCD record failed: %s";
	public static final String importFcdHandleBodyFail = importFcdHandleBodyFail1;
	public static final String importFcdHandleBodyWebSocket1 = "websocket%s";
	public static final String importFcdHandleBodyWebSocket = importFcdHandleBodyWebSocket1;

	public static final String importFcdVehicleStepStarted1 = "Syncing FCD record started: %s";
	public static final String importFcdVehicleStepStarted = importFcdVehicleStepStarted1;
	public static final String importFcdVehicleStepComplete1 = "Syncing FCD record completed: %s";
	public static final String importFcdVehicleStepComplete = importFcdVehicleStepComplete1;
	public static final String importFcdVehicleStepFail1 = "Syncing FCD record failed: %s";
	public static final String importFcdVehicleStepFail = importFcdVehicleStepFail1;
	public static final String importFcdVehicleStepWebSocket1 = "websocket%s";
	public static final String importFcdVehicleStepWebSocket = importFcdVehicleStepWebSocket1;


	//////////////
	// initDeep //
	//////////////

	public TrafficFcdReader initDeepTrafficFcdReader(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		initDeepTrafficFcdReader();
		return (TrafficFcdReader)this;
	}

	public void initDeepTrafficFcdReader() {
		initTrafficFcdReader();
	}

	public void initTrafficFcdReader() {
				siteRequest_Init();
				configInit();
				webClientInit();
				vertxInit();
				workerExecutorInit();
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepTrafficFcdReader(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficFcdReader(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficFcdReader(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficFcdReader(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainTrafficFcdReader(String var) {
		TrafficFcdReader oTrafficFcdReader = (TrafficFcdReader)this;
		switch(var) {
			case "siteRequest_":
				return oTrafficFcdReader.siteRequest_;
			case "config":
				return oTrafficFcdReader.config;
			case "webClient":
				return oTrafficFcdReader.webClient;
			case "vertx":
				return oTrafficFcdReader.vertx;
			case "workerExecutor":
				return oTrafficFcdReader.workerExecutor;
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateTrafficFcdReader(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficFcdReader(String var, Object val) {
		TrafficFcdReader oTrafficFcdReader = (TrafficFcdReader)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSetConfig(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSearchConfig(siteRequest_, (JsonObject)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSearchStrConfig(siteRequest_, (JsonObject)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficFcdReader(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficFcdReader(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "config":
			return TrafficFcdReader.staticSearchFqConfig(siteRequest_, o);
			default:
				return null;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String[] TrafficFcdReaderVals = new String[] { importFcdComplete1, importFcdFail1, importFcdSkip1, importFcdStarted1, importSystemEventStarted1, importSystemEventComplete1, importSystemEventFail1, importSystemEventWebSocket1, importFcdFileListStarted1, importFcdFileListComplete1, importFcdFileListSkip1, importFcdFileListFail1, importFcdFileStarted1, importFcdFileComplete1, importFcdFileFail1, importFcdHandleBodyStarted1, importFcdHandleBodyComplete1, importFcdHandleBodyFail1, importFcdHandleBodyWebSocket1, importFcdVehicleStepStarted1, importFcdVehicleStepComplete1, importFcdVehicleStepFail1, importFcdVehicleStepWebSocket1 };

	public static final String CLASS_SIMPLE_NAME = "TrafficFcdReader";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_config = "config";
	public static final String VAR_webClient = "webClient";
	public static final String VAR_vertx = "vertx";
	public static final String VAR_workerExecutor = "workerExecutor";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_config = "";
	public static final String DISPLAY_NAME_webClient = "";
	public static final String DISPLAY_NAME_vertx = "";
	public static final String DISPLAY_NAME_workerExecutor = "";

	public static String displayNameForClass(String var) {
		return TrafficFcdReader.displayNameTrafficFcdReader(var);
	}
	public static String displayNameTrafficFcdReader(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_config:
			return DISPLAY_NAME_config;
		case VAR_webClient:
			return DISPLAY_NAME_webClient;
		case VAR_vertx:
			return DISPLAY_NAME_vertx;
		case VAR_workerExecutor:
			return DISPLAY_NAME_workerExecutor;
		default:
			return null;
		}
	}
}
