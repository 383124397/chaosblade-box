package com.alibaba.chaosblade.box.dao.infrastructure.app.chaosblade;

import com.alibaba.chaosblade.box.common.common.domain.chaosblade.ChaosBladeMetaData;

/**
 * @author haibin
 *
 *
 */
public interface ChaosBladeListener {

    ChaosBladeMetaData onCompleted(ChaosBladeInvoker chaosBladeInvoker) throws Exception;
}
