package com.lcc.japi.test;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

/**
 * @author 李昌赐
 * @since 2021−05-29
 */
public class Test {

    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        //项目路径
        config.setProjectPath("E:\\workSpace\\ideaWorkSpace\\spring-boot-api");
        //项目名
        config.setProjectName("spring-boot-api");
        //接口文档版本
        config.setApiVersion("V1.0");
        //接口文档保存路径
        config.setDocsPath("E:\\workSpace\\ideaWorkSpace\\spring-boot-api\\api");
        //是否自动生成
        config.setAutoGenerate(Boolean.TRUE);
        //生成html接口文档格式
        Docs.buildHtmlDocs(config);
    }
}
