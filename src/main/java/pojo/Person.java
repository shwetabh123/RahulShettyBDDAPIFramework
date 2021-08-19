
package pojo;

import java.util.HashMap;
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
"first_name",
"last_name",
"age",
"id",
"address",
"phonenumbers"
})
@Generated("jsonschema2pojo")
public class Person {

@JsonProperty("first_name")
private String firstName;
@JsonProperty("last_name")
private String lastName;
@JsonProperty("age")
private Integer age;
@JsonProperty("id")
private Integer id;
@JsonProperty("address")
private String address;
@JsonProperty("phonenumbers")
private String phonenumbers;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("first_name")
public String getFirstName() {
return firstName;
}

@JsonProperty("first_name")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("last_name")
public String getLastName() {
return lastName;
}

@JsonProperty("last_name")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("age")
public Integer getAge() {
return age;
}

@JsonProperty("age")
public void setAge(Integer age) {
this.age = age;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("address")
public String getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(String address) {
this.address = address;
}

@JsonProperty("phonenumbers")
public String getPhonenumbers() {
return phonenumbers;
}

@JsonProperty("phonenumbers")
public void setPhonenumbers(String phonenumbers) {
this.phonenumbers = phonenumbers;
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