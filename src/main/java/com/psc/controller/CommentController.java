package com.psc.controller;

import com.psc.pojo.Comment;
import com.psc.service.CommentService;
import com.psc.utils.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/09/05/16:37
 * @Description:
 */
@RestController("/comments")
public class CommentController {
    private CommentService commentService;

    @PostMapping("/add")
    public boolean addComment(Comment comment) {
        Long createTime = StringUtils.getCurrentTime();
        Long updateTime = StringUtils.getCurrentTime();
        String flag=commentService.insertComment(comment, createTime, updateTime);
        if (flag.equals("1")){
            return true;
        }
            return false;
    }

}
