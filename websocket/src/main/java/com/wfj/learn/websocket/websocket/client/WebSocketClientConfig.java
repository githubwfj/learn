package com.wfj.learn.websocket.websocket.client;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class WebSocketClientConfig {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketClientConfig.class);

    @Bean
    public WebSocketClient webSocketClient() {
        try {
            WebSocketClient webSocketClient = new WebSocketClient(new URI("ws://localhost:8085/ws"), new Draft_6455()) {
                @Override
                public void onOpen(ServerHandshake handshakedata) {
                    logger.info("[websocket] 连接成功");
                }

                @Override
                public void onMessage(String message) {
                    logger.info("[websocket] 收到消息={}", message);
                }

                @Override
                public void onClose(int code, String reason, boolean remote) {
                    logger.info("[websocket] 退出连接");
                }

                @Override
                public void onError(Exception ex) {
                    logger.info("[websocket] 连接错误={}", ex.getMessage());
                }
            };
            webSocketClient.connect();
            return webSocketClient;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
