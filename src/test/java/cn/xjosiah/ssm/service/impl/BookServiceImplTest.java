package cn.xjosiah.ssm.service.impl;

import cn.xjosiah.ssm.dao.BaseTest;
import cn.xjosiah.ssm.dto.AppointExecution;
import cn.xjosiah.ssm.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Test
    public void testAppoint() {
        long bookId = 1000;
        long studentId= 1816160070;
        AppointExecution execution = bookService.appoint(bookId,studentId);
        System.out.println(execution);
    }
}
