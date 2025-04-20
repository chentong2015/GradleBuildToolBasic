package org.example;

import com.netflix.discovery.EurekaClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;

public class Main {

    // 测试从依赖管理引入的依赖
    private EurekaClient eurekaClient;

    public static void main(String[] args) {
        // 测试从本地目录引入的依赖
        CloseableHttpClient httpClient = HttpClients.createDefault();
    }
}