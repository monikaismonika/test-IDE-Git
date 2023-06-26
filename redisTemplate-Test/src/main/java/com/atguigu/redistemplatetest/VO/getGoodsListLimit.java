package com.atguigu.redistemplatetest.VO;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class getGoodsListLimit {
    private Integer currentPage;
    private Integer limit;
    private Integer total;
    private int[] data;
}
