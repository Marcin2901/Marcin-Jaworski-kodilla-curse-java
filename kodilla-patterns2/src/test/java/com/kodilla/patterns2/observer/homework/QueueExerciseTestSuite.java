package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observator.homework.Mentor;
import com.kodilla.patterns2.observator.homework.QueueExercise;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

//20.4
public class QueueExerciseTestSuite {

    @Test
    public void testUpdate() {
        //Given
        QueueExercise stack = new QueueExercise("Stack - exercises");
        QueueExercise lambda = new QueueExercise("Lambda - exercises");

        Mentor mentor1 = new Mentor("Erwin");
        Mentor mentor2 = new Mentor("Maciej");

        stack.registerObserver(mentor1);
        lambda.registerObserver(mentor1);
        lambda.registerObserver(mentor2);

        //When
        stack.addExercise("new exercise xyz");
        lambda.addExercise("new exercise xyz");
        lambda.addExercise("new exercise xyz");

        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(2, mentor2.getUpdateCount());

    }
}
