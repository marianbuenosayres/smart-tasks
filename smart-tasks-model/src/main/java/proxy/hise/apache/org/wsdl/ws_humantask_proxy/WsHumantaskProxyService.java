
/*
 * 
 */

package proxy.hise.apache.org.wsdl.ws_humantask_proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.9
 * Mon Feb 07 20:30:44 ART 2011
 * Generated source version: 2.2.9
 * 
 */


@WebServiceClient(name = "ws-humantask-proxyService", 
                  wsdlLocation = "file:/home/esteban/plugTree/smart-tasks/smart-tasks-model/src/main/resources/wsdl/ws-humantask-proxy.wsdl",
                  targetNamespace = "http://org.apache.hise.proxy/wsdl/ws-humantask-proxy") 
public class WsHumantaskProxyService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://org.apache.hise.proxy/wsdl/ws-humantask-proxy", "ws-humantask-proxyService");
    public final static QName WsHumantaskProxyPort = new QName("http://org.apache.hise.proxy/wsdl/ws-humantask-proxy", "ws-humantask-proxyPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/esteban/plugTree/smart-tasks/smart-tasks-model/src/main/resources/wsdl/ws-humantask-proxy.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/home/esteban/plugTree/smart-tasks/smart-tasks-model/src/main/resources/wsdl/ws-humantask-proxy.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public WsHumantaskProxyService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsHumantaskProxyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsHumantaskProxyService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns WsHumantaskProxyPortType
     */
    @WebEndpoint(name = "ws-humantask-proxyPort")
    public WsHumantaskProxyPortType getWsHumantaskProxyPort() {
        return super.getPort(WsHumantaskProxyPort, WsHumantaskProxyPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsHumantaskProxyPortType
     */
    @WebEndpoint(name = "ws-humantask-proxyPort")
    public WsHumantaskProxyPortType getWsHumantaskProxyPort(WebServiceFeature... features) {
        return super.getPort(WsHumantaskProxyPort, WsHumantaskProxyPortType.class, features);
    }

}
