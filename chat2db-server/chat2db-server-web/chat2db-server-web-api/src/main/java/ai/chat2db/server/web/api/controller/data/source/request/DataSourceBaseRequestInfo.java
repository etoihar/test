/**
 * alibaba.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package ai.chat2db.server.web.api.controller.data.source.request;

/**
 * @author jipengfei
 * @version : DataSourceBaseRequestInfo.java
 */
public interface DataSourceBaseRequestInfo {

    /**
     * 获取datasoure id
     * @return
     */
    Long getDataSourceId();

    /**
     * 获取datasoure name
     * @return
     */
    String getDatabaseName();
}