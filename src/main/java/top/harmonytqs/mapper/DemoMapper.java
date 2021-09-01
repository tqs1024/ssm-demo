package top.harmonytqs.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Author : 谭庆山
 * @Date : 2021/8/31 15:29
 * @Description TODO
 */
@Repository
public interface DemoMapper {
    String selectNameById(Integer id);
}
