
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
    "companyName",
    "pointerCriteria",
    "jobDescription",
    "_id",
    "placementPackage"
})
public class PlacementDatum {

    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("pointerCriteria")
    private Double pointerCriteria;
    @JsonProperty("jobDescription")
    private String jobDescription;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("placementPackage")
    private Integer placementPackage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The companyName
     */
    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 
     * @param companyName
     *     The companyName
     */
    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 
     * @return
     *     The pointerCriteria
     */
    @JsonProperty("pointerCriteria")
    public Double getPointerCriteria() {
        return pointerCriteria;
    }

    /**
     * 
     * @param pointerCriteria
     *     The pointerCriteria
     */
    @JsonProperty("pointerCriteria")
    public void setPointerCriteria(Double pointerCriteria) {
        this.pointerCriteria = pointerCriteria;
    }

    /**
     * 
     * @return
     *     The jobDescription
     */
    @JsonProperty("jobDescription")
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * 
     * @param jobDescription
     *     The jobDescription
     */
    @JsonProperty("jobDescription")
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
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
     *     The placementPackage
     */
    @JsonProperty("placementPackage")
    public Integer getPlacementPackage() {
        return placementPackage;
    }

    /**
     * 
     * @param placementPackage
     *     The placementPackage
     */
    @JsonProperty("placementPackage")
    public void setPlacementPackage(Integer placementPackage) {
        this.placementPackage = placementPackage;
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
