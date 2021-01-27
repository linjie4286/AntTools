package org.train.proxy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 11:22
 */
public class SearcherProxy implements Searcher {

    private RealSearcher searcher;
    private UsageLogger usageLogger;
    private AccessValidator accessValidator;

    public  SearcherProxy()
    {
        searcher = new RealSearcher();
    }

    @Override
    public String doSearch(String userId, String keyValue) {

        if(checkAccess(userId)){
            String result = searcher.doSearch(null,keyValue);
            logUsage(userId);
            return result;
        }

        return "验证失败";
    }

    //查询前的授权操作
    private boolean checkAccess(String userId) {
        accessValidator = new AccessValidator();
        return accessValidator.validateUser(userId);
    }

    //查询后的日志操作
    private void logUsage(String userId) {
        UsageLogger logger = new UsageLogger();
        logger.setUserId(userId);
        logger.save();
    }
}
