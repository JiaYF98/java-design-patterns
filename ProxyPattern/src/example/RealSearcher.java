package example;

public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userID, String keyword) {
        System.out.println("用户'" + userID + "'使用关键词'" + keyword + "'查询商务信息！");
        return "返回具体内容";
    }
}
