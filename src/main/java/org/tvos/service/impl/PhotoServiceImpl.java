package org.tvos.service.impl;

import org.springframework.stereotype.Service;
import org.tvos.dto.PhotoDto;
import org.tvos.service.PhotoService;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    public PhotoDto getPhotoFromSpots(String provinceName, String cityName, Long AlbumId, Long PhotoId) {
        return null;
    }

    public PhotoDto getPhotoFromCollege(String provinceName, Long AlbumId, Long PhotoId) {
        return null;
    }

    public List<PhotoDto> getPhotoFromUserWork(String cookieId, String userName) {
        return null;
    }

    public List<PhotoDto> getPhotoFromUserFavorite(String cookieId, String userName) {
        return null;
    }
}
