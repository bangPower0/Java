package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")  //多实例，当重新建立的时候，我们会得到多个实例。
public class AlphaService {

    private AlphaDao alphaDao;

//    public AlphaService() {
//        System.out.println("实例化AlphaService");
//    }
//
//    @PostConstruct  // 初始化方法，构造之后调用
//    public void init() {
//        System.out.println("初始化AlphaService");
//    }
//
//    @PreDestroy   // 销毁之前调用，释放资源
//    public void destroy() {
//        System.out.println("销毁AlphaService");
//    }

    public String find() {
        return alphaDao.select();
    }
}
