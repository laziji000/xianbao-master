package com.zyh.market.model.dto;

import com.zyh.market.model.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangyihua
 * @version 1.0
 * @description TODO
 * @date 2024/2/21 21:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemRolePageDto extends Page {
  private String key;
  
}
