package io.walker.planes.myehbadminton.model.item.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品型号
 *
 * @author Planeswalker23
 */
@Data
public class ItemSkuDesc implements Serializable {

    private static final long serialVersionUID = 6729017413055546954L;

    /**
     * 编码
     */
    private String code;

    /**
     * 商品类型
     * {@link io.walker.planes.myehbadminton.constant.dict.ItemTypeDict}
     */
    private String itemTypeDict;
}