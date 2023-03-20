package co.antonis.gwt.example.client.generated;

import co.antonis.generator.model.sample.PojoType;
import co.antonis.generator.model.sample.sub.PojoChild;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import java.lang.String;
import java.util.logging.Logger;

/**
 * Generated for total 1 structures 
 * 
 * @see co.antonis.generator.model.sample.sub.PojoChild [fields:23/1] 
 */
public class SerializationGWTJson_Sub {
  public static Logger log = Logger.getLogger("");

  public static PojoChild toPojoChild(String json) {
    JSONValue jsonValue = JSONParser.parseStrict(json);
    JSONObject jsonObject = jsonValue.isObject();
    
    if (jsonObject == null)  {
      return null;
    }
    PojoChild structure = new PojoChild();
    if(jsonObject.get("string")!=null) {
      structure.setString(jsonObject.get("string").isString().stringValue());
    }
    if(jsonObject.get("mapString")!=null) {
      structure.setMapString(SerializationGWTUtilities.toMapPojo_JsonV_FuncS(
          jsonObject.get("mapString"),
          (s) -> s!=null ? Integer.parseInt(s) : null,
          (s) -> s)
          );
    }
    if(jsonObject.get("stringNotSet")!=null) {
      structure.setStringNotSet(jsonObject.get("stringNotSet").isString().stringValue());
    }
    if(jsonObject.get("nameOfType")!=null) {
      structure.setPojoType(PojoType.valueOf(jsonObject.get("nameOfType").isString().stringValue()));
    }
    if(jsonObject.get("isBooleanValue")!=null) {
      structure.setBooleanValue(Boolean.parseBoolean(jsonObject.get("isBooleanValue").toString()));
    }
    if(jsonObject.get("date")!=null) {
      structure.setDate(SerializationGWTUtilities.toDateFromV(jsonObject.get("date")/*.isString().stringValue()*/));
    }
    if(jsonObject.get("listString")!=null) {
      structure.setListString(SerializationGWTUtilities.toListPojo_JsonV_FuncS(
          jsonObject.get("listString"),
          (s) -> s)
          );
    }
    if(jsonObject.get("listDouble")!=null) {
      structure.setListDouble(SerializationGWTUtilities.toListPojo_JsonV_FuncS(
          jsonObject.get("listDouble"),
          (s) -> s!=null ? Double.parseDouble(s) : null)
          );
    }
    if(jsonObject.get("listLong")!=null) {
      structure.setListLong(SerializationGWTUtilities.toListPojo_JsonV_FuncS(
          jsonObject.get("listLong"),
          (s) -> s!=null ?Long.parseLong(s) : null)
          );
    }
    if(jsonObject.get("listMapChild")!=null) {
      structure.setListMapChild(SerializationGWTUtilities.toListPojo_JsonV_FuncS(
          jsonObject.get("listMapChild"),
          (s0)->SerializationGWTUtilities.toMapPojo_String_FuncS(
          s0,
          (s) -> s!=null ? Integer.parseInt(s) : null,
          (s1)->SerializationGWTUtilities.toListPojo_String_FuncS(
          s1,
          (s) -> SerializationGWTJson_Sample.toPojoSimple(s))
          )
          )
          );
    }
    if(jsonObject.get("numberB")!=null) {
      structure.setNumberB(Integer.parseInt(jsonObject.get("numberB").toString()));
    }
    if(jsonObject.get("listPojoType")!=null) {
      structure.setListPojoType(SerializationGWTUtilities.toListPojo_JsonV_FuncS(
          jsonObject.get("listPojoType"),
          (s) -> s!=null ? co.antonis.generator.model.sample.PojoType.valueOf(s) : null)
          );
    }
    if(jsonObject.get("child")!=null) {
      structure.setSimple(SerializationGWTJson_Sample.toPojoSimple(jsonObject.get("child").isObject().toString()));
    }
    if(jsonObject.get("charA")!=null) {
      structure.setCharA(jsonObject.get("charA").isString().stringValue().charAt(0));
    }
    if(jsonObject.get("idL")!=null) {
      structure.setNumberLongClass(Long.parseLong(jsonObject.get("idL").toString()));
    }
    if(jsonObject.get("listAny")!=null) {
      // TODO [Member:listAny/ Serializable:listAny] (interface java.util.List) Not type parameters in container (ignoring)
    }
    if(jsonObject.get("numberInt")!=null) {
      structure.setNumberInt(Integer.parseInt(jsonObject.get("numberInt").toString()));
    }
    if(jsonObject.get("numberDouble")!=null) {
      structure.setNumberDouble(Double.parseDouble(jsonObject.get("numberDouble").toString()));
    }
    if(jsonObject.get("charNotSet")!=null) {
      structure.setCharNotSet(jsonObject.get("charNotSet").isString().stringValue().charAt(0));
    }
    if(jsonObject.get("mapChild")!=null) {
      structure.setMapChild(SerializationGWTUtilities.toMapPojo_JsonV_FuncS(
          jsonObject.get("mapChild"),
          (s) -> s!=null ? Integer.parseInt(s) : null,
          (s) -> SerializationGWTJson_Sample.toPojoSimple(s))
          );
    }
    if(jsonObject.get("boolValue")!=null) {
      structure.setBoolValue(Boolean.parseBoolean(jsonObject.get("boolValue").toString()));
    }
    if(jsonObject.get("mapListChild")!=null) {
      structure.setMapListChild(SerializationGWTUtilities.toMapPojo_JsonV_FuncS(
          jsonObject.get("mapListChild"),
          (s) -> s!=null ? Integer.parseInt(s) : null,
          (s0)->SerializationGWTUtilities.toListPojo_String_FuncS(
          s0,
          (s) -> SerializationGWTJson_Sample.toPojoSimple(s))
          )
          );
    }
    if(jsonObject.get("id")!=null) {
      structure.setNumberLong(Long.parseLong(jsonObject.get("id").toString()));
    }
    return structure;
  }
}
