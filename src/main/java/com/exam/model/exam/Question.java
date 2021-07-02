package com.exam.model.exam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quesId;

    @Column(length = 5000)
    private String content;
    private String image;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String answer;

    public Question(Quiz quiz, String content, String image, String option1, String option2, String option3, String option4, String answer) {
        this.quiz = quiz;
        this.content = content;
        this.image = image;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }
}
