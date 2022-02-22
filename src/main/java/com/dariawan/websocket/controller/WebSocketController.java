package com.dariawan.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSocketController {

	@RequestMapping("/websocket")
	public String getWebSocket() {
		return "ws-broadcast";
	}

	@RequestMapping("/")
	public String homepage() {
		return "ws-broadcast";
	}
}
