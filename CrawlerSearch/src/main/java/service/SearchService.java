package service;

import dao.SearchDao;
import domain.CrawlerData;

public class SearchService {
    SearchDao searchDao = new SearchDao();

    //查询方法返回一个封装好的数据体对象CrawlerData对象
    public CrawlerData search(String shuru){
        CrawlerData search = searchDao.search(shuru);
        return search;
    }
}
