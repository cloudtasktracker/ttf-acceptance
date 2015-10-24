package com.tasktracker.acceptance.client;

import com.tasktracker.acceptance.config.AppConf;
import com.tasktracker.acceptance.operation.ApiOperation;
import com.tasktracker.libraries.common.client.RestClient;
import com.tasktracker.libraries.common.utils.StringUtils;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.util.URIUtil;

import java.util.List;

/**
 *
 * Created by joan on 9/8/15.
 */
public class ApiClient extends RestClient{

    private AppConf appConf;

    public ApiClient(){
        this.appConf = new AppConf();
    }

    public String listTask(String userId) throws URIException {
        return super.doGet(this.createApiOperation(ApiOperation.LIST_TASK, null));
    }

    public String getTask(String taskId) {
        return "";
    }

    public String addTask(String name) {
        return "";
    }

    public String deleteTask(String taskId) {
        return "";
    }

    public String updateTask(String userId, String taskId) {
        return "";
    }

    private String createApiOperation(ApiOperation operation, List<String> params) throws URIException {
        return URIUtil.encodeQuery(
                AppConf.taskServiceConf.getProperty("tta.api.host") +
                AppConf.taskServiceConf.getProperty("tta.api.endpoint") +
                operation.getOperation() +
                StringUtils.createPathParams(params)
        );
    }
}
