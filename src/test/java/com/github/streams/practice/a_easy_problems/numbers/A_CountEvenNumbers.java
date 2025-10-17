package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Count even numbers:
 *
 * <p>Example: <br>
 * Input = [1,2,3,4,5,6]<br>
 * Output = 3 <br>
 * Explanation: (2, 4, 6) are even numbers.
 */
class A_CountEvenNumbers {

  @Test
  void countEvenNumbers() {
    final var input = List.of(1, 2, 3, 4, 5, 6, 7);

    final var mySolution = EasyNumbersProblemSolution.countNumberOfEvenNumbers(input);
    final var yourSolution = input.stream().filter(x->x%2==0).count(); // WRITE YOUR IMPLEMENTATION HERE//
    
    Assertions.assertEquals(
        mySolution,
        yourSolution,
        "Your solution is incorrect - you can refer to mySolution above to check, how I have done the same problem.");
  }
}
