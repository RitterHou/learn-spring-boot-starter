package com.nosuchfield.httpstarter;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author hourui 2017/10/10 17:16
 */
@Setter
@Getter
public class HttpClient {

    private String url;

    public String getHtml() {
        try {
            URL url = new URL(this.url);
            URLConnection urlConnection = url.openConnection();                                                    // 打开连接
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8")); // 获取输入流
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

}
