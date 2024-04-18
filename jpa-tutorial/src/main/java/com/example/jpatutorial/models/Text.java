package com.example.jpatutorial.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
public class Text {

    private String content;
}
