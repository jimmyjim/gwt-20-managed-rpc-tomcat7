package comet;

import com.google.gwt.user.client.rpc.impl.Serializer;
import com.google.gwt.user.client.rpc.SerializationException;
import java.io.Serializable;

public class org_atmosphere_gwt20_client_managed_RPCSerializerImpl extends org.atmosphere.gwt20.client.managed.RPCSerializer {
  private Serializer SERIALIZER = new comet.org_atmosphere_gwt20_client_managed_RPCSerializer();protected Serializer getRPCSerializer() {return SERIALIZER;}}
