package com.imooc.test1;

public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
	private int worka;
	private int workBug;
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public DevelopmentWork(int worka,int workBug){
	    this.setWorka(worka);
	    this.setWorkBug(workBug);
	}
    // 公有的get***/set***方法完成属性封装
	public void setWorka(int worka){
	    this.worka=worka;
	}
	public int getWorka(){
	    return this.worka;
	}
	public  void setWorkBug(int workBug){
	    this.workBug=workBug;
	}
	public int getWorkBug(){
	    return this.workBug;
	}
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String work() {
        String str=this.getName()+"的日报是：，今天编写了"+this.getWorka()+"行代码，目前人任然有"
	+this.getWorkBug()+"个bug没有解决。其中"+this.getWorka()+"的数据由属性提供";
        return str;
	}
}

