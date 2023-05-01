package com.imooc.classwork;
public class Book {
  //私有属性：书名、作者、出版社、价格
     private String name;
     private String author;
     private String pub;
     private float price;
     
	//通过构造方法实现属性赋值
    public Book(String name,String author,String pub,int price){
    this.name=name;
    this.author=author;
    this.pub=pub;
    setPrice(price);

    }
    public void setPrice(float price){
        if(price<10){
            System.out.println("图书价格最低10元");
            price=10;
        }
        this.price=price;
    }
    
    public void setPub(){
        this.pub=pub;
    }
    
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPub(){
        return this.pub;
    }
    public float getPrice(){
        return this.price;
    }

    /*通过公有的get/set方法实现属性的访问，其中：
    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
    2、限定作者、书名均为只读属性
    */
    
  //信息介绍方法，描述图书所有信息
    public void ifor(){
        System.out.println("书名："+ getName());
        System.out.println("作者："+ getAuthor());
        System.out.println("出版社："+ getPub());
        System.out.println("价格："+ getPrice());
    }

}