package org.javaup.memory.model;

/**
 
 * @description: 模型对象

 **/
public record ComparisonTurnResponse(
    int round,
    String question,
    String noMemoryAnswer,
    String slidingWindowAnswer,
    String summaryAnswer,
    String summarySnapshot,
    int summaryCompressionCount
) {
}
