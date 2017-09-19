package com.lyae.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyae.common.Menu;
import com.lyae.service.ImageBoardService;

@Controller
@RequestMapping("/board/image")
public class ImageBoardController {
	@Autowired ImageBoardService imageBoardService;
	
	@Menu(name="이미지게시판", desc="사진첩", order=3)
	@RequestMapping("/list")
	public String list(HttpServletRequest req, Model model){
		imageBoardService.getImgList(req);
			
			
		return "imageBoard/list";
	}
	
	@RequestMapping("/{filename}")
	public String view(@PathVariable String filename,  Model model){
		return "imageBoard/view";
	}
}