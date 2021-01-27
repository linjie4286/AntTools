package org.train.proxy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 11:31
 */
public class TestDemo {
    private static Searcher searcher;

    public static void main(String[] args) {
        searcher = new SearcherProxy();
        String userId = "Admin";
        String searchType = "SEARCH_BY_ACCOUNT";
        String result = searcher.doSearch(userId, searchType);
        System.out.println(result);
    }
}
