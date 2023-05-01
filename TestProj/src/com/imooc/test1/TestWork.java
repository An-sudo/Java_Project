package com.imooc.test1;
public class TestWork extends Work {
    //属性：编写的测试用例个数、发现的Bug数量
    private int testNum;
    private int numBug;
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public TestWork(){
        
    }
    
	public TestWork(int testNum,int numBug){
	    this.setTestNum(testNum);
	    this.setNumBug(numBug);
	}
    // 公有的get***/set***方法完成属性封装
    public void setTestNum(int testNum){
        this.testNum=testNum;
    }
    public int getTestNum(){
        return this.testNum;
    }
    public void setNumBug(int numBug){
        this.numBug=numBug;
    }
    public int getNumBug(){
        return this.numBug;
    }
	// 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
	public String work() {
        String str=this.getName()+"的日报是：今天编写了"+this.getTestNum()+"个测试用例，发现了"+this.getNumBug()+"bug。其中"+this.getTestNum()+"的数据由属性提供";
        return str;
	}
}
