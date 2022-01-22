package com.newpi.data.proxy;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date 2022/1/22 22:54
 * @desc:
 */
public class StaticProxy {

    public static void main(String[] args) {
        RealSubject subject = new RealSubject();

        Proxy proxy = new Proxy(subject);
        proxy.request(null);
    }
}

interface Subject {
    void request(Object param);
}

class  Proxy implements Subject {

   private Subject targetObject;

   public Proxy(Subject targetObject){
       this.targetObject = targetObject;
   }
    @Override
    public void request(Object param) {
        System.out.println("Proxy request");
        before(param);
        targetObject.request(param);
        after(param);
    }

    private void before(Object param){
    }

    private void after(Object param){
    }
}

class RealSubject implements Subject {

    @Override
    public void request(Object param) {
        System.out.println("RealSubject request");
    }
}