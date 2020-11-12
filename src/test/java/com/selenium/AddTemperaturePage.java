package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AddTemperaturePage extends BasePage {
    public AddTemperaturePage(ChromeDriver driver) {
        super(driver);
    }
    // 姓名
    private  By username = new By.ById("username");
    // 别名
    private  By englishName = new By.ById("memberAdd_english_name");
    // 账号
    private  By acctId = new By.ById("memberAdd_acctid");
    // 性别:男
    private  By male = new By.ByCssSelector("input[name='gender'][value=1]");
    // 性别:女
    private  By female = new By.ByCssSelector("input[name='gender'][value=1]");
    // 手机
    private  By phone = new By.ById("memberAdd_phone");
    // 座机
    private  By telephone = new By.ById("memberAdd_telephone");
    // 邮箱
    private  By mail = new By.ById("memberAdd_mail");
    // 地址
    private  By address = new By.ById("memberEdit_address");
    // 部门显示删除按钮
    private  By showDeleteButton = new By.ByCssSelector(".ww_commonImg_SmallGrayMore");
    // 删除部门按钮
    private  By deleteButton = new By.ByXPath("//li[contains(@class,'qui_dropdownMenu_item')]/a[text()='删除']");
    // 部门修改按钮
    private  By changeDepartment = new By.ByXPath("//a[text()='修改']");
    // 职务
    private  By title = new By.ById("memberAdd_title");
    // 身份：普通成员
    private  By common = new By.ByCssSelector("input[name='identity_stat'][value=0]");
    // 身份：上级
    private  By superior = new By.ByCssSelector("input[name='identity_stat'][value=1]");
    // 底部职务：同步公司内职务"input[name='extern_position_set'][value='sync']"
    private  By synchronous = new By.ByCssSelector("input[name='extern_position_set'][value='sync']");
    // 底部职务：自定义custom
    private  By custom = new By.ByCssSelector("input[name='extern_position_set'][value='custom']");
    // 自定义职务输入框
    private  By externPosition  = new By.ById("extern_position");
    // 邮箱分享勾选框
    private  By sendInvite = new By.ByCssSelector("[name='sendInvite']");
    // 保存并添加按钮
    private  By saveAndAdd = new By.ByXPath(
            "//div[contains(@class,'member_colRight_operationBar')][2]/a[text()='保存并继续添加']");
    // 保存按钮
    private  By save = new By.ByXPath(
            "//div[contains(@class,'member_colRight_operationBar')][2]/a[text()='保存']");
    // 取消按钮
    private  By cancel = new By.ByXPath(
            "//div[contains(@class,'member_colRight_operationBar')][2]/a[text()='取消']");

    /**
     * 输入姓名
     * @param name
     */
    public  void sendName(String name){
        sendData(username,name);
    }
    /**
     * 输入别名
     * @param tagName
     */
    public  void sendTagName(String tagName){
        sendData(englishName,tagName);
    }

    /**
     * 输入账号
     * @param account
     */
    public void sendAcctId(String account){
        sendData(acctId,account);
    }

    /**
     * 选择性别
     * @param driver
     * @param sex
     */
    public void chooseSex(ChromeDriver driver,String sex){
        WebElement chooseSex;
        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        if(sex.equals("男")){
            chooseSex = driver.findElement(male);
        }else {
            chooseSex = driver.findElement(female);
        }
        jsExecutor.executeScript("arguments[0].attr('checked','checked')",chooseSex);
    }
    /**
     * 输入手机
     * @param phoneNum
     */
    public void sendPhone(String phoneNum){
        sendData(phone,phoneNum);
    }
    /**
     * 输入座机
     * @param telephoneNum
     */
    public void sendTelephone(String telephoneNum){
        sendData(telephone,telephoneNum);
    }

    /**
     * 输入邮箱
     * @param email
     */
    public void sendMail(String email){
        sendData(mail,email);
    }

    /**
     * 输入邮箱
     * @param home
     */
    public void sendAddress(String home){
        sendData(address,home);
    }

    /**
     * 输入职务
     * @param position
     */
    public void sendTitle(String position){
        sendData(title,position);
    }

    /**
     * 点击保存并添加
     */
    public void saveAndAdd(){
        clickElement(saveAndAdd);
    }
    /**
     * 点击保存
     */
    public void save(){
        clickElement(save);
    }
    /**
     * 点击取消
     */
    public void cancel(){
        clickElement(cancel);
    }
}
