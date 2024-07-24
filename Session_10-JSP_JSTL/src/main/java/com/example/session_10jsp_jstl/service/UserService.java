package com.example.session_10jsp_jstl.service;

import com.example.session_10jsp_jstl.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static final List<User> users = new ArrayList<User>();
    static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    static {
        try{
            users.add(new User("Mai Văn Hoàn", sf.parse("1983-08-20"),"Hà Nội", "https://phunugioi.com/wp-content/uploads/2020/10/hinh-anh-bao-ve-moi-truong.jpg" ));
            users.add(new User("Nguyễn Văn Nam", sf.parse("1983-08-21"),"Bắc Giang", "https://congthuong-cdn.mastercms.vn/stores/news_dataimages/2023/052023/25/10/in_article/bvmt20230525100048.jpg?rt=20230525100049"));
            users.add(new User("Nguyễn Thái Hòa", sf.parse("1983-08-22"),"Nam Định", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlsuKlV3AUtbtrI48gQTdiOBIXbMvESGHsIeuaS905U6vqNI8FoSlrkjMBU6ZHirPaws4&usqp=CAU" ));
            users.add(new User("Trần Đăng Khoa", sf.parse("1983-08-23"),"Hà Tây", "https://thuanthienplastic.com/wp-content/uploads/2023/03/moi-truong-1.jpg?w=1130" ));
            users.add(new User("Nguyễn Đình Thi", sf.parse("1983-08-24"),"Hà Nội", "https://luatdainam.vn/wp-content/uploads/2023/08/bao-ve-moi-truong-la-gi-noi-dung-va-bien-phap-bao-ve-moi-truong-1522.jpg" ));
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public List<User> findAll() {
        return users;
    }

}
