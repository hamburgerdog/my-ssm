package cn.xjosiah.ssm.dao;

import cn.xjosiah.ssm.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest{

    BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Test
    public void testQueryById(){
        Book book = bookDao.queryById(1001);
        System.out.println(book);
    }

    @Test
    public void testQueryAll(){
        List<Book> books = bookDao.queryAll(0, 2);
        books.forEach(System.out::println);
    }

    @Test
    public void testReduceNumber(){
        bookDao.reduceNumber(1000);
        Book book = bookDao.queryById(1000);
        System.out.println(book);
    }
}
