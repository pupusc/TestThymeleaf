package com.psc.service.impl;

import com.psc.dao.CommentDao;
import com.psc.pojo.Comment;
import com.psc.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/09/05/15:52
 * @Description:
 */
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;
    private Logger logger;
    @Override
    public String insertComment(Comment comment, Long createTime, Long UpdateTime) {
        if (comment.getContext()==null) {
            String message = "context is not allowed to be null";
            logger.info(message);
            return "-1";
        }
        commentDao.insertComment(comment, createTime, UpdateTime);
        logger.info("insertComment"+comment);
        return "1";
    }

    @Override
    public void selectComment(int commentId) {

    }

    @Override
    public void updateComment(int commentId, String content) {

    }

    @Override
    public void deleteComment(int commentId) {

    }
}
