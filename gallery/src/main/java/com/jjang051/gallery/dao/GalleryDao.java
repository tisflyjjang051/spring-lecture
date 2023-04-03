package com.jjang051.gallery.dao;

import com.jjang051.gallery.dto.GalleryDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GalleryDao {
  int insertGallery(GalleryDto galleryDto);
}
