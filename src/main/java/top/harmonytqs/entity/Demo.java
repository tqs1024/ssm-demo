package top.harmonytqs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author : 谭庆山
 * @Date : 2021/8/31 15:29
 * @Description TODO
 */
@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
    private Integer id;
    private String name;
}
