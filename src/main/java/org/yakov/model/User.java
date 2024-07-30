package org.yakov.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.yakov.util.Generator;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public abstract class User {
    private  String id = Generator.getRandomId();

    @JsonIgnore
    private List<Task> tasks = new ArrayList<>();
}
