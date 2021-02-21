package cn.xjosiah.ssm.dao;

import cn.xjosiah.ssm.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    /**
     * 通过ID查询书籍
     *
     * @param id
     * @return
     */
    Book queryById(long id);

    //这里为什么要给方法的参数添加@Param注解呢？是因为该方法有两个或以上的参数，一定要加，不然mybatis识别不了
    //上面的BookDao接口的queryById方法和reduceNumber方法只有一个参数book_id，所以可以不用加 @Param注解
    /**
     * 查询所有书籍
     *
     * @param offset    偏移量
     * @param limit     一次查询的数量
     * @return
     */
    List<Book> queryAll(@Param("offset")int offset,@Param("limit")int limit);

    /**
     * 减少馆藏数量 每次调用则减一
     *
     * @param bookId
     * @return
     */
    int reduceNumber(long bookId);
}
