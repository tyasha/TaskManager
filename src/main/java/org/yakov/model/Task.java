package org.yakov.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.yakov.util.Generator;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public abstract class Task {
    private String id = Generator.getRandomId();
    @JsonIgnore
    private User user;
}
