package example;

public class ProxySearch implements Searcher {
    private final RealSearcher searcher = new RealSearcher();
    private final AccessValidator validator = new AccessValidator();
    private final Logger logger = new Logger();

    @Override
    public String doSearch(String userID, String keyword) {
        //如果身份验证成功，则执行查询
        if (this.validate(userID)) {
            String result = searcher.doSearch(userID, keyword);
            this.log(userID);
            return result;
        }
        return null;
    }

    private void log(String userID) {
        logger.log(userID);
    }

    public boolean validate(String userID) {
        return validator.validate(userID);
    }
}
