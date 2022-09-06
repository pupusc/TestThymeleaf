package com.psc.service;

import com.psc.pojo.Comment;
import org.springframework.stereotype.Service;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/09/05/15:53
 * @Description:
 */
@Service
public interface CommentService {

    String insertComment(Comment comment, Long createTime, Long UpdateTime);

    void selectComment(int commentId);

    void updateComment(int commentId,String content);

    void deleteComment(int commentId);

}
