package io.learnk8s.knote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "notes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Note implements Serializable {
    @Field("id")
    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;

    @Override
    public String toString() {
        return description;
    }
}
