package com.mgunawardhana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Node
public class Course {

    @Id @GeneratedValue
    private Long id;

    private String identifier;

    private String title;

    private String teacher;
}
