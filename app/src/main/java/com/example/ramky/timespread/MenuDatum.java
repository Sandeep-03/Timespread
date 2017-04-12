
package com.example.ramky.timespread;

import java.util.HashMap;
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
    "day",
    "_id",
    "dinner",
    "snacks",
    "lunch",
    "breakFast"
})
public class MenuDatum {

    @JsonProperty("day")
    private Integer day;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("dinner")
    private Dinner dinner;
    @JsonProperty("snacks")
    private Snacks snacks;
    @JsonProperty("lunch")
    private Lunch lunch;
    @JsonProperty("breakFast")
    private BreakFast breakFast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The day
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    @JsonProperty("day")
     public void setDay(Integer day) {
        this.day = day;
    }

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
     *     The dinner
     */
    @JsonProperty("dinner")
    public Dinner getDinner() {
        return dinner;
    }

    /**
     * 
     * @param dinner
     *     The dinner
     */
    @JsonProperty("dinner")
    public void setDinner(Dinner dinner) {
        this.dinner = dinner;
    }

    /**
     * 
     * @return
     *     The snacks
     */
    @JsonProperty("snacks")
    public Snacks getSnacks() {
        return snacks;
    }

    /**
     * 
     * @param snacks
     *     The snacks
     */
    @JsonProperty("snacks")
    public void setSnacks(Snacks snacks) {
        this.snacks = snacks;
    }

    /**
     * 
     * @return
     *     The lunch
     */
    @JsonProperty("lunch")
    public Lunch getLunch() {
        return lunch;
    }

    /**
     * 
     * @param lunch
     *     The lunch
     */
    @JsonProperty("lunch")
    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    /**
     * 
     * @return
     *     The breakFast
     */
    @JsonProperty("breakFast")
    public BreakFast getBreakFast() {
        return breakFast;
    }

    /**
     * 
     * @param breakFast
     *     The breakFast
     */
    @JsonProperty("breakFast")
    public void setBreakFast(BreakFast breakFast) {
        this.breakFast = breakFast;
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
