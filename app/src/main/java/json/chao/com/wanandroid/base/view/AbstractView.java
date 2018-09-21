package json.chao.com.wanandroid.base.view;


/**
 *  View 基类
 *
 * @author quchao
 * @date 2017/11/27
 */

public interface AbstractView {

    /**
     * Use night mode
     *
     * @param isNightMode if is night mode
     */
    //夜间模式
    void useNightMode(boolean isNightMode);

    /**
     * Show error message
     *
     * @param errorMsg error message
     */
    //
    //错误信息
    void showErrorMsg(String errorMsg);

    /**
     * showNormal
     */
    //正确的
    void showNormal();

    /**
     * Show error
     */
    //错误的 无返回值
    void showError();

    /**
     * Show loading
     */
    //加载
    void showLoading();

    /**
     * Reload
     */
    //重新启动
    void reload();

    /**
     * Show login view
     */
    void showLoginView();

    /**
     * Show logout view
     */
    void showLogoutView();

    /**
     * Show collect success
     */
    void showCollectSuccess();//采集成功

    /**
     * Show cancel collect success
     */
    void showCancelCollectSuccess();//删除采集成功

    /**
     * Show toast
     *
     * @param message Message
     */
    void showToast(String message);//Toast

    /**
     * Show snackBar
     *
     * @param message Message
     */
    void showSnackBar(String message);//

}
