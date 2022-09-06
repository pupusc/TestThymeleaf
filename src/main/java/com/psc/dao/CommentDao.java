package com.psc.dao;

import com.psc.pojo.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/08/24/15:28
 * @Description:
 */
public interface CommentDao {
    @Insert("insert into comment (comment , createTime , UpdateTime) values (#{comment} ,#{createTime} ,#{updateTime})")
    void insertComment(Comment comment, Long createTime, Long UpdateTime);

    @Select("select * from comment where commentId = #{commentId}")
    void selectComment(int commentId);

    @Update("update comment set content = #{content} where commentId = #{commentId}")
    void updateComment(int commentId,String content);

    @Delete("delete * from comment where commentId = #{commentId}")
    void deleteComment(int commentId);
}
