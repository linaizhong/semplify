package ai.semplify.entityhub.models.spotlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DBPediaAnnotationResource {
    @JsonProperty("@URI")
    private String uri;

    @JsonProperty("@support")
    private String support;

    @JsonProperty("@types")
    private String types;

    @JsonProperty("@surfaceForm")
    private String surfaceForm;

    @JsonProperty("@offset")
    private Integer offset;

    @JsonProperty("@similarityScore")
    private Double similarityScore;

    @JsonProperty("@percentageOfSecondRank")
    private String percentageOfSecondRank;
}
