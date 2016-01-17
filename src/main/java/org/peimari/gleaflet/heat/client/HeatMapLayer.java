package org.peimari.gleaflet.heat.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.client.LatLng;

public class HeatMapLayer extends Layer {

	protected HeatMapLayer() {
	}

	public static final native HeatMapLayer create(JsArray<LatLng> latlngs, JavaScriptObject options) 
	/*-{
		return $wnd.L.heatLayer(latlngs, options);
	}-*/;

}
