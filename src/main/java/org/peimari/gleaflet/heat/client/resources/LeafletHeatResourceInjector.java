package org.peimari.gleaflet.heat.client.resources;

import com.google.gwt.core.client.GWT;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

public class LeafletHeatResourceInjector {

	protected static LeafletHeatClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(LeafletHeatClientBundle.class);
			LeafletHeatResourceInjector injector = GWT
					.create(LeafletHeatResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		injectScript(bundle.heatScript().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
