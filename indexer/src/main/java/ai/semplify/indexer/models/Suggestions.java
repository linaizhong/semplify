package ai.semplify.indexer.models;

import lombok.Data;

import java.util.List;

@Data
public class Suggestions {
    private List<Suggestion> suggestions;
}
