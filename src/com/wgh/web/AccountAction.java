package com.wgh.web;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wgh.domain.Account;
import com.wgh.service.AccountService;
import com.wgh.service.AccountServiceImpl;
import lombok.Getter;
import lombok.Setter;
import sun.java2d.opengl.WGLSurfaceData;

@Getter@Setter
public class AccountAction extends ActionSupport implements ModelDriven<Account> {
    private  Account account = new Account();
    @Override
    public Account getModel() {
        return account;
    }
    AccountService accountService ;
    public String save() {
       accountService.save(account);
        return  null ;
    }


}
