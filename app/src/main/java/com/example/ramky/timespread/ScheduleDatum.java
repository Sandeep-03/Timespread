
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
    "typex",
    "_id",
    "timings"
})
public class ScheduleDatum {

    @JsonProperty("typex")
    private String typex;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("timings")
    private List<Timing> timings = new ArrayList<Timing>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The typex
     */
    @JsonProperty("typex")
    public String getTypex() {
        return typex;
    }

    /**
     * 
     * @param typex
     *     The typex
     */
    @JsonProperty("typex")
    public void setTypex(String typex) {
        this.typex = typex;
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
     *     The timings
     */
    @JsonProperty("timings")
    public List<Timing> getTimings() {
        return timings;
    }

    /**
     * 
     * @param timings
     *     The timings
     */
    @JsonProperty("timings")
    public void setTimings(List<Timing> timings) {
        this.timings = timings;
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
