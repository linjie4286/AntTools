package org.train.proxy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 11:23
 */
public class RealSearcher implements Searcher{

    @Override
    public String doSearch(String userId, String searchType) {
        return "真实的查询结果";
    }

}
