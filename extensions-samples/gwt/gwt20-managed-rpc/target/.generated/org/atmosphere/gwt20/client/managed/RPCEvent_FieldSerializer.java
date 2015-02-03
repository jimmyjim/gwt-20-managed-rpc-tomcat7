package org.atmosphere.gwt20.client.managed;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RPCEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getMessage(org.atmosphere.gwt20.client.managed.RPCEvent instance) /*-{
    return instance.@org.atmosphere.gwt20.client.managed.RPCEvent::message;
  }-*/;
  
  private static native void setMessage(org.atmosphere.gwt20.client.managed.RPCEvent instance, java.lang.String value) 
  /*-{
    instance.@org.atmosphere.gwt20.client.managed.RPCEvent::message = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.atmosphere.gwt20.client.managed.RPCEvent instance) throws SerializationException {
    setMessage(instance, streamReader.readString());
    
  }
  
  public static org.atmosphere.gwt20.client.managed.RPCEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.atmosphere.gwt20.client.managed.RPCEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.atmosphere.gwt20.client.managed.RPCEvent instance) throws SerializationException {
    streamWriter.writeString(getMessage(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.atmosphere.gwt20.client.managed.RPCEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.atmosphere.gwt20.client.managed.RPCEvent_FieldSerializer.deserialize(reader, (org.atmosphere.gwt20.client.managed.RPCEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.atmosphere.gwt20.client.managed.RPCEvent_FieldSerializer.serialize(writer, (org.atmosphere.gwt20.client.managed.RPCEvent)object);
  }
  
}
