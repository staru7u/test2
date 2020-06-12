package com.zentop.chatbot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zentop.chatbot.model.vo.SimpleText;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ChatbotController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatbotController.class);
	
	@ResponseBody
	@RequestMapping(value = "/simpleText", method = RequestMethod.GET)
	public SimpleText keyboard() {
		SimpleText simpleText = new SimpleText("심플텍스트 예제입니다");

		return simpleText;
	}
	
}
