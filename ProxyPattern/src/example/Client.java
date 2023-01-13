package example;

public class Client {
    public static void main(String[] args) {
        Searcher searcher = (Searcher) XMLUtil.getBean();
        if (searcher != null) {
            String result = searcher.doSearch("合法用户", "关键词1");
            System.out.println(result);
        }
    }
}
