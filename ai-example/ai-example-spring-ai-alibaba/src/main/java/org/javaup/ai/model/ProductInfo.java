package org.javaup.ai.model;

/**

 * @description: 模型对象

 **/
public record ProductInfo(
    String productId,
    String productName,
    String price,
    int stock,
    String highlights
) {
}
