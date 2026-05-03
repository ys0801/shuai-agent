package org.javaup.ai.model;

/**

 * @description: 模型对象

 **/
public record OrderSummary(
    String orderId,
    String status,
    boolean canRefund,
    String nextAction
) {
}
