package com.example.quiz.Modal;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString@Document(collection = "Python")
public class QuizPythonQuestion {
    @MongoId
    private ObjectId id;
    private String question;
    private String difficulty;
    private String code;
    private String category;
    private String correctAnswer;
    private String userSelectedOptions; // Field to store user-selected options
    private List<String> hints; // Field to store hints for each option
    private List<String> options; // Field to store hints for each option

    // Constructors, getters, setters, etc.
}

