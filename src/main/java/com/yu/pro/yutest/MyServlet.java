package com.yu.pro.yutest;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/12/11 0011 下午 7:54
 */
@WebServlet(urlPatterns = "/my/Servlet",
asyncSupported =  true)
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().println("Hello,World");
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(()->{
            try {
                resp.getWriter().println("Hello,World");
            } catch (IOException e) {
                e.printStackTrace();
            }
            asyncContext.complete();
        });
    }
}
