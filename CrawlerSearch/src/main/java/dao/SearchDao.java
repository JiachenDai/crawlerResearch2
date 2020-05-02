package dao;

import domain.CrawlerData;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class SearchDao {
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    public CrawlerData search(String shuru){
        String sql = "select * from where title = ?";
        CrawlerData crawlerData = template.queryForObject(sql, new BeanPropertyRowMapper<CrawlerData>(CrawlerData.class), shuru);
        return crawlerData;

    }
}
