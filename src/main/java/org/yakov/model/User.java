package org.yakov.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yakov.util.Generator;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public abstract class User {
    private String id = Generator.getRandomId(this);

    @JsonIgnore
    private List<Task> tasks = new ArrayList<>();
}
