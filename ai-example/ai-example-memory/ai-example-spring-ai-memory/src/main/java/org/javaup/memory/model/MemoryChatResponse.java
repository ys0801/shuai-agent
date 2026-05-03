package org.javaup.memory.model;

import java.util.List;

/**

 * @description: 模型对象

 **/
public record MemoryChatResponse(
    String strategy,
    String sessionId,
    String question,
    String answer,
    int estimatedPromptTokens,
    String summary,
    int compressionCount,
    List<ConversationMessageView> memoryMessages
) {
}
