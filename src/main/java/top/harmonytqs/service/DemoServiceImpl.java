package top.harmonytqs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.harmonytqs.mapper.DemoMapper;

/**
 * @Author : 谭庆山
 * @Date : 2021/8/31 15:30
 * @Description TODO
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper mapper;

    @Override
    public String findNameById(Integer id) {
        return mapper.selectNameById(id);
    }
}
