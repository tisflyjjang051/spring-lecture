package com.jjang051.gallery.service;

import com.jjang051.gallery.dao.GalleryDao;
import com.jjang051.gallery.dto.GalleryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryServiceImpl implements GalleryService {

  @Autowired
  GalleryDao galleryDao;

  @Override
  public int insertGallery(GalleryDto galleryDto) {
    int result = galleryDao.insertGallery(galleryDto);
    return result;
  }
}
