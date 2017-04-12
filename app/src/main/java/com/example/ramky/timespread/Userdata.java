
package com.example.ramky.timespread;

import java.util.ArrayList;
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
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "_id",
    "mess",
    "email",
    "mobile",
    "fullName",
    "password",
    "rollNo",
    "__v",
    "placement",
    "food",
    "clubs",
    "courses"
})
public class Userdata {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("mess")
    private String mess;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mobile")
    private Integer mobile;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("rollNo")
    private String rollNo;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("placement")
    private List<Object> placement = new ArrayList<Object>();
    @JsonProperty("food")
    private List<Object> food = new ArrayList<Object>();
    @JsonProperty("clubs")
    private List<Object> clubs = new ArrayList<Object>();
    @JsonProperty("courses")
    private List<Course> courses = new ArrayList<Course>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The mess
     */
    @JsonProperty("mess")
    public String getMess() {
        return mess;
    }

    /**
     * 
     * @param mess
     *     The mess
     */
    @JsonProperty("mess")
    public void setMess(String mess) {
        this.mess = mess;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    @JsonProperty("mobile")
    public Integer getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    @JsonProperty("mobile")
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The fullName
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     *     The password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     The rollNo
     */
    @JsonProperty("rollNo")
    public String getRollNo() {
        return rollNo;
    }

    /**
     * 
     * @param rollNo
     *     The rollNo
     */
    @JsonProperty("rollNo")
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * 
     * @return
     *     The v
     */
    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The __v
     */
    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    /**
     * 
     * @return
     *     The placement
     */
    @JsonProperty("placement")
    public List<Object> getPlacement() {
        return placement;
    }

    /**
     * 
     * @param placement
     *     The placement
     */
    @JsonProperty("placement")
    public void setPlacement(List<Object> placement) {
        this.placement = placement;
    }

    /**
     * 
     * @return
     *     The food
     */
    @JsonProperty("food")
    public List<Object> getFood() {
        return food;
    }

    /**
     * 
     * @param food
     *     The food
     */
    @JsonProperty("food")
    public void setFood(List<Object> food) {
        this.food = food;
    }

    /**
     * 
     * @return
     *     The clubs
     */
    @JsonProperty("clubs")
    public List<Object> getClubs() {
        return clubs;
    }

    /**
     * 
     * @param clubs
     *     The clubs
     */
    @JsonProperty("clubs")
    public void setClubs(List<Object> clubs) {
        this.clubs = clubs;
    }

    /**
     * 
     * @return
     *     The courses
     */
    @JsonProperty("courses")
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * 
     * @param courses
     *     The courses
     */
    @JsonProperty("courses")
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
