package com.alibaba.chaosblade.box.service;

import com.alibaba.chaosblade.box.common.common.domain.Response;
import com.alibaba.chaosblade.box.dao.model.base.PageableResponse;
import com.alibaba.chaosblade.box.service.model.experiment.ExperimentScope;
import com.alibaba.chaosblade.box.service.model.scope.*;

import java.util.List;

/**
 * @author haibin
 *
 *
 */
public interface CloudScopeService {

    /**
     * 查找一个scope
     *
     * @param scopeQueryRequest
     * @return
     */
    Response<ScopeInfo> findOneScope(ScopeInfoQueryRequest scopeQueryRequest);

    /**
     * 分页查询资源信息
     *
     * @param experimentScopePageableRequest
     * @return
     */
    Response<PageableResponse<ExperimentScope>> pageableQueryExperimentScopes(
        ExperimentScopePageableRequest experimentScopePageableRequest);

    /**
     * 当前机器的累计演练的次数
     *
     * @param scopeQueryRequest
     * @return
     */
    Response<List<ExperimentScopeInvokeCount>> countExperimentScopeInvocation(
        ScopeInfoQueryRequest scopeQueryRequest);

    /**
     * 当前机器涉及到的演练场景
     *
     * @param scopeQueryRequest
     * @return
     */
    Response<List<FunctionInvocationCount>> countExperimentScopeSceneFunctionCount(
        ScopeInfoQueryRequest scopeQueryRequest);

    /**
     * @param scopeInfoQueryRequest
     * @return
     */
    Response<PageableResponse<ScopeExperimentTask>> pageableQueryExperimentTaskByScope(
        PageableScopeExperimentTaskQueryRequest scopeInfoQueryRequest);
}
