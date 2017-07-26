package org.tvos.service.impl;

import org.springframework.stereotype.Service;
import org.tvos.dto.CityDto;
import org.tvos.service.CityService;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Service
public class CityServiceImpl implements CityService {

    /**
     * TODO 访问Dao层拿城市数据
     * @return
     */
    public List<CityDto> getCities(String provinceName) {
        return null;
    }
}
