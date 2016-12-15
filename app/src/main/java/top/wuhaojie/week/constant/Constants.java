package top.wuhaojie.week.constant;

/**
 * Created by wuhaojie on 2016/12/1 13:37.
 */

public interface Constants {
    int NEW_ACTIVITY_REQUEST_CODE = 0;
    int EDIT_ACTIVITY_REQUEST_CODE = 1;

    String INTENT_EXTRA_DAY_OF_WEEK = "INTENT_EXTRA_DAY_OF_WEEK";
    String INTENT_BUNDLE_NEW_TASK_DETAIL = "INTENT_BUNDLE_NEW_TASK_DETAIL";
    String CHOOSE_PAPER_DIALOG_CHECK_ITEM_BUNDLE_KEY = "CHOOSE_PAPER_DIALOG_CHECK_ITEM_BUNDLE_KEY";
    String INTENT_EXTRA_EDIT_TASK_DETAIL_ENTITY = "INTENT_EXTRA_EDIT_TASK_DETAIL_ENTITY";
    String INTENT_EXTRA_MODE_OF_NEW_ACT = "INTENT_EXTRA_MODE_OF_NEW_ACT";

    int HANDLER_WHAT_DELETE_TASK = 0;

    interface MODE_OF_NEW_ACT {
        int MODE_EDIT = 5;
        int MODE_CREATE = 6;
    }

    interface CONFIG_KEY {
        String SHOW_WEEK_TASK = "SHOW_WEEK_TASK";
        String SHOW_AS_LIST = "SHOW_AS_LIST";
        String SHOW_PRIORITY = "SHOW_PRIORITY";
        String NIGHT_MODE = "NIGHT_MODE";
    }


}
