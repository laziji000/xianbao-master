package com.zyh.market.model.dto;

import com.zyh.market.model.Page;
import lombok.Data;

/**
 * @author zhangyihua
 * @version 1.0
 * @description TODO
 * @date 2024/3/3 18:21
 */
@Data
public class ProductInfoPageDto extends Page {
  private String typeCode;
  private String key;
  private String status;
}
