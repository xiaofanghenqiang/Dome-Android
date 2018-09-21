package json.chao.com.wanandroid.contract.main;

import com.tbruyelle.rxpermissions2.RxPermissions;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.AbstractView;
import json.chao.com.wanandroid.core.bean.main.collect.FeedArticleListData;

/**
 * @author quchao
 * @date 2018/2/13
 */

public interface ArticleDetailContract {

    interface View extends AbstractView {

        /**
         * Show collect article data
         *
         * @param feedArticleListData FeedArticleListData
         */
        //收集文章数据
        void showCollectArticleData(FeedArticleListData feedArticleListData);

        /**
         * Show cancel collect article data
         *
         * @param feedArticleListData feedArticleListData
         */
        //取消收集文章数据
        void showCancelCollectArticleData(FeedArticleListData feedArticleListData);

        /**
         * Share event
         */
        //分享
        void shareEvent();

        /**
         * Share error
         */
        //错误
        void shareError();

    }

    interface Presenter extends AbstractPresenter<View> {

        /**
         * Get auto cache state
         *
         * @return if auto cache state
         */
        //获取自动缓存对象
        boolean getAutoCacheState();

        /**
         * Get no image state
         *
         * @return if has image state
         */
        //获取没有对象的状态
        boolean getNoImageState();

        /**
         * Add collect article
         *
         * @param id article id
         */
        //添加文章
        void addCollectArticle(int id);

        /**
         * Cancel collect article
         *
         * @param id article id
         */
        //取消文章
        void cancelCollectArticle(int id);

        /**
         * Cancel collect article
         *
         * @param id article id
         */
        //取消收集页面文章
        void cancelCollectPageArticle(int id);

        /**
         * verify share permission
         *
         * @param rxPermissions RxPermissions
         */
        //共享事件权限设置
        void shareEventPermissionVerify(RxPermissions rxPermissions);

    }
}
