package org.javaup.memory.model;

import java.util.List;

/**

 * @description: 模型对象

 **/
public record MemoryComparisonResponse(
    String scriptName,
    List<ComparisonTurnResponse> turns,
    MemoryChatResponse slidingWindowFinalState,
    MemoryChatResponse summaryFinalState
) {
}
