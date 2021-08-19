
package pojo;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"location",
"accuracy",
"name",
"phone_number",
"address",
"types",
"website",
"language"
})
@Generated("jsonschema2pojo")
public class AddPlace {

@JsonProperty("location")
private Location location;
@JsonProperty("accuracy")
private Integer accuracy;
@JsonProperty("name")
private String name;
@JsonProperty("phone_number")
private String phoneNumber;
@JsonProperty("address")
private String address;
@JsonProperty("types")
private List<String> types = null;
@JsonProperty("website")
private String website;
@JsonProperty("language")
private String language;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("location")
public Location getLocation() {
return location;
}

@JsonProperty("location")
public void setLocation(Location location) {
this.location = location;
}

@JsonProperty("accuracy")
public Integer getAccuracy() {
return accuracy;
}

@JsonProperty("accuracy")
public void setAccuracy(Integer accuracy) {
this.accuracy = accuracy;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("phone_number")
public String getPhoneNumber() {
return phoneNumber;
}

@JsonProperty("phone_number")
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

@JsonProperty("address")
public String getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(String address) {
this.address = address;
}

@JsonProperty("types")
public List<String> getTypes() {
return types;
}

@JsonProperty("types")
public void setTypes(List<String> types) {
this.types = types;
}

@JsonProperty("website")
public String getWebsite() {
return website;
}

@JsonProperty("website")
public void setWebsite(String website) {
this.website = website;
}

@JsonProperty("language")
public String getLanguage() {
return language;
}

@JsonProperty("language")
public void setLanguage(String language) {
this.language = language;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
