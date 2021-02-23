package com.spring5.demo02;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public UserServiceProxy() {
    }

    public UserService getUserServiceImpl() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    public void log(String msg){
        System.out.println(this.getClass()+"执行方法"+msg);
    }
}
