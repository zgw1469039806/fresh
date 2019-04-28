package org.gd.getw.filter;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @DATA 2019-04-28 14:31
 * @Author 张国伟  WeChat:17630376104
 * @Description 服务下线后进行提示
 *
 */
public class ShopFallbackProvider implements ZuulFallbackProvider {
    @Override
    public String getRoute()
    {
        return "goshopping";
    }

    @Override
    public ClientHttpResponse fallbackResponse()
    {
        return new ClientHttpResponse()
        {
            @Override
            public HttpStatus getStatusCode() throws IOException
            {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException
            {
                return this.getStatusCode().value();
            }

            @Override
            public String getStatusText() throws IOException
            {
                return this.getStatusCode().getReasonPhrase();
            }

            @Override
            public void close()
            {

            }

            @Override
            public InputStream getBody() throws IOException
            {
                return  new ByteArrayInputStream("goshopping-service微服务不可用，请你滚犊子。".getBytes());
            }

            @Override
            public HttpHeaders getHeaders()
            {
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application","json", Charset.forName("UTF-8"));
                headers.setContentType(mt);
                return headers;
            }
        };
    }
}
