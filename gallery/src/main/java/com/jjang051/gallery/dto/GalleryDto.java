package com.jjang051.gallery.dto;

import lombok.Data;

@Data
public class GalleryDto {

  int no;
  private String title;
  private String contents;
  private String original;
  private String renamed;
}
