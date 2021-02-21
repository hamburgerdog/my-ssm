package cn.xjosiah.ssm.dao;

import cn.xjosiah.ssm.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest{

    AppointmentDao appointmentDao;

    @Autowired
    public void setAppointmentDao(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    @Test
    public void testInsertAppointment(){
        int i = appointmentDao.insertAppointment(1001, 1816160070);
        System.out.printf("此次执行了%d条操作",i);
    }

    @Test
    public void testQueryByKeyWithBook(){
        Appointment appointment = appointmentDao.queryByKeyWithBook(1001, 1816160070);
        System.out.println(appointment);
    }
}
