package spring13zhujiedi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;//接口的调用

    //查询全部的方法
    public void selectAll(){
        //controller层 调用service层 即controller 依赖了 service层
        adminService.selectAll();

    }
}
