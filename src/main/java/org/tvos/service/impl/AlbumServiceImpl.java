package org.tvos.service.impl;

import org.springframework.stereotype.Service;
import org.tvos.dto.AlbumDto;
import org.tvos.service.AlbumService;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    public List<AlbumDto> getAlbumsFromSpots(String provinceName, String cityName) {
        return null;
    }

    public List<AlbumDto> getAlbumsFromCollege(String provinceName) {
        return null;
    }

    public List<AlbumDto> getAlbumsFromRecommend() {
        return null;
    }
}
