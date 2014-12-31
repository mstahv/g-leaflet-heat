package org.peimari.gleaflet.heat.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.peimari.gleaflet.client.ILayer;
import org.peimari.gleaflet.client.LatLng;

public class HeatMapLayer extends JavaScriptObject implements ILayer {

	protected HeatMapLayer() {
	}

	public static final native HeatMapLayer create(JsArray<LatLng> latlngs, JavaScriptObject options) 
	/*-{
		return $wnd.L.heatLayer(latlngs, options);
	}-*/;

}
