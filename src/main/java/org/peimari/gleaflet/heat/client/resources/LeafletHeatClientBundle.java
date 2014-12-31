package org.peimari.gleaflet.heat.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletHeatClientBundle extends ClientBundle {
 
    @Source("leaflet-heat.js")
    @DoNotEmbed
    TextResource heatScript();

}
