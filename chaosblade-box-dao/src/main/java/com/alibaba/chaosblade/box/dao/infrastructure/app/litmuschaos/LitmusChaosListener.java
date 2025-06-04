package com.alibaba.chaosblade.box.dao.infrastructure.app.litmuschaos;


import com.alibaba.chaosblade.box.common.common.domain.chaosblade.ChaosBladeMetaData;

/**
 * @author yefei
 */
public interface LitmusChaosListener {

    ChaosBladeMetaData onCompleted(LitmusChaosInvoker litmusChaosInvoker) throws Exception;
}
