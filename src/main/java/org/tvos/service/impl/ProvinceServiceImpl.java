package org.tvos.service.impl;

import org.springframework.stereotype.Service;
import org.tvos.dto.CityDto;
import org.tvos.dto.ProvinceDto;
import org.tvos.service.ProvinceService;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    //省份名
    String provinceName = "";

    /**
     * TODO 访问Dao层拿景点对应的省份数据
     * @return
     */
    public List<ProvinceDto> getProvincesForSpots() {
        return null;
    }

    /**
     * TODO 访问Dao层拿高校对应的省份数据
     * @return
     */
    public List<ProvinceDto> getProvincesForCollege() {
        return null;
    }
}
