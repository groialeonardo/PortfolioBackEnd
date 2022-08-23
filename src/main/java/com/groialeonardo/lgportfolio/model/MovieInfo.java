
package com.groialeonardo.lgportfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
//@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieInfo {
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("Year")
    private Integer Year ;
    @JsonProperty("imdbID")
    private String imdbID;

    public MovieInfo() {
    }

    public MovieInfo(String Title, Integer Year, String imdbID) {
        this.Title = Title;
        this.Year = Year;
        this.imdbID = imdbID;
    }
    
    
}
