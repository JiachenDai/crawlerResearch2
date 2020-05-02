package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.CrawlerData;
import service.SearchService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/searchServlet")
public class SearchServlet extends HttpServlet {
    SearchService searchService = new SearchService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String shuru = request.getParameter("shuru");
        //调用service进行搜索
        CrawlerData search = searchService.search(shuru);
        //序列化为json返回
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(response.getOutputStream(),search);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }
}
