package org.dark.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//當你的這個主啟動類與其他的組件不在一個路徑下時，會發生找不到組件（Component）的錯誤
//解決方法可以如下所示，添加一個@ComponentScan註解，並聲明要掃描的路徑("org.dark")
@ComponentScan("org.dark")
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
