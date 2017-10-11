package me.hourui.run;

import me.hourui.httpstarter.HttpClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hourui 2017/10/10 16:51
 */
@Component
public class RunIt {

    @Resource
    private HttpClient httpClient;

    public void hello() {
        System.out.println(httpClient.getHtml());
    }

}
