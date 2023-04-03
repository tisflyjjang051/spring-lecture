package com.jjang051.gallery.controller;

import com.jjang051.gallery.dto.GalleryDto;
import com.jjang051.gallery.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GalleryController {

  @Autowired
  GalleryService galleryService;

  @GetMapping({ "/", "/list" })
  public String list() {
    return "/gallery/list";
  }

  @GetMapping("/insert")
  public String insert() {
    return "/gallery/insert";
  }

  @PostMapping("/insert")
  public String insertProcess(GalleryDto galleryDto) {
    galleryService.insertGallery(galleryDto);
    return "redirect:/";
  }
}