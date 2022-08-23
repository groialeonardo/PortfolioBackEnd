
package com.groialeonardo.lgportfolio.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class MovieResp  {
    @JsonProperty("page")
    private int page;
    @JsonProperty("per_page")
    private int per_page;
    @JsonProperty("total")
    private int total;
    @JsonProperty("total_pages")
    private int total_pages;
    @JsonProperty("data")
    private MovieInfo[] data;

    public MovieResp() {
    }

    public MovieResp(int page, int per_page, int total, int total_pages, MovieInfo[] data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
    }


    
  
  
    
}
