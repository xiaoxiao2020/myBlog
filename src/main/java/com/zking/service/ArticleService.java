 /*
  * Copyright 2019 tuhu.cn All right reserved. This software is the
  * confidential and proprietary information of tuhu.cn ("Confidential
  * Information"). You shall not disclose such Confidential Information and shall
  * use it only in accordance with the terms of the license agreement you entered
  * into with Tuhu.cn
  */
 package com.zking.service;

 import com.alibaba.fastjson.JSONObject;
 import com.zking.entity.Article;
 import org.springframework.transaction.annotation.Transactional;

 /**
  * @auther chendesheng
  * @date 2019/1/29
  */
 public interface ArticleService {
     /**
      * 插入文章
      * param record
      * @return
      */
     int insert(Article article);
     
     /**
      * 保存文章
      * @param article 文章
      * @return  status: 200--成功   500--失败
      */
     JSONObject insertArticle(Article article);
     /**
      * 通过文章id更新它的上一篇或下一篇文章id
      * @param lastOrNext
      * @param lastOrNextArticleId
      * @param articleId
      */
     void updateArticleLastOrNextId(String lastOrNext, long lastOrNextArticleId, long articleId);
     /**
      * 修改文章
      * @return
      */
     @Transactional
     JSONObject updateArticleById(Article article);
 }